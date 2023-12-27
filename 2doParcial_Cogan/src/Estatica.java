import java.util.Scanner;

public class Estatica extends Publicidad{
	private double metrosCuadrados;
	private static double PrecioMetroCuadrado;
	
	public Estatica(Sucursal s, double mc)
	{
		super(s);
		metrosCuadrados=mc;
	}
	
	public double GetPrecioMetroCuadrado()
	{
		if(PrecioMetroCuadrado==0)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Ingrese el precio por metro cuadrado del cartel: ");
			PrecioMetroCuadrado=s.nextDouble();
		}
		return PrecioMetroCuadrado;
	}
	
	public double calcularPrecio()
	{
		return this.metrosCuadrados*this.GetPrecioMetroCuadrado();
	}
	
}
