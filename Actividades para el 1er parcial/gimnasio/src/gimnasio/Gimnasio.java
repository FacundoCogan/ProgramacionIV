package gimnasio;

import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
	private ArrayList<Socio> socios = new ArrayList<Socio>();
	
	public Socio formularioSocio() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nRegistro socio");
		
		System.out.print("\nDni: ");
		int  dni = in.nextInt();
		
		Socio socio = this.buscarSocio(dni);
		if (socio == null) {
			System.out.print("\nNombre: ");
			String nombre = in.next();
			
			System.out.print("\nDireccion: ");
			String direccion = in.next();
			
			return new Socio(dni, nombre, direccion);
		}
			System.out.print("\nEl dni " + dni + " ya existe");
			return null;
	}
	
	public void agregarSocio() {
		Socio socio = this.formularioSocio();
		if (socio != null) {
			this.socios.add(socio);
		}
	}
	
	private Socio buscarSocio(int dni) {
		int i = 0;
		while (i < this.cantidadSocios() && socios.get(i).getDni() != dni) {
			i++;
		}
		if (i != this.cantidadSocios()) {
			return socios.get(i);
		}
		return null;
	}
	
	public void registrarDeuda() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nDni: ");
		int  dni = in.nextInt();
		
		Socio socio = buscarSocio(dni);
		
		if (socio == null) {
			System.out.print("\nNo existe un socio con dni: " + dni);
		} else {
			System.out.print("\nDeuda: ");
			float  deuda = in.nextFloat();
			
			socio.aumentarDeuda(deuda);
		}
	}
	
	public void registrarAbono() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nDni: ");
		int  dni = in.nextInt();
		
		Socio socio = buscarSocio(dni);
		
		if (socio == null) {
			System.out.print("\nNo existe un socio con dni: " + dni);
		} else {
			System.out.print("\nAbono: ");
			float  abono = in.nextFloat();
			
			socio.reducirDeuda(abono);
		}
	}
	
	public int cantidadSocios() {
		return socios.size();
	}
	
	public void informarCantidadSocios() {
		System.out.print("\nCantidad socios: " + this.cantidadSocios());
	}
	
	public void informarTotalRecaudado() {
		float totalRecaudado = 0;
		for (Socio socio: socios) {
			totalRecaudado += socio.getTotalAbonado();
		}
		System.out.print("\nTotal recaudado: " + totalRecaudado);
	}
	
	private ArrayList<Socio> buscarSociosConDeuda() {
		ArrayList<Socio> sociosConDeuda = new ArrayList<Socio>();
		
		for (Socio socio: socios) {
			if (socio.poseeDeuda()) {
				sociosConDeuda.add(socio);
			}
		}
		
		return sociosConDeuda;
	}
	
	private void mostrarNombreSubListaSocios(ArrayList<Socio> subListaSocios) {
		for (Socio socio: subListaSocios) {
			socio.mostrarNombre();
		}
	}
	
	private void mostrarInfoSubListaSocios(ArrayList<Socio> subListaSocios) {
		for (Socio socio: subListaSocios) {
			socio.mostrarInfo();
		}
	}
	
	public void informarDeudores() {
		ArrayList<Socio> sociosConDeuda = this.buscarSociosConDeuda();
		this.mostrarInfoSubListaSocios(sociosConDeuda);
	}
	
	public void informarNombreDeudores() {
		ArrayList<Socio> sociosConDeuda = this.buscarSociosConDeuda();
		this.mostrarNombreSubListaSocios(sociosConDeuda);
	}
	
	public void informarDeudaSocio() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nDni: ");
		int  dni = in.nextInt();
		
		Socio socio = this.buscarSocio(dni);
		
		if (socio == null) {
			System.out.print("\nNo existe un socio con dni: " + dni);
		} else {
			socio.informarDeuda();
		}
	}
	
	public void generarSubLista() {
		ArrayList<Socio> listaPosiblesSocios = new ArrayList<Socio>();
		String continuar = "si";
		
		do {
			Socio posibleSocio = this.formularioSocio();
			if (posibleSocio != null) {
				listaPosiblesSocios.add(posibleSocio);
			}
			
			System.out.print("\nDesea ingresar otro socio");
			System.out.print("\n[si/no]: ");
		} while (continuar != "si");
		
		this.agregarSociosSubLista(listaPosiblesSocios);
	}
	
	public void agregarSociosSubLista(ArrayList<Socio> listaPosiblesSocios) {
		for (Socio posibleSocio: listaPosiblesSocios) {
			Socio socio = this.buscarSocio(posibleSocio.getDni());
			
			if (socio == null) {
				socios.add(posibleSocio);
				System.out.print("\nSocio dni " + posibleSocio.getDni() + " fue agregado");
			} else {
				System.out.print("\nSocio dni " + posibleSocio.getDni() + " no fue agregado");
			}
		}
	}
}
