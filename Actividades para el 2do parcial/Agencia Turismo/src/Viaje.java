import java.util.ArrayList;

public class Viaje {
	public static int idViaje = 0;
	private int codigo;
	private String destino;
	private Fecha fechaSalida;
	private int cupo;
	private float costTransporteXPersona;
	private ArrayList<Turista> turistas;
	private Promocion promo;
	
	public Viaje (String dest, int c, float cost){
		codigo = idViaje++;
		destino = dest;
		cupo = c;
		costTransporteXPersona = cost;
		promo = null;
		fechaSalida = Fecha.nuevaFecha();
		turistas = new ArrayList<Turista>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public boolean sos(int c) {
		return c == codigo;
	}
	
	public void agregarPromo(Promocion d) {
		promo = d;
	}
	
	public boolean hayCupo() {
		return cupo > 0;
	}
	
	public boolean existeTurista(Turista c) {
		int i=0;
		while(i<turistas.size() && !(turistas.get(i)==c))
			i++;
		if(i==turistas.size())
			return false;
		else
			return true;
		
	}
	
	public void agregarTurista(Turista turista) {
		turistas.add(turista);
	}
}
