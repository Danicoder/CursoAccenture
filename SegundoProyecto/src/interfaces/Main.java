package interfaces;

public class Main {

	public static void main(String[] args) {
		//La instancio sin new
		Interface1 objeto = (a, b) -> a + b;

		System.out.println(objeto.cuenta(3, 5));
		System.out.println(objeto.resuelto(20));
		System.out.println(objeto.saluda());
		
		//(pepe)->System.out.println(pepe);
		//(pepe)->System.out::println; //llamo al método de system que es println
		
		
	}

}
