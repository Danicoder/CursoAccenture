package agroalimentaria;
/**
 * Esta clase define objetos que contienen
 * productos refigerados definida al crear los objetos
 * @author Daniela García Millán
 *
 */
public class PRefigerados extends Productos{
	//código de organismo de supervisión alimentaria
	private int codOrgSupAlim;
	/**
	 * Método que devuelve el Código de Organismos
	 * de supervisión alimentaria
	 * @return Código de Organismos
	 * de supervisión alimentaria
	 */
	public int getCodOrgSupAlim() {
		return codOrgSupAlim;
	}
	/**
	 * Método que obtiene del usuario el Código de Organismos
	 * de supervisión alimentaria
	 * @param Código de Organismos
	 * de supervisión alimentaria
	 */
	public void setCodOrgSupAlim(int codOrgSupAlim) {
		this.codOrgSupAlim = codOrgSupAlim;
	}
	/**
	 * Genera el Código de Organismos
	 * de supervisión alimentaria
	 */
	@Override
	public String toString() {
		return "Código organismo supervisor: " + getCodOrgSupAlim() + " ";
	}
}
