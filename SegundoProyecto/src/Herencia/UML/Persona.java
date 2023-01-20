package Herencia.UML;

/**
 * Clase que define objetos, tales como los datos personales de una persona
 * 
 * @author Daniela García Millán
 *
 */
public abstract class Persona {
	private int id;
	protected String nombre;
	protected String direccion;
	protected String correoElectronico;

	/**
	 * Constructor vacío
	 */
	protected Persona() {
		super();
	}

	/**
	 * Constructor que define los datos personales del cliente
	 * @param nombre
	 * @param direccion
	 * @param correoElectronico
	 */
	protected Persona(String nombre, String direccion, String correoElectronico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Clase abstracta definida por cada clase que herede de este
	 * 
	 * @return tipo String
	 */
	abstract String asString();

	/**
	 * Método que devuelve la identidad del cliente
	 * 
	 * @return identidad del usuario
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método que asigna la identidad del cliente
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método que devuelve el nombre del cliente
	 * 
	 * @return nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que obtiene el nombre del cliente
	 * 
	 * @param nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve la direccion del cliente
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método que obtiene la direccion del cliente
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Método que devuelve el correo electónico del cliente
	 * 
	 * @return correo electónico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * Método que obtiene el correco electrónico del cliente
	 * 
	 * @param correo electronico
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Método que da de alta el cliente
	 */
	public static void crear() {
		System.out.println("Creo una persona");
	}

	/**
	 * Método que borra al cliente
	 */
	public static void borrar() {
		System.out.println("Borro una persona");
	}

	/**
	 * Método que envia un mensaje al cliente
	 */
	public static void enviarMensaje() {
		System.out.println("EnvioMensaje");
	}
}
