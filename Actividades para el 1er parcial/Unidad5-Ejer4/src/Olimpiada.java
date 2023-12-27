import java.util.ArrayList;
import java.util.Scanner;

public class Olimpiada {
	Scanner in = new Scanner(System.in);
	private ArrayList <Prueba> pruebas;
	private ArrayList <Competidor> competidores;
	private ArrayList <Pais> paises;
	
	public Olimpiada() {
		pruebas = new ArrayList <Prueba>();
		competidores = new ArrayList <Competidor>();
		paises = new ArrayList <Pais>();
	}
	
	public void agregarPrueba() {
		System.out.println("Ingrese el nombre de la Prueba:");
		String nombre = in.next();
		
		Prueba prueba = new Prueba(nombre);
		pruebas.add(prueba);
	}
	
	public void agregarCompetidor() {
		System.out.println("Ingrese el nombre del competidor:");
		String nombre = in.next();
		
		System.out.println("Ingrese el dni del competidor:");
		String dni = in.next();
		
		System.out.println("Ingrese el nombre del pais:");
		String nombrePais = in.next();
		
		Pais pais = buscarPais(nombrePais);
		
		if(pais == null) {
			System.out.println("El pais no existe, se registro el pais");
			pais = new Pais(nombrePais);
			paises.add(pais);
			
		}
		
		Competidor competidor = new Competidor(nombre, dni, pais);
		competidores.add(competidor);
	}
	
	public void agregarPais() {
		System.out.println("nombre: ");
		String nom = in.next();
		
		Pais p = new Pais(nom);
		paises.add(p);
	}
	
	private Pais buscarPais(String nom) {
		int i=0;
		while(i<paises.size() && !paises.get(i).sos(nom))
			i++;

		if(i==paises.size())
			return null; 
		else
			return paises.get(i);	

	}
	
	public void inscribirCompetidor() {
		System.out.println("Ingrese el dni del competidor:");
		String dni = in.next();
		
		Competidor competidor = this.buscarCompetidor(dni);
		
		if(competidor != null) {
			System.out.println("Ingrese nombre de la prueba:");
			String nombrePrueba = in.next();
			
			Prueba prueba = this.buscarPrueba(nombrePrueba);
			
			if(prueba != null) {
				//Crear Participacion
				Participacion participacion = new Participacion(0,prueba,competidor);
				prueba.agregarParticipacion(participacion);
				competidor.agregarParticipacion(participacion);
				
			}
			else {
				System.out.println("La prueba no existe");
			}
		}
		else {
			System.out.println("El competidor no existe");
		}
	}
	
	public Competidor buscarCompetidor(String dni) {
		int i=0;

		while(i<competidores.size() && !competidores.get(i).sos(dni))
			i++;

		if(i==competidores.size())
			return null; 
		else
			return competidores.get(i);	

	}
	
	public Prueba buscarPrueba(String nom) {
		int i=0;
		while(i<pruebas.size() && !pruebas.get(i).sos(nom))
			i++;
		if(i==pruebas.size())
			return null; 
		else
			return pruebas.get(i);	

	}
	
	public void agregarPuntaje() {
		System.out.println("Ingrese el dni del competidor:");
		String dni = in.next();
		
		Competidor competidor = this.buscarCompetidor(dni);
		
		if(competidor != null) {
			System.out.println("Ingrese nombre de la prueba:");
			String nombrePrueba = in.next();
			
			Prueba prueba = this.buscarPrueba(nombrePrueba);
			if(prueba != null) {
				System.out.println("Ingrese el puntaje de la prueba:");
				float puntaje = in.nextFloat();
				competidor.agregarPuntajePrueba(puntaje,prueba);
			}
			else {
				System.out.println("La prueba no existe");
			}
			
			
		}
		else {
			System.out.println("El competidor no existe");
		}
		
	}
	/*
	public void cantMedallasOroPais() {
		System.out.println("Ingrese el pais:");
		String nombrePais = in.next();
		
		Pais pais = buscarPais(nombrePais);
		
		if(pais != null) {
			pais.cantMedallasOroPais();
		}
		else {
			System.out.println("El pais no existe");
		}
	}
	*/
	
	


	
	
}
