package agroalimentaria;
/**
 * Clase que define objetos, los cuales contienen 
 * variedad de congelados obtenidos como objetos
 * @author Daniela García Millán
 *
 */
public class PCAire extends PCongelados{
	private double pNitrogeno;
	private double pOxigeno;
	private double pDioxidoCarbono;
	private double pVaporAgua;
	/**
	 * Método que devuelve la cantidad de nitrógeno 
	 * obtenida de los productos congelados
	 * @return devuelve la cantidad de 
	 * nitrógeno obtenida de los congelados
	 */
	public double getpNitrogeno() {
		return pNitrogeno;
	}
	/**
	 * Método que obtiene la cantidad de nitrógeno 
	 * obtenida de los productos congelados
	 * @return obtiene la cantidad de 
	 * nitrógeno obtenida de los congelados
	 * @param cantidad de nitrógeno adquirida por el usuario
	 */
	public void setpNitrogeno(double pNitrogeno) {
		this.pNitrogeno = pNitrogeno;
	}
	/**
	 * Método que devuelve la cantidad de oxígeno 
	 * obtenida de los productos congelados
	 * @return devuelve la cantidad de 
	 * oxígeno obtenida de los congelados
	 */
	public double getpOxigeno() {
		return pOxigeno;
	}
	/**
	 * Método que obtiene la cantidad de oxígeno 
	 * obtenida de los productos congelados
	 * @return obtiene la cantidad de 
	 * oxígeno obtenida de los congelados
	 * @param cantidad de oxígeno adquirida por el usuario
	 */
	public void setpOxigeno(double pOxigeno) {
		this.pOxigeno = pOxigeno;
	}
	/**
	 * Método que devuelve la cantidad de dióxido
	 * de carbono obtenida de los productos congelados
	 * @return devuelve la cantidad de 
	 * dióxido de carbono obtenida de los congelados
	 */
	public double getpDioxidoCarbono() {
		return pDioxidoCarbono;
	}
	/**
	 * Método que obtiene la cantidad de dióxido
	 * de carbono obtenida de los productos congelados
	 * @return obtiene la cantidad de 
	 * de dióxido de carbono obtenida de los congelados
	 * @param cantidad de dióxido de carbono adquirida por el usuario
	 */
	public void setpDioxidoCarbono(double pDioxidoCarbono) {
		this.pDioxidoCarbono = pDioxidoCarbono;
	}
	/**
	 * Método que devuelve el vapor de agua
	 * obtenida de los productos congelados
	 * @return devuelve la cantidad de 
	 * vapor de agua obtenida de los congelados
	 */
	public double getpVaporAgua() {
		return pVaporAgua;
	}
	/**
	 * Método que obtiene el vapor de agua 
	 * obtenido de los productos congelados
	 * @return obtiene la cantidad de 
	 * vapor de agua obtenida de los congelados
	 * @param cantidad de vapor de agua adquirida por el usuario
	 */
	public void setpVaporAgua(double pVaporAgua) {
		this.pVaporAgua = pVaporAgua;
	}
	/**
	 * Método que genera la cantidad de nitrógeno,
	 * vapor de agua,oxígeno, dióxido de carbono
	 * obtenida de los productos congelados
	 */
	@Override
	public String toString() {
		return "\n %Nitrogeno: " + getpNitrogeno() + "\n %Oxigeno: " + getpOxigeno() + " \n %Dioxido de carbono: " + getpDioxidoCarbono()
				+ "\n %VaporAgua: " + getpVaporAgua();
	}
	
	

}
