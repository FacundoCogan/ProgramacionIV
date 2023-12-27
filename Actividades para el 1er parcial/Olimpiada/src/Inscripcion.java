
public class Inscripcion {
	private Competidor competidor;
	private Prueba prueba;
	private float puntuacion;
	
	public Inscripcion(Competidor competidor, Prueba prueba) {
		this.competidor = competidor;
		this.prueba = prueba;
		this.puntuacion = 0;
		
		competidor.agregarInscripcion(this);
		prueba.agregarInscripcion(this);
	}
	
	public boolean hasCompetidorYPrueba(Competidor competidor, Prueba prueba) {
		return this.competidor == competidor && this.prueba == prueba;
	}
	
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public boolean esMedallaDeOro() {
		return this.puntuacion > 98;
	}
	
	public void informarCompetidor() {
		this.competidor.mostar();
	}
	
	public void informarPrueba() {
		this.prueba.mostar();
	}
}
