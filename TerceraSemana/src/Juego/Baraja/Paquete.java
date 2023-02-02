package Juego.Baraja;

import java.util.HashSet;
import java.util.Set;

public class Paquete {
	Set<Carta> baraja = new HashSet<>();
	static final String[] PALOS_POKER = {"corazones","diamantes","picas","trebol"};
	
	
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
	 * Recorre las cantidad de cartas en una baraja
	 * y las añade al objeto de cartas
	 */
	public void barajarCartas() {
		//añado a la baraja(Carta)los palos
		for (String palo : PALOS_POKER) { //palos
			for (int i = 1; i <= 13 ;i++) {//cartas
				Carta c = new Carta();
				c.setNumero(i);
				c.setPalo(palo);
				baraja.add(c);
			}
		}
	}
	/**
	 * Repartir baraja(cartas a los jugadores)
	 * me da cartas y en este bucle hago get del 
	 * paquete y doy las cartas a los jugadores
	 */
	public void asignarBarajas(Jugadores jugador) {
		for (Carta carta : baraja) {
			for (int i = 0; i < 5; i++) {
				Carta cartaJugador = new Carta();
				cartaJugador.setNumero(carta.getNumero());
				cartaJugador.setPalo(carta.getPalo());
				jugador.setMano(cartaJugador);//no asino bien la mano al jugador 
				System.out.println(jugador.toString());
			}
		}
	}
	/**
	 * segundo metodo que llame a ese para hacer un reparto de las cartas
	 */
	private void repartirBaraja(Jugadores jugador) {
//		for (String j : jugador) {
//			asignarBarajas(j);
//		}
	}
}
