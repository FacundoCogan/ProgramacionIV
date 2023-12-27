import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	private ArrayList<Cuenta> cuentas;
	
	public Banco()
	{
		cuentas=new ArrayList<Cuenta>();
	}
	
	public void abrirCta()
	{
		Scanner s=new Scanner(System.in);
		Cuenta cta;
		System.out.println("1 para abrir una caja de ahorro");
		System.out.println("2 para abrir una cuenta corriente");
		int op=s.nextInt();
		System.out.println("Nro de cuenta");
		int nroCta=s.nextInt();
		if(op==1)
		{
			/*
			CajaAhorro ca=new CajaAhorro(nroCta);
			cuentas.add(ca);
			*/
			cta=new CajaAhorro(nroCta);
		}
		else
		{
			System.out.println("Saldo descubierto");
			double sd=s.nextDouble();
			/*
			CuentaCorriente cc=new CuentaCorriente(nroCta,sd);
			cuentas.add(cc);
			*/
			cta=new CuentaCorriente(nroCta, sd);
		}
		cuentas.add(cta);
	}
	
	public void depositar(int nc,double imp)
	{
		Cuenta cta=this.buscar(nc);
		if(cta!=null)
		{
			cta.depositar(imp);
		}
	}
	
	public Cuenta buscar(int n)
	{
		int i=0;
		while(i<cuentas.size() && !cuentas.get(i).sos(n))
			i++;
		
		if(i==cuentas.size())
			return null;
		else
			return cuentas.get(i);
	}
}
