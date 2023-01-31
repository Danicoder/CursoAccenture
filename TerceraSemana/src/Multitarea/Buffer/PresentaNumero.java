package Multitarea.Buffer;

import java.util.Random;

public class PresentaNumero implements Runnable{
	Buffer buf;

	public void setBuf(Buffer buf) {
		this.buf = buf;
	}

	@Override
	public void run() {
		while(true){
			System.out.println(buf.getNumero());
//			synchronized(buf) {
//				while(!buf.isDisponible()) {
//					System.out.println("Esperando número");
//					try {
//						buf.wait();
//					}catch(InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//				System.out.println(buf.getNumero());
//				buf.setDisponible(false);
//				buf.notifyAll();
//			}
		}
	}
}
