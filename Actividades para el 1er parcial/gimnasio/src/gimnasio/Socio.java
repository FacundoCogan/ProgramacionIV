package gimnasio;

public class Socio {
	private int dni;
	private String nombre;
	private String direccion;
	private float totalAbonado;
	private float totalAdeudado;
	
	public Socio(int dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.totalAbonado = 0;
		this.totalAdeudado = 0;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void aumentarDeuda(float deuda) {
		this.totalAdeudado += deuda;
	}
	
	public void reducirDeuda(float abono) {
		this.totalAbonado += abono;
	}
	
	public float getTotalAbonado() {
		return this.totalAbonado;
	}
	
	public boolean poseeDeuda() {
		return this.totalAdeudado > this.totalAbonado;
	}
	
	public void mostrarNombre() {
		System.out.print("\nNombre: " + this.nombre);
	}
	
	public void mostrarInfo() {
		System.out.print("\nDni: " + this.dni);
		System.out.print("\nNombre: " + this.nombre);
		System.out.print("\nDireccion: " + this.direccion);
		System.out.print("\nTotal abonado: " + this.totalAbonado);
		System.out.print("\nTotal adeudado: " + this.totalAdeudado);
	}
	
	public float getDeuda() {
		return this.totalAdeudado - this.totalAbonado;
	}
	
	public void informarDeuda() {
		if (this.poseeDeuda()) {
			System.out.print("\nDni: " + dni);
			System.out.print("\nPosee deuda estimada en: " + this.getDeuda());
		} else {
			System.out.print("\nDni: " + dni);
			System.out.print("\nNo posee deuda: ");
		}
	}
}
