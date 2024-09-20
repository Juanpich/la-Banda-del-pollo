package TP4EJ3;

public class Principal {

	public static void main(String[] args) {
		Empleado n000 = new Empleado("Jasinto", 112233, 500);
		Empleado n001 = new EmpleadoComision("Pepe", 122331, 500, 80, 2);
		Empleado n002 = new EmpleadoHoraExtra("Soledad", 223344, 500, 8, 50);
		calcularSueldo(n000);
		calcularSueldo(n001);
		calcularSueldo(n002);
			
		

	}
	public static void calcularSueldo(Empleado emp) {
		System.out.println("El empleado "+ emp.getNombre() + " con dni= " + emp.getDni() + " cobra:" +emp.getSueldo());
		
	}

}
