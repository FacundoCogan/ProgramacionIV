
public class Dinamica extends Publicidad{
	private double precioSegundo;
	private double duracionVideo;
	
	public Dinamica(double ps, Sucursal s, double dv)
	{
		super(s);
		precioSegundo=ps;
		duracionVideo=dv;
	}
	
	public double calcularPrecio()
	{
		return this.precioSegundo*this.duracionVideo;
	}
	
}
