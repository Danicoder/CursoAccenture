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
	public void setMano(Carta carta) {
		this.mano.add(carta);
	}

	@Override
	public String toString() {
		return "Jugadores [mano=" + mano + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
