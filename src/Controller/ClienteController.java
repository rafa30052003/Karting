package Controller;
import views.View;
import utils.util;
import model.DAO.*;
import model.dataObject.Cliente;
public class ClienteController {
	
	
	
	public static void switchPrincipal(Circuito c) {
		boolean value=false;
		do {	
			View.menuPrincipal();
			int op=util.leeEntero("Introduce la opcion deseada");
			switch (op) {
			case 1:
					switchCreateCliente(c);
				break;
			case 2:
				
				break;
			case 3:
			
				break;
			case 4:
			
				break;
			case 0:
				value=true;
				break;
	
			default:
				break;
			}
		} while (!value);
		
	}
	
	
	public static void switchCreateCliente(Circuito c) {
		c.createCliente(readCliente());
	}
	
	
	public static Cliente readCliente() {
		String dni = util.devuelveDNI(util.leeString("introduce dni"));
		String nombre = util.leeString("introduce el nombre");
		int  edad = util.validaEdad("introduce la edad");
		String tlf = util.leeString("introduce un tlf");
		 return new Cliente(dni,nombre,edad,tlf);
		
	}
	
	
}
