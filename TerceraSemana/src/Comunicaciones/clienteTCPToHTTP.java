package Comunicaciones;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class clienteTCPToHTTP {
	// Defino los literales, del puerto
	public static final int PUERTO = 443;//ESTANDAR PARA HTTPS
	public static final String SERVERNAME = "recursosformacion.com";

	public static void main(String[] args) {
		try {
			while (true) {
					// Enviamos mensaje y recibe respuesta
					System.out.println("Conectacdo a " + SERVERNAME + " por puerto" + PUERTO);
					Socket client = new Socket(SERVERNAME, PUERTO);
					// Imprimimos el mensaje en él
					System.out.println("Conectando a " + client.getRemoteSocketAddress());
					OutputStream outToServer = client.getOutputStream(); // lee en bytes y devuelve datos
					DataOutputStream out = new DataOutputStream(outToServer);
					out.writeUTF("Saludito desde" + client.getLocalSocketAddress());
					// Recibir mensaje que transmita
					InputStream inFromServer = client.getInputStream();
					DataInputStream in = new DataInputStream(inFromServer);
					int lectura = in.read();
					//leo todo lo que me envia el servidor
					while(lectura != -1) {
						lectura=in.read();
						System.out.println(lectura);
						lectura=in.read();
					}


					client.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}