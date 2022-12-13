package model.DAO;

import model.dataObject.Cliente;
import utils.util;

public class Circuito {
	private String nombreCir;
	private Cliente[] clientes;
	
	public Circuito(String nombreCir){
		this.nombreCir=nombreCir;
		clientes = new Cliente[10];
	}
	/**
	 * Funci�n que muestra el n�mero total de clientes en el array
	 * 
	 * @return-->Devuelve el n�mero de cleintes
	 */

	public int nClientes() {
		int n = 0;
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				n++;
			}
		}
		return n;
	}

	/**
	 * Funci�n que se encarga de buscar un cliente por el DNI
	 * @param dni--> DNI del cliente
	 * @return--> Devuelve el cliente encontrado
	 */
	public Cliente showClienteDni(String dni) {
		Cliente c=null;
		if(clientes!=null && nClientes() > 0){
			for (int i = 0; i < clientes.length && c==null ; i++) {
				if(clientes[i].getDni().equals(dni)) {
					c=clientes[i];
				}else {
					util.mensaje("El DNI ya est� registrado");
				}
			}
		}
		return c;
	}
	/**
	 * Funci�n que crea un cliente
	 * @param c--> Cliente
	 * @return--> Devuelve la creaci�n del cliente
	 */
	public boolean createCliente(Cliente c) {
		boolean valid=false;
		if(c!=null && nClientes()<10 && showClienteDni(c.getDni())==null) {
			for (int i = 0; i < clientes.length && !valid; i++) {
				if(clientes[i]==null) {
					clientes[i]=c;
					valid=true;
				}
			}
		}
		return valid;
	}
	/**
	 * Funci�n que elimina un estudiante
	 * @param c--> Cliente
	 * @return--> Devuelve que el cliente se ha eliminado(no seguro)
	 */
	public boolean deleteCliente(Cliente c) {
		boolean valid=false;
		if(c!=null && showClienteDni(c.getDni())!=null) {
			for(int i=0;i<clientes.length && !valid;i++) {
				if(clientes[i].equals(c)) {
					clientes[i]=null;
					valid=true;
				}
			}
		}
		return valid;
	}
}
