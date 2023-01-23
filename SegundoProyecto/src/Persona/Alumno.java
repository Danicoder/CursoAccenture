package Persona;

import java.util.List;

public class Alumno extends Persona {
	private int curso;
	private List<String> asignaturas;
	// private Set<String> asignaturas;

	public Alumno(int curso,List<String> asignaturas) {
		super();
		setCurso(this.curso);
		setAsignaturas(this.asignaturas);
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}

	public List<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + getCurso() + ", asignaturas=" + getAsignaturas() + "]";
	}

	@Override
	void mostrar() {
		System.out.println(this.toString());
	}
}
