import java.util.Scanner;

public class Ejecutora {
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		Empresa empresa = new Empresa();
		
		int  opcion;
		
		do {
			System.out.print("\n[1] Agregar empleado");
			System.out.print("\n[2] Agregar venta");
			System.out.print("\n[3] Asignar sector a empleado");
			System.out.print("\n[4] Agregar sector");
			System.out.print("\n[5] Cambiar sector a empleado");
			System.out.print("\n[0] Salir");
			
			System.out.print("\nIngrese una opcion: ");
			opcion = in.nextInt();
			
			System.out.print("\n-------------------------");
			switch(opcion) {
				case 1:
					empresa.agregarEmpleado();
					break;
				case 2:
					empresa.agregarVenta();
					break;
				case 3:
					empresa.asignarSectorEmpleado();
					break;
				case 4:
					empresa.agregarSector();
					break;
				case 5:
					empresa.cambiarEmpleadoSector();
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
			}
			System.out.print("\n-------------------------");
		} while (opcion != 0);
	}
}
