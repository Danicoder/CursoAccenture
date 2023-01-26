package StreamPracticas;

import java.util.Optional;

public class Optionales {

	public static void main(String[] args) {
		String name = "Daniela";
		Optional<String> nameDani = Optional.ofNullable(name);
		nameDani.ifPresent(nombre->System.out.println(nombre.length()));
		//nameDani.ifPresent(n->System.out.print(name.length()));
		System.out.println(Optional.ofNullable(name).orElse("Daniela"));
	}

}
