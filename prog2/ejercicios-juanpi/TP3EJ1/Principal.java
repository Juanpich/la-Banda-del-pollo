package TP3EJ1;

public class Principal {
	public static void main(String[] args) {
		Persona persona1 = new Persona(46902119 ,"Juan Pablo");
		Persona persona2 = new Persona(46900000, "Fransisco");
		Empleado empleado1 = new Empleado("agustin");
		Encuesta encuesta1 = new Encuesta(3);
		Encuesta encuesta2 = new Encuesta(2);
		Encuesta encuesta3 = new Encuesta(1);
		persona1.setCargoEncuesta(encuesta1, empleado1);
		System.out.println(empleado1.getInfoEmpleado());
		persona2.setCargoEncuesta(encuesta1, empleado1);
		persona1.setCargoEncuesta(encuesta1, empleado1);
		System.out.println(empleado1.getInfoEmpleado());
		persona1.setCargoEncuesta(encuesta3, empleado1);
		persona1.setCargoEncuesta(encuesta2, empleado1);
		persona2.setCargoEncuesta(encuesta2, empleado1);
		System.out.println(empleado1.getInfoEmpleado());
	}
		
		
		
	}
	
	

