package Juego.Baraja;

import java.util.HashSet;
import java.util.Set;

/**
 * Jugando a las cartas --------------------- Una baraja con 48 cartas del 1 al
 * 12 y con 4 palos (oros,copas,espadas y bastos)
 * 
 * 4 jugadores con nombre y edad, mano. Repartir cartas
 * 
 * Visualizar juego de cada jugador/todos
 * ---------------------------------------- Hallar los 5 patrónes del juego Las
 * cartas que tiene y mirar si tiene dos parejas las descarta Posibilidad de
 * descarte analizar juego determinar ganardor
 * 
 * @param args
 */
public class Juego {

	// Cartas que tiene cada mano
	static int CARTAS = 5;

	public static void main(String[] args) {

		Paquete paquete = new Paquete();
		Jugadores jugadores = new Jugadores();
		Set<Carta> baraja = new HashSet<>();

		paquete.barajarCartas();
		baraja = paquete.getBaraja();
		baraja.forEach(System.out::println);

		paquete.repartirBarajas(jugadores, baraja);
		paquete.visualizrJugador(jugadores);
	}
}