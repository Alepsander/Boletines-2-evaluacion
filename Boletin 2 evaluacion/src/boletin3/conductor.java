package boletin3;

public class conductor extends vehiculo {
	private String dni;
	private String nombre;
	
	public conductor(String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}
	
	public String getdni() {
		return dni;
}
	public String getnombre() {
		return nombre;
	}
}