package views;

public class View {

	//MENÚ PRINCIPAL
	
	public static void menuPrincipal() {
		System.out.println("MENÚ CLIENTES KARTING CLUB");
		System.out.println("1. Insertar nuevo cliente.");
		System.out.println("2. Ver cliente.");
		System.out.println("3. Actualizar cliente.");
		System.out.println("4. Eliminar un cliente.");
	}
	
	//SUBMENÚS
	
	//SUBMENÚ INSERTAR NUEVO CLIENTE
	public static void submenuInsertar() {
		System.out.println("INSERTAR NUEVO CLIENTE");
		System.out.println("1. Introducir nombre.");
		System.out.println("2. Introducir dni.");
		System.out.println("3. Introducir edad.");
		System.out.println("4. Introducir número de telefono.");
	}
	
	
	//SUBMENÚ ACTUALIZAR CLIENTE
	
	public static void submenuEditar() {
		System.out.println("EDITAR CLIENTE");
		System.out.println("1. Modificar nombre.");
		System.out.println("2. Modificar dni.");
		System.out.println("3. Modificar edad.");
		System.out.println("4. Modificar número de telefono.");
	}
	
	//SUBMENÚ MOSTRAR CLIENTE
	
	public static void submenuMostrar() {
		System.out.println("MOSTRAR");
		System.out.println("1. Mostrar cliente.");
		
	}
	
	//SUBMENÚ ELIMINAR CLIENTE
	
	public static void submenuEliminar() {
		System.out.println("ELIMINAR");
		System.out.println("1. Eliminar cliente.");
	}
}
