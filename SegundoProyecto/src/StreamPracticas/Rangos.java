package StreamPracticas;

import java.util.stream.IntStream;

public class Rangos {

	public static void main(String[] args) {
		//Strings de integers
		IntStream numeros = IntStream.range(1, 20);//20 excluido
		numeros.forEach(System.out::println);
	}

}
