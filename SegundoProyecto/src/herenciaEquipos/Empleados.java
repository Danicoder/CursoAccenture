package herenciaEquipos;

public abstract class Empleados {
	protected Integer id;
	protected String nombre;
	protected String apellidos;
	protected Integer edad;
	
	protected Empleados(Integer id, String nombre, String apellidos, Integer edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getapellidos() {
		return apellidos;
	}

	public void setapellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getedad() {
		return edad;
	}

	public void setedad(Integer edad) {
		this.edad = edad;
	}
	
	abstract void Concentrarse();
	abstract void Viajar();
}
