/**
 * 
 */
package Automovil;

/**
 * @author d.garcia.millan
 *
 */
public class vehiculo {
	private int numMarchas;
	private int velocidadMax;
	private String VIN; // número de chasis
	private int numRuedas;
	
	
	//bloques inicialización staticos
	static int contador;
	static {contador=1500;}
	
	/*Vehiculo(){
		setMatricula("B-"+ ++contador);
	}*/
	
	
	public vehiculo(int numMarchas, int velocidadMax, String VIN, int numRuedas) {
		super();
		this.numMarchas = numMarchas;
		this.velocidadMax = velocidadMax;
		this.VIN = VIN;
		this.numRuedas = numRuedas;
		//llamar a otro constructor de la clase this.()?
	}


	public vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	
}
