package Comunicaciones;

import java.net.HttpURLConnection;
import java.net.URL;

public class PruebasURL {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://recursosformacion.com/wordpress");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();

			// me identifico con un browser para que me autorize e identifique
			huc.addRequestProperty("User-Agente", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0");
			/// InputStream stream = urlcon.getInputStream();

			for (int i = 0; i < 7; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + "=" + huc.getHeaderField(i));
			}
			huc.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
