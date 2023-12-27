import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private String nombre;
	private String direccion;
	
	public void agregarEmpleado() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nDni: ");
		int  dni = in.nextInt();
		
		Empleado empleado = this.buscarEmpleado(dni);
		
		if (empleado != null) {
			
			if (empleado.estasEliminado())
			{
				System.out.print("\nDesea reactivar el empleado " + dni + " [1: si / 2: no]");
				int  op = in.nextInt();
				
				if (op == 1) {
					empleado.reactivar();
				}
				
			} else {
				System.out.print("\nEl empleado ya existe");
				
			}
			
		} else {
			System.out.print("\nNombre: ");
			String  nombre = in.next();
			
			System.out.print("\nCategoria: ");
			String  categoria = in.next();
			
			System.out.print("\nSueldo: ");
			float  sueldo = in.nextFloat();
			
			empleado = new Empleado(nombre, dni, categoria, sueldo);
			empleados.add(empleado);
		}
	}
	
	public void agregarHorasExtras() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nDni: ");
		int  dni = in.nextInt();
		
		Empleado empleado = this.buscarEmpleado(dni);
		
		if (empleado == null) {
			System.out.print("\nEl empleado no existe");
		} else {
			System.out.print("\nHoras extras: ");
			int  horasExtras = in.nextInt();
			
			empleado.agregarHorasExtras(horasExtras);
		}
	}
	
	private Empleado buscarEmpleado(int dni) {
		int i = 0;
		while (i < empleados.size() && !empleados.get(i).hasDni(dni)) {
			i++;
		}
		if (i == empleados.size()) {
			return null;
		}
		return empleados.get(i);
	}
	
	/*
	private Empleado buscarEmpleado(int dni) {
		int i = 0;
		while (i < empleados.size() && !empleados.get(i).estasActivo(dni)) {
			i++;
		}
		if (i == empleados.size()) {
			return null;
		}
		return empleados.get(i);
	}
	*/
	
	public void eliminarEmpleado() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nDni: ");
		int  dni = in.nextInt();
		
		Empleado empleado = this.buscarEmpleado(dni);
		
		if (empleado == null) {
			System.out.print("\nEl empleado no existe");
		} else {
			empleado.desactivar();
		}
	}
	
	public void listarSueldoEmpleados() {
		for (Empleado empleado: empleados) {
			empleado.mostrarSueldo();
		}
	}
	
	public void informarTotalPagarHorasExtras() {
		int totalPagarHorasExtras = 0;
		for (Empleado empleado: empleados) {
			totalPagarHorasExtras += empleado.calcularSueldoHorasExtras();
		}
		System.out.print("\nTotal a pagar por horas extras: " + totalPagarHorasExtras);
	}
	
	public void informarTotalPagarSueldoFinal() {
		int totalPagar = 0;
		for (Empleado empleado: empleados) {
			totalPagar += empleado.calcularSueldoFinal();
		}
		System.out.print("\nTotal a pagar: " + totalPagar);
	}
}
