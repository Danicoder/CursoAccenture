package Juego.Baraja;

import java.util.HashSet;
import java.util.Set;

public class Paquete {
	Set<Carta> baraja = new HashSet<>();
	static final String[] CARTAS_ESPANYOLAS = {"oros","copas","espadas","bastos"};

	
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
	public void RepartirCartas(String palo) {
		//Cojo cada una de las cartas
		for (int i = 0; i < CARTAS_ESPANYOLAS.length; i++) {
			palo = CARTAS_ESPANYOLAS[i];
		}
		for (int i = 0; i < 13; i++) {
			Carta c = new Carta();
			c.setNumero(i);
			c.setPalo(palo);
			//añado a la baraja(Carta) las cartas
			baraja.add(c);
		}
	}
}
