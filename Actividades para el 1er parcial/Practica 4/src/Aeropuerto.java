import java.util.ArrayList;
import java.util.Scanner;

public class Aeropuerto {
	private String nombre;
	private ArrayList<Vuelo> vuelos;
	private ArrayList<Destino> destinos;
	
	Scanner s = new Scanner(System.in);
	int opc;
	
	public Aeropuerto(/*String nom*/) {
		//nombre = nom;
		vuelos = new ArrayList<Vuelo>();
		destinos = new ArrayList<Destino>();
	}
	
	public void agregarDest() {
		System.out.println("Ingrese codigo de destino: ");
		int cod = s.nextInt();
		Destino destin = this.buscarDestino(cod); 
		if (destin==null){
			System.out.println("Ingrese nombre del destino: ");
			String nom = s.next();
			destin = new Destino(cod, nom);
			destinos.add(destin);
		}
	}
	
	public void agregarVuelo() {
		System.out.println("Ingrese codigo de destino: ");
		int dest = s.nextInt();
		Destino destin = this.buscarDestino(dest); 
		if (destin!=null){
			System.out.println("Ingrese numero de vuelo: ");
			int cod = s.nextInt();
			Vuelo vuel = this.buscarVuelo(cod);
			if (vuel == null){
				System.out.println("Ingrese capacidad del vuelo: ");
				int cap = s.nextInt();
				System.out.println("Ingrese costo de pasaje: ");
				double cost = s.nextDouble();
				Vuelo vuelo = new Vuelo(cod,destin, cap, cost);
				vuelos.add(vuelo);
				destin.agregarVueloLista(vuelo);
			}
		}
	}
	
	public void informarVac() {
		System.out.println("Ingrese codigo de destino: ");
		int dest = s.nextInt();
		Destino destin = this.buscarDestino(dest); 
		if (destin!=null)
			System.out.println("Cantidad de vacantes disponibles:" + destin.cantVacDestino());
	}
	
	public void comprarVoletos() {
		System.out.println("Ingrese codigo de destino: ");
		int dest = s.nextInt();
		Destino destin = this.buscarDestino(dest); 
		if (destin!=null){
			System.out.println("Ingrese pasajes a comprar: ");
			int cant = s.nextInt();
			if (destin.compCap(cant)){
				Vuelo vuel = destin.vueloCap(cant);
				if (vuel != null)
					vuel.aumentarVacOcupados(cant);
				else {
					destin.distPasajes(cant);
				}
			}
		}
	}
	
	public void mostrarVuelos(){
		
	}
	
	public void informarImporteRec(){
		System.out.println("Ingrese numero de vuelo: ");
		int cod = s.nextInt();
		Vuelo vuel = this.buscarVuelo(cod);
		if (vuel != null)
			System.out.println("Importe recaudado:" + vuel.getImporteRec());
	}
	
	private Vuelo buscarVuelo(int n){
		int i = 0;
		while ((i<vuelos.size()) && (!vuelos.get(i).esVuelo(n)))
			i++;
		if(i<vuelos.size())
			return vuelos.get(i);
		else
			return null;
	}
	
	private Destino buscarDestino(int n){
		int i = 0;
		while ((i<destinos.size()) && (!destinos.get(i).esDest(n)))
			i++;
		if(i<destinos.size())
			return destinos.get(i);
		else
			return null;
	}
}
