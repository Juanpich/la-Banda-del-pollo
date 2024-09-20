package TP6EJ4;

import java.time.LocalDate;

public class Camion extends Elemento {
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
	public boolean getEsMenor(Elemento elemn) {
		Camion otr = (Camion)elemn;
		return this.getFechaCarga().isBefore(otr.getFechaCarga());
	}
}
