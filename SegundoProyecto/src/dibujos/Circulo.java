package dibujos;

/**
 * Clase que define el diámetro y parámetro(área) de un círculo
 * 
 * @author Daniela García Millán
 *
 */
public class Circulo extends FormasGeometricas {
	/**
	 * Método utilizado para calcular el radio del círculo
	 * @param radio
	 */
	protected Circulo(double radio) {
		super(radio);
	}
	/**
	 * Método heredado para calcular el perímetro de un círculo
	 * @return valor del area
	 */
	@Override
	double calcularArea() {
		return Math.PI * Math.pow(this.radio,2);
	}
	/**
	 * Método que sirve para calcular el diametro de un circulo
	 * @return valor del diametro
	 */
	double diametro() {
		return 2*this.radio;
	}
	/**
	 * Método que imprime por pantalla el resultado del área y del diámetro
	 */
	@Override
	void dibujar() {
		System.out.println("Dibujando circulo con un área de " + calcularArea());
		System.out.println("Dibujando circulo con un diámetro de " + diametro());
	}
}
