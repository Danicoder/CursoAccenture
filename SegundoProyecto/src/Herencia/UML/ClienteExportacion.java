package Herencia.UML;

/**
 * Clase que define los datos del cliete que ha realizado la exportación
 * 
 * @author Daniela García Millán
 *
 */
public class ClienteExportacion extends Cliente {

	private String VAT; // no me deja poner final

	/**
	 * Contructor que define l
	 * 
	 * @param vAT
	 * @param nombre
	 * @param direccion
	 * @param correoElectronico
	 */
	public ClienteExportacion(String vAT, String nombre, String direccion, String correoElectronico) {
		super();
		VAT = vAT;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Método que devuelve el número de identificación fiscal de una empresa
	 * española que va a realizar operaciones a nivel europeo
	 * 
	 * @return VAT
	 */
	public String getVAT() {
		return VAT;
	}

	/**
	 * Método que obtiene el número de identificación fiscal de una empresa española
	 * que va a realizar operaciones a nivel europeo
	 * 
	 * @param VAT
	 */
	public void setVAT(String vAT) {
		VAT = vAT;
	}

	/**
	 * Método que devuelve el nombre del cliente
	 * 
	 * @return nombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que asigna el nombre del cliente
	 * 
	 * @param nombre
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve la dirección del cliente
	 * 
	 * @return dirección
	 */
	@Override
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método que asigna la dirección del cliente
	 * 
	 * @param dirección
	 */
	@Override
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Método que devuelve el correo electrónico del cliente
	 * 
	 * @return correo electrónico
	 */
	@Override
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * Método que asigna el correo electrónico del cliente
	 * 
	 * @param correo electrónico
	 */
	@Override
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "ClienteExportacion [nombre=" + nombre + ", direccion=" + direccion + ", correoElectronico="
				+ correoElectronico + "]";
	}
}
