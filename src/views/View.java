package views;

import model.dataObject.Cliente;
import utils.util;

public class View {

	//MENU PRINCIPAL
	
	public static void menuPrincipal() {
		System.out.println("MENU CLIENTES KARTING CLUB");
		System.out.println("1. Insertar nuevo cliente.");
		System.out.println("2. Ver cliente.");
		System.out.println("3. Actualizar cliente.");
		System.out.println("4. Eliminar un cliente.");
	}
	
	//SUBMENUS
	
	//SUBMENU INSERTAR NUEVO CLIENTE
	public static void submenuInsertar() {
		System.out.println("INSERTAR NUEVO CLIENTE");
		System.out.println("1. Introducir nombre.");
		System.out.println("2. Introducir dni.");
		System.out.println("3. Introducir edad.");
		System.out.println("4. Introducir número de telefono.");
	}
	
	
	//SUBMENU ACTUALIZAR CLIENTE
	
	public static void submenuEditar() {
		System.out.println("EDITAR CLIENTE");
		System.out.println("1. Modificar nombre.");
		System.out.println("2. Modificar dni.");
		System.out.println("3. Modificar edad.");
		System.out.println("4. Modificar número de telefono.");
	}
	
	//SUBMENU MOSTRAR CLIENTE
	
	public static void showCliente(Cliente c) {
		System.out.println(c);
	}
	
	//SUBMENU ELIMINAR CLIENTE
	
	public static void submenuEliminar() {
		System.out.println("has eliminado el cliente");
	}
	
	
	
	
	
	
	
	
	//LEE LOS DATOS DEL CLIENTE
	public static Cliente readCliente() {
		System.out.println("   ___   _   _                _              \r\n"
				+ "  / __| | | (_)  ___   _ _   | |_   ___   ___\r\n"
				+ " | (__  | | | | / -_) | ' \\  |  _| / -_) (_-<\r\n"
				+ "  \\___| |_| |_| \\___| |_||_|  \\__| \\___| /__/\r\n"
				+ "                                             ");
		String dni = util.devuelveDNI("Introduce dni: ");
		String nombre = util.leeString("Introduce el nombre: ");
		int  edad = util.validaEdad("Introduce la edad: ");
		String tlf = util.validaTLF("Introduce un tlf: ");
		 return new Cliente(dni,nombre,edad,tlf);
		
	}
	
	
	// MODIFICA EL CLIENTE
	public static void editCliente(Cliente c) {
		System.out.println("           _   _   _                         _   _                _         \r\n"
				+ "  ___   __| | (_) | |_   __ _   _ _     __  | | (_)  ___   _ _   | |_   ___ \r\n"
				+ " / -_) / _` | | | |  _| / _` | | '_|   / _| | | | | / -_) | ' \\  |  _| / -_)\r\n"
				+ " \\___| \\__,_| |_|  \\__| \\__,_| |_|     \\__| |_| |_| \\___| |_||_|  \\__| \\___|\r\n"
				+ "                                                                            ");
		String nombre = util.leeString("introduce el nombre");
		int  edad = util.validaEdad("introduce la edad");
		String tlf = util.validaTLF("introduce un tlf");
		c.setNombre(nombre);
		c.setEdad(edad);
		c.setTelefono(tlf);
		
	}
}
