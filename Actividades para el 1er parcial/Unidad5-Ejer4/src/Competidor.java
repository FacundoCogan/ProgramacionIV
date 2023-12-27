import java.util.ArrayList;

public class Competidor {
	private String nombre;
	private String dni;
	private Pais pais;
	private ArrayList <Participacion> participaciones;
	
	public Competidor(String nombre, String dni, Pais pais) {
		this.nombre = nombre;
		this.dni = dni;
		this.pais = pais;
		participaciones = new ArrayList <Participacion>();
	}
	
	public boolean sos(String identificador) {
		return (this.dni.equals(identificador));
	}
	
	public void agregarParticipacion(Participacion part) {
		participaciones.add(part);
	}
	
	public void agregarPuntajePrueba(float puntaje, Prueba prueba) {
		Participacion p = buscarParticipacion(prueba);
		
		if(p != null) {
			p.setPuntaje(puntaje);
		}
		else {
			System.out.println("La participacion no existe");
		}
	}
	
	public Participacion buscarParticipacion(Prueba prueba) {
		int i=0;
		while(i<participaciones.size() && !participaciones.get(i).sos(prueba))
			i++;
		if(i==participaciones.size())
			return null; 
		else
			return participaciones.get(i);	
	}
	
	/*
	public cantMedallasOro() {
		
	}
	*/
	
	
}
