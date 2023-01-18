package Ejercicios_S1;

public class PruebaCast {

	public static void main(String[] args) {
		double n= 10;
		char a = 'c';
		float f = 34;
		double d= 3.1;
		short s=0;
		byte b=2;
		
		n=(char)a;
		System.out.println(n);
		n=(int)f; 
		System.out.println(n);
		n=(double)d; 
		n=s; 
		n=2; 
		n=b;
		System.out.println(n);
	}

}
