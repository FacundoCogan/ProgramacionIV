
public class Promocion {
	public static int idPromo = 0;
	private int nroPromocion;
	private Viaje viaje;
	private float porcentajeDesc;
	
	public Promocion(Viaje viaje, float descuento) {
		nroPromocion = idPromo++;
		this.viaje=viaje;
		porcentajeDesc = descuento;
		this.viaje.agregarPromo(this);
	}
	
}
