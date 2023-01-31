package Cronometro;

import java.lang.Thread;

public class cronometro {

	public static void main(String[] args) {
		//DecimalFormat myFormatter = new DecimalFormat("00");
		try {
			for (int hora = 0; hora < 23; hora++) {
				for (int minuto = 0; minuto <= 59; minuto++) {
					for (int segundos = 0; segundos <= 59; segundos++) {
						System.out.printf("%02d:%02d:%02d", hora, minuto, segundos);
						System.out.println();
						Thread.sleep(1000);
						/* Otra forma de hacerlo
						System.out.print("\b\b\b\b\b\b\b\b"+myFormatter.format(hora)+":");
						myFormatter.format(minutos);
						myFormatter.format(segundos);*/
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
