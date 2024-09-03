package TP4EJ1;

public class AlarmaLuminosa {
	private boolean seActiva;
	public AlarmaLuminosa() {
		this.seActiva = false;
	}
	public void encenderAlarma(boolean seActiva) {
		this.seActiva = seActiva;
		if(this.seActiva) {
			Luz l1 = new Luz();
			Timbre t1 = new Timbre();
			l1.encender(this.seActiva);
			t1.hacerSonar(this.seActiva);
		}
	}
	
}
