package agroalimentaria;
/**
 * Clase del objeto congelado, el cual contienen 
 * el tipo de nitrógeno
 * @author Daniela García Millán
 *
 */
public class PCNitrogeno extends PCongelados{
	public String metodo;
	public int segundos;
	/**
	 * Método que devuelve el tiempo obtenido
	 * del nitrógeno en segundos
	 * @return el método obtenido mediante el nitrógeno
	 */
	public String getMetodo() {
		return metodo;
	}
	/**
	 * Método obtenido del nitrógeno
	 * @param adquiere el valor del método
	 */
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	/**
	 * Método que devuelve el tiempo obtenido
	 * del nitrógeno en segundos
	 * @return el tiempo en segundos
	 */
	public int getSegundos() {
		return segundos;
	}
	/**
	 * Método que obtenido el tiempo del nitrógeno 
	 * en segundos
	 * @param se obtiene el tiempo en segundos del nitrógeno
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	/**
	 * Método que genera los datos obtenidos por el nitrógeno
	 */
	@Override
	public String toString() {
		return "métodod del nitrogeno: " + getMetodo() + ", segundos: " + getSegundos();
	}
	
}
