package Multitarea.Synchronized;

import java.io.InterruptedIOException;

public class NoSincro implements Runnable {
	static Integer n = 1; //es como contador para todas las instancias
	private String mensaje;// mensaje para cada una de las instancias
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized(n){
				System.out.println(mensaje + " " + n);
				n++;
			}
		}try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
