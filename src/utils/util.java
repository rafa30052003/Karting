package utils;

import java.util.Scanner;

public class util {
	
	 public static String leeString(String mensaje) {
		  Scanner sc = new Scanner (System.in);
		  String result = null;
		  boolean valid = false;
		  do {
			try {
				System.out.println(mensaje);
				result = sc.nextLine();
				valid = true;
			} catch (Exception e) {
				System.out.println("Error. Introduzca una cadena");
				sc.nextLine();
			}
		} while (!valid);
		  return result;
		  
	  }
	  
	  
	  public static int leeEntero(String mensaje) {
		  Scanner sc = new Scanner (System.in);
		  int result = 0;
		  boolean valid = false;
		  do {
			try {
				System.out.println(mensaje);
				result = sc.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.println("Error. Introduzca un entero");
				sc.nextLine();
			}
		} while (!valid);
		  return result;
	  }
	  
	  
	  public static int validaEdad(String mensaje) {
		  Scanner sc = new Scanner (System.in);
		  int result = 0;
		  boolean valid = false;
		  do {
			try {
				System.out.println(mensaje);
				if(result >= 16) {
					result = sc.nextInt();
					valid = true;
				}else {
					System.out.println("introduzca la edad correcta");
					valid = false;
				}
			} catch (Exception e) {
				System.out.println("Error. Introduzca un entero");
				sc.nextLine();
			}
		} while (!valid);
		  return result;
	  }
	  
	  
	  
	  public static boolean validaDNI (String DNI) {
		  
		  boolean result=false;
		  
		  if (DNI.length()==9 && Character.isLetter(DNI.charAt(8))==true) {

			  char letraMayuscula=((DNI.substring(8)).toUpperCase()).charAt(0);
			  	if(soloNumero(DNI)==true && letraDNI(DNI)==letraMayuscula) {
				  result = true;
			  }
		  }
		  return result;
		  
	  }
	private static boolean soloNumero(String DNI) {
		boolean result=true;
		String numero=DNI.substring(0,8);
		for (int i = 0; i < 8 && result; i++) {
			char digito=DNI.charAt(i);
			if(digito<'0' || digito>'9') {
				result=false;
			}
			
		} 
		return result;
			
		
	}
	public static char letraDNI(String dni){
		int miDNI=Integer.parseInt(dni.substring(0,8));
		int resto=0;
		char miLetra=' ';
		char[] asignacionLetra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		resto=miDNI % 23;
		miLetra=asignacionLetra[resto];
		return miLetra;
		}
	
	
	public static String devuelveDNI(String dni) {
		boolean valid = false;
		
		do {
			try {
				if(validaDNI(dni)==true) {
					valid = true;
				}
			} catch (Exception e) {
				System.out.println("Introduce el dni correctamente1");
			}
			
		} while (!valid);
		return dni;
	}
 }
