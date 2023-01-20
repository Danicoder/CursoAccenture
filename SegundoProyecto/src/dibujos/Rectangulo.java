package dibujos;

/**
 * Clase que define el ancho y el alto de un triángulo
 * 
 * @author Daniela García Millán
 *
 */
public class Rectangulo extends FormasGeometricas {
	/**
	 * Constructor que heredamos de la herencia
	 * 
	 * @param base
	 * @param altura
	 */
	Rectangulo(double base, double altura) {
		super(base, altura);
	}
	/**
	 * Método que se hereda de la clase FormasGeométricas para dar
	 * como resultado el área del rectángulo
	 */
	@Override
	double calcularArea() {
		return this.base * this.altura;
	}

	/**
	 * Método heredado de la herencia para imprir el área del rectángulo
	 */
	@Override
	void dibujar() {
		System.out.println("Dibujando un rectángulo de " + calcularArea());
	}
}
