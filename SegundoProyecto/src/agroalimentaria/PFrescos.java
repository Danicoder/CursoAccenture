package agroalimentaria;
/**
 * Clase que define los tipos de productos a utilizar
 * @author Daniela García Millán
 *
 */
public class PFrescos extends Productos{
	private String fechaEnvasado;
	private String paisOrigen;
	/**
	 * Método que devuelve la fecha de envasados del producto
	 * @return la fecha indicada por el usuario
	 */
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	/**
	 * Método que genera la fecha de envasados del producto
	 * @param la fecha indicada por el usuario
	 */
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	/**
	 * Método que devuelve el país de orígen del producto
	 * @return el país de orígen indicado por el usuario
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}
	/**
	 * Método que genera el país de orígen del producto
	 * @param paisOrigen
	 */
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	/**
	 * Método que muestra la fecha indicada por el usuario, 
	 * así como el país de orígen del producto
	 */
	@Override
	public String toString() {
		return "Fecha Envasado: " + fechaEnvasado + "\n Pais Origen: " + paisOrigen;
	}

}
