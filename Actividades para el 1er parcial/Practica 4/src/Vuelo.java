
public class Vuelo {
	private int numero;
	private Destino destino;
	private int capacidad;
	private int cantAsientOcupados;
	private double costoPasaje;
	
	public Vuelo(int n, Destino dest, int cap, double cost){
		numero = n;
		destino = dest;
		capacidad = cap;
		cantAsientOcupados = 0;
		costoPasaje = cost;
	}
	
	public boolean esVuelo(int n) {
		return n==numero;
	}
	
	public int cantVac(){
		return (capacidad - cantAsientOcupados);
	}
	
	public double getImporteRec(){
		return (costoPasaje*cantAsientOcupados);
	}
	
	public void aumentarVacOcupados(int n) {
		cantAsientOcupados += n;
	}
	
	public int llenarVuelo(int n) {
		int cant = this.cantVac();
		if (cant<n) {
			n -= cant;
			cantAsientOcupados+= cant;
		}
		else {
			cantAsientOcupados+= n;
			n=0;
		}
		return n;
	}
	
	public boolean capValida(int n) {
		return (n<=this.cantVac());
	}
	
	public void mostrate(){
		
	}
}
