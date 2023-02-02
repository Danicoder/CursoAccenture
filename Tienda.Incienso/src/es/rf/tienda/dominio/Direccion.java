package es.rf.tienda.dominio;

import java.util.Objects;

import es.rf.tienda.exception.DomainException;

/**
  * Nombre		Direccion
 * Descripcion	Lista de categorías
 * @author 		Daniela García
 */
public class Direccion {
	
	private String dir_nombre;
	private String dir_direccion;
	private String dir_poblacion;
	private String dir_cPostal;
	private String dir_provincia;
	private String dir_pais;
	private String dir_correoE;
	
	
	public Direccion() {
		super();
	}

	/**
	 * Getter para el nombre de la dirección
	 * @return String con el nombre de la dirección
	 */
	public String getDir_nombre() {
		return dir_nombre;
	}
	
	/**
	 * Setter para el nombre de de la dirección
	 * @param dir_nombre
	 * @throws DomainException 
	 */
	public void setDir_nombre(String dir_nombre) throws DomainException {
		if(dir_nombre.length() > 5 && dir_nombre.length() < 100)
			this.dir_nombre = dir_nombre;
		else
			throw new DomainException("El nombre ha de contener entre 5 y 100 caracteres");
	}
	/**
	 * Getter para la dirección
	 * @return String con el nombre de la dirección
	 */
	public String getDir_direccion() {
		return dir_direccion;
	}
	/**
	 *  Setter para la dirección
	 * @param dir_direccion
	 */
	public void setDir_direccion(String dir_direccion) {
		this.dir_direccion = dir_direccion;
	}
	/**
	 * Getter para la población
	 * @return String con el nombre de la población
	 */
	public String getDir_poblacion() {
		return dir_poblacion;
	}
	/**
	 * Setter para la población
	 * @param dir_poblacion
	 */
	public void setDir_poblacion(String dir_poblacion) {
		this.dir_poblacion = dir_poblacion;
	}
	/**
	 * Getter para el código postal
	 * @return String del código postal
	 */
	public String getDir_cPostal() {
		return dir_cPostal;
	}
	/**
	 * Setter para el código postal
	 * @param dir_cPostal
	 */
	public void setDir_cPostal(String dir_cPostal) {
		this.dir_cPostal = dir_cPostal;
	}
	/**
	 * Getter que devuevle la provincia
	 * @return la provincia
	 */
	public String getDir_provincia() {
		return dir_provincia;
	}
	/**
	 * Setter para la provincia
	 * @param dir_provincia
	 */
	public void setDir_provincia(String dir_provincia) {
		this.dir_provincia = dir_provincia;
	}
	/**
	 * Getter que devuelve el país
	 * @return el país
	 */
	public String getDir_pais() {
		return dir_pais;
	}
	/**
	 * Setter para el país
	 * @param dir_pais
	 */
	public void setDir_pais(String dir_pais) {
		this.dir_pais = dir_pais;
	}
	/**
	 * Getter que devuelve un String del e-mail
	 * @return
	 */
	public String getDir_correoE() {
		return dir_correoE;
	}
	/**
	 * Setter para el a-mail
	 * @param dir_correoE
	 */
	public void setDir_correoE(String dir_correoE) {
		this.dir_correoE = dir_correoE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dir_cPostal, dir_correoE, dir_direccion, dir_nombre, dir_pais, dir_poblacion,
				dir_provincia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(dir_cPostal, other.dir_cPostal) && Objects.equals(dir_correoE, other.dir_correoE)
				&& Objects.equals(dir_direccion, other.dir_direccion) && Objects.equals(dir_nombre, other.dir_nombre)
				&& Objects.equals(dir_pais, other.dir_pais) && Objects.equals(dir_poblacion, other.dir_poblacion)
				&& Objects.equals(dir_provincia, other.dir_provincia);
	}

	@Override
	public String toString() {
		return "Direccion [dir_nombre=" + dir_nombre + ", dir_direccion=" + dir_direccion + ", dir_poblacion="
				+ dir_poblacion + ", dir_cPostal=" + dir_cPostal + ", dir_provincia=" + dir_provincia + ", dir_pais="
				+ dir_pais + ", dir_correoE=" + dir_correoE + "]";
	}	
}
