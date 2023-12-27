
public class Turista {
	private String nombre;
	private int dni;
	private String direccion;
	private int telefono;
	
	public Turista(String nombre, int dni, String direccion, int telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public boolean sos (int c) {
		return c == dni;
	}
}
