
public class Alquiler {
	private int codigo;
	private String fecha;
	//private Fecha fecha;
	private Herramienta herramienta;
	private Cliente cliente;
	
	public Alquiler(int cod,String unaFecha,Herramienta h,Cliente c)
	{
		codigo=cod;
		fecha=unaFecha;
		herramienta=h;
		cliente=c;
	}
	
	/*
	public Alquiler(int cod,Fecha unaFecha,Herramienta h,Cliente c)
	{
		codigo=cod;
		fecha=unaFecha;
		herramienta=h;
		cliente=c;
		
	}
	*/
	
	public Herramienta getHerramienta()
	{
		return herramienta;
	}
	
	public Cliente getCliente()
	{
		return cliente;
	}
	
	public void completarDev()
	{
		herramienta.devolucion(this);
		cliente.devolucion(this);
	}
	
	public void mostrarHerram()
	{
		herramienta.mostrar();
	}
	
	public void mostrarCli()
	{
		System.out.println(cliente.getDni()+fecha+cliente.getDirec());
	}
	
	public boolean sos(int unCod)
	{
		return unCod==codigo;
	}
}
