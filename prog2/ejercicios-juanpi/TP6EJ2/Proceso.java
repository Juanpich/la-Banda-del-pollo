package TP6EJ2;

public class Proceso {
	private int memoria;

	public Proceso(int memoria) {
		super();
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String toString() {
		return "Proceso de memoria: " + this.getMemoria();
	}
}
