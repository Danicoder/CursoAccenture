package dibujos;

/**
 * Clase que define el ancho y el alto de un triángulo
 * 
 * @author Daniela García Millán
 *
 */
public class Triangulo extends FormasGeometricas {

	/**
	 * Constructor que heredamos de la clase FormasGeométricas
	 * @param d
	 * @param altura
	 */
	Triangulo(double d, double altura) {
		super(d, altura);
	}

	/**
	 * Metodo que devuelve el valor del área del triángulo
	 */
	@Override
	public double calcularArea() {
		return this.base * this.altura / 2;
	}

	/**
	 * Método que se implementa desde la clase heredada para mostrar el tamaño de
	 * los lados.
	 */
	@Override
	void dibujar() {
		System.out.println("Dibujando un triángulo de " + calcularArea());
	}
}
