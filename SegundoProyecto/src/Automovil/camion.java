package Automovil;

public class camion extends vehiculo {
	private long pesoMax;
	private double precio;
	
	public camion(int numMarchas, int velocidadMax, String VIN, int numRuedas, long pesoMax, double precio) {
		super(numMarchas, velocidadMax, VIN, numRuedas);
		this.pesoMax = pesoMax;
		this.precio = precio;
	}

	public long getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(long pesoMax) {
		this.pesoMax = pesoMax;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
		
}
