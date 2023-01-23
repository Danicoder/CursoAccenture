package herenciaEquipos;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Empleados> lista = new ArrayList<Empleados>();
		
		lista.add(new Futbolista(1, "Juan", "García Molina", 26, 7, "Área de tiro"));
		lista.add(new Entrenador(2, "Daniela", "Millán Martínez", 40, "Dinamarca"));
		lista.add(new Masajista(3, "Miguel", "García Rodríguez", 20, 7, "Acupuntura"));
		
		lista.forEach((actual) -> {
			for (Empleados empleados : lista) {
				//Utilizamos el if para llamar al método de cada uno de los objetos
				if( empleados instanceof Futbolista) {
					Futbolista futbol = (Futbolista) actual;
					//con static solo llamo a su clase, sin necesidad de instanciar un objeto de la misma
					Futbolista.jugarPartido();
					// sin static obliga hacer una instancia del objeto
					futbol.entrenar();
				}
				if( empleados instanceof Entrenador) {
					((Entrenador) actual).dirigirPartido();
					((Entrenador) actual).dirigirEntrenamiento();
				}
				if( empleados instanceof Masajista) {
					Masajista futbol = (Masajista) actual;
					futbol.darMasaje();
				}
			}
		});
		
		
	}
}
