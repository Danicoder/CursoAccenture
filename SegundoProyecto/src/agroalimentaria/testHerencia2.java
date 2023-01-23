package agroalimentaria;
/**
 * Clase que devuelve el resultado obtenido en las clases del paquete agroalimentaria
 * @author Daniela García Millán
 *
 */
public class testHerencia2 {

	public static void main(String[] args) {

		PRefigerados refigerados = new PRefigerados("20/01/2023", 1,100);
		PCongelados congelados = new PCongelados("20/01/2023", 1, -34.5);
		PCAire aire = new PCAire("20/01/2023", 1, 20.0, 30, 63.02, 20.05, 2);
		PFrescos frescos = new PFrescos("20/01/2023", 1,"20/01/2023","España");
			
		System.out.println(refigerados.toString());
		System.out.println(congelados.toString());
		System.out.println(frescos.toString());		
		System.out.println(congelados.toString()+aire.toString());
	}

}
