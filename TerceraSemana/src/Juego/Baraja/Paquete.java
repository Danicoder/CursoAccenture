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
	public void asiganrCartas() {
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
}
