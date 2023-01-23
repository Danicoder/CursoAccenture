package Persona;

public abstract class Persona {
	private String codPersona;
	private String nombre;
	private int edad;
	private String telContacto;
	
	protected Persona(String codPersona, String nombre, int edad, String telContacto) {
		super();
		this.codPersona = codPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.telContacto = telContacto;
	}
	
	public Persona() {
		super();
	}

	abstract void mostrar();
	
	public String getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
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

	public String getTelContacto() {
		return telContacto;
	}

	public void setTelContacto(String telContacto) {
		this.telContacto = telContacto;
	}

	@Override
	public String toString() {
		return "Persona [codPersona=" + getCodPersona() + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", telContacto="
				+ getTelContacto() + "]";
	}
	
}
