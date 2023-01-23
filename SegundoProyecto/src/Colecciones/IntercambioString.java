package Colecciones;
/**
 * Clase genérica para intercambiar de un String a otro
 * @author Daniela García Millán
 *
 * @param <T>
 */
public class IntercambioString<T> {
	
	private T texto1;
	private T texto2;
	/**
	 * Constructor que contiene el valor de los dos textos
	 * @param texto1
	 * @param texto2
	 */
	public IntercambioString(T texto1, T texto2) {
		/*this.texto1 = texto1;
		this.texto2 = texto2;*/
		setTexto1(texto1);
		setTexto2(texto2);
		 
	}
	public void volcado() {
		T t1 = this.getTexto1();
		T t2 = this.getTexto2();
		System.out.println(t2);
		System.out.println(t1);

	}
	/**
	 *  Método que devuelve el contenido del texto1
	 * @return texto1
	 */
	public T getTexto1() {
		return texto1;
	}
	/**
	 *  Método que obtiene el contenido del texto1
	 * @param texto1
	 */
	public void setTexto1(T texto1) {
		this.texto1 = texto1;
	}
	/**
	 * Método que obtiene el contenido del texto2
	 * @param texto2
	 */
	public void setTexto2(T texto2) {
		this.texto2 = texto2;
	}
	/**
	 * Método que devuelve el contenido del texto2
	 * @return texto2
	 */
	public T getTexto2() {
		return texto2;
	}
	/**
	 * Método que muestra el resultado obtenido por los
	 * objetos referenciados anteriormente.
	 */
	public static void main(String[] args) {
		IntercambioString<String> intercambio1 = new IntercambioString<String>("Hola","chao");
		intercambio1.setTexto1(new String("Daniela"));
		intercambio1.setTexto2(new String("Miguel"));
		
		//Sin casteo
		String intercambio2 = intercambio1.getTexto1();
		intercambio1.volcado();
		System.out.println(intercambio2);
	}
}
