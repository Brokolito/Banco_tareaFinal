import java.util.Date;

public class Corriente extends CuentaBancaria {
	private int sobregiro;

	public Corriente(int numero, Date fechaApertura, int saldo, int sobregiro) {
		super(numero,fechaApertura,saldo);
		this.sobregiro=sobregiro;
	}

	public int getSobregiro() {
		return this.sobregiro;
	}

	public void setSobregiro(int sobregiro) {
		this.sobregiro = sobregiro;
	}

	public String getType() {
		return "Corriente";
	}
}