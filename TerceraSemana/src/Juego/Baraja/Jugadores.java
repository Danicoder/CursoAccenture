package Juego.Baraja;

import java.util.HashSet;
import java.util.Set;

public class Jugadores {
	//cartas que le han tocado. Set no repite, pero no ordena
	Set<Carta> mano;
	private String nombre;
	private int edad;
	
	public Jugadores() {
		mano = new HashSet<>();
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Set<Carta> getMano() {
		return mano;
	}
	public void setMano(Set<Carta> mano) {
		this.mano = mano;
	}
	@Override
	public String toString() {
		return "Jugadores [nombre=" + nombre + ", edad=" + edad + "]";
	}
	/**
	 * Repartir baraja(cartas a los jugadores)
	 * me da cartas y en este bucle hago get del 
	 * paquete y doy las cartas a los jugadores
	 */
	public void repartirBarajas() {
		Paquete p = new Paquete();
		
		for (Carta carta : mano) {
			this.setMano(p.getBaraja());
		}
	}
	/**
	 * Método que Reparte las cartas, en total 5 cartas para cada jugador
	 * metodo con n cartas a jugador y repartir 
	 * segundo metodo que llame a ese para hacer un reparto de las cartas
	 */
}
