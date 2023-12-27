import java.util.Scanner;

public class Limpieza extends Empleado {
private int horasExtras;
	
	public Limpieza(String nom, String cate, int docu, int suel, int leg, int hor)
	{
		super( nom, cate, docu, suel, leg);
		horasExtras = hor;
	}
	
	public int darSueldo()
	{
		int tot = 0;
		tot =  (super.darSueldo() + this.darHorasExtras());
		return tot;
	}
	
	public int darHorasExtras() {
		return horasExtras * 100;
	}


}
