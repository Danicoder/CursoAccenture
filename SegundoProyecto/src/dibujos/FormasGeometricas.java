package dibujos;

/**
 * Clase que define el resultado de calcular las bases de una figura geométrica
 * 
 * @author Daniela García Millán
 */
abstract class FormasGeometricas{
	/**
	 * Atributos de la clase que comparte con las clases que heredan del mismo
	 */
	protected double base;
	protected double altura;
	protected double radio;
	Punto coordenadas; //creo un objeto de la clase Punto
	Texto texto; //creo un objeto de la clase Texto

	
	abstract void dibujar();
	abstract double calcularArea();

	/**
	 * Constructor para calcular una figura
	 * 
	 * @param base
	 * @param altura
	 */
	FormasGeometricas(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	/**
	 * Constructor para calcular el circulo
	 * 
	 * @param radio
	 */
	public FormasGeometricas(double radio) {
		super();
		this.setRadio(radio);
	}
	
	/**
	 * Método que devuelve el ancho de la figura
	 * 
	 * @return devuelve el ancho de la figura
	 */
	public double getbase() {
		return base;
	}

	/**
	 * Método que establece el ancho de la figura
	 * 
	 * @param base
	 */
	public void setbase(int base) {
		this.base = base;
	}

	/**
	 * Método que devuelve la altura de la figura
	 * 
	 * @param base
	 */
	public double getaltura() {
		return altura;
	}

	/**
	 * Método que establece la altura de la figura
	 * 
	 * @param base
	 */
	public void setaltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Método que devuelve el radio del circulo
	 * 
	 * @param base
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * Método que establece el radio del circulo
	 * 
	 * @param base
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	/**
	 * Devuelve las coordenadas que hemos obtenido del objeto Punto
	 * @return coordenadas
	 */
	public Punto getCoordenadas() {
		return coordenadas;
	}
	/**
	 * Obtiene las coordenadas que hemos obtenido del objeto Punto
	 * @param coordenadas
	 */
	public void setCoordenadas(Punto coordenadas) {
		this.coordenadas = coordenadas;
	}	
}
