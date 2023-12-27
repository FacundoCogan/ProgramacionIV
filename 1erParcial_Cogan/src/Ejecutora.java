import java.util.Scanner;

public class Ejecutora {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Empresa emp = new Empresa();
		Fecha f;
		
		int  opcion, codPed, codProd, mat, dni, nroPed, tiempo, codRep;
		
		do {
			System.out.print("\n[1] Agregar pedido de reparacion"); // hecho
			System.out.print("\n[2] Agregar repuestos utilizados"); // hecho
			System.out.print("\n[3] Agregar tecnico");
			System.out.print("\n[4] Agregar repuesto");
			System.out.print("\n[5] Agregar producto");
			System.out.print("\n[6] Informar cuanto debe abonar el cliente");
			System.out.print("\n[7] Incrementar costo de repuesto");
			System.out.print("\n[8] Informar cliente con mayor cantidad de pedidos de reparacion");
			System.out.print("\n[9] Informar producto con menor cantidad de pedidos de reparacion");
			
			System.out.print("\nIngrese una opcion: ");
			opcion = s.nextInt();
			
			System.out.print("\n-------------------------");
			switch(opcion) {
				case 1:
					System.out.println("Codigo de pedido: ");
					codPed=s.nextInt();
					System.out.println("Codigo de producto: ");
					codProd=s.nextInt();
					System.out.println("Matricula del tecnico: ");
					mat=s.nextInt();
					System.out.println("DNI del cliente: ");
					dni=s.nextInt();
					f.hoy();
					System.out.println("Fecha de hoy registrada automaticamente.");
					System.out.println("Numero de pedido: ");
					nroPed=s.nextInt();
					System.out.println("Falla: ");
					String falla=s.next();
					System.out.println("Tiempo estimado: ");
					tiempo=s.nextInt();
					emp.agregarPedido(codPed, codProd, mat, dni, f, nroPed, falla, tiempo);
					break;
				case 2:
					System.out.println("Numero de pedido: ");
					nroPed=s.nextInt();
					System.out.println("Codigo de repuesto: ");
					codRep=s.nextInt();
					System.out.println("Cantidad de repuestos utilizados: ");
					int repUtil=s.nextInt();
					emp.agregarRepUtilizados(nroPed, codRep, repUtil);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
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
