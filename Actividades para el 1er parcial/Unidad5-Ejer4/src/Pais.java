import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList <Competidor> competidores;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		competidores = new ArrayList <Competidor>();
	}
	
	public boolean sos(String nombre) {
		return this.nombre.equalsIgnoreCase(nombre);
	}
	
	/*
	public void cantMedallasOroPais() {
		int cantMedallasOro=0;
		for(Competidor comp: competidores) {
			cantMedallasOro = comp.cantMedallasOro();
		}
	}
	*/
	
}
