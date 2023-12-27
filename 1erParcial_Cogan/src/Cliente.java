import java.util.ArrayList;

public class Cliente {
	private int dni;
	private ArrayList<Pedido>listaPedidos;
	
	public Cliente(int d, String n)
	{
		dni=d;
		listaPedidos=new ArrayList<Pedido>();
	}
	
	public boolean sos(int x)
	{
		return dni==x;
	}
	
	public void agregarPed(Pedido p)
	{
		listaPedidos.add(p);
	}
}
