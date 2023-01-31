package Multitarea.Buffer;

import java.util.Random;

public class GeneraNumero implements Runnable{
	
	Buffer buf;
	
	public void setBuf(Buffer buf) {
		this.buf = buf;
	}

	@Override
	public void run() {
		Random rn = new Random();
		while(true){
			buf.setNumero(rn.nextInt());
			/*synchronized(buf) {
				while(buf.isDisponible()) {
					System.out.println("Esperando espacio.....");
					try {
						buf.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				buf.setNumero(rn.nextInt());
				buf.setDisponible(true);
				System.out.println("Número disponible");
				buf.notifyAll();
			}*/
		}
	}
}
