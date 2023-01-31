package PruebasFicherosUser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		//Abro el fichero para mostrar los datos de ese fichero
		File fichero = new File("C:\\Users\\d.garcia.millan\\Desktop\\PruebasFicherosEntradaSalida\\texto.txt");
		
		FileReader fr = new FileReader(fichero);
		BufferedReader bfr = new BufferedReader(bfr);
		
		try(Scanner leerfichero = new Scanner(fichero)) {
			leerfichero.useDelimiter("\n");
			while(leerfichero.hasNext()) {
				String cadena = leerfichero.next();
				System.out.println(cadena + " ");
			}
		}catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			fichero.;
		}
	}
}
