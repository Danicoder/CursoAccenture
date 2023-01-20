package Herencia.UML;
/**
 * Clase que define el código de usuario de la persona
 * @author Daniela García Millán
 *
 */
public class Usuario extends Persona{
	private int codigoUsuario;
	/**
	 * Constructor definido en la clase persona
	 * para hacer uso de los atributos de dicha clase.
	 * @param nombre
	 * @param direccion
	 * @param correoElectronico
	 */
	public Usuario(String nombre, String direccion, String correoElectronico) {
		super(nombre, direccion, correoElectronico);
	}
	/**
	 * Método que devuelve el código de los usuarios
	 * @return código de los usuarios
	 */
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	/**
	 * Método que obtiene el código de usuario
	 * @param codigoUsuario
	 */
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	/**
	 * Método que verifica la veracidad del usuario
	 * para autorizarlo
	 */
	public static void autorizar() {
		System.out.println("Autorizo");
	}
	/**
	 * Método que crea al usuario
	 */
	public static void crear() {
		System.out.println("Estoy creando un usuario");
	}
	/**
	 * Método obtenido por la clase herredada para
	 * definir el código de usuario obtenido
	 */
	@Override
	String asString() {
		return "Código del usuario: " + getCodigoUsuario();
	}

}
