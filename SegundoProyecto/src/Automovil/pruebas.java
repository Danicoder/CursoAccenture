package Automovil;

public class pruebas {

	public static void main(String[] args) {
		
		coche car1 = new coche("Azul","Ford",4);
		coche car2 = new coche("Negro","Chevrolet",5);
		coche car3 = new coche("Rojo","Lexus",6);
		
		//El nuevo objeto creado es una instancia del 
		//primer objeto creado, por ende tiene los mis valores
		coche car4 = car1;
		
		//hacemos referencia a vehiculo porque coche forma parte de vehiculo
		vehiculo car5 = new coche("Blanco","Seat",5);
		//creo la instancia referenciada para poder definir el método de todoterreno
		//que forma parte del coche
		if(car1 instanceof todoterreno)
			car1.activarReductora(false);
	}
}
