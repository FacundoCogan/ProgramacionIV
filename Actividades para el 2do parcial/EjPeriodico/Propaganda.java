
import utilidades.Fecha;

public class Propaganda extends Publicacion {
	private float alto;
	private float ancho;
	
public Propaganda(int nro, String nom, Fecha f, int d, float h, float w)
{
	super(nro,nom,f,d);
	alto = h;
	ancho = w;
}
	
public float dameEspacio()
{
	return alto * ancho;
	
}

public void informarContratados() {
	System.out.printf("%s - %6.2f \n",super.toString(), this.dameEspacio());	
}
}
