
public abstract class Cuenta {
	private int nro;
	private double saldo; 
	
	public Cuenta(int nc)
	{
		nro=nc;
		saldo=0;
	}
	
	public boolean sos(int c)
	{
		return nro==c; 
	}
	
	public void depositar(double m)
	{
		saldo+=m;
	}
}
