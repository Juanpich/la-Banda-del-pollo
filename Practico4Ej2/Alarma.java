package TP4EJ2;

import java.util.ArrayList;

public class Alarma {
	AlarmaLuminosa al;
	ArrayList <Sensor> sensores;
	public Alarma(AlarmaLuminosa al) {
		sensores = new ArrayList <Sensor>();
		this.al = al;
	}
	public void cargarSensor(Sensor sn) {
		sensores.add(sn);
		this.comprobarSensores();
	}
	public int getCantSensoresCargados() {
		return sensores.size();
	}
	public void comprobarSensores() {
		boolean aux = false;
		for(int i = 0; i < this.getCantSensoresCargados(); i++) {
			aux = sensores.get(i).revisarSensor();
			if(aux) {
				System.out.println("Se detecto conflicto en " + sensores.get(i).getNombre());
				al.comprobarAlarma(aux);
			}
		}
		
	}
	
}
