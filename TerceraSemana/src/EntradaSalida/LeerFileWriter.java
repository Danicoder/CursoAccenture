package EntradaSalida;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LeerFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\Users\\d.garcia.millan\\Desktop"
					+ "\\PruebasFicherosEntradaSalida\\texto.txt");
			pw = new PrintWriter(fichero);

			for (int i = 0; i < 10; i++) {
				pw.println("Línea " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
