package TP5EJ4;


import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	private String nombre;
	private ArrayList<String>cualidades;
	private ArrayList<Alumno>familiar;
	private boolean estaDisponible;
	public Alumno(String nombre) {
		this.nombre = nombre;
		this.familiar = new ArrayList<Alumno>();
		this.estaDisponible = true;
		this.cargarCualidades();
	}
	private void cargarCualidades() {
		this.cualidades = new ArrayList<String>();
		//this.cualidades.add("listo");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cargar cualidades para alumno " + this.getNombre());
		String aux = "";
		boolean sigo = true;
		while(sigo) {
			try {
					System.out.println("Ingrese una cualidad:");
					aux = scanner.nextLine();
					this.cualidades.add(aux);
					System.out.println("Desea seguir avanzando si = true, no = false:");
					sigo = scanner.nextBoolean();
				
			}catch(Exception exc) {
				System.out.println(exc);	
			}
		}
		
	}
	public void cargarFamiliar(Alumno fam) {
		this.familiar.add(fam);
	}
	public ArrayList<String> getCualidades() {
		ArrayList<String> aux = new ArrayList<String>(this.cualidades);
		return aux;
	}
	public String getNombre() {
		return this.nombre;
	}
	public boolean getDisponible() {
		return this.estaDisponible;
	}
	public ArrayList<Alumno> getFamiliares(){
		ArrayList<Alumno> aux = new ArrayList<Alumno>(this.familiar);
		return aux;
	}
}
