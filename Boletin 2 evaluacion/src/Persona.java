import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persona {
	
	//camnpos
	public String nombre;
	public int estatura;
	public String apellidos;
	public LocalDate FechaNac;
	
	//constr
	public void obtenerEdad() {
		Long edad=ChronoUnit.YEARS.between(FechaNac, LocalDate.now());
	}
	
	public void parametros() {
		
	}
	
	//met
	public void MostrarDatos(){
		System.out.println(nombre);
		System.out.println(apellidos);
		System.out.println(estatura);
		System.out.println(FechaNac);
	}
	
}
