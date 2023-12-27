import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private ArrayList<Sucursal>listaSucursales;
	private ArrayList<Publicidad>listaPublicidades;
	
	public Empresa()
	{
		listaSucursales= new ArrayList<Sucursal>();
		listaPublicidades= new ArrayList<Publicidad>();
	}
	
	public void agregarPublicidad() // caso de uso 1
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese codigo de publicidad: ");
		int cod=s.nextInt();
		{
			Publicidad pub=this.buscarPublicidad(cod);
			if(pub==null)
			{
				System.out.println("Ingrese codigo de localidad de la sucursal: ");
				int codL=s.nextInt();
				Sucursal suc=this.buscarSucursal(codL);
				if(suc!=null)
				{
					System.out.println("Ingrese tipo [1: Estatica / 2: Dinamica] ");
					byte op=s.nextByte();
					if(op==1)
					{	
						System.out.println("Ingrese metros cuadrados: ");
						double mc=s.nextDouble();
						
						pub=new Estatica(suc, mc);
						listaPublicidades.add(pub);
						suc.agregarPublicidad(pub);
						System.out.println("Se ha generado exitosamente la publicidad con codigo: "+pub.getCodigo());
					}
					else
						System.out.println("Ingrese precio por segundo de video: ");
						double p=s.nextDouble();
						
						System.out.println("Ingrese la duracion del video: ");
						double dv=s.nextDouble();
						
						pub=new Dinamica(p, suc, dv);
						listaPublicidades.add(pub);
						suc.agregarPublicidad(pub);
						System.out.println("Se ha generado exitosamente la publicidad con codigo: "+pub.getCodigo());
						
					}
					System.out.println("La sucursal no existe.");	
			}
			else
				System.out.println("El codigo de publicidad ingresado ya existe.");
		}
	}
	
	public void informarPublicidades() // caso de uso 2
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese codigo de localidad de la sucursal: ");
		int cod=s.nextInt();
		Sucursal sucu=this.buscarSucursal(cod);
		if(sucu!=null)
		{
			sucu.mostrarPubli();
		}
		else
			System.out.println("El codigo de localidad ingresado no es valido.");
	}
	
	public void informarImporteTotal() // caso de uso 3
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese codigo de localidad de la sucursal: ");
		int cod=s.nextInt();
		Sucursal sucu=this.buscarSucursal(cod);
		if(sucu!=null)
		{
			sucu.mostrarTotal();
		}
	}
	
	private Publicidad buscarPublicidad(int cod)
	{
		int i=0;
		while(i<listaPublicidades.size() && !listaPublicidades.get(i).sos(cod))
			i++;
		if(i==listaPublicidades.size())
			return null;
		else
			return listaPublicidades.get(i);
	}
	
	private Sucursal buscarSucursal(int cod)
	{
		int i=0;
		while(i<listaSucursales.size() && !listaSucursales.get(i).sos(cod))
			i++;
		if(i==listaSucursales.size())
			return null;
		else
			return listaSucursales.get(i);
	}
}
