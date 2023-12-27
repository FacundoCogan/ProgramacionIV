import java.util.Scanner;

public class Ejecutora {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		Scanner in = new Scanner(System.in);
		
		int op;
        do {
                System.out.print("\n1- Agregar un Empleado.");
                System.out.print("\n2- Eliminar un empleado");
                System.out.print("\n3- Listar sueldo empleado");
                System.out.print("\n4- Informar total a pagar de Horas Extras.");
                System.out.print("\n5- Informar total a pagar de Sueldo.");
                System.out.print("\n6- Cargar Horas Extras");
                System.out.print("\n0- salir\n");
                op=in.nextInt();
                System.out.print("\n-----------------");
                switch(op)
                {
                        case 1:
                        		empresa.agregarEmpleado();
                                break;
                        case 2:
                        		empresa.eliminarEmpleado();
                                break;
                        case 3:
                        		empresa.listarSueldoEmpleados();
                                break;
                        case 4:
                        		empresa.informarTotalPagarHorasExtras();
                                break;
                        case 5:
                        		empresa.informarTotalPagarSueldoFinal();
                                break;
                        case 6:
                        		empresa.agregarHorasExtras();
                                break;
                }
                System.out.print("\n-----------------");
        } while(op != 0);
	}
}
