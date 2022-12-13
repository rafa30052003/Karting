package model.dataObject;

import utils.util;

public class Cliente {
	private String dni;
	private String nombre;
	private int edad;
	private String telefono;
	/**
	 * 
	 * @param d dni
	 * @param n	nombre
	 * @param e	edad
	 * @param t	telefono
	 */
	public Cliente(String dni, String nombre, int edad, String telefono) {
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
		this.telefono=telefono;
	}
	public Cliente() {
		nombre="C";
		dni="A";
		edad=0;
		telefono="E";
	}
	/**
	 *  GETTERS Y SETTERS
	 */
	public String setDni(String dni) {
		if(util.validaDNI(dni)) {
		this.dni=dni;	
		}
		return this.dni;
	}
	public String getDni() {
		return this.dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefono() {
		return this.telefono;
	}
	@Override
	public String toString() {
		return "Cliente \ndni=" + dni + "\nnombre=" + nombre + "\ntelefono=" + telefono + "\nedad=" + edad + "";
	}
	
	public boolean equals(Object obj) {
		boolean result=false;
		
		if(obj==this) { //comparando el objeto recibido con la instancia(this), si la zona de memoria es la misma da true
			result = true;
		} else {
			if(obj!=null && obj.getClass()==this.getClass()) {
				Cliente e = (Cliente)obj;
				if(this.dni.equals(e.getDni())) {
					result=true;
				}
			}
		}
		
		return result;
	}
}
