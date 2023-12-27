
import java.util.Calendar;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	
	public Fecha hoy(){
		Fecha f = new Fecha();
		Calendar c=Calendar.getInstance();
		f.setDia(c.get(Calendar.DAY_OF_MONTH));
		f.setMes(c.get(Calendar.MONTH)+1);
		f.setAno(c.get(Calendar.YEAR));
		return f;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
