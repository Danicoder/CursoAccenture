package herenciaEquipos;

public class Masajista extends Empleados {

	private String titulacion;
	private Integer aniosExperiencia;

	protected Masajista(Integer id, String nombre, String apellidos, Integer edad,Integer aniosExperiencia,String titulacion) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	void Concentrarse() {
		System.out.println(super.getnombre() + " concentrado");
	}
	@Override
	void Viajar() {
		System.out.println(super.getnombre() + " viajando");
	}
	
	public static void darMasaje() {
		System.out.println("Estoy dando un masaje");
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public Integer getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(Integer aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Masajista [" + super.getnombre() + " tiene una titulacion en: " + getTitulacion() + " , aniosExperiencia: " + getAniosExperiencia() + "]";
	}
	
}
