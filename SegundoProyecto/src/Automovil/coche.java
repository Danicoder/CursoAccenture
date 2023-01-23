package Automovil;

public class coche extends vehiculo implements todoterreno{

	private int numPuertas;
	private String color;
	private String modelo;
	private boolean todoterreno;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public coche(String color,String modelo,int numPuertas) {
		super();
		this.numPuertas = numPuertas;
		this.color = color;
		this.modelo = modelo;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void activarReductora(boolean activar) {
		setTodoterreno(activar);
	}

	public boolean isTodoterreno() {
		return todoterreno;
	}

	public void setTodoterreno(boolean todoterreno) {
		this.todoterreno = todoterreno;
	}
	
	
}
