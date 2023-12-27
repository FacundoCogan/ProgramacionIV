import java.util.Scanner;

public final class Vendedor extends Empleado {
	private int cantidadDeVentas;
		
public Vendedor(String nom, String cate, int docu, int suel, int leg, int ventas)
{
	super( nom, cate, docu, suel, leg);
	cantidadDeVentas=ventas;
}

public int darSueldo()
{
	int tot = 0;
	tot =  (super.darSueldo() + this.importeVentas());
	return tot;
}
	
private int importeVentas(){
	return cantidadDeVentas * 200;
}

public int darVentas(){
	return cantidadDeVentas;
}


}