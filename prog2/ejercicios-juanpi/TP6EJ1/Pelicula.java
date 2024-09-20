package TP6EJ1;

import java.util.ArrayList;
import java.util.Iterator;

public class Pelicula extends Item {
	private String nombre;
	private String genero;
	private int cantDisponibles;
	private ArrayList<Cliente>clientes;
	public Pelicula(String nombre, String genero, int cantDisponibles) {
		this.nombre = nombre;
		this.genero = genero;
		this.cantDisponibles = cantDisponibles;
		this.clientes = new ArrayList<Cliente>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getCantDisponibles() {
		return cantDisponibles;
	}
	public void setSumarCopiasStock(int cantDisponibles) {
		this.cantDisponibles += cantDisponibles;
	}
	
	public ArrayList<Cliente> getClientes() {
		return new ArrayList<Cliente>(this.clientes);
	}
	public String getListaClientes() {
		String aux = "Los clientes que tienen reservada La pelicula" + this.getNombre() + " son:" + '\n';
		for (int i = 0; i < this.clientes.size(); i++) {
			aux += this.clientes.get(i).getNombre() + '\n';
		}
		return aux;
	}
	public void setAlquiler(Cliente clien) {
		if(this.cantDisponibles > 0) {
			if(clien.getPuedeAlquilar()) {
				this.cantDisponibles--;
				this.clientes.add(clien);
				clien.agregarALaLista(this.toString());
			}else {
				System.out.println("el cliente no puede alguilar");
			}
		}else {
			System.out.println("Lo sentimos no hay mas peliculas" + this.getNombre());
		}
	}
	public String toString() {
		return "Pelicula: " + this.getNombre();
	}
	public void borrarClienteDeReserva(Cliente clien) {
		int pos = this.clientes.indexOf(clien);
		if(pos !=-1) {
			this.clientes.remove(pos);
			System.out.println("El cliente se elimino de la lista");
			clien.cancelarReserva();
			this.cantDisponibles++;
		}else {
			System.out.println("El cliente no esta en esta lista");
		}
	}
	
}
