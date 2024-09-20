package TP6EJ3;

import java.time.LocalDate;

public class Camion {
	private LocalDate fechaCarga;
	public Camion(int anio, int mes, int dia) {
		this.fechaCarga = LocalDate.of(anio, mes, dia);
	}
	public LocalDate getFechaCarga() {
		return this.fechaCarga;
	}
	public void setFechaCraga(LocalDate fecha) {
		this.fechaCarga = fecha;
	}
	public String toString() {
		return "Camion que se cargo: " + this.getFechaCarga() +'\n';
	}
}
