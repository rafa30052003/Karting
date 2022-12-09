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
	  
	  
	  public static int vaidaEdad(String mensaje) {
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
	  
	  
	  
	  public static void validaDNI (String DNI) {
		  if (! (DNI.length()>=8 && DNI.length()<=9)) {
			System.out.println("longitad no correcta");
		  }
		  String parte_numerica = DNI.substring(0, DNI.length()-1);
		  
		  
		  int numeroDNI = 0;
		  
		  try {
			  numeroDNI = Integer.parseInt(parte_numerica);
		} catch (Exception e) {
			System.out.println("la parte numerica debe ser un numero");
		}
		
		  char letra= DNI.substring(DNI.length()-1, DNI.length()).toUpperCase().charAt(0);
		  
		  if(!(letra>='A' && letra<='Z')) {
			  System.out.println("la parre de la letra no es correcta");
		  }
		  
		  final int divisor= 23;
		  //Ya hemos validado el formato
		  char []  letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		  
		  int resto= numeroDNI % 23;
		  
		  String nuevoDNI = numeroDNI + "" +  letrasNIF[resto];
		  if(DNI.startsWith("0")) {
		  }
		  
		  if(!(nuevoDNI.equals(DNI))) {
			  System.out.println("el dni no tiene el formato adecuado");
		  }
	  }
	  
 }
