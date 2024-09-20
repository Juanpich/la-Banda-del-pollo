package TP6EJ4;

public class Computadora extends Elemento{
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

	@Override
	public boolean getEsMenor(Elemento elemn) {
		Computadora otr = (Computadora) elemn;
		return this.getRapidez() < otr.getRapidez();
	}
	
}
