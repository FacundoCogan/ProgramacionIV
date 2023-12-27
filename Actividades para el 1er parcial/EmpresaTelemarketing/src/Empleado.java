import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
	private float sueldo;
	private ArrayList<Venta> ventas;
	private int legajo;
	private Sector sector;
	private String nombre;
	
	public Empleado(int legajo, String nombre, float sueldo) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.ventas = new ArrayList<Venta>();
	}
	
	public boolean hasLegajo(int legajo) {
		return this.legajo == legajo;
	}
	
	public void crearYAsignarVenta() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nFecha: ");
		String fecha = in.next();
		
		System.out.print("\nMonto: ");
		float monto = in.nextFloat();
		
		Venta venta = new Venta(fecha, monto);
		ventas.add(venta);
		
		System.out.print("\nSe agrego la venta correctamente");
	}
	
	public boolean hasSector(Sector sector) {
		return this.sector != null && this.sector.hasId(sector.getId());
	}
	
	public void asignarSector(Sector sector) {
		this.sector = sector;
		System.out.print("\nSe asigno el sector al empleado correctamente");
	}
	
	public Sector getSector() {
		return this.sector;
	}
}
