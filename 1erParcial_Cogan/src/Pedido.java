import java.util.ArrayList;

public class Pedido {
	private int nroPed;
	private Producto producto;
	private Tecnico tecnico;
	private Cliente cliente;
	private Fecha fecha;
	private String falla;
	private int tiempoEst;
	private ArrayList<Repuesto>listaRepuestos;
	
	public Pedido(int n, Producto p, Tecnico t, Cliente c, Fecha f, String fa, int te)
	{
		nroPed=n;
		producto=p;
		tecnico=t;
		cliente=c;
		fecha=f;
		falla=fa;
		tiempoEst=te;
		listaRepuestos=new ArrayList<Repuesto>();
	}
	
	public boolean sos(int x)
	{
		return nroPed==x;
	}
	
}
