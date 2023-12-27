import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList<Inscripcion> inscripciones;
	
	public boolean hasNombre(String pais) {
		return this.nombre == pais;
	}
	
	public void informarMedallasDeOro() {
		int contador = 0;
		
		for (Inscripcion inscripcion: inscripciones) {
			if (inscripcion.informarSiEsMedallaDeOro()) {
				contador++;
			}
		}
		
		System.out.print("\nSe obtuvieron " + contador + " medallas de oro");
	}
}
