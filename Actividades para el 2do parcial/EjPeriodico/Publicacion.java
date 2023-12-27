import utilidades.Fecha;

public abstract class Publicacion {
	
	private int codigo;
	private String nombreSolicitante;
	private Fecha fechaContrato;
	private int diasContrato;
	private static double precioCm2Dia;
	
public Publicacion(int nro, String nom, Fecha f, int d)
{
	codigo = nro;
	nombreSolicitante = nom;
	fechaContrato = f;
	diasContrato = d;		
}		

	public abstract float dameEspacio();
	public abstract void informarContratados();
	
public boolean estasExpirada()
{					
	return (Fecha.hoy().compareTo(fechaContrato) > diasContrato);		
}
	
public boolean estasVigentePara(Fecha f)
{
	int dif = f.compareTo(fechaContrato);
	return (dif >= 0 && dif <= diasContrato);
}
	
public boolean sosCodigo(int nro)
{
	return codigo == nro;
}
	
public String darSolicitante()
{
	return nombreSolicitante;
}

public String toString()
{
	return codigo + " " + nombreSolicitante + " - " + fechaContrato.toString();
}

public String dameEstado()
{
	if(this.estasExpirada())
		return "Expirada";
	else
		return "VIGENTE";
}
	
public void calcularCosto() {
	System.out.printf("El costo de la publicacion es de $%6.2f\n",(this.dameEspacio()*diasContrato*Publicacion.getPrecioCm2Dia()));
}

public static void setPrecioCm2Dia(double precio) {
	precioCm2Dia = precio;
}

public static double getPrecioCm2Dia() {
	return precioCm2Dia;
}

}
