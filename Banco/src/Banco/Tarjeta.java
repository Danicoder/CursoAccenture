package Banco;

import java.time.LocalDate;

public abstract class Tarjeta {
	protected Cuenta mCuentaAsociada;
	protected LocalDate mfechaDeCaducidad; //dd/mm/año
	protected String mNumero;
	protected String mTitular;
	
	protected Tarjeta(LocalDate mfechaDeCaducidad, String mNumero, String mTitular) {
		this.mfechaDeCaducidad = mfechaDeCaducidad;
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}
	/**
	 * Setters y getters
	 */
	public void setCuenta(Cuenta c) {
		this.mCuentaAsociada = c;
	}
	public Cuenta getCuenta(Cuenta c) {
		return mCuentaAsociada;
	}

	public LocalDate getMfechaDeCaducidad() {
		return mfechaDeCaducidad;
	}
	public void setMfechaDeCaducidad(LocalDate mfechaDeCaducidad) {
		this.mfechaDeCaducidad = mfechaDeCaducidad;
	}
	public String getmNumero() {
		return mNumero;
	}
	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}
	public String getmTitular() {
		return mTitular;
	}
	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}
	/**
	 * Métodos abstráctos
	 */
	public abstract double getSaldo();
	public abstract void ingresar(double importe) throws Exception;
	public abstract void pagoEnEstablecimiento(String datos, double importe) throws Exception;
	public abstract void retirar(double importe) throws Exception;
}
