package TP6EJ1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private String nombre;
	private LocalDate reservaHasta;
	private ArrayList <String> itemsAlquilados;
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.itemsAlquilados = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getReservaHasta() {
		return reservaHasta;
	}
	public boolean getPuedeAlquilar() {
		if(this.reservaHasta == null) {
			this.cargarFecha();
			return true;
		}else
			return false;
	}
	public boolean getFechaVencuida() {
		LocalDate hoy = LocalDate.now();
		return this.reservaHasta.isBefore(hoy);
	}
	private void cargarFecha() {
		  DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        boolean fechaValida = false;
	        Scanner scanner = new Scanner(System.in);
	        while (!fechaValida) {
	            try {
	                System.out.print("Introduce una fecha (formato dd/MM/yyyy): ");
	                String fechaCadena = scanner.nextLine();
	                this.reservaHasta = LocalDate.parse(fechaCadena, formato);
	                fechaValida = true;
	            } catch (DateTimeParseException e) {
	                System.out.println("Fecha inválida. Por favor, ingresa la fecha en formato dd/MM/yyyy.");
	            }
	        }
	}
	public void cancelarReserva() {
		this.reservaHasta = null;
	}
	public void agregarALaLista(String items) {
		this.itemsAlquilados.add(items.toString());
	}
	
	
	
}
