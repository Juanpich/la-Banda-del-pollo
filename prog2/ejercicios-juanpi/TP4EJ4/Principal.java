package TP4EJ4;



public class Principal {
	
	public static void main (String[] args) {
		/*Los estados para aplicar son: (en pais de origen),(en consentracion), (viajando) */
		Seleccion arg = new Seleccion();
		Futbolista ciantini = new Futbolista("Agustin", "ciantini", 10, "en consentracion", "09/08/2005", 9, 'd'); 
		Futbolista coccirio = new Futbolista("Fransisco","Coccirio", 11, "en pais de origen", "16/12/2005", 10, 'z');
		Masajista barragan = new Masajista("Jazmin", "Barragan", 12, "viajando", "28/09/2005", 3, "Especialista en piernas" );
		Entrenador chiclana = new Entrenador("Juan Pablo", "Chiclana", 13, "viajando", "26/08/2005", "Argentina");
		arg.cargarSeleccion(chiclana);
		arg.cargarSeleccion(barragan);
		arg.cargarSeleccion(coccirio);
		arg.cargarSeleccion(ciantini);
		arg.cargarSeleccion(chiclana);
		chiclana.equals(coccirio);
		System.out.println(arg.getCantidadIntegrantes());
		System.out.println(coccirio.getEstaDisponibleParaCaridad());
		System.out.println(chiclana.getEstaDisponibleParaCaridad());
	}
	
}
