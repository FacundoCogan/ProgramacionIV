import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private ArrayList<Empleado> empleados;
	private ArrayList<Sector> sectores;
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
		this.sectores = new ArrayList<Sector>();
	}
	
	public void agregarEmpleado() { // CU-1
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nLegajo: ");
		int legajo = in.nextInt();
		
		Empleado empleado = this.buscarEmpleadoPorLegajo(legajo);
		
		if (empleado != null) {
			System.out.print("\nEl empleado ya existe");
		} else {
			System.out.print("\nNombre: ");
			String nombre = in.next();
			
			System.out.print("\nSueldo: ");
			float sueldo = in.nextFloat();
			
			empleado = new Empleado(legajo, nombre, sueldo);
			empleados.add(empleado);
			
			System.out.print("\nEl empleado fue agregado");
		}
	}
	
	private Empleado buscarEmpleadoPorLegajo(int legajo) {
		int i = 0;
		while (i < empleados.size() && !empleados.get(i).hasLegajo(legajo)) {
			i++;
		}
		if (i == empleados.size()) {
			return null;
		}
		return empleados.get(i);
	}
	
	public void agregarVenta() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nLegajo: ");
		int legajo = in.nextInt();
		
		Empleado empleado = this.buscarEmpleadoPorLegajo(legajo);
		
		if (empleado == null) {
			System.out.print("\nEl empleado no existe");
		} else {
			empleado.crearYAsignarVenta();
		}
	}
	
	public void asignarSectorEmpleado() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nLegajo: ");
		int legajo = in.nextInt();
		
		Empleado empleado = this.buscarEmpleadoPorLegajo(legajo);
		
		if (empleado == null) {
			System.out.print("\nEl empleado no existe");
		} else {
			System.out.print("\nCodigo sector: ");
			int idSector = in.nextInt();
			
			Sector sector = this.buscarSectorPorId(idSector);
			
			if (sector == null) {
				System.out.print("\nEl sector no existe");
			} else if (empleado.hasSector(sector)) {
				System.out.print("\nEl empleado ya esta en el sector");
			} else {
				empleado.asignarSector(sector);
				sector.agregarEmpleado(empleado);
			}
		}
	}
	
	private Sector buscarSectorPorId(int id) {
		int i = 0;
		while (i < sectores.size() && !sectores.get(i).hasId(id)) {
			i++;
		}
		if (i == sectores.size()) {
			return null;
		}
		return sectores.get(i);
	}
	
	public void agregarSector() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nCodigo sector: ");
		int idSector = in.nextInt();
		
		Sector sector = this.buscarSectorPorId(idSector);
		
		if (sector != null) {
			System.out.print("\nEl sector ya existe");
		} else {
			System.out.print("\nubicacion: ");
			String ubicacion = in.next();
			
			System.out.print("\npresupuesto: ");
			float presupuesto = in.nextFloat();
			
			sector = new Sector(idSector, ubicacion, presupuesto);
			sectores.add(sector);
			
			System.out.print("\nEl sector fue agregado");
		}
	}
	
	public void cambiarEmpleadoSector() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nLegajo: ");
		int legajo = in.nextInt();
		
		Empleado empleado = this.buscarEmpleadoPorLegajo(legajo);
		
		if (empleado == null) {
			System.out.print("\nEl empleado no existe");
		} else {
			System.out.print("\nCodigo sector destino: ");
			int idSectorDestino = in.nextInt();
			
			Sector sectorDestino = this.buscarSectorPorId(idSectorDestino);
			
			if (sectorDestino == null) {
				System.out.print("\nEl sector destino no existe");
			} else if (empleado.hasSector(sectorDestino)) {
				System.out.print("\nEl empleado ya esta en el sector");
			} else {
				Sector sector = empleado.getSector();
				sector.sacarEmpleado(empleado);
				empleado.asignarSector(sectorDestino);
				sectorDestino.agregarEmpleado(empleado);
			}
		}
	}
}
