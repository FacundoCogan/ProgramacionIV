import java.util.Scanner;

public class Ejecutora{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Olimpiada oli = new Olimpiada();
		byte opc;
		do {
			System.out.println("\n\t -- MENU --");
			System.out.println("-----------------------------");  
			System.out.println("1- Agregar una Prueba");
			System.out.println("2- Agregar Competidor");
			System.out.println("3- Agregar Pais");
			System.out.println("4- Inscribir Competidor");
			System.out.println("5- Agregar Puntaje");
			System.out.println("5- Cantidad de medallas de oro en Pais");
			System.out.println("\n Ingese el numero de la opcion:");
			opc = in.nextByte();
			
			switch(opc) {
				case 1:
					oli.agregarPrueba();
					break;
				
				case 2:
					oli.agregarCompetidor();
					break;
				
				case 3:
					oli.agregarPais();
					break;
				
				case 4:
					oli.inscribirCompetidor();
					break;
				
				case 5:
					oli.agregarPuntaje();
					break;
				/*
				case 6:
					oli.cantMedallasOroPais();
					break;
				*/
			}
					
		}while(opc != 0);
		
	}
}

