import java.util.ArrayList;

public class Sector {
	private float presupuesto;
	private String ubicacion;
	private int id;
	private ArrayList<Empleado> empleados;
	
	public Sector(int id, String ubicacion, float presupuesto) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.presupuesto = presupuesto;
		this.empleados = new ArrayList<Empleado>();
	}
	
	public boolean hasId(int id) {
		return this.id == id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
		System.out.print("\nSe asigno el empleado al sector correctamente");
	}
	
	public void sacarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
		System.out.print("\nSe desasigno el empleado al sector correctamente");
	}
}
