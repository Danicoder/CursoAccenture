package curso.BuclesYsaltos;

/**
 * 
 * @author Daniela García Millán
 *
 */
public class BuclesYsaltos {
	/**
	 * Compruba cúal de ambos parámetros es el mayor,multiplo o sí son iguales
	 */
	public static void comparando(int a, int b) {
		if (a > b)
			System.out.println(a + " es mayor a " + b);
		else
			System.out.println(b + " es mayor a " + a);
		if (a == b)
			System.out.println(" ambos números coinciden");
		if (a % b == 0 || b % a == 0) {
			System.out.println("Además, son multiplos");
		} else {
			System.out.println("Además, no son multiplos");
		}
	}

	/**
	 * Según la nota que tenga el aluno se le muestra al usuario sí dicha nota es
	 * Insuficiente,bien,Suficiente o sobresaliente. Posdata: lo había hecho de otra
	 * forma pero lo borre al ver que la que puso el profesor eramos óptima.
	 * 
	 * @param nota
	 */
	public static void notasClase(int nota) {
		switch (nota) {
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

	/**
	 * Método que indica la fecha correcta asumiendo 30 días del mes.
	 * 
	 * @param dia  Día que contiene el mes
	 * @param mes  Mes comprendido en un año
	 * @param anyo Años comprendidos en fechas que no sean negativas
	 */
	public static void filtroFecha1(int dia, int mes, int anyo) {
		if (dia >= 1 && dia <= 30) {
			if (mes >= 1 && mes <= 12) {
				if (anyo > 0) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Año incorrecto");
				}
			} else {
				System.out.println("Mes incorrecto");
			}
		} else {
			System.out.println("Día incorrecto");
		}
	}

	/**
	 * Método que indica la fecha correcta utilizando los días reales de cada mes,
	 * sin arrays.
	 * 
	 * @param dia  Día que contiene el mes
	 * @param mes  Mes comprendido en un año
	 * @param anyo Años comprendidos en fechas que no sean negativas
	 */
	public static void filtroFecha2(int dia, int mes, int anyo) {
		int diames = 0;
		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diames = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				diames = 30;
				break;
			default:
				System.out.println("Año erróneo");
				break;
			}
			if (dia <= diames) {
				if (anyo > 0) {
					System.out.println("Fecha correcta");
				}
			} else {
				System.out.println("Día incorrecto");
			}
		}
	}

	/**
	 * Método que indica la fecha correcta utilizando los días reales de cada mes,
	 * con arrays. *
	 * 
	 * @param dia  Día que contiene el mes
	 * @param mes  Mes comprendido en un año
	 * @param anyo Años comprendidos en fechas que no sean negativas
	 */
	public static void filtroFecha3(int dia, int mes, int anyo) {
		int[] meses = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		if (mes >= 1 && mes <= 12) {
			if (dia > 0 && dia >= meses[mes - 1] && anyo > 0) {
				System.out.println("La fecha es correcta");
			} else {
				System.out.println("La fecha es incorrecta");
			}
		} else {
			System.out.println("Mes incorrecto");
		}
	}

	/**
	 * Método que indica la fecha correcta teniendo en cuenta los años bisiestos.
	 * 
	 * @param dia  Día que contiene el mes
	 * @param mes  Mes comprendido en un año
	 * @param anyo Años comprendidos en fechas que no sean negativas
	 */
	public static void filtroFecha4(int dia, int mes, int anyo) {
		int[] meses = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		if (mes >= 1 && mes <= 12) {
			if (dia > 0 && dia >= meses[mes - 1]) {
				if ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0) {
					meses[1] = 29;
				}
				System.out.println("La fecha es correcta");
			} else {
				System.out.println("Día incorrecto");
			}
		} else {
			System.out.println("Mes incorrecto");
		}
	}

	/**
	 * Método que convierte los números literales en palabras
	 * 
	 * @param num
	 */
	public static void convertirNumAtextoV1(int num) {
		int unidades;
		int decenas;

		String[] decenasArray = { "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sexenta", "setenta",
				"ochenta", "noventa" };
		String[] unidadesArray = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
				"diez" };

		unidades = num % 10;
		decenas = num / 10;

		System.out.println(unidades == 0 || decenas == 0 ? decenasArray[decenas]
				: decenasArray[decenas] + " y " + unidadesArray[unidades]);
	}

	/**
	 * Método como el anterior pero con un sistema de calculo diferente
	 * 
	 * @param num
	 */
	public static void convertirNumAtextoV2(int num) {
		int unidades = 0;
		int decenas = 0;

		unidades = num % 10;
		decenas = num / 10;

		switch (decenas) {
		case 0:
			System.out.println("");
			break;
		case 1:
			System.out.println("diez");
			break;
		case 2:
			System.out.println("veinte");
			break;
		case 3:
			System.out.println("treinta");
			break;
		case 4:
			System.out.println("cuarenta");
			break;
		case 5:
			System.out.println("cincuenta");
			break;
		case 6:
			System.out.println("sexenta");
			break;
		case 7:
			System.out.println("setenta");
			break;
		case 8:
			System.out.println("ochenta");
			break;
		case 9:
			System.out.println("noventa");
			break;
		}
		System.out.println("y");
		switch (unidades) {
		case 0:
			System.out.println("");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("siete");
			break;
		case 8:
			System.out.println("ocho");
			break;
		case 9:
			System.out.println("nueve");
			break;
		}
	}

	/**
	 * Método que calcula el cuadrado de un número y lo muestra por pantalla
	 * 
	 * @param args
	 */
	public static void calidaComandosArgs(String[] args) {
		int num = 0;
		double resultado = 0;

		for (String nums : args) {
			num = Integer.parseInt(nums);
			resultado = Math.pow(resultado, 2);
			System.out.println(num + " ^2 = " + resultado);
		}
	}

	/**
	 * Listar números de 100 al 0 de 23 en 23
	 */
	public static void listarNumeros() {
		for (int i = 100; i >= 0; i -= 23) {
			System.out.println(i);
		}
	}

	/**
	 * Método que devuelve verdadero sí es primo, en caso contrario devolverá falso.
	 * 
	 * @param num
	 * @return
	 */
	static boolean esPrimo(int num) {
		for (int i = 5; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Calcular los números múltiplos
	 */
	public static boolean esMultiplo(int n1, int n2) {
		if (n1 % n2 == 0)
			return true;
		else
			return false;
	}

	/**
	 * Calcular la suma de los primeros 10 números múltiplos de 5
	 */
	public static void numMultiplo(int num) {
		int acomulador = 0;
		int contador = 0;
		int suma =0;
		
		for (int i = 1; i <= 10000; i++) {
			if (esMultiplo(i, num)) {
				acomulador += i;
				contador++;
			}
			if (contador == 10) {
				contador=0;
				suma += acomulador;
				System.out.println(suma);
			}
		}

	}

	public static void factorial(int num) {
		int factorial = 0;
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + num + "es:" + factorial);
	}

	public static void tablaMultiplicar() {

	}

	public static void dibujoCuadrado(int cantidad) {
		for (int i = 0; i < cantidad; i++) {// fila
			for (int j = 0; j < cantidad; j++) { // columna
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void primosCantidad() {

	}

	public static void main(String[] args) {
		// comparando(0,45);
		// notasClase(3);
		// filtroFecha1(10,8,2015);
		// filtroFecha2(20,8,2015);
		// filtroFecha3(20,8,2015);
		// filtroFecha4(20,8,2004);
		// convertirNumAtextoV1(72);
		// convertirNumAtextoV2(72);
		// salidaComandosArgs(args);
		// listarNumeros();
		numMultiplo(5);
		// numMultiplos();
		// factorial(8);
		// tablaMultiplicar();
		// dibujoCuadrado(8);
		// primosCantidad();
	}
}
