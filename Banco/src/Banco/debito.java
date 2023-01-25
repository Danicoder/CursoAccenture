package Banco;

import java.time.LocalDate;

public class debito extends tarjeta {

	public debito(LocalDate mfechaDeCaducidad, String mNumero, String mTitular) {
		super(mfechaDeCaducidad, mNumero, mTitular);
	}

	@Override
	public double getSaldo() {
		return this.mCuentaAsociada.getSaldo();
	}

	@Override
	public void ingresar(double importe) throws Exception {
		if(importe < 0)
			throw new Exception("No puede ingresar valores negativos");
		else {
			if(getSaldo() > 0) {
				this.mCuentaAsociada.ingresar("Ingreso en (cajero automático)", importe);
			}
		}
	}

	@Override
	public void pagoEnEstablecimiento(String concepto, double importe) {
		this.mCuentaAsociada.retirar("Compra en: "+ concepto, importe);
	}

	@Override
	public void retirar(double importe) throws Exception {
		this.mCuentaAsociada.retirar("Retiro en (cajero automático)", importe);
	}
}
