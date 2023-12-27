
public class Repuesto {
	private int codRep;
	private double costo;
	private int cantidad;
	
	public Repuesto(int c, double co)
	{
		codRep=c;
		costo=co;
		cantidad=0;
	}
	
	public boolean sos(int x)
	{
		return codRep==x;
	}
	
	public void agregarRepuesto(int cantUtil)
	{
		cantidad+=cantUtil;
	}
	
	public int getCodRep()
	{
		return codRep;
	}
	
	public int getCantidad()
	{
		return cantidad;
	}
}
