package TP4EJ2;

public class AlarmaLuminosa {
	private boolean seActiva;
	public AlarmaLuminosa() {
		this.seActiva = false;
		this.comprobarAlarma(this.seActiva);
	}
	public void comprobarAlarma(boolean seActiva) {
		this.seActiva = seActiva;
		if(this.seActiva) {
			Luz l1 = new Luz();
			Timbre t1 = new Timbre();
			l1.encender(this.seActiva);
			t1.hacerSonar(this.seActiva);
		}
		
	}
	public boolean getSeActiva() {
		return seActiva;
	}
	public void setSeActiva(boolean seActiva) {
		this.seActiva = seActiva;
	}
	
}
