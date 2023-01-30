package CopyPasteFicheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copiarFichero {

	public static void main(String[] args) throws IOException {
		Path pathSource1 = Paths.get("C:","\\Users\\d.garcia.millan\\Desktop\\PruebasFicherosEntradaSalida\\SoyunFichero.txt");
		Path destPath2 = Paths.get("C:Users\\d.garcia.millan\\Desktop\\PruebasFicherosEntradaSalida\\SoyunFichero.txt");
		
		Path target = Files.copy(pathSource1, destPath2, StandardCopyOption.REPLACE_EXISTING);
		System.out.println(target.getFileName());
	}

}
