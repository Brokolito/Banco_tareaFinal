import java.util.ArrayList;

public class GestorBanco {
	private ArrayList<Sucursal> sucursales;

	public GestorBanco() {
		this.sucursales=new ArrayList<>();
	}

	public boolean addCliente(Sucursal sucursal, Cliente cliente) {
		if(cliente!=null){
			for(Cliente cliente1:sucursal.getClientes()){
				if(cliente1.getRut().equals(cliente.getRut())){
					System.out.println("Persona ya inscrita en la sucursal como cliente");
					return false;
				}
			}
			sucursal.getClientes().add(cliente);
			return true;
		}
		System.out.println("El cliente que ha ingresado no es valido");
		return false;
	}

	public boolean addCuentaACliente(Sucursal sucursal,CuentaBancaria cuenta, Cliente cliente) {
		if(cuenta!=null && cliente!=null){
			for(CuentaBancaria cuentaBancaria:cliente.getCuentasBancarias()){
				if(cuentaBancaria.getType().equals(cuenta.getType())){
					System.out.println("El usuario ya tiene este tipo de cuenta");
					return false;
				}
			}
			cliente.getCuentasBancarias().add(cuenta);
			sucursal.getCuentasBancarias().add(cuenta);
			return true;
		}
		return false;
	}

	public boolean addSucursal(Sucursal sucursal) {
		if(sucursal!=null){
			sucursales.add(sucursal);
			return true;
		}
		return false;
	}

	public boolean verCuentasCliente(Cliente cliente) {
		if(cliente!=null){
			System.out.println("------------------------------------------------------------");
			System.out.println("Cliente : "+cliente.getNombre()+""+cliente.getApellido());
			if(cliente.getCuentasBancarias().size()!=0){
				for (CuentaBancaria cuentaBancaria:cliente.getCuentasBancarias()){
					System.out.println("Tipo : "+cuentaBancaria.getType());
				}
			}else{
				System.out.println("El usuario no tiene cuentas asociadas");
			}
			System.out.println("------------------------------------------------------------");
		}
		System.out.println("El cliente no es valido");
		return false;
	}

	public boolean verCuentasSucursaAhorrol(Sucursal sucursal) {
		ArrayList<Ahorro> cuentasAhorro=new ArrayList<>();
		if(sucursal!=null){
			System.out.println("------------------------------------------------------------");
			System.out.println("Cuentas sucursal: "+sucursal.getCodigoSucursal());
			if(sucursal.getCuentasBancarias().size()!=0){
				for(CuentaBancaria cuentaBancaria:sucursal.getCuentasBancarias()){
					if(cuentaBancaria.getType().equals("Ahorro")){
						cuentasAhorro.add((Ahorro) cuentaBancaria);
						System.out.println("Numero de cuenta: "+cuentaBancaria.getNumero());
					}
				}
			}else{
				System.out.println("La sucursal no tiene cuentas asociadas");
				return false;
			}
			if(cuentasAhorro.size()==0){
				System.out.println("No hay cuentas de Ahorro ");
				return false;
			}
			System.out.println("------------------------------------------------------------");
			return true;
		}
		System.out.println("Sucursal no valida");
		return false;
	}

	public boolean verCuentasSucursalCorriente(Sucursal sucursal) {
		ArrayList<Corriente>cuentasCorrientes=new ArrayList<>();
		if(sucursal!=null){
			System.out.println("------------------------------------------------------------");
			System.out.println("Sucursal : "+sucursal.getCodigoSucursal());
			if(sucursal.getCuentasBancarias().size()!=0){
				for(CuentaBancaria cuentaBancaria:sucursal.getCuentasBancarias()){
					if(cuentaBancaria.getType().equals("Corriente")){
						cuentasCorrientes.add((Corriente) cuentaBancaria);
						System.out.println("Cuenta : "+cuentaBancaria.getNumero());
					}
				}
			}else{
				System.out.println("Esta sucursal no tiene cuentas asociadas");
				return false;
			}
			if(cuentasCorrientes.size()==0){
				System.out.println("La sucursal no tiene cuentas Corriente");
				return false;
			}
			System.out.println("------------------------------------------------------------");
			return true;
		}
		return false;
	}
}