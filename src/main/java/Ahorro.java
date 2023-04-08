import java.util.Date;

public class Ahorro extends CuentaBancaria {
	private double reajuste;

	public Ahorro(int numero, Date fechaApertura, int saldo, double reajuste) {
		super(numero, fechaApertura, saldo);
		this.reajuste=reajuste;
	}

	public double getReajuste() {
		return this.reajuste;
	}

	public void setReajuste(double reajuste) {
		this.reajuste = reajuste;
	}

	public String getType() {
		return "Ahorro";
	}
}