package Banco;

import java.time.LocalDate;
import java.util.ArrayList;

import Implementacion.filtro;

/**
 * importe positivo siempre
 * 
 * @author d.garcia.millan
 */
public class cuenta {
	protected ArrayList<movimiento> nMovimiento;
	protected String nNumero;
	protected String mTitular;

	/**
	 * Constructores
	 */

	public cuenta(String nNumero, String mTitular) {
		this.nNumero = nNumero;
		this.mTitular = mTitular;
		nMovimiento = new ArrayList<movimiento>();
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
		movimiento m = new movimiento();
		m.setnImporte(importe);
		m.setmConcepto(concepto);
		m.setmFecha(LocalDate.now());
		addMovimiento(m);
	}
	public void addMovimiento(movimiento m) {
		nMovimiento.add(m);
	}
	public void listMovimientos() {
		System.out.println("-----------------Movimientos realizados en la cuenta--------------------");
		System.out.println(nMovimiento.size());
		for (movimiento mov : nMovimiento) {
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
		for (movimiento movimiento : nMovimiento) {
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
	public void retirar(String concepto, double importe) {
		if (importe < 0) {
			System.out.println(importe);
			System.out.println("No puede retirar un saldo negativo");
		} else if (getSaldo() > 0) {
			addMovimiento(-importe, concepto); // negativo porque estoy retirando dinero
			System.out.println("Retiro realizado");
		}
	}
}
