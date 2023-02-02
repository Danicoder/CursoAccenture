package es.rf.tienda.dominio;

import java.time.LocalDate;
import java.util.Objects;
/**
 * Nombre		Producto
* Descripcion	Lista de categorías
* @author 		Daniela García
*/
public class Producto {
	private String id_producto;
	private String pro_descripcion;
	private String pro_desLarga;
	private double pro_precio;
	private int pro_stock;
	private LocalDate pro_fecRepos;
	private LocalDate pro_fecActi;
	private LocalDate pro_fecDesacti;
	private String pro_uniVenta;
	private double pro_cantXUniVenta;
	private String pro_uniUltNivel;
	private int id_pais;
	private String pro_usoRecomendado;
	private int id_categoria;
	private int pro_stkReservado;
	private int pro_nStkAlto;
	private int pro_nStkBajo;
	private char pro_stat;
	
	public Producto() {
		super();
	}
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public String getPro_descripcion() {
		return pro_descripcion;
	}
	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}
	public String getPro_desLarga() {
		return pro_desLarga;
	}
	public void setPro_desLarga(String pro_desLarga) {
		this.pro_desLarga = pro_desLarga;
	}
	public double getPro_precio() {
		return pro_precio;
	}
	public void setPro_precio(double pro_precio) {
		this.pro_precio = pro_precio;
	}
	public int getPro_stock() {
		return pro_stock;
	}
	public void setPro_stock(int pro_stock) {
		this.pro_stock = pro_stock;
	}
	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}
	public void setPro_fecRepos(LocalDate pro_fecRepos) {
		this.pro_fecRepos = pro_fecRepos;
	}
	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}
	public void setPro_fecActi(LocalDate pro_fecActi) {
		this.pro_fecActi = pro_fecActi;
	}
	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}
	public void setPro_fecDesacti(LocalDate pro_fecDesacti) {
		this.pro_fecDesacti = pro_fecDesacti;
	}
	public String getPro_uniVenta() {
		return pro_uniVenta;
	}
	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
	}
	public double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}
	public void setPro_cantXUniVenta(double pro_cantXUniVenta) {
		this.pro_cantXUniVenta = pro_cantXUniVenta;
	}
	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}
	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		this.pro_uniUltNivel = pro_uniUltNivel;
	}
	public int getId_pais() {
		return id_pais;
	}
	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}
	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}
	public void setPro_usoRecomendado(String pro_usoRecomendado) {
		this.pro_usoRecomendado = pro_usoRecomendado;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getPro_stkReservado() {
		return pro_stkReservado;
	}
	public void setPro_stkReservado(int pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}
	public int getPro_nStkAlto() {
		return pro_nStkAlto;
	}
	public void setPro_nStkAlto(int pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}
	public int getPro_nStkBajo() {
		return pro_nStkBajo;
	}
	public void setPro_nStkBajo(int pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}
	public char getPro_stat() {
		return pro_stat;
	}
	public void setPro_stat(char pro_stat) {
		this.pro_stat = pro_stat;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id_categoria, id_pais, id_producto, pro_cantXUniVenta, pro_desLarga, pro_descripcion,
				pro_fecActi, pro_fecDesacti, pro_fecRepos, pro_nStkAlto, pro_nStkBajo, pro_precio, pro_stat,
				pro_stkReservado, pro_stock, pro_uniUltNivel, pro_uniVenta, pro_usoRecomendado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id_categoria == other.id_categoria && id_pais == other.id_pais
				&& Objects.equals(id_producto, other.id_producto)
				&& Double.doubleToLongBits(pro_cantXUniVenta) == Double.doubleToLongBits(other.pro_cantXUniVenta)
				&& Objects.equals(pro_desLarga, other.pro_desLarga)
				&& Objects.equals(pro_descripcion, other.pro_descripcion)
				&& Objects.equals(pro_fecActi, other.pro_fecActi)
				&& Objects.equals(pro_fecDesacti, other.pro_fecDesacti)
				&& Objects.equals(pro_fecRepos, other.pro_fecRepos) && pro_nStkAlto == other.pro_nStkAlto
				&& pro_nStkBajo == other.pro_nStkBajo
				&& Double.doubleToLongBits(pro_precio) == Double.doubleToLongBits(other.pro_precio)
				&& pro_stat == other.pro_stat && pro_stkReservado == other.pro_stkReservado
				&& pro_stock == other.pro_stock && Objects.equals(pro_uniUltNivel, other.pro_uniUltNivel)
				&& Objects.equals(pro_uniVenta, other.pro_uniVenta)
				&& Objects.equals(pro_usoRecomendado, other.pro_usoRecomendado);
	}
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", pro_descripcion=" + pro_descripcion + ", pro_desLarga="
				+ pro_desLarga + ", pro_precio=" + pro_precio + ", pro_stock=" + pro_stock + ", pro_fecRepos="
				+ pro_fecRepos + ", pro_fecActi=" + pro_fecActi + ", pro_fecDesacti=" + pro_fecDesacti
				+ ", pro_uniVenta=" + pro_uniVenta + ", pro_cantXUniVenta=" + pro_cantXUniVenta + ", pro_uniUltNivel="
				+ pro_uniUltNivel + ", id_pais=" + id_pais + ", pro_usoRecomendado=" + pro_usoRecomendado
				+ ", id_categoria=" + id_categoria + ", pro_stkReservado=" + pro_stkReservado + ", pro_nStkAlto="
				+ pro_nStkAlto + ", pro_nStkBajo=" + pro_nStkBajo + ", pro_stat=" + pro_stat + "]";
	}
}
