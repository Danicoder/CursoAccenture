package RecursosFormacion;

public class Nombres2 {

	static int $nombre;
	static int pasado; // no hace referencia a la variable de abajo
	static int alcance;// faltaba;

	public static void main(String[] arg) {
		int _contador;
		_contador = 25;
		$nombre = _contador;
		pasado = _contador;

		System.out.println($nombre + " / " + _contador);
	}
}
