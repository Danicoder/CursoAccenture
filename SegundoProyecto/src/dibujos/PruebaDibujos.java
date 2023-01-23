package dibujos;
/**
 * Clase que instancia los objetos para detallar el valor oportuno de cada uno de los 
 * métodos o clases del paquete dibujos.
 * @author Daniela García Millán
 *
 */
public class PruebaDibujos {
	public static void main(String[] args) {
		FormasGeometricas circulo1 = new Circulo(10.7);
		FormasGeometricas circulo2 = new Circulo(2);
		Circulo c1 = new Circulo(2);
		
		//Cómo la clase padre implementa ese método sus subclases también pueden
		c1.getCoordenadas().invertir();
		circulo2.getCoordenadas().invertir();
		
		Rectangulo rectangulo = new Rectangulo(5,10.3);
		Triangulo triangulo = new Triangulo(5.6,10);
				
		System.out.println("El área del circulo es de "+ circulo1.getbase() + "x" + circulo1.getaltura() + "=" + circulo1.getRadio());
		System.out.println("El área del triángulo es de "+ triangulo.getbase() + "x" + triangulo.getaltura() + "=" + triangulo.calcularArea());
		System.out.println("El área del rectángulo es de "+ rectangulo.getbase() + "x" + rectangulo.getaltura() + "=" + rectangulo.calcularArea());
		circulo1.dibujar();
		rectangulo.dibujar();
		triangulo.dibujar();
	}
}
