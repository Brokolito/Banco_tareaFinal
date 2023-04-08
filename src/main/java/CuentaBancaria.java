import java.util.Date;

public abstract class CuentaBancaria {
	private int numero;
	private Date fechaApertura;
	private int saldo;

	public CuentaBancaria(int numero, Date fechaApertura, int saldo) {
		this.numero=numero;
		this.fechaApertura=fechaApertura;
		this.saldo=saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public Date getFechaApertura() {
		return this.fechaApertura;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public abstract String getType();
}