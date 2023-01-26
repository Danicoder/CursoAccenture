package StreamPracticas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ConFiles {
	public static void main(String[] args) throws IOException {
		Stream ficheros = Files.walk(Paths.get(""));
		ficheros
		.filter(s->s.toString().contains(".java"))
		.forEach(System.out::println);
	}
}
