package CopyPasteFicheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoverFichero {

	public static void main(String[] args) throws IOException {
		Path origen = Paths.get("C:\\Users\\d.garcia.millan\\Desktop\\PruebasFicherosEntradaSalida\\SoyunFichero.txt");
		Path destino = Paths.get("C:\\Users\\d.garcia.millan\\Desktop\\prueba2Ficheros");
		Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
	}
}
