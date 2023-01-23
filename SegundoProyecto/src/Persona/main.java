package Persona;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Profesor profe = new Profesor("1A","Daniela",26,"+346427678455",125f,"10/12/2020");
		
		List<String> asignaturas = new ArrayList<String>() {{add("Matemáticas");}};
		Alumno alumno = new Alumno(1,asignaturas);
		
		System.out.println(profe.toString());
		System.out.println(alumno.toString());
	}

}
