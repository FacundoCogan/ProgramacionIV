import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private ArrayList<Pedido>listaPedidos;
	private ArrayList<Cliente>listaClientes;
	private ArrayList<Repuesto>listaRepuestos;
	private ArrayList<Tecnico>listaTecnicos;
	private ArrayList<Producto>listaProductos;
	
	public Empresa ()
	{
		listaPedidos=new ArrayList<Pedido>();
		listaClientes=new ArrayList<Cliente>();
		listaRepuestos=new ArrayList<Repuesto>();
		listaTecnicos=new ArrayList<Tecnico>();
		listaProductos=new ArrayList<Producto>();
	}
	
	public void agregarPedido(int codPed, int codProd, int unaMat, int unDni, Fecha unaF, String unaFalla, int tiem) // caso de uso 1
	{
		Pedido p=this.buscarPedido(codPed);
		if(p==null)
		{
			Producto pr=this.buscarProducto(codProd);
			if(pr!=null)
			{
				Tecnico t=this.buscarTecnico(unaMat);
				if(t!=null)
				{
					Cliente c=this.buscarCliente(unDni);
					if(c==null)
					{
						c=new Cliente(unDni, p);
						p=new Pedido(codPed, pr, t, c, unaF, unaFalla, tiem);
						listaPedidos.add(p);
						t.agregarPedido(p);
						c.agregarPed(p);
					}
					else
					{
						System.out.println("El dni ingresado ya existe en el sistema y se ha registrado el pedido.");
						p=new Pedido(codPed, pr, t, c, unaF, unaFalla, tiem);
						listaPedidos.add(p);
						t.agregarPedido(p);
						c.agregarPed(p);
					}
				}
				else
					System.out.println("La matricula del tecnico ingresada no existe.");
			}
			else
				System.out.println("El codigo de producto ingresado no existe, debe agregarlo.");
		}
		else
			System.out.println("El numero de pedido ingresado ya existe.");
	}
	
	public void agregarRepUtilizados(int nroPed, int codRep, int cantUtil)
	{
		Pedido ped=this.buscarPedido(nroPed);
		if(ped!=null)
		{
			Repuesto rep=this.buscarRepuesto(codRep);
			if(rep!=null)
			{
				rep.agregarRepuesto(cantUtil);
				mostrarCantUtilizada();
			}
			
		}
		else
			System.out.println("El numero de pedido no existe.");
	}
	
	public void mostrarCantUtilizada()
	{
		for(Repuesto rep:listaRepuestos)
		{
			System.out.println("Para el repuesto: "+rep.getCodRep()+", se utilizo la cantidad de: "+rep.getCantidad()+" repuestos.");
		}
	}
	
	private Pedido buscarPedido(int unCod)
	{
		int i=0;
		while(i<listaPedidos.size() && !listaPedidos.get(i).sos(unCod))
			i++;
		if(i==listaPedidos.size())
			return null;
		else
			return listaPedidos.get(i);
	}
	
	private Tecnico buscarTecnico(int unaMat)
	{
		int i=0;
		while(i<listaTecnicos.size() && !listaTecnicos.get(i).sos(unaMat))
			i++;
		if(i==listaTecnicos.size())
			return null;
		else
			return listaTecnicos.get(i);
	}
	
	public Cliente buscarCliente(int unDni)
	{
		int i=0;
		while(i<listaClientes.size() && !listaClientes.get(i).sos(unDni))
			i++;
		if(i==listaClientes.size())
			return null;
		else
			return listaClientes.get(i);
	}
	
	public Producto buscarProducto(int codProd)
	{
		int i=0;
		while(i<listaProductos.size() && !listaProductos.get(i).sos(codProd))
			i++;
		if(i==listaProductos.size())
			return null;
		else
			return listaProductos.get(i);
	}
	
public Repuesto buscarRepuesto(int codRep)
{
	int i=0;
	while(i<listaRepuestos.size() && !listaRepuestos.get(i).sos(codRep))
		i++;
	if(i==listaRepuestos.size())
		return null;
	else
		return listaRepuestos.get(i);
}
	
	
}
