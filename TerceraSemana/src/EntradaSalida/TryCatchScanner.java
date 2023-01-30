package EntradaSalida;

import java.io.File;
import java.util.Scanner;

public class TryCatchScanner {

	public static void main(String[] args) {
		String carpeta ="C:\\Users\\d.garcia.millan\\Desktop\\PruebasFicherosEntradaSalida";
		String archivo ="SoyunFichero.txt";
		//Path path = FilesSystem.getDefult().getPath(carpeta,archivo);
		//Scanner leerfichero = new Scanner(path);
		File fichero = new File(carpeta + archivo);
		try(Scanner leerfichero = new Scanner(fichero)) {
			//en vez de utilizar nextLine,puedo:
			leerfichero.useDelimiter("\n");
			while(leerfichero.hasNext()) {
				String cadena = leerfichero.next();
				System.out.println(cadena + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//leerfichero.close();
	}

}
