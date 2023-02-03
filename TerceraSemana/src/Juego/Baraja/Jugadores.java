package Juego.Baraja;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Jugadores {
	//cartas que le han tocado. Set no repite, pero no ordena
	Set<Carta> mano;
	private String nombre;
	private int edad;
	
	public Jugadores() {
		mano = new HashSet<>();
	}
	/**
	 * Método que asigna a cada juhgador su información.
	 * @return una lista de jugadores
	 */
	public Set<Jugadores> ListaJugadores() {
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
