package Banco;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) throws Exception {
		/**
		 * Crear objeto de cada claase para realizar ingresos
		 * y retirar por cada objeto que pueda.
		 * 
		 * Listar los movimientos.Puede ser necesario
		 *  añador en alguna clase un método para listarlos
		 */
		//Fechas
		//LocalDate fechaCaducidad = LocalDate.of(2018, m.getmFecha().getMonth(), 1);
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaCaducidad = fechaActual.plusYears(4);
		
		cuenta cuenta = new cuenta("AL35202111090000000001234567","Daniela García");
		debito debito = new debito(fechaCaducidad, "ES9121000418450200051332", "Angela Murcia");
		credito credito = new credito(fechaCaducidad,"PT50000201231234567890154","Fernando García",4500);
			
		cuenta.ingresar(34);
		cuenta.ingresar("gasolina", 45);
		cuenta.retirar(2);
		cuenta.retirar("impuestos", 95);
		
		debito.setCuenta(cuenta);
		debito.ingresar(50);
		debito.retirar(34);
		
		credito.setCuenta(cuenta);
		credito.ingresar(15);
		credito.ingresar(23);
		credito.retirar(10);
		System.out.println(credito.getSaldo());
		
		//credito.liquidar(fechaActual.getMonth(), fechaActual.getYear());
		
		cuenta.listMovimientos();
	}

}
