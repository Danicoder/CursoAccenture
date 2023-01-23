package agroalimentaria;
/**
 * Clase que define los productos de la empresa agroalimentaria.
 * @author Daniela García Millán
 *
 */
public class Productos {

	private String fechaCaducidad;
	private int numeroLote; //autoincremento
	
	/**
	 * Método que devuelve la fecha de caducidad del producto
	 * @return fecha de caducidad
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	/**
	 * Método que obtiene la fecha de caducidad del producto
	 * @param fecha de caducidad
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	/**
	 * Método que devuelve el número de lote del producto
	 * @return número de lote
	 */
	public int getNumeroLote() {
		return numeroLote;
	}
	/**
	 * Método que obtiene número de lotes del producto
	 * @param número de lote
	 */
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	/**
	 * Método que genera la fecha de caducidad de los productos
	 */
	@Override
	public String toString() {
		return "Fecha caducidad: " + fechaCaducidad + " Numero Lote: " + numeroLote + " ";
	}
}
