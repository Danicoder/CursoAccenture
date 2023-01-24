package Banco;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class tarjeta {
	protected cuenta mCuentaAsociada;
	protected LocalDate mfechaDeCaducidad; //dd/mm/año
	protected String mNumero;
	protected String mTitular;
	
	protected tarjeta(LocalDate mfechaDeCaducidad, String mNumero, String mTitular) {
		this.mfechaDeCaducidad = mfechaDeCaducidad;
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}
	/**
	 * Setters y getters
	 */
	public void setCuenta(cuenta c) {
		this.mCuentaAsociada = c;
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
