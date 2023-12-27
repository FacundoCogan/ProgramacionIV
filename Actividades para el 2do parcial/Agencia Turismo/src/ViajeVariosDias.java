import java.util.Scanner;

public class ViajeVariosDias extends Viaje {
	private int cantDias;
	private static float costoDiaXPersona;
	private String alojamiento;

	public ViajeVariosDias(String dest, int c, float cost, int cantD, String aloj){
		super(dest, c, cost);
		cantDias = cantD;
		alojamiento = aloj;
	}
	
	public static float getCostoXPersona(){
		if (costoDiaXPersona == 0) {
			Scanner s=new Scanner(System.in);
			System.out.println("Ingrese costo dia por persona: ");
			costoDiaXPersona = s.nextFloat();
			s.close();
		}
		return costoDiaXPersona;
	}
}
