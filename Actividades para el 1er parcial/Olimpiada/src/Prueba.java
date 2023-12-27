import java.util.ArrayList;

public class Prueba {
	private String disciplina;
	private ArrayList<Inscripcion> inscripciones;
	
	public Prueba(String disciplina) {
		this.disciplina = disciplina;
		this.inscripciones = new ArrayList<Inscripcion>();
	}
	
	public boolean hasDisciplina(String disciplina) {
		return disciplina == this.disciplina;
	}
	
	public void mostar() {
		System.out.print("\nDisciplina: " + this.getDisciplina());
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}
	
	public void agregarInscripcion(Inscripcion inscripcion) {
		inscripciones.add(inscripcion);
	}

	/*
	public void informarPuntuacionMasAlta() {}
		if (inscripciones.size() > 0) {
			Inscripcion inscripcionMasAlta = inscripciones.get(0);
			for (Inscripcion inscripcion: inscripciones) {
				if (inscripcion.hasMayorPuntuacion(inscripcionMasAlta.getPuntuacion())) {
					inscripcionMasAlta = inscripcion;
				}
			}
		}
	}
	*/
}
