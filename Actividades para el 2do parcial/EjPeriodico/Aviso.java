import utilidades.Fecha;

public class Aviso extends Publicacion{
	
private int cantLineas;
private static double superficieLinea;
	
public Aviso(int nro, String nom, Fecha f, int d, int c){
	super(nro, nom, f, d);
	cantLineas = c;
}
	
public float dameEspacio()
{
	return (float) (cantLineas* (Aviso.getSuperficieLinea()));
	
}

public void informarContratados() {
	System.out.printf("%s - %6.2f  \n",super.toString(), this.dameEspacio());	
}

public static void setSuperficieLinea(double sup) {
	superficieLinea = sup;
}

public static double getSuperficieLinea() {
	return superficieLinea;
}

}
