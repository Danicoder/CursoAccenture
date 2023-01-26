package Banco;

import java.time.LocalDate;
import java.util.ArrayList;

import Implementacion.Filtro;

/**
 * importe positivo siempre
 * 
 * @author d.garcia.millan
 */
public class Cuenta {
	protected ArrayList<Movimiento> nMovimiento;
	protected String nNumero;
	protected String mTitular;
	Filtro filtro = new Filtro();
	final int TEXTO_MAX = 30;
	final int TEXTO_MIN = 20;
	/**
	 * Constructores
	 */

	public Cuenta(String nNumero, String mTitular) {
		//if(filtro.cumpleRangoLongitud(mTitular, TEXTO_MIN, TEXTO_MIN)) {
			this.nNumero = nNumero;
			this.mTitular = mTitular;
			nMovimiento = new ArrayList<Movimiento>();
		//}
	}

	/**
	 * Getters y setters
	 */

	public String getnNumero() {
		return nNumero;
	}

	public void setnNumero(String nNumero) {
		this.nNumero = nNumero;
	}

	public String getmTitular() {
		return mTitular;
	}

	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	/**
	 * Métodos
	 */

	public void addMovimiento(double importe, String concepto) {
		Movimiento m = new Movimiento();
		m.setnImporte(importe);
		m.setmConcepto(concepto);
		m.setmFecha(LocalDate.now());
		addMovimiento(m);
	}
	public void addMovimiento(Movimiento m) {
		nMovimiento.add(m);
	}
	public void listMovimientos() {
		System.out.println("-----------------Movimientos realizados en la cuenta--------------------");
		System.out.println(nMovimiento.size());
		for (Movimiento mov : nMovimiento) {
			System.out.println(mov);
		}
	}

	/**
	 * Obtiene el importe del saldo actual mediante los movimientos obtenidos
	 * 
	 * @return
	 */
	public double getSaldo() {
		double saldo = 0;
		for (Movimiento movimiento : nMovimiento) {
			saldo += movimiento.getnImporte();
		}
		return saldo;
	}

	public void ingresar(double importe) throws Exception {
		if (importe < 0) {
			throw new Exception("No puede ingresar valores negativos");
		} else {
			ingresar("ingreso en efectivo: ", importe); // polimorfismo
		}
	}

	public void ingresar(String concepto, double importe) throws Exception {
		if (importe < 0) {
			throw new Exception("No puede ingresar valores negativos");
		} else {
			addMovimiento(importe, concepto);
		}
	}

	/**
	 * Retirar saldo pposritivo, nunca negativo
	 * 
	 * @param importe
	 * @throws Exception
	 */
	public void retirar(double importe) throws Exception {
		if (importe < 0) {
			System.out.println("No puede retirar un saldo negativo");
		} else {
			retirar("Retirar en efectivo: ", importe); // polimorfismo
		}
	}

	/**
	 * Retirar saldo positivo, nunca negativo
	 * 
	 * @param concepto
	 * @param importe
	 */
	public void retirar(String concepto, double importe) throws Exception{
		if (importe < 0) {
			throw new Exception("No puede retirar un saldo negativo");
		} else if (getSaldo() > 0) {
			addMovimiento(-importe, concepto); // negativo porque estoy retirando dinero
			System.out.println("Retiro realizado");
		}
	}
}
