package boletin3;

public class remolque extends camion {
	public remolque(String matricula, String tipo, int velMax, remolque Remolque) {
		super(matricula, tipo, velMax, Remolque);
		// TODO Auto-generated constructor stub
	}
	private String matricula;
	private int longitud;

	public String getmatricula() {
		return matricula;
	}
	public int getlongitud() {
		return longitud;
	}
}