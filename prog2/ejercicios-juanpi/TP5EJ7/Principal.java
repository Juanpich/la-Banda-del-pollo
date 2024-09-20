package TP5EJ7;

public class Principal {
	public static void main(String[] args) {
		Empleado n000 = new Empleado("Jasinto","papa", 112233, 500);
		EmpleadoComision n001 = new EmpleadoComision("Pepe","jaja", 122331, 500, 80, 10);
		EmpleadoBono n002= new EmpleadoBono("Soledad","uraco", 223344, 500, 100, 10, 9);
		calcularSueldo(n000);
		calcularSueldo(n001);
		calcularSueldo(n002);
	}
	public static void calcularSueldo(Empleado emp) {
		System.out.println("El empleado "+ emp.getNombre() + " " + emp.getApellido() + " con dni= " +emp.getDni() + " cobra:" +emp.getSueldo());
		
	}
	
}
