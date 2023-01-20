package Herencia.UML;
/**
 * Clase que define los objetos,
 * tales como el nª del cliente 
 * y la fecha en la que se da de alta
 * @author Daniela García Millán
 *
 */
public class Cliente extends Persona {
	private int numCliente;
	private String fechaAlta;
	/**
	 * Constructor vacío 
	 */
	protected Cliente() {	}
	
	
	/*Ejemplo sobreescritura
	public int setNombre() {
		if (filtraNombre(nombre)) {
			super(setNombre(nombre));
		}
	}*/
	/**
	 * Método que obtiene el número del cliente asociado a la persona
	 * @param número del cliente 
	 */
	public void setnumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	/**
	 * Método que devuelve la fecha de alta del cliente
	 * @return fecha de Alta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * Método que obtiene la fecha de alta del cliente asociado a la persona
	 * @param fecha de alta
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * Método procedente de la clase heredada para definir el número de cliete
	 */
	@Override
	String asString() {
		return "Cliente" + numCliente;
	}
	/**
	 * Método que imprime la fecha en la que el usuario se dio de alta
	 */
	public void verFechaAlta() {
		System.out.println("Mi fecha de alta fue: "+ getFechaAlta() );
	}
}
