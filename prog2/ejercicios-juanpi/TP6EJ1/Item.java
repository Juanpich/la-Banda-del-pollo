package TP6EJ1;

import java.time.LocalDate;

public abstract class Item {
	private LocalDate hoy = LocalDate.now();
	
	public LocalDate getHoy() {
		return this.hoy;
	}
	public abstract void setAlquiler(Cliente clien);
}
