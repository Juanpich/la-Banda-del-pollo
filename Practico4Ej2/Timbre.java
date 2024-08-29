package TP4EJ2;

public class Timbre{
	private boolean activar;
	public Timbre() {
		this.activar = false;
	}
	public void hacerSonar(boolean activar) {
		this.activar = activar;
		if(this.activar) {
			System.out.println("WIU, WIU");
		}
	}
	
 }
