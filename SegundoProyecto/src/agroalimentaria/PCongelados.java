package agroalimentaria;
/**
 * Esta clase define objetos que contienen
 * los tipos de congelados, así como su temperatura 
 * definida al crear los objetos
 * @author Daniela García Millán
 *
 */
public class PCongelados {
	
	private double temperatura;
	
	/**
	 * Método que devuelve la temperatura del producto congelado
	 * @return temperatura
	 */
	public double getTemperatura() {
		return temperatura;
	}
	/**
	 * Método que obtiene la temperatura del producto congelado
	 * @param temperatura
	 */
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * Método que genera la temperatura de los productos congelados
	 */
	@Override
	public String toString() {
		return "Temperatura: " + getTemperatura() + " ";
	}
}
