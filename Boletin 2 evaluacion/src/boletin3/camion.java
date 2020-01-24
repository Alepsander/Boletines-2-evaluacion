package boletin3;

public class camion extends vehiculo{
	private int altura;
	private remolque remolque; 
	
	public camion (String matricula, String tipo, int velMax, remolque Remolque) {
		this.matricula=matricula;
		this.tipo=tipo;
		this.velMax=velMax;
		this.remolque=remolque; 
	}
	public int getaltura() {
		return altura;
	}
	public remolque getremolque() {
		return remolque;
	}
	
	public void mostrarDatoscamion() {
		mostrarDatoscamion();
		System.out.println(altura);
		System.out.println(remolque);
	}
}