import java.util.ArrayList;
import java.util.Scanner;

public class Olimpiada {
	private ArrayList<Prueba> pruebas;
	private ArrayList<Competidor> competidores;
	private ArrayList<Inscripcion> inscripciones;
	private ArrayList<Pais> paises;
	private String ubicacion;
	
	public Olimpiada(String ubicacion) {
		this.ubicacion = ubicacion;
		this.pruebas = new ArrayList<Prueba>();
		this.competidores = new ArrayList<Competidor>();
		this.inscripciones = new ArrayList<Inscripcion>();
		this.paises = new ArrayList<Pais>();
	}
	
	public void addPrueba() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nRegistro prueba");
		
		System.out.print("\nDisciplina");
		String disciplina = in.next();
		
		Prueba prueba = this.buscarPrueba(disciplina);
		
		if (prueba != null) {
			System.out.print("\nLa prueba ya existe");
		} else {
			prueba = new Prueba(disciplina);
			pruebas.add(prueba);
			System.out.print("\nLa prueba Se creo exitosamente");
		}
	}
	
	private Prueba buscarPrueba(String disciplina) {
		int i = 0;
		while (i < this.pruebas.size() && !this.pruebas.get(i).hasDisciplina(disciplina)) {
			i++;
		}
		if (i == this.pruebas.size()) {
			return null;
		}
		return this.pruebas.get(i);
	}
	
	public void inscribirCompetidorPrueba() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nInscribir competidor a prueba");
		
		System.out.print("\nDni competidor:");
		int dni = in.nextInt();
		
		Competidor competidor = this.buscarCompetidor(dni);
		
		if (competidor == null) {
			System.out.print("\nEl competidor no existe");
		} else {
			
			System.out.print("\nDisciplina:");
			String disciplina = in.next();
			
			Prueba prueba = this.buscarPrueba(disciplina);
			
			if (prueba == null) {
				System.out.print("\nLa prueba no existe");
			} else {
				
				Inscripcion inscripcion = new Inscripcion(competidor, prueba);
				inscripciones.add(inscripcion);
				System.out.print("\nSe inscribio correctamente");
			}
		}
	}
	
	private Competidor buscarCompetidor(int dni) {
		int i = 0;
		while (i < this.competidores.size() && !this.competidores.get(i).hasDni(dni)) {
			i++;
		}
		if (i == this.competidores.size()) {
			return null;
		}
		return this.competidores.get(i);
	}
	
	public void asignarPuntuacionInscripcion() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nAsignar puntuacion");
		
		System.out.print("\nDni competidor:");
		int dni = in.nextInt();
		
		Competidor competidor = this.buscarCompetidor(dni);
		
		if (competidor == null) {
			System.out.print("\nEl competidor no existe");
		} else {
			
			System.out.print("\nDisciplina:");
			String disciplina = in.next();
			
			Prueba prueba = this.buscarPrueba(disciplina);
			
			if (prueba == null) {
				System.out.print("\nLa prueba no existe");
			} else {
				
				Inscripcion inscripcion = this.buscarInscripcion(competidor, prueba);
				
				if (inscripcion == null) {
					System.out.print("\nLa inscripcion no existe");
				} else {
					System.out.print("\nPuntuacion:");
					int puntiacion = in.nextInt();
					
					inscripcion.setPuntuacion(puntiacion);
					System.out.print("\nSe agrego la puntuacion correctamente");
				}
			}
		}
	}
	
	private Inscripcion buscarInscripcion(Competidor competidor, Prueba prueba) {
		int i = 0;
		while (i < this.inscripciones.size() && !this.inscripciones.get(i).hasCompetidorYPrueba(competidor, prueba)) {
			i++;
		}
		if (i == this.inscripciones.size()) {
			return null;
		}
		return this.inscripciones.get(i);
	}
	
	public void informarMedallasDeOroPais() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nInformar medallas de oro pais");
		
		System.out.print("\nNombre pais:");
		String nombrePais = in.next();
		
		Pais pais = this.buscarPais(nombrePais);
		
		if (pais == null) {
			System.out.print("\nEl pais no existe");
		} else {
			
			pais.informarMedallasDeOro();
		}
	}
	
	private Pais buscarPais(String pais) {
		int i = 0;
		while (i < this.paises.size() && !this.paises.get(i).hasNombre(pais)) {
			i++;
		}
		if (i == this.paises.size()) {
			return null;
		}
		return this.paises.get(i);
	}
	
	/*
	public void informarPuntajeMasAlto() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nInformar puntaje mas alto disciplina");
		
		System.out.print("\nDisciplina:");
		String disciplina = in.next();
		
		Prueba prueba = this.buscarPrueba(disciplina);
		
		if (prueba == null) {
			System.out.print("\nLa prueba no existe");
		} else {
			
			prueba.informarPuntuacionMasAlta();
		}
	}
	*/
}
