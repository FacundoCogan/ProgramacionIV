import java.util.ArrayList;

public class Competidor {
	private String nombre;
	private Pais pais;
	private int dni;
	private ArrayList<Inscripcion> inscripciones;
	
	public boolean hasDni(int dni) {
		return this.dni == dni;
	}
	
	public void mostar() {
		System.out.print("\nNombre: " + this.getNombre());
		System.out.print("\nDni: " + this.getDni());
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void agregarInscripcion(Inscripcion inscripcion) {
		inscripciones.add(inscripcion);
	}
}
