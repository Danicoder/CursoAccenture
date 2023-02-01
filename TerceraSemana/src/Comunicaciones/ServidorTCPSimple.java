package Comunicaciones;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServidorTCPSimple {
	
	public static final String SALUDO = "Servidor esperando en puerto";
	public static final int TIMEOUT =100000;
	public static final int PUERTO = 6000;
	
	private static ServerSocket serverSocket;
	
	
	public static void main(String[] args) throws IOException {
		// Puerto por encima del 1024
		serverSocket = new ServerSocket(PUERTO);
		serverSocket.setSoTimeout(TIMEOUT);
		//Cómo nadie lo llama el servidor espera a que alguien se conecte

		while(true) {
			try {
				System.out.println(SALUDO + serverSocket.getLocalPort()+"...");
				Socket server = serverSocket.accept();
				System.out.println("Conexión desde " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Gracias por conectarte a " + server.getLocalSocketAddress() + "\nAdiosito!");
				server.close();
				break;
			}catch(SocketTimeoutException s) {
				System.out.println("Socket timed out!");
			}
			catch(IOException e) {
				e.printStackTrace();
				break;
			}
		}
		
	}

}
