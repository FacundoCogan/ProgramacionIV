import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private ArrayList<Empleado>empleados;
	public String nombre;

public Empresa()
{
	empleados = new ArrayList<Empleado>();
	nombre = "La Rosa";
}
	
public void agregarEmpleado()
{
	Scanner in = new Scanner(System.in);
	in.useDelimiter(System.getProperty("line.separator"));
	
	System.out.print("\nIngrese Dni: ");
	int docu = in.nextInt();
	
	Empleado e= this.verificarEmpleado(docu);
	
	if (e != null)
		{
			System.out.println("\n  Ya existe un empleado con ese DNI ");
		}
	else 
		{
			int opc = 0;
			do
				{
				 System.out.print("1-Vendedor | 2-Jerarquico | 3- Limpieza: ");
				 opc = in.nextInt();
				}while(opc < 1 || opc > 3);
						
			System.out.print("Ingrese Nombre:");
			String nom = in.next();
			System.out.print("Ingrese Legajo:");
			int leg = in.nextInt();
			System.out.print("Ingrese Categoria:");
			String cat = in.next();
			System.out.print ("Ingrese Sueldo:");
			int suel = in.nextInt();
			Empleado nuevo;  // El ArrayList esta definido como una clase abstracta
			if(opc == 1)
			{
				System.out.print ("Ingrese Cantidad de Ventas:");
				int ventas = in.nextInt();
				nuevo = new Vendedor(nom, cat, docu, suel, leg, ventas); //siempre se crea una clase concreta
			}
			else if(opc == 2)
				{
					nuevo = new Jerarquico(nom, cat, docu, suel, leg); //siempre se crea una clase concreta
				}
			else
				{
					System.out.print ("Ingrese Horas Extras:");
					int horas = in.nextInt();
					nuevo = new Limpieza(nom, cat, docu, suel, leg, horas); //siempre se crea una clase concreta
				}
				empleados.add(nuevo);
		}
			 //else
 }//agregar
		
		
public void eliminarEmpleado()
{
	Scanner in = new Scanner(System.in);
	in.useDelimiter(System.getProperty("line.separator"));
	System.out.print("\nIngrese Dni: ");
	int docu = in.nextInt();
	Empleado e= this.verificarEmpleado(docu);
	
	if (e != null)
		{System.out.println("\n El Empleado fue eliminado !!!");
		 empleados.remove(e);}
	else {
			System.out.println("\n No existe un Empleado con ese Dni ");
		 }
}
		
public void informarSueldos(){
	for (Empleado e: empleados) 
		{
			e.mostrate();
		    System.out.println(" Sueldo: " + e.darSueldo()); // nunca debo preguntar por la clase //
		}   
	System.out.println("");
}

public void informarTotalHorasExtras() {
	double tot = 0;
	for (Empleado e: empleados)
		{
			tot = tot + e.darHorasExtras();
		}
  	System.out.printf("Total a Pagar Hs Extras ->  %.0f",tot);
  	System.out.println("");
}

public void informarTipoDeEmpleado(){
	for (Empleado e: empleados)
		{
			e.mostrate();
			System.out.println("");
		}
 }
	
public Empleado verificarEmpleado(int docu){
	int i = 0;
	while (i<empleados.size()&& !empleados.get(i).sos(docu))
		i++;
	if(i<empleados.size())
		{
		return empleados.get(i);}
	else
		{return null;}
}
}