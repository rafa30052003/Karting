package views;

import model.dataObject.Cliente;
import utils.util;

public class View {

	//MENU PRINCIPAL
	
	public static void menuPrincipal() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|---MENU CLIENTES KARTING---|");
		System.out.println("|                           |");
		System.out.println("| [0]-> Salir               |");
		System.out.println("| [1]-> Insertar cliente    |");
		System.out.println("| [2]-> Mostrar cliente     |");
		System.out.println("| [3]-> Actualizar cliente  |");
		System.out.println("| [4]-> Eliminar cliente    |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
	}
	
	//SUBMENUS
	
	
	
	//MOSTRAR CLIENTE
	 
	public static void showCliente(Cliente c) {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      MOSTRAR CLIENTE      |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		System.out.println(c);
	}
	
	//ELIMINAR CLIENTE
	
	public static void submenuEliminar() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      ELIMINAR CLIENTE     |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		System.out.println("Has eliminado correctamente el cliente seleccionado.");
	}
	

	
	//LEE LOS DATOS DEL CLIENTE
	public static Cliente readCliente() {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|     INTRODUCIR CLIENTE    |");
		System.out.println("|___________________________|");
		System.out.println("                             ");

		
		String dni = util.devuelveDNI("Introduce dni: ");
		String nombre = util.leeString("Introduce el nombre completo: ");
		int  edad = util.validaEdad("Introduce la edad: ");
		String tlf = util.validaTLF("Introduce un numero de telefono: ");
		 return new Cliente(dni,nombre,edad,tlf);
		
	}
	
	
	// MODIFICA EL CLIENTE
	public static void editCliente(Cliente c) {
		System.out.println("                             ");
		System.out.println(" ___________________________ ");
		System.out.println("|                           |");
		System.out.println("|      EDITAR CLIENTE       |");
		System.out.println("|___________________________|");
		System.out.println("                             ");
		String nombre = util.leeString("Introduce el nombre completo:");
		int  edad = util.validaEdad("Introduce la edad:");
		String tlf = util.validaTLF("Introduce un numero de telefono:");
		c.setNombre(nombre);
		c.setEdad(edad);
		c.setTelefono(tlf);
		
	}
}
