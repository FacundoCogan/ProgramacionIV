import java.util.ArrayList;
import java.util.Scanner;

public class Compañia {
	private ArrayList<Viaje> viajes;
	private ArrayList<Turista> turistas;
	private ArrayList<Promocion> promociones;
	
	public Compañia() {
		viajes = new ArrayList<Viaje>();
		turistas = new ArrayList<Turista>();
		promociones = new ArrayList<Promocion>();
	}
	
	public void agregarViaje() {
		Scanner s=new Scanner(System.in);
		Viaje v;
		System.out.println("Ingrese destino del viaje: ");
		String destino = s.next();
		System.out.println("Ingrese cupo: ");
		int cupo = s.nextInt();
		System.out.println("Ingrese el coste de transporte por persona: ");
		int coste = s.nextInt();
		System.out.println("1| Viaje por un Dia // 2|Viaje por varios Dias ");
		int op  = s.nextInt();
		if (op == 1) 
			v = new ViajeUnDia(destino, cupo, coste);
		else {
			System.out.println("Ingrese cantidad de dias: ");
			int cant = s.nextInt();
			System.out.println("Ingrese alojamiento: ");
			String aloja = s.next();
			v = new ViajeVariosDias(destino, cupo, coste, cant, aloja);
		}
		viajes.add(v);
		System.out.println("El viaje fue generado con el codigo: "+v.getCodigo());
		s.close();
	}
	
	public void agregarPromocion() {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese codigo de viaje: ");
		int cod = s.nextInt();
		Viaje viaje = this.buscarViaje(cod);
		if (viaje != null) {
			System.out.println("Ingrese % de descuento: ");
			float porcen = s.nextFloat();
			Promocion promo = new Promocion(viaje, porcen);
			promociones.add(promo);
		}
		s.close();
	}
	
	public void agregarTurista() {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		String nombre = s.next();
		System.out.println("Ingrese dni: ");
		int dni = s.nextInt();
		System.out.println("Ingrese direccion: ");
		String direcc = s.next();
		System.out.println("Ingrese telefono: ");
		int telefono = s.nextInt();
		Turista turist = new Turista(nombre, dni, direcc, telefono);
		turistas.add(turist);
		s.close();
	}
	
	public void agergarTuristaViaje() {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese codigo del viaje: ");
		int cod = s.nextInt();
		Viaje viaje = this.buscarViaje(cod);
		if(viaje != null) {
			if (viaje.hayCupo()) {
				System.out.println("Ingrese dni del turista: ");
				int dni = s.nextInt();
				Turista turist = this.buscarTurista(dni);
				if (turist!=null) {
					if(viaje.existeTurista(turist))
						System.out.println("Este turista ya se encuentra registrado en el viaje.");
					else {
						viaje.agregarTurista(turist);
						System.out.println("El turista fue agregado al viaje con exito");
					}
				}
			}
		}
		s.close();
	}
	
	private Viaje buscarViaje(int c) {
		int i=0;
		while(i<viajes.size() && !viajes.get(i).sos(c))
			i++;
		if(i==viajes.size())
			return null;
		else
			return viajes.get(i);
	}
	
	private Turista buscarTurista(int c) {
		int i=0;
		while(i<turistas.size() && !turistas.get(i).sos(c))
			i++;
		if(i==turistas.size())
			return null;
		else
			return turistas.get(i);
	}
}
