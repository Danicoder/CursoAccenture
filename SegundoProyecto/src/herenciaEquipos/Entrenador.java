package herenciaEquipos;

public class Entrenador extends Empleados {
	private String idFederacion;

	public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion=idFederacion;
	}

	@Override
	void Concentrarse() {
		System.out.println(super.getnombre() + " concentrado");
	}

	@Override
	void Viajar() {
		System.out.println(super.getnombre() + " viajando");
	}
	//Sin static para hacer un cast
	void dirigirPartido() {
		System.out.println("Dirigiendo un partido");
	}
	//Sin static para hacer un cast
	void dirigirEntrenamiento() {
		System.out.println("Estoy dirigiendo un entrenamiento");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + "]";
	}
	
}
