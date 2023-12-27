
import java.util.Scanner;

public class EjecutoraPeriodico {
	
	public static void main(String[] args)
	{
		Publicacion.setPrecioCm2Dia(15);
		Aviso.setSuperficieLinea(0.3);
		
		byte opc;
		Periodico p = new Periodico();
		Scanner e = p.obtenerEntrada();
		do
		{
			System.out.println("\n1 -> Agregar publicaci�n: ");
			System.out.println("2 -> Informar costo de una publicaci�n: ");
			System.out.println("3 -> Eliminar publicaciones expiradas: ");
			System.out.println("4 -> Calcular espacio total requerido en cm2 en una fecha: ");
			System.out.println("5 -> Informar Publicaciones Contratadas: ");
			System.out.println("6- asignar precio por cm2 dia");
			System.out.println("0 -> Finalizar aplicaci�n: ");
			System.out.print("Opci�n: ");
			opc = e.nextByte();
			switch(opc)
			{
				case 1:
					p.agregarPublicacion();
					break;
				case 2:
					p.informarCosto();
					break;
				case 3:
					p.eliminarPublicacionesExpiradas();
					break;
				case 4:
					p.calcularEspacioTotalRequerido();
					break;
				case 5:
					p.informarContratados();
					break;
				case 6:
					System.out.println("nuevo valor: ");
					double precio = e.nextDouble();
					Publicacion.setPrecioCm2Dia(precio);
					break;
				default:
					if(opc != 0)
						System.out.println("Opci�n incorrecta.");
					break;			
			}			
			
		}
		while(opc != 0);		
		
	}

}
