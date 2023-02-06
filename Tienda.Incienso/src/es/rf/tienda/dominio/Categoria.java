package es.rf.tienda.dominio;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.Validator;

/**
 * 
 * Nombre		Categoria
 * Descripcion	Lista de categorías
 * @author 		Daniela García
 *
 */
public class Categoria {
	
	private int id_categoria;			//identificador categoria
	
	private String cat_nombre;			//nombre de la categoria
	
	private String cat_descripcion;		//descripcion de la categoria
	
	
	public Categoria(){}
	
	
	public boolean isValid(){	
		return !Validator.isVacio(cat_nombre) &&
				id_categoria > 0;
	}
	
	/**
	 * Getter para identificador de categoria
	 * @return Integer con el id de la categoria
	 */
	public int getId_categoria() {
		return id_categoria;
	}
	
	/**
	 * Setter para identificador de categoria
	 * 
	 */
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	/**
	 * Getter para el nombre de categoria
	 * @return cadena con el nombre de la categoria
	 */
	public String getCat_nombre() {
		return cat_nombre;
	}
	
	/**
	 * Setter para el nombre de categoria
	 * @throws Exception 
	 * 
	 */
	public void setCat_nombre(String cat_nombre) throws Exception {
		if(Validator.isAlfanumeric(cat_nombre) && Validator.cumpleLongitud(cat_nombre, 5, 50))
			this.cat_nombre = cat_nombre;
		else
			throw new DomainException("El nombre ha de tener mas 5 caracteres y menos de 50");
	}
	
	/**
	 * Getter para la descripcion de categoria
	 * @return cadena con la descripcion de la categoria
	 */
	public String getCat_descripcion() {
		return cat_descripcion;
	}
	
	/**
	 * setter para la descripcion de categoria
	 * @throws Exception 
	 * 
	 */
	public void setCat_descripcion(String cat_descripcion) throws Exception {
		if(Validator.isAlfanumeric(cat_descripcion) && Validator.cumpleLongitudMax(cat_descripcion, 200))
			this.cat_descripcion = cat_descripcion;
		else
			throw new DomainException("El texto debe contener menos de 200 caracteres");
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cat_descripcion == null) ? 0 : cat_descripcion.hashCode());
		result = prime * result + ((cat_nombre == null) ? 0 : cat_nombre.hashCode());
		result = prime * result + id_categoria;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (cat_descripcion == null) {
			if (other.cat_descripcion != null)
				return false;
		} else if (!cat_descripcion.equals(other.cat_descripcion))
			return false;
		if (cat_nombre == null) {
			if (other.cat_nombre != null)
				return false;
		} else if (!cat_nombre.equals(other.cat_nombre))
			return false;
		if (id_categoria != other.id_categoria)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", cat_nombre=" + cat_nombre + ", cat_descripcion="
				+ cat_descripcion + "]";
	}
}
