package Banco;

import java.time.LocalDate;

public class Debito extends Tarjeta {
	//cuenta asociada envia todos los movimientos a la cuenta
	public Debito(LocalDate mfechaDeCaducidad, String mNumero, String mTitular) {
		super(mfechaDeCaducidad, mNumero, mTitular);
	}

	@Override
	public double getSaldo() {
		return this.getmCuentaAsociada().getSaldo();
	}

	@Override
	public void ingresar(double importe) throws Exception {
		if(importe < 0)
			throw new Exception("No puede ingresar valores negativos");
		else {
			if(getSaldo() > 0) {
				this.getmCuentaAsociada().ingresar("Ingreso en (cajero automático)", importe);
			}
		}
	}

	@Override
	public void pagoEnEstablecimiento(String concepto, double importe) throws Exception {
		this.getmCuentaAsociada().retirar("Compra en: "+ concepto, importe);
	}

	@Override
	public void retirar(double importe) throws Exception {
		this.getmCuentaAsociada().retirar("Retiro en (cajero automático)", importe);
	}
}
