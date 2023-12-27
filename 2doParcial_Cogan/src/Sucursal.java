import java.util.ArrayList;

public class Sucursal {
	int codLocalidad;
	private ArrayList<Publicidad>listaPublicidades;
	
	public Sucursal(int cl)
	{
		codLocalidad=cl;
		listaPublicidades=new ArrayList<Publicidad>();
	}
	
	public void agregarPublicidad(Publicidad p)
	{
		listaPublicidades.add(p);
	}
	
	public boolean sos(int x)
	{
		return codLocalidad==x;
	}
	
	public void mostrarPubli()
	{
		for(Publicidad pub:listaPublicidades)
			System.out.println("Codigo de publicidad: "+pub.getCodigo()+" y es de tipo: "+pub.getClass().getName());
	}
	
	public void mostrarTotal()
	{
		double total=0;
		for(Publicidad pub:listaPublicidades)
		{
			total+=pub.calcularPrecio();
		}
		
		System.out.println("El importe que se cobro en concepto de publicidades es de: $"+total);
	}
	
}
