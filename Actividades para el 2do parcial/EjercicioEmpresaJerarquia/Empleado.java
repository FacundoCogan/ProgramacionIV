public abstract class Empleado {
	private int dni;
	private String nombre;
	private int legajo;
	private String categoria;
	private int sueldo;
		
	public Empleado(String nom, String cate, int docu, int suel, int leg)
	{
		nombre = nom;
		categoria = cate;
		dni = docu;
		sueldo = suel;
		legajo = leg;
	}

	public boolean sos(int docu)
	{
		return dni == docu;
	}
	
	public String darNombre()
	{
		return nombre;
	}
	
	public int darSueldo()
	{
		return sueldo;
	}

	public int darHorasExtras() {
		return 0;
	}
	
	public String darTipo() {
		return this.getClass().getName();
}
	
	public void mostrate() {
		{System.out.print (" - " + dni + " " + nombre + " " + legajo + " " + categoria + " " + this.darTipo());
	}
}
}
