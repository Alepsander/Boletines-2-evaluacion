package boletin3;

public class Coche extends vehiculo{
	private int numPlazas;
	
	public void coche(String matricula, String tipo, int velMax, int numPlazas) {
		this.matricula=matricula; 
		this.tipo=tipo;
		this.velMax=velMax;
		this.numPlazas=numPlazas;
	}
	public int getnumPlazas() {
		return numPlazas;
	}
	public void setnumPlazas() {
		this.setnumPlazas();
	}
	public void mostrarDatosCoche() {
		mostrarDatosCoche();
		System.out.println(numPlazas);
	}
}