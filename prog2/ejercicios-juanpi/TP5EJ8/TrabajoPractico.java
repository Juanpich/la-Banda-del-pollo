package TP5EJ8;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class TrabajoPractico {
	private String nombre;
	protected ArrayList<String>palabrasClaves;
	protected Evaluador evaluador;
	
	public TrabajoPractico(String nombre) {
		this.nombre = nombre;
		this.setPalabrasClaves();
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<String>(this.palabrasClaves);
	}
	private void setPalabrasClaves() {
	    this.palabrasClaves = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Cargar palabras claves para el tp " + this.getNombre());
	    boolean sigo = true;

	    while (sigo) {
	        try {
	            System.out.println("Ingrese una palabra clave:");
	            String aux = scanner.nextLine();
	            this.palabrasClaves.add(aux);

	            System.out.println("¿Desea seguir avanzando? si/no:");
	            String respuesta = scanner.nextLine().toLowerCase();
	            if (!respuesta.equals("si")) {
	                sigo = false;
	            }
	        } catch (Exception exc) {
	            System.out.println("Ha ocurrido un error: " + exc.getMessage());
	        }
	      }
	  }
	public abstract void asignarEvaluador(Evaluador eva);
	public abstract boolean sePuedeAsiganrEvaluador(Evaluador eva);
	
	
}
