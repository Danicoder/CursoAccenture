package Herencia.UML;

/**
 * Clase que define los objetos referentes a los datos proporcionados por el
 * cliente que exporta nacionalmente
 * 
 * @author Daniela García Millán
 *
 */
public class ClienteNacional extends Cliente {
	protected String NIF;

	/**
	 * Constructor que contiene el atributo de cliente nacional asignado
	 * 
	 * @param fechaAlta
	 * @param numCliente
	 * @param nombre
	 * @param direccion
	 * @param correoElectronico
	 */
	public ClienteNacional(String NIF) {
		super();
		this.NIF = NIF;
	}

	/**
	 * Método que devuelve el DNI del cliente
	 * 
	 * @return NIF
	 */
	public String getNIF() {
		return NIF;
	}

	/**
	 * Método que obtiene el DNI del cliente
	 * 
	 * @param NIF
	 */
	public void setNIF(String NIF) {
		this.NIF = NIF;
	}
}
