import java.util.Scanner;

public class Ejecutora {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Compañia comp = new Compañia();
		int op;
		
		do{
			System.out.println("1- Agregar viaje");
			System.out.println("2- Agregar promocion");
			System.out.println("3- Agregar turista");
			System.out.println("4- Asignar turista a viaje");
			System.out.println("5- ");
			
			System.out.println("0- ");
			op=s.nextInt();
			switch(op){
				case 1:
					comp.agregarViaje();
					break;
				case 2:
					comp.agregarPromocion();
					break;
				case 3:
					comp.agregarTurista();
					break;
				case 4:
					
					break;
				case 5:
					
					break;
			}
		}while(op!=0);
		
		s.close();
	}

}
