import java.util.Scanner;
public class EjecutoraTP711 {
	public static void main (String args[]){
		
		Empresa e = new Empresa ();
		Scanner entrada = new Scanner(System.in);
		byte opc = 0;
		
		do {
			System.out.println("\nIngrese: 1- Agregar Empleado:");
			System.out.println("Ingrese: 2- Eliminar Empleado:");
			System.out.println("Ingrese: 3- Listar Sueldo de Empleados:");
			System.out.println("Ingrese: 4- Informar Total a Pagar Hs Extras:");
			System.out.println("Ingrese: 5- Tipo de Empleado:");
			System.out.println("Ingrese: 0- Salir");
			System.out.print("\nIngrese opc:");
			opc = entrada.nextByte();
			switch (opc) {
		case 1: {
			e.agregarEmpleado();
		}break;
		case 2: {
			e.eliminarEmpleado();
		}break;
		case 3:{
			e.informarSueldos();
		}break;
		case 4:{
			e.informarTotalHorasExtras();
		}break;
		case 5:{
			e.informarTipoDeEmpleado();
		}break;
					}
		}
		while (opc !=0);
		}
}

