
public class Participacion {
	private float puntaje;
	private Prueba prueba;
	private Competidor competidor;
	
	public Participacion(float puntaje, Prueba prueba, Competidor competidor) {
		this.puntaje = puntaje;
		this.prueba = prueba;
		this.competidor = competidor;
	}
	
	public boolean sos(Prueba p) {
		return this.prueba == p;
	}
	
	public void setPuntaje(float puntaje) {
		this.puntaje = puntaje;
	}
}
