package Herencia.UML;

public class EjecutandoPersona {
	/**
	 * Método que hace llamada a los objetos creados en este paquete
	 * @param args
	 */
	public static void main(String[] args) {
		ClienteExportacion cE = new ClienteExportacion("325195756", "Daniela", "Calle Moriones", "daniela@hotmail.com");
		cE.setnumCliente(642767856);
		cE.setNombre("Juan");
		cE.setNombre("Daniela");
		cE.setFechaAlta("20/10/2022");
		
		System.out.println("Juan se dio de alta el día " + cE.getFechaAlta()
		                   + " junto con "+ cE.getNombre());
		System.out.println("Los datos personales de Daniela son: "+cE.toString());
	}

}
