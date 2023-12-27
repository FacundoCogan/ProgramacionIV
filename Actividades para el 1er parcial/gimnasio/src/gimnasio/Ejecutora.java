package gimnasio;

import java.util.Scanner;

public class Ejecutora {
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		Gimnasio gym = new Gimnasio();
		
		int  opcion;
		
		do {
			System.out.print("\n[1] Agregar socio");
			System.out.print("\n[2] Registrar deuda");
			System.out.print("\n[3] Reducir deuda");
			System.out.print("\n[4] Cantidad Socios");
			System.out.print("\n[5] Total recaudado");
			System.out.print("\n[6] Nombres de socios con deuda");
			System.out.print("\n[7] Lista de socios con deuda");
			System.out.print("\n[8] Conocer deuda socio");
			System.out.print("\n[9] Registrar lista de socios");
			System.out.print("\n[0] Salir");
			
			System.out.print("\nIngrese una opcion: ");
			opcion = in.nextInt();
			
			System.out.print("\n-------------------------");
			switch(opcion) {
				case 1:
					gym.agregarSocio();
					break;
				case 2:
					gym.registrarDeuda();
					break;
				case 3:
					gym.registrarAbono();
					break;
				case 4:
					gym.informarCantidadSocios();
					break;
				case 5:
					gym.informarTotalRecaudado();
					break;
				case 6:
					gym.informarNombreDeudores();
					break;
				case 7:
					gym.informarDeudores();
					break;
				case 8:
					gym.informarDeudaSocio();
					break;
				case 9:
					gym.generarSubLista();
					break;
			}
			System.out.print("\n-------------------------");
		} while (opcion != 0);
	}
}
