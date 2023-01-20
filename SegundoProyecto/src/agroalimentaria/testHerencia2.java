package agroalimentaria;
/**
 * Clase que devuelve el resultado obtenido en las clases del paquete agroalimentaria
 * @author Daniela García Millán
 *
 */
public class testHerencia2 {

	public static void main(String[] args) {
		// Creo un objeto de cada tipo y muestro los datos de cada uno de los objetos creados
		Productos producto = new Productos();
		PRefigerados refigerados = new PRefigerados();
		PCongelados congelados = new PCongelados();
		PCAire aire = new PCAire();
		PFrescos frescos = new PFrescos();
		
		producto.setFechaCaducidad("20/01/2023");
		producto.setNumeroLote(1);
		
		refigerados.setCodOrgSupAlim(100);
		
		congelados.setTemperatura(-34.5);
		
		aire.setpNitrogeno(20.0);
		aire.setpOxigeno(30);
		aire.setpDioxidoCarbono(63.02);
		aire.setpVaporAgua(20.05);
		
		frescos.setFechaEnvasado("20/01/2023");
		frescos.setPaisOrigen("España");
		
		System.out.println(producto.toString()+refigerados.toString());
		System.out.println(producto.toString()+congelados.toString());
		System.out.println(producto.toString()+congelados.toString()+"\n "+frescos.toString());		
		System.out.println(producto.toString()+congelados.toString()+aire.toString());
	}

}
