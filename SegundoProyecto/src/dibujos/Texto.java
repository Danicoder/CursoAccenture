package dibujos;

public class Texto {
	String titulo;
	String descripcion;
	
	public Texto(String titulo, String descripcion) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	public String gettitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getdescripcion() {
		return descripcion;
	}
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
