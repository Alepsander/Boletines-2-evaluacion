package boletin3;

public class vehiculo {
	protected String matricula;
	protected String tipo;
	protected int velMax;
	protected conductor conductor;

	public String getmatricula() {
		return matricula;
	}
	
	public String gettipo() {
		return tipo;
	}
	
	public int getvelMax() {
		return velMax;
	}
	
	public conductor getconductor() {
		return conductor;
	}
}