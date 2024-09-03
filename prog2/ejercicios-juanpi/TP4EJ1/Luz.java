package TP4EJ1;

public class Luz{
	private boolean activar;
	public Luz() {
		this.activar = false;
	}
	public void encender(boolean activar) {
		this.activar = activar;
		if(this.activar) {
			System.out.println("LUZ ENCENDIDA");
		}
		
	}
	
}
