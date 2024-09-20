package TP4EJ6;

public class Principal {
	public static void main(String[]args) {
		EmpleadoJerarquico n001 = new EmpleadoJerarquico("Juan Pablo", "Chiclana Urraco", 19, 1023, 1200);
		Empleado n002 = new Empleado("Pepe", "Dualde", 22, 1024, 700);
		Empleado n003 = new Empleado("Jasinto", "Diaz", 23, 1025, 700);
		Empleado n004 = new Empleado("Juan", "Gonzales", 20, 1027, 700);
		Usuario n005 = new Usuario("Juan Pablo", "Chiclana Urraco", 19, "juanpich", "www.02");
		n001.setEmpleadosACargo(n002);
		n001.setEmpleadosACargo(n003);
		n001.setEmpleadosACargo(n004);	
		imprimirPer(n001);
		imprimirPer(n002);
		imprimirPer(n003);
		imprimirPer(n004);
		imprimirPer(n005);
		
		
	}
	public static void imprimirPer(Persona per) {
		System.out.println(per.getInfo());
		
	}
}
