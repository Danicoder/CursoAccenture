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
 * Posibilidad de descarte
 * analizar juego
 * determinar ganardor
 * 
 * @param args
 */
public class Juego {
	
	//Cartas que tiene cada mano
	static int CARTAS = 5;

	
	public static Set<Jugadores> obtenerJugadores() {
		
		Set<Jugadores> Listjug = new HashSet<>();
		Jugadores jugador = new Jugadores();
		
		jugador.setEdad(23);
		jugador.setNombre("Juan Molina");
		Listjug.add(jugador);
		
		jugador.setEdad(28);
		jugador.setNombre("Rocio Durcan");
		Listjug.add(jugador);
		
		jugador.setEdad(30);
		jugador.setNombre("Angel Alarcón");
		Listjug.add(jugador);
		
		jugador.setEdad(46);
		jugador.setNombre("Hugo Zarra");
		Listjug.add(jugador);
		
		return Listjug;
	}
	
		public static void main(String[] args) {
		
		Paquete paquete = new Paquete();
		Set<Carta> baraja = new HashSet<>();
		
		paquete.asiganrCartas();
		baraja = paquete.getBaraja();
		for (Carta carta : baraja) {
			System.out.println(carta);
		}
	}
}