package EntradaSalida;

import java.util.Scanner;

public class DatosScanner {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2;
		System.out.println("Introduce un número");
		n1=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce otro número");
		n2= teclado.nextInt();//lee y luego convierte a int
		//teclado.nextLine(); //le hasta el final de la línea
		
		System.out.format("Primer número %d y segundo número %d",n1,n2);
	}
}
