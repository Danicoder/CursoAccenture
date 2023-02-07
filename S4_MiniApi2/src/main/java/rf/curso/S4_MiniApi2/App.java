package rf.curso.S4_MiniApi2;

import java.util.List;

import rf.curso.S4_MiniApi2.controller.CountryController;
import rf.curso.S4_MiniApi2.modelos.Country;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	CountryController cc = new CountryController();
    	
		System.out.println("*****************Lista de países*****************");
		List<Country> list = cc.leerTodos();
		listaCtr(list);
		
		System.out.println("*****************Países encontrados*****************");
		System.out.println(cc.leerUno("BR"));

		System.out.println("*****************Insertar países*****************");
		Country country = new Country();
		country.setCountry_id("ES");
		country.setCountry_name("España");
		country.setRegion_id(5);
		cc.actualizar(country);
		System.out.println("Insertado correctamente");
    }
    public static void listaCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}
}
