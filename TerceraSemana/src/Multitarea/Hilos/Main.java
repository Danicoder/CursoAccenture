package Multitarea.Hilos;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Mensaje m1 = new Mensaje();
		Mensaje m2 = new Mensaje();
		
		m1.setMensaje("Este mensaje es desde 1");
		m2.setMensaje("Este mensaje es desde 2");
		m1.start(); //llama automáticamente a run
		m2.start();
		Thread.sleep(5000);
		//panel dialogo de jpanel, sí tubieramos con interfaz gráfica
		//showMessageDialog(null,"This is even shorter");
		m2.setMensaje("***************");
	}

}
