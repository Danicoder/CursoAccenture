package RecursosFormacion;

import java.util.Iterator;

public class BuclesYsaltos {
	public static void Comparando() {
		int a = 0;
		int b = 45;
			if(a > b)
				System.out.println(a + " es mayor a " + b);
			else
				System.out.println(b + " es mayor a " + a);
			if(a==b)
				System.out.println(" ambos números coinciden");
			if(a % b == 0 || b % a == 0)
			{
				System.out.println("Además, son multiplos");
			}
			else{
				System.out.println("Además, no son multiplos");
			}
			
	}
	public static void NotasClase(int nota) {
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		}
		
	}
	public static void FiltroFecha1(int dia,int mes,int anyo) {
		if(dia >= 1 && dia <= 30) {
			if(mes >= 1 && mes <= 12) {
				if(anyo > 0) {
					System.out.println("Fecha correcta");
				}
				else {
					System.out.println("Año incorrecto");
				}
			}
			else {
				System.out.println("Mes incorrecto");
			}
		}
		else {
			System.out.println("Día incorrecto");
		}
	}
	public static void FiltroFecha2(int dia,int mes,int anyo) {
		int diames = 0;
		if(mes >= 1 && mes <= 12) {
			switch(mes)
			{
				case 1:	case 3:	case 5:case 7:case 8:case 10:case 12:
					diames=31;
					break;
				case 4:	case 6:	case 9:	case 11:
					diames=30;
					break;
				default:
					System.out.println("Año erróneo");
					break;
			}
			if(dia<=diames) {
				if(anyo > 0) {
					System.out.println("Fecha correcta");
				}
			}
			else {
				System.out.println("Día incorrecto");
			}
		}
		
	}
	public static void FiltroFecha3(int dia,int mes,int anyo) {
		int[] meses = {1,2,3,4,5,6,7,8,9,10,11,12}; 

			if(mes >= 1 && mes <= 12) {
				if(dia>0 && dia>=meses[mes-1] && anyo > 0) {
					System.out.println("La fecha es correcta");
				}
				else {
					System.out.println("La fecha es incorrecta");
				}
			}
			else {
				System.out.println("Mes incorrecto");
			}
	}
	public static void FiltroFecha4(int dia,int mes,int anyo) {
		int[] meses = {1,2,3,4,5,6,7,8,9,10,11,12}; 

		if(mes >= 1 && mes <= 12) {
			if(dia>0 && dia>=meses[mes-1]) {
				if((anyo % 4 == 0 && anyo % 100 != 0) | anyo%400==0) {
					meses[1]=29;
				}
				System.out.println("La fecha es correcta");
			}
			else {
				System.out.println("Día incorrecto");
			}
		}
		else {
			System.out.println("Mes incorrecto");
		}
	}
	public static void ConvertirNumAtextoV1(int num) {
		int unidades, decenas;
		
		String[] decenasArray = {"","diez","veinte","treinta","cuarenta","cincuenta","sexenta","setenta","ochenta","noventa"};
		String[] unidadesArray = {"","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
		
		unidades = num % 10;
		decenas = num / 10;
		
		System.out.println(unidades == 0 || decenas == 0 ? decenasArray[decenas] : decenasArray[decenas]+" y "+unidadesArray[unidades]);
	}
	public static void ConvertirNumAtextoV2(int num) {
		int unidades, decenas;
		
		String[] decenasArray = {"","diez","veinte","treinta","cuarenta","cincuenta","sexenta","setenta","ochenta","noventa"};
		String[] unidadesArray = {"","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
		
		unidades = num % 10;
		decenas = num / 10;
		
		System.out.println(unidades == 0 || decenas == 0 ? decenasArray[decenas] : decenasArray[decenas]+" y "+unidadesArray[unidades]);
	}
	public static void SalidaComandosArgs(String[] args) {
		int num = 0;
		double cuadrado = 0;
		
		for (String nums: args) {
			num = Integer.parseInt(nums);
			cuadrado = Math.pow(cuadrado, 2);
			System.out.println("Cuadrado de "+ num + " es " + cuadrado);
		}

	}
	public static void ListarNumeros() {
		
		for (int i = 100; i >= 0; i -= 23) {
				System.out.println(i);
		}
	}
	public void NumMultiplos() {
		
	}
	public static void Factorial(int num) {
		int factorial=0;
		for (int i = num; i > 0; i--) {
			factorial = factorial *i;
		}
		System.out.println("El factorial de "+ num +  "es:"+ factorial);
	}
	public static void TablaMultiplicar() {
		int tabla=0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+1 + "*");
			for (int j = i; j <= i; j++) {
				System.out.print(j+1);
			}
		}
	}
	public static void DibujoCuadrado(int cantidad) {
		for (int i = 0; i < cantidad; i++) {//fila
			for (int j = 0; j < cantidad; j++) { //columna
				System.out.print("* ");
			}
		System.out.println("");
		}
	}
	public static void PrimosCantidad() {
		bool primo=true;
		for (int i = 1; i <= 100; i++) {
			if(primo % i == 0) {
				primo += i;
			}
			System.out.println(primo);
		}
	}
	public static void main(String[] args) {
		//Comparando();
		//NotasClase(3);
		//FiltroFecha1(10,8,2015);
		//FiltroFecha2(20,8,2015);
		//FiltroFecha3(20,8,2015);
		//FiltroFecha4(20,8,2004);
		//ConvertirNumAtextoV1(72);
		//ConvertirNumAtextoV2(72);
		//SalidaComandosArgs(args);
		//ListarNumeros();
		//Factorial(8);
		//TablaMultiplicar();
		//DibujoCuadrado(8);
		PrimosCantidad();
	}

}
