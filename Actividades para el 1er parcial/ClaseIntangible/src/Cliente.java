import java.util.ArrayList;

public class Cliente {
	private int dni;
	private String direccion;
	private ArrayList<Alquiler>alquileres;
	
	
	public Cliente (int num, String n) 
	{
		dni = num;
		direccion = n;
		alquileres=new ArrayList<Alquiler>();
	}
	
	public boolean sos (int num) {
		return dni == num;
	}
	
	public boolean puede()
	{
		return alquileres.size()<5;
	}
	
	public void registrarAlq(Alquiler alq)
	{
		alquileres.add(alq);
	}
	
	public void devolucion(Alquiler a)
	{
		alquileres.remove(a);
	}

	public void informaHerramientas()
	{
		System.out.println("Tiene "+alquileres.size()+" herramientas");
		for(Alquiler a:alquileres)
			a.mostrarHerram();
	}
	
	public int getDni()
	{
		return dni;
	}
	public String getDirec()
	{
		return direccion;
	}
}
