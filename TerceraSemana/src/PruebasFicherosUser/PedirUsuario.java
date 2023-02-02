package PruebasFicherosUser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PedirUsuario {
	/**
	 * Programa que pide por teclado los siguientes datos: -Nombre -Apellido Los
	 * grabo en un fichero con la estructura de - nombre = nombre - apellido =
	 * apellido A continuación, nueva clase capaz de leer este fichero y presentar
	 * por pantalla los datos leidos
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		try(Scanner lectura = new Scanner(System.in)) {
			// Si no existe creo el fichero indicado
			FileWriter fichero = new FileWriter(".\\PruebasFicherosUser");

			String nombre;
			String apellido;
				// Pregunto al usuario
				System.out.println("Ingrese su nombre: ");
				nombre = lectura.next();
				System.out.println("Ingrese su apellido: ");
				apellido = lectura.next();
			PrintWriter bw = new PrintWriter(fichero);

			// Escribo en el fichero indicado al comienzo
			bw.println("Nombre=" + nombre);
			bw.println("Apellido=" + apellido);

			// Cierro el stream
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Archivo modifciado");
		}
	}
}
