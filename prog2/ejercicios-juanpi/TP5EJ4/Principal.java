package TP5EJ4;

public class Principal {
	public static void main(String[] args) {
		
		//Alumno agustin = new Alumno("Agustin");
		Alumno fransisco = new Alumno("Fransisco");
		Alumno jazmin = new Alumno("jazmin");
		//Casa trucos = new Casa(1, null, false);
		Casa magia = new Casa(3, null, true);
		fransisco.cargarFamiliar(jazmin);
		jazmin.cargarFamiliar(fransisco);
		magia.cargarAlumno(jazmin);
		magia.cargarAlumno(fransisco);
		//magia.cargarAlumno(fransisco);
		//trucos.cargarAlumno(agustin);
		
		
			
		
	}
}
