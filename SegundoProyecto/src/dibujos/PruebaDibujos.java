package dibujos;
/**
 * Clase que instancia los objetos para detallar el valor oportuno de cada uno de los 
 * métodos o clases del paquete dibujos.
 * @author Daniela García Millán
 *
 */
public class PruebaDibujos {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(10.7);
		Rectangulo rectangulo = new Rectangulo(5,10.3);
		Triangulo triangulo = new Triangulo(5.6,10);
		
		System.out.println("El radio del circulo es de "+ circulo.getRadio());
		circulo.dibujar();
		rectangulo.dibujar();
		triangulo.dibujar();
	}
}
