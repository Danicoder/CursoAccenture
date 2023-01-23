package Automovil;

public class moto extends vehiculo {
	
	private int capacidadDeposito;
	

	public moto(int numMarchas, int velocidadMax, String VIN, int numRuedas,int capacidadDeposito) {
		super(numMarchas, velocidadMax, VIN, numRuedas);
		this.capacidadDeposito = capacidadDeposito;
	}


	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}


	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}
	
}
