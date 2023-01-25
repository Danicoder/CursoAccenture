package Banco;

import java.time.LocalDate;

/**
 * Clase que controla el movimiento de la cuenta
 * @author d.garcia.millan
 */
public class movimiento {
	protected String mConcepto;
	protected LocalDate mFecha;
	protected double nImporte;
	
	/**
	 * Constructores
	 */
	public movimiento(String mConcepto, LocalDate mFecha, double nImporte) {
		super();
		this.mConcepto = mConcepto;
		this.mFecha = mFecha;
		this.nImporte = nImporte;
	}
	
	public movimiento() {
		super();
	}

	/**
	 * Getters y setters
	 */
	public String getmConcepto() {
		return mConcepto;
	}

	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}
	public LocalDate getmFecha() {
		return mFecha;
	}
	public void setmFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}
	public double getnImporte() {
		return nImporte;
	}
	public void setnImporte(double nImporte) {
		this.nImporte = nImporte;
	}
	@Override
	public String toString() {
		return getmFecha()+ "\t" + getmConcepto() + "\t" +getnImporte();
	}
}
