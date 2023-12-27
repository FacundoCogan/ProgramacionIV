import java.util.ArrayList;

public class Tecnico {
	private int matricula;
	private double valorHora;
	private ArrayList<Pedido>listaPedidos;
	
	public Tecnico(int m, double vh)
	{
		matricula=m;
		valorHora=vh;
		listaPedidos=new ArrayList<Pedido>();
	}
	
	public boolean sos(int x)
	{
		return matricula==x;
	}
	
	public void agregarPedido(Pedido p)
	{
		listaPedidos.add(p);
	}
}
