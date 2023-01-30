package PruebasFicherosUser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.sound.midi.Patch;

public class PedirUsuario {
	/**
	 * Programa que pide por teclado los siguientes datos:
	 * -Nombre
	 * -Apellido
	 * Los grabo en un fichero con la estructura de 
	 * - nombre = nombre
	 * - apellido = apellido
	 * A continuación, nueva clase capaz de leer este fichero 
	 * y presentar por pantalla los datos leidos
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		try {
			//Si no existe creo el fichero indicado
			FileWriter fichero = new FileWriter("C:\\Users\\d.garcia.millan\\Desktop\\PruebasFicherosEntradaSalida\\texto.txt");
			Scanner lectura = new Scanner(System.in);
			
			//Pregunto al usuario
			System.out.println("Ingrese su nombre: ");
			String nombre = lectura.next();
			System.out.println("Ingrese su apellido: ");
			String apellido = lectura.next();
			
			//Escribo en el fichero indicado al comienzo
			fichero.write("Nombre = "+nombre+"\n");
			fichero.write("Apellido = "+apellido);
			
			//Cierro el stream
			fichero.close();
			
		}catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
