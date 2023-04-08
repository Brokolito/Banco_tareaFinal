import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String rut;
	private String estadoCivil;
	private int edad;
	private int ingreso;
	private Sucursal sucursal;
	private ArrayList<CuentaBancaria> cuentasBancarias;

	public Cliente(String nombre, String apellido, String rut, String estadoCivil) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
		this.estadoCivil=estadoCivil;
		this.cuentasBancarias=new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}
}