package TP3EJ4;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
	private String nombre;
	private String apellido;
	private  LocalDate fechaNacimiento;
	private int numTel;
	private String direccion;
	private String email;
	public Contacto(String nombre, String apellido, int anio, int mes, int dia, int numTel, String direccion,
			String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.setFechaNacimiento(anio, mes, dia);
		this.numTel = numTel;
		this.direccion = direccion;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return "" + fechaNacimiento;
	}
	public void setFechaNacimiento(int anio, int mes, int dia) {
		if(mes <= 12 && mes >= 1 && dia <= 31 && dia >= 1) {
			this.fechaNacimiento =  LocalDate.of(anio, mes, dia);
		}
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento, fechaActual);
		return periodo.getYears();
	}
	public boolean equals(Contacto cont) {
		if(cont == null) {
			return false;
		}
		if(cont.getNombre().equals( this.getNombre()) && cont.getApellido().equals(this.getApellido()) && cont.getNumTel() == this.getNumTel()) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
}