import java.util.ArrayList;

public class Destino {
	private int cod;
	private String nombre;
	private ArrayList<Vuelo> vuelos;
	
	
	public Destino(int n, String nom) {
		cod = n;
		nombre = nom;
		vuelos = new ArrayList<Vuelo>();
	}
	
	public void agregarVueloLista(Vuelo x) {
		vuelos.add(x);
	}
	
	public boolean esDest(int n) {
		return n == cod;
	}
	
	public int cantVacDestino(){
		int cant = 0;
		for (Vuelo v : vuelos){
			cant += v.cantVac();
		}
		return cant;
	}
	
	public boolean compCap(int n) {
		return (n <= this.cantVacDestino());
	}
	
	public void distPasajes(int n){
		int i = 0;
		while ((i<vuelos.size()) && (n>0)) {
			n = vuelos.get(i).llenarVuelo(n);
			i++;
		}
	}
	
	public Vuelo vueloCap(int n) {
		int i = 0;
		while ((i<vuelos.size()) && (!vuelos.get(i).capValida(n)))
			i++;
		if(i<vuelos.size())
			return vuelos.get(i);
		else
			return null;
	}
	
	public void mostrarVuelos(){
		
	}
}
