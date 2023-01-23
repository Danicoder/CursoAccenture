package agroalimentaria;
/**
 * Clase que define un objeto, el cual contienen 
 * salinidad como objeto
 * @author Daniela García Millán
 *
 */
public class PCAgua extends PCongelados{
	
	private double salinidad;
	
	public PCAgua(String fechaCaducidad, int numeroLote, double temperatura, double salinidad) {
		super(fechaCaducidad, numeroLote, temperatura);
		this.salinidad = salinidad;
	}
	/**
	 * Método que devuelve la salinidad obtenida del agua
	 * @return cantidad de sal encontrada en el agua
	 */
	public double getSanidad() {
		return salinidad;
	}
	/**
	 * Método que obtiene la salinidad obtenida del agua
	 * @return cantidad de sal encontrada en el agua
	 */
	public void setSanidad(double sanidad) {
		this.salinidad = sanidad;
	}
	/**
	 * Método que muestra al usuario cuanta sal contiene el agua,
	 * dato obtenido como objeto
	 */
	@Override
	public String toString() {
		return super.toString() + "Salidad  del agua: " + salinidad;
	}

}
