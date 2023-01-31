package PruebasFicherosUser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) throws IOException {
		//Abro el fichero para mostrar los datos de ese fichero
		File fichero = new File(".\\PruebasFicherosUser");
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		String nombre ="";
		String apellido ="";
		String lectura = "";
		
		while((lectura = br.readLine()) != null) {
			String dato[] = lectura.split("=");
			
			if(dato[0].equals("Nombre")) {
				nombre=dato[1];
			}
			if(dato[0].equals("Apellido")) {
				apellido=dato[1];
			}
		}
		System.out.println(nombre + " " + apellido);
	}
}
