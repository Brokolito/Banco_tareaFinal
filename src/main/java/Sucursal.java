import java.util.ArrayList;

public class Sucursal {
	private String codigoSucursal;
	private int codigoPostal;
	private ArrayList<CuentaBancaria> cuentasBancarias;
	private ArrayList<Cliente> clientes;

	public Sucursal(String codigoSucursal, int codigoPostal) {
		this.codigoSucursal=codigoSucursal;
		this.codigoPostal=codigoPostal;
		this.cuentasBancarias=new ArrayList<>();
		this.clientes=new ArrayList<>();
	}

	public String getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
}