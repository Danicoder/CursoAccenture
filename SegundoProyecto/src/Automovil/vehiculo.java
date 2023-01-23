/**
 * 
 */
package Automovil;

/**
 * @author d.garcia.millan
 *
 */
public class vehiculo implements Dao {
	private int numMarchas;
	private int velocidadMax;
	private String VIN; // número de chasis
	private int numRuedas;
	private String matricula;
	// bloques inicialización staticos
	static int contador;
	static {
		contador = 1500;
	}

	vehiculo() {
		setMatricula("B-" + ++contador);
	}

	/*vehiculo(String modelo, int marchas) {
		// llamar al otro constructor de la clase
		this();
		setModelo(modelo);
		setMarchas(marchas);
	}*/

	public vehiculo(int numMarchas, int velocidadMax, String VIN, int numRuedas) {
		super();
		this.numMarchas = numMarchas;
		this.velocidadMax = velocidadMax;
		this.VIN = VIN;
		this.numRuedas = numRuedas;
		AccesoBD dao = new AccesoBD();
		dao.AccesoLectura(this);
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void grabar() {
		// TODO Auto-generated method stub

	}
}
