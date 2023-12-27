import java.util.Scanner;
public class Ejecutora {	
	public static void main(String[] args) 
	{
		Aeropuerto a = new Aeropuerto();
		Scanner s = new Scanner(System.in);
		int opc;
		do{
			System.out.println("----SELECCION DE ACCION----");
			System.out.println("1- Agregar vuelo.");
			System.out.println("2- Agregar destino.");
			System.out.println("3- Informar vacantes.");
			System.out.println("4- Informar importe recaudado.");
			System.out.println("5- Comprar Voletos.");
			System.out.println("6- .");
			System.out.println("7- .");
			System.out.println("8- .");
			System.out.println("9- .");
			System.out.println("10- .");
			System.out.println("11- .");
			System.out.println("12- .");
			
			opc = s.nextInt();
			switch(opc)
			{
			case 1:
			{
				a.agregarVuelo();
			}
				break;
			case 2:
			{
				a.agregarDest();
			}
				break;
			case 3:
			{		
				a.informarVac();
			}
				break;
			case 4:
			{	
				a.informarImporteRec();
			}
			break;
			case 5:
			{	
				a.comprarVoletos();
			}
			break;
			case 6:
			{	
				
			}
			break;
			case 7:
			{	
				
			}
			break;
			case 8:
			{	
				
			}
			break;
			case 9:
			{
				
			}
			break;
			case 10:
			{
				
			}
			break;
			case 11:
			{
				
			}
			break;
			case 12:
			{
				
			}
				break;
			}
			System.out.println(" ");
		}
		while(opc != 0);
		s.close();
	}
}