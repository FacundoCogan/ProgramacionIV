import java.util.ArrayList;

import javax.print.attribute.SetOfIntegerSyntax;

public class Empresa {
	private ArrayList<Herramienta> herramientas;
	private ArrayList<Cliente> clientes;
	private ArrayList<Alquiler> alquileres;
	
	public Empresa () 
	{
		herramientas = new ArrayList<Herramienta>();
		clientes = new ArrayList<Cliente>();
		alquileres=new ArrayList<Alquiler>();
	}
	
	public void registrarCliente(int unDni,String unaDirec) //caso de uso 1
	{
		Cliente cli=this.buscarCliente(unDni);
		if(cli==null)
		{
			cli=new Cliente(unDni, unaDirec);
			clientes.add(cli);
		}
		else
			System.out.println("ya es cliente");
	}
	
	public void agregarHerramienta(int unCod,String unaDesc,int unaCant) //caso de uso 2
	{
		Herramienta herra=this.buscarHerramienta(unCod);
		if(herra!=null)
			herra.sumarStock(unaCant);
		else
		{
			herra=new Herramienta(unCod,unaDesc,unaCant);
			herramientas.add(herra);
		}
	}
	
	public void alquilar(int unDni,int codHerr,String fechaAlq,int codAlq) //caso de uso 3
	{
		Cliente cli=this.buscarCliente(unDni);
		if(cli==null)
			System.out.println("Cliente inexixtente");
		else
		{
			Herramienta h=this.buscarHerramienta(codHerr);
			if(h==null)
				System.out.println("Herramienta inexixtente");
			else
			{
				if(cli.puede())
				{
					if(h.sePuedeAlquilar())
					{
						Alquiler alq=new Alquiler(codAlq,fechaAlq,h,cli);
						alquileres.add(alq);
						cli.registrarAlq(alq);
						h.registrarAlq(alq);
					}
					else
						System.out.println("No hay disponibles");
				}
				else
					System.out.println("No puede alquilar");
			}
		}
		
		
	}
	
	public void devolver(int codAlquiler)  //caso de uso 4

	{
		Alquiler alq=this.buscarAlquiler(codAlquiler);
		if(alq!=null)
		{
			alquileres.remove(alq);
			/*
			alq.getHerramienta().devolucion(alq);
			alq.getCliente().devolucion(alq);
			*/
			alq.completarDev();
		}
	}
	
	public void informarHerramCliente(int unDni) //caso de uso 5
	{
		Cliente cli=this.buscarCliente(unDni);
		if(cli!=null)
			cli.informaHerramientas();
	}
	
	public void infHerramAlq(int cod) //caso de uso 6
	{
		Herramienta h=this.buscarHerramienta(cod);
		if(h!=null)
			h.mostrarAlq();
	}

	public Cliente buscarCliente (int doc) 
	{
		int i=0;
		while(i<clientes.size() && !clientes.get(i).sos(doc))
			i++;
		if (i<clientes.size())
			return clientes.get(i);
		else
			return null;
	}
	
	public Herramienta buscarHerramienta (int cod) 
	{
		int i=0;
		while((i<herramientas.size()) && !(herramientas.get(i).sos(cod)))
			i++;
		if (i<herramientas.size())
			return herramientas.get(i);
		else
			return null;
	}
	
	public Alquiler buscarAlquiler (int unCod) 
	{
		int i=0;
		while(i<alquileres.size() && !alquileres.get(i).sos(unCod))
			i++;
		if (i<alquileres.size())
			return alquileres.get(i);
		else
			return null;
	}
}
