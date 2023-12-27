
public class Producto {
	private int codProd;
	private String nombre;
	
	public Producto(int c, String n)
	{
		codProd=c;
		nombre=n;
	}
	
	public boolean sos(int x)
	{
		return codProd==x;
	}
}
