package StreamPracticas;

import java.util.Random;
import java.util.stream.Stream;

public class NumPares {

	public static void main(String[] args) {

		/*
		 * int[10] nums = Arrays.stream(nums) .filter(n->n%2==0).toArray();
		 */

		// imprime del o al 9
		Stream.iterate(0, n -> n + 1)
						.limit(10)
						.forEach(System.out::println);
		
		Random rand = new Random();
		Stream.generate(() -> rand.nextInt(1000))
				.limit(20)
				.forEach(System.out::println);
		


	}

}
