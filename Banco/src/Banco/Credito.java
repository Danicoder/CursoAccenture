

/**
 * 
 */
package Banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author d.garcia.millan
 *
 */
public class Credito extends Tarjeta {
	// cuenta asociada para liquidar unicamente
	protected double mCredito;
	protected ArrayList<Movimiento> mMovimiento;

	private final double COMISION = 5 / 100;
	private final double MIN_COMISION = 3;

	public Credito(LocalDate mfechaDeCaducidad, String mNumero, String mTitular, double mCredito) {
		super(mfechaDeCaducidad, mNumero, mTitular);
		this.mCredito = mCredito;
		mMovimiento = new ArrayList<Movimiento>();
	}

	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public double getCreditoDisponible() {
		return mCredito + getmCredito();
	}

	@Override
	public double getSaldo() {
		double saldo = 0;
		for (Movimiento movimiento : mMovimiento) {
			saldo += movimiento.getnImporte();
		}
		return saldo + getCreditoDisponible();
	}

	/**
	 * Agrega movimiento de tarjeta de crédito, con el concepto "Ingreso een
	 */
	@Override
	public void ingresar(double importe) throws Exception {
		if (getCreditoDisponible() > 0)
			mMovimiento.add(new Movimiento("Ingreo en tarjeta de crédito", LocalDate.now(), importe));
		if (importe < 0) {
			throw new Exception("No puede ingresar valores negativos");
		}
	}

	/**
	 * Suma todos los importes del mes indicando los elimina de movimeitnos de
	 * tarjeta y añade el movimiento a cuenta asociada
	 * 
	 * @param mes
	 * @param anyo
	 */
	public void liquidar(int mes, int anyo) {
		 double suma = 0; 
		 Movimiento m = new Movimiento();

		 
		 System.out.println("Liquidación de la tarjeta de crédito cuyo mes es: " + mes
		 + " y año: " + anyo); 
		 
		 for (Movimiento movimiento : mMovimiento) { 
			 if ((mes == movimiento.getmFecha().getMonthValue()) 
				&& (movimiento.getmFecha().getYear()== anyo)) { 
				 suma += movimiento.getnImporte(); 
				 mMovimiento.remove(movimiento);
			 }
		} 
		 // Añado el movimiento a la cuenta asociada
		 m.setmConcepto("Liquidar");
		 m.setmFecha(LocalDate.of(anyo, mes, 27));
		 m.setnImporte(suma); 
		 if (suma != 0){ 
			 mMovimiento.add(m);
		 }
		 /*
	 		//Dos pasadas, una para calcular el stream y otra para calcular los elementos
			total = mMovimiento.stream()
					.filter(mov -> mov.getmFecha().getMonthValue() == mes && mov.getmFecha().getYear() == anyo)
					.map(mov -> mov.getnImporte()).reduce(0,(subtotal, element) -> subtotal + element);
			mMovimientos = new List<Movimiento>(mMovimiento.stream()
					.filter(mov -> !(mov.getmFecha().getMonthValue() == mes && mov.getmFecha().getYear() == anyo))
					.collect(Collectors.toList());
		*/
	}

	/**
	 * Filtrar crédito disponible
	 * 
	 * @throws Exception
	 */
	@Override
	public void pagoEnEstablecimiento(String concepto, double importe) throws Exception {
		this.getmCuentaAsociada().retirar("Compra en: " + concepto, importe);
		getCreditoDisponible();
		if (importe < 0)
			throw new Exception("No puede ingresar valores negativos");
		else {
			if (getCreditoDisponible() > 0) {
				Movimiento m = new Movimiento("Compra en: " + concepto, LocalDate.now(), importe);
				this.mMovimiento.add(m);
			}
		}
	}

	/**
	 * Agrega el movimiento de la tarjeta de crédito cuyo concepto es "Retirada en
	 * cuenta asociada(cajero automático) añadimos una comisión de 5%, mínimo de 3
	 * euros filtra crédito disponible
	 * 
	 * @throws Exception
	 */
	@Override
	public void retirar(double importe) throws Exception {
		if (importe < 0)
			throw new Exception("No puede retirar valores negativos");
		else if (getCreditoDisponible() < importe) {
			importe = importe * COMISION > MIN_COMISION ? MIN_COMISION : importe * COMISION;
			Movimiento m = new Movimiento("Retirada en cuenta asociada(cajero automático)", LocalDate.now(), -importe);
			mMovimiento.add(m);
		}
	}
}
