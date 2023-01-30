package Banco.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) throws Exception {
		Filtro fechasFormato = new Filtro();
		fechasFormato.fechaCorrecta("12/10/1980");
		String fecha="20240319";
		fecha.formatted(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		System.out.println(fecha.formatted(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));        
	}

}
