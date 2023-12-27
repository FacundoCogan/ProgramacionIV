import java.util.Scanner;

public class Ejecutora {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Empresa emp=new Empresa();
		int op,unDni,unCod,codAlq;
		do
		{
			System.out.println("1- Registrar un nuevo cliente");
			System.out.println("2- Agregar herramienta");
			System.out.println("3- Alquilar");
			System.out.println("4- Devoluci�n");
			System.out.println("5- Herramientas por cliente");
			System.out.println("6- Herramienta alquilada");
			System.out.println("0- salir");
			op=s.nextInt();
			switch(op)
			{
				case 1:
					//1- Registrar un nuevo cliente
					System.out.println("Registrar cliente");
					System.out.println("DNI");
					unDni=s.nextInt();
					System.out.println("Direcci�n");
					String unaDirec=s.next();
					emp.registrarCliente(unDni,unaDirec);
					break;
				case 2:
					//2- Agregar una herramienta (puede ser una herramienta nueva o una existente, en cuyo caso se incrementa el stock)
					System.out.println("C�digo de la herramienta");
					unCod=s.nextInt();
					System.out.println("Descripci�n");
					String unaDesc=s.next();
					System.out.println("Cantidad");
					int unaCant=s.nextInt();
					emp.agregarHerramienta(unCod,unaDesc,unaCant);
					break;
				case 3:
					//3- Alquilar una herramienta. Un cliente no puede tener m�s de 5 herramientas alquiladas en el mismo momento 
					System.out.println("Alquilar");
					System.out.println("DNI del cliente");
					unDni=s.nextInt();
					System.out.println("C�digo de la herramienta a alquilar");
					unCod=s.nextInt();
					System.out.println("Fecha del alquiler"); 
					String fechaAlq=s.next(); 
					//Fecha fechaAlq=Fecha.hoy();
					//Fecha fechaAlq=Fecha.nuevaFecha();
					System.out.println("C�digo del alquiler");
					codAlq=s.nextInt();
					emp.alquilar(unDni,unCod,fechaAlq,codAlq);
					break;
				case 4:
					//4- Devolver una herramienta dado el c�digo del alquiler
					System.out.println("Devoluci�n");
					System.out.println("C�digo del alquiler");
					codAlq=s.nextInt();
					emp.devolver(codAlq);
					break;
				case 5:
					//5- Informar cuantas herramientas tiene en su poder un cliente dado y cuales.
					System.out.println("Cantidad de herramientas alquiladas por un cliente");
					System.out.println("DNI del cliente");
					unDni=s.nextInt();
					emp.informarHerramCliente(unDni);
				case 6:
					//6- Para una herramienta dada informar qui�n la tiene, desde cuando y direcci�n para reclamo.
					System.out.println("Alquileres de una herramienta");
					System.out.println("C�digo de la herramienta");
					unCod=s.nextInt();
					emp.infHerramAlq(unCod);
					break;
				
	
			}
		}while(op!=0);
		s.close();
	}
}
