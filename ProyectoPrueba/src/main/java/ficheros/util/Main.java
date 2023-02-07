package ficheros.util;

import java.util.List;

import ficheros.controller.CountryController;
import ficheros.modelos.Country;

public class Main {
	public static void main(String[]args) throws Exception {
		CountryController cc = new CountryController();
		List<Country> list = cc.leerTodos();
		listarCtr(list);
		System.out.println("**********************************************");
		System.out.println(cc.leerUno("BR"));
		
		Country countrys = cc.leerUno("BR");
		countrys.setCountry_name("Modificando_1");
		System.out.println("Modificados :"+ cc.actualizar(countrys));
		
		System.out.println("**********************************************");
		System.out.println(cc.leerUno("BR"));
		
		Country countrys_2 = cc.leerUno("BR");
		System.out.println("Borrados: "+ cc.eliminar(countrys_2));
	}
	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}
}
