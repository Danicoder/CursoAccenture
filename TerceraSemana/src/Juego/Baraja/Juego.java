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
 * Posibilidad de descarte
 * analizar juego
 * determinar ganardor
 * 
 * @param args
 */
public class Juego {
	
	//Cartas que tiene cada mano
	static int CARTAS = 5; 

	public static void main(String[] args) {
		
		Paquete paquete = new Paquete();
		Set<Carta> baraja = new HashSet<>();
		
		Jugadores j1 = new Jugadores("Juan Molina",23);
		Jugadores j2 = new Jugadores("Rocio Durcan",34);
		Jugadores j3 = new Jugadores("Angel Alarcón", 20);
		Jugadores j4 = new Jugadores("Hugo Zarra", 28);
		
		
	}

}
