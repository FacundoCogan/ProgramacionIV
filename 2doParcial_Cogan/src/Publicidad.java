
public abstract class Publicidad {
	private static int IdCodigo=0;
	private int codigo;
	private Sucursal sucursal;
	
	public Publicidad (Sucursal suc)
	{
		codigo=IdCodigo++;
		sucursal=suc;
	}
	
	public boolean sos(int x)
	{
		return codigo==x;
	}
	
	public int getCodigo()
	{
		return codigo;
	}
	
	
	public abstract double calcularPrecio();
	
	
}
