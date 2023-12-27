import java.util.ArrayList;

public class Herramienta {
	private int codigo;
	private String desc;
	private int stock;
	private ArrayList<Alquiler> alquileres;
	
	public Herramienta (int c, String des, int cant)
	{
		codigo = c;
		desc = des;
		stock = cant;
		alquileres=new ArrayList<Alquiler>();
	}
	
	public boolean sos ( int c) 
	{
		return codigo == c;
	}
	
	public void sumarStock(int cant)
	{
		stock+=cant;
	}
	
	public boolean sePuedeAlquilar()
	{
		return alquileres.size()<stock;
	}
	
	public void registrarAlq(Alquiler alq)
	{
		alquileres.add(alq);
	}
	
	public void devolucion(Alquiler a)
	{
		alquileres.remove(a);
	}

	public void mostrar()
	{
		System.out.println(codigo+" - "+desc);
	}
	
	public void mostrarAlq()
	{
		for(Alquiler a:alquileres)
			a.mostrarCli();
	}
	
}
