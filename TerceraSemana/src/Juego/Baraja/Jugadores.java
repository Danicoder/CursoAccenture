package Juego.Baraja;

import java.util.HashSet;
import java.util.Set;

public class Jugadores {
	//cartas que le han tocado. Set no repite, pero no ordena
	Set<Carta> mano; //cartas que le han tocado
	private String nombre;
	private int edad;
	
	
	public Jugadores(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
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
	//Añado la carta a la baraja, que viene siendo la carta
	public void setMano(Set<Carta> mano) {
		this.mano = mano;
	}
	@Override
	public String toString() {
		return "Jugadores [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
