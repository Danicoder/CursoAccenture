package Comunicaciones;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class clienteTCPSimple {
	// Defino los literales, del puerto
	public static final int PUERTO = 6000;
	public static final String DIRECCION = "localhost";


	public static void main(String[] args) throws IOException {

		// Enviamos mensaje y recibe respuesta
		System.out.println("Conectacdo a " + DIRECCION + " por puerto" + PUERTO);
		Socket client = new Socket(DIRECCION, PUERTO);
		// Imprimimos el mensaje en él
		System.out.println("Conectando a " + client.getRemoteSocketAddress());
		OutputStream outToServer = client.getOutputStream(); // lee en bytes y devuelve datos
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF("Saludito desde" + client.getLocalSocketAddress());
		// Recibir mensaje que transmita
		InputStream inFromServer = client.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);
		System.out.println("Me han contestado " + in.readUTF());

		client.close();
	}

}
