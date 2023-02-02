package Juego.Baraja;

import java.util.HashSet;
import java.util.Set;

/**
 * Jugando a las cartas
 * ---------------------
 * Una baraja con  48 cartas del 1 al 12 y con 4 palos
 * (oros,copas,espadas y bastos)
 * 
 * 4 jugadores con nombre y edad, mano.
 * Repartir cartas
 * 
 * Visualizar juego de cada jugador/todos
 * ----------------------------------------
 * Hallar los 5 patrónes del juego
 * Las cartas que tiene y mirar si tiene dos parejas las descarta
 * Posibilidad de descarte
 * analizar juego
 * determinar ganardor
 * 
 * @param args
 */
public class Juego {
	
	//Cartas que tiene cada mano
	static int CARTAS = 5;

	/**
	 * Método que asigna a cada juhgador su información.
	 * @return una lista de jugadores
	 */
	public static Set<Jugadores> obtenerJugadores() {
		Set<Jugadores> Listjug = new HashSet<>();
		Jugadores j1 = new Jugadores();
		Jugadores j2 = new Jugadores();
		Jugadores j3 = new Jugadores();
		Jugadores j4 = new Jugadores();
		
		j1.setEdad(23);
		j1.setNombre("Juan Molina");
		Listjug.add(j1);
		
		j2.setEdad(28);
		j2.setNombre("Rocio Durcan");
		Listjug.add(j2);
		
		j3.setEdad(30);
		j3.setNombre("Angel Alarcón");
		Listjug.add(j3);
		
		j4.setEdad(46);
		j4.setNombre("Hugo Zarra");
		Listjug.add(j4);
		
		return Listjug;
	}
	
		public static void main(String[] args) {
		
		Paquete paquete = new Paquete();
		Jugadores jugadores = new Jugadores();
		Carta carta = new Carta();
		Set<Carta> baraja = new HashSet<>();
		
		paquete.barajarCartas();
		baraja = paquete.getBaraja();
		baraja.forEach(System.out::println);
		paquete.repartirBarajas(jugadores);
		
	}
}