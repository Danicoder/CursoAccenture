package Cronometro;

import java.io.IOException;
import java.lang.Thread;

public class cronometro {

	public static void main(String[] args) throws IOException, InterruptedException {
		for (int hora = 0; hora < 24; hora++) {
			for (int minuto = 0; minuto <= 60; minuto++) {
				for (int segundos = 0; segundos <= 60; segundos++) {
					System.out.printf("%02d:%02d:%02d",hora,minuto,segundos);
					System.out.println();
					Thread.sleep(1000);
				}
			}
		}
	}

}
