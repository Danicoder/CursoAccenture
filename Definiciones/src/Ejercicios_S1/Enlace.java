package Ejercicios_S1;

import java.time.LocalTime;

public class Enlace {
	Definiciones defi = new Definiciones();
	Definiciones defi2 = new Definiciones();
	
	public String url;
	public LocalTime hora;
	static int contador=0;
	public int indice;
	
	Enlace(){
		indice=contador++;
	}
	
	
	public void modificacion() {
		defi.nombre ="Esto es defi";
		defi2.nombre ="Esto es defi2";
		
		System.out.println("defi = " +defi.nombre); 
		System.out.println("defi = " +defi2.nombre); 
		
		defi.nombre ="Esto es descripción estática";
		defi2.nombre ="Esto es descripción estática";
		
		System.out.println("defi = " +defi.nombre); 
		System.out.println("defi = " +defi2.nombre); 
		
	}
}
