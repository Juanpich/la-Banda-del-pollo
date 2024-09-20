package TP6EJ2;

public class Computadora {
	private int rapidez;
	

	public Computadora(int rapidez) {
		super();
		this.rapidez = rapidez;
	}

	public int getRapidez() {
		return rapidez;
	}

	public void setRapidez(int rapidez) {
		this.rapidez = rapidez;
	}
	public String toString() {
		return "Computadora con rapidez: " + this.getRapidez();
	}
	
}
