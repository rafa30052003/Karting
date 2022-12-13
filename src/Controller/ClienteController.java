package Controller;
import views.View;
import utils.util;
import model.DAO.*;
import model.dataObject.Cliente;
public class ClienteController {
	
	
	// MENU PRINCIPAL.
	public static void switchPrincipal(Circuito c) {
		boolean value=false;
		do {	
			View.menuPrincipal();
			int op=util.leeEntero("Introduce la opcion deseada: ");
			switch (op) {
			case 1:
				switchCreateCliente(c);
				break;
			case 2:
				switchShowCliente(c);
				break;
			case 3:
				switchUpdateCliente(c);
				break;
			case 4:
				switchDeleteCliente(c);
				break;
			case 0:
				value=true;
				break;
	
			default:
				break;
			}
		} while (!value);
		
	}
	
	
	//CONTROLADOR PARA CREAR CLIENTES.
	public static void switchCreateCliente(Circuito c) {
		c.createCliente(View.readCliente());
	}
	
	//CONTROLADOR PARA VER CLIENTES.
	public static void switchShowCliente(Circuito c) {
		View.showCliente(c.showClienteDni(util.devuelveDNI("Introduce dni: ")));
		
	}
	
	//CONTROLADOR PARA MODIFICAR CLIENTES.
	public static void switchUpdateCliente(Circuito c) {
		Cliente cli = null;
		cli=c.showClienteDni(util.devuelveDNI("Introduce dni: "));
		View.editCliente(cli);
	}
	
	//CONTROLADOR PARA ELIMINAR CLIENTES.
	public static void switchDeleteCliente(Circuito c) {
		c.deleteCliente(c.showClienteDni(util.devuelveDNI("Introduce dni: ")));
		View.submenuEliminar();
	}
	
	
	
	
	

}
