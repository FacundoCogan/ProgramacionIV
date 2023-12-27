
public class Empleado {
	private String nombre;
	private int dni;
	private String categoria;
	private float sueldo;
	private int horasExtras;
	private boolean eliminado;
	
	public Empleado(String nombre, int dni, String categoria, float sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.categoria = categoria;
		this.sueldo = sueldo;
		this.horasExtras = 0;
		this.eliminado = false;
	}
	
	public boolean hasDni(int dni) {
		return this.dni == dni;
	}
	
	public boolean estasActivo(int dni) {
		return this.hasDni(dni) && !this.eliminado;
	}

	public void agregarHorasExtras(int horasExtras) {
		this.horasExtras += horasExtras;
	}
	
	public void mostrarSueldo() {
		System.out.print("\nSueldo empleado " + this.getDni() + ": " + this.getSueldo());
	}
	
	public float calcularSueldoHorasExtras() {
		return horasExtras * 600;
	}
	
	 private int getDni() {
        return this.dni;
     }
	 
	 private float getSueldo() {
        return sueldo;
     }
	 
	 public float calcularSueldoFinal() {
		 return this.getSueldo() + this.calcularSueldoHorasExtras();
	 }
	 
	 public boolean estasEliminado() {
		 return this.eliminado;
	 }
	 
	 public void reactivar() {
		 this.eliminado = false;
	 }
	 
	 public void desactivar() {
		 this.eliminado = true;
	 }
}
