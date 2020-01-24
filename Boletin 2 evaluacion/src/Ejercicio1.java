import java.time.LocalDate;
import java.util.Date;

public class Ejercicio1 {
	public String nombre;
			public int estatura;
			public String apellidos;
			public LocalDate FechaNac;
			
	public static void main(String[] args) {
	
		
		Persona pers1=new Persona();
		pers1.nombre="Jose";
		pers1.apellidos="Rodriguez Mata";
		pers1.FechaNac= LocalDate.of(1965,1,15);
		pers1.estatura= 165;
		
		Persona pers2=new Persona();
		pers2.nombre="Maria";
		pers2.apellidos="Sanchez Gomez";
		pers2.FechaNac=LocalDate.of(1980,12,26);
		pers2.estatura= 170;
		 
		Persona pers3=new Persona();
		pers3.nombre="Alejandro";
		pers3.apellidos="Gomez Perez";
		pers3.FechaNac=LocalDate.of(2001,11,01);
		pers3.estatura= 190;
		 
		Persona pers4=new Persona();
		pers4.nombre="Jose Manuel";
		pers4.apellidos="Perez Pons";
		pers4.FechaNac=LocalDate.of(2010,05,01);
		pers4.estatura=127;
	
		pers1.MostrarDatos();
		pers2.MostrarDatos();
		pers3.MostrarDatos();
		pers4.MostrarDatos();
		
		pers1.obtenerEdad();
		pers2.obtenerEdad();
		pers3.obtenerEdad();
		pers4.obtenerEdad();
		
	}
		
	
}