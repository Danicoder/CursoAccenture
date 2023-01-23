package herenciaEquipos;

public class Futbolista extends Empleados {
	private Integer dorsal;
	private String demarcacion;

	protected Futbolista(Integer id, String nombre, String apellidos, Integer edad,Integer dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	@Override
	void Concentrarse() {
		System.out.println(super.getnombre() + " concentrado");
	}

	@Override
	void Viajar() {
		System.out.println(super.getnombre() + " viajando");
	}
	
	public static void jugarPartido() {
		System.out.println("Estoy jugando un partido");
	}
	public void entrenar() {
		System.out.println("Estoy entrenando");
	}
	

	public Integer getDorsal() {
		return dorsal;
	}

	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
		return "Futbolista con la id: " + super.getId() + " tiene el dorsal nª: " + getDorsal() + " . Juega en: " + getDemarcacion() ;
	}
	
}
