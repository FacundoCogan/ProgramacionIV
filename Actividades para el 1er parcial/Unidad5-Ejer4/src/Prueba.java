import java.util.ArrayList;

public class Prueba {
	private String nombre;
	private ArrayList <Participacion> participaciones;
	//fecha
	
	public Prueba(String nombre) {
		this.nombre = nombre;
		participaciones = new ArrayList <Participacion>();
	}
	
	public boolean sos(String nombre) {
		return (this.nombre.equalsIgnoreCase(nombre));
	}
	
	public void agregarParticipacion(Participacion part) {
		participaciones.add(part);

	}
	
}
