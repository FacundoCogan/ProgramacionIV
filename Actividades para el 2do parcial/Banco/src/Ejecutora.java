import java.util.Scanner;

public class Ejecutora {

	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			Banco banco=new Banco();
			int op,ncta;
			double monto;
			do
			{
				System.out.println("1- Abrir una cuenta nueva");
				System.out.println("2- Depositar un monto en una cuenta.");
				System.out.println("3- Extraer un monto de una cuenta.");
				
				System.out.println("0- salir");
				op=s.nextInt();
				switch(op)
				{
					case 1:
						banco.abrirCta();
						break;
					case 2:
						System.out.println("Nro de cuenta en la que va a depositar");
						ncta=s.nextInt();
						System.out.println("Monto a depositar");
						monto=s.nextDouble();
						banco.depositar(ncta,monto);
						break;
					case 3:
						System.out.println("Nro de cuenta en la que va a extraer");
						ncta=s.nextInt();
						System.out.println("Monto a extraer");
						monto=s.nextDouble();
						//banco.extraer(ncta,monto);
						break;
				}
			}while(op!=0);
			
			s.close();
	}

}
