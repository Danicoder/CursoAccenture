package Juego.Baraja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Paquete {
	Set<Carta> baraja = new HashSet<>();
	static final String[] PALOS_POKER = { "corazones", "diamantes", "picas", "trebol" };

	public Paquete() {
		super();
	}

	public Set<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(Set<Carta> baraja) {
		this.baraja = baraja;
	}

	/**
	 * Recorre las cantidad de cartas en una baraja y las añade al objeto de cartas
	 */
	public void barajarCartas() {
		// añado a la baraja(Carta)los palos
		for (String palo : PALOS_POKER) { // palos
			for (int i = 1; i <= 13; i++) {// cartas
				Carta c = new Carta();
				c.setNumero(i);
				c.setPalo(palo);
				baraja.add(c);
			}
		}
	}
	/**
	 * Método que reparte las cartas a cada jugador
	 */
	public void repartirBarajas(Jugadores jugadores, Iterable<Carta> baraja2) {
		Iterator<Carta> carta;
		for (Jugadores jug : jugadores.ListaJugadores()) {
			carta = baraja2.iterator();
			jug.setMano(carta.next());
			carta.remove();
		}
	}
	public void visualizrJugador(Jugadores jug) {
		System.out.println("Jugador: " + jug.getNombre() + " ,edad " + jug.getEdad());
		jug.getMano().forEach(System.out::println);
	}
}
