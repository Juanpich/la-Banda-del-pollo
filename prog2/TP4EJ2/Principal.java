package TP4EJ2;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
public class Principal {

	public static void main(String[] args) {
		
		//BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		AlarmaLuminosa al = new AlarmaLuminosa();
		Alarma alarmaControl = new Alarma(al);
		Movimiento smc = new Movimiento("cocina", false);
		Movimiento smb = new Movimiento("baño", false);
		RoturaVidrio srvc = new RoturaVidrio("cocina", false);
		RoturaVidrio srvb = new RoturaVidrio("baño", false);
		Aberturas ac = new Aberturas("cocina", false);
		Aberturas ab = new Aberturas("baño", false);
		alarmaControl.cargarSensor(ab);
		alarmaControl.cargarSensor(ac);
		alarmaControl.cargarSensor(srvb);
		alarmaControl.cargarSensor(srvc);
		alarmaControl.cargarSensor(smb);
		alarmaControl.cargarSensor(smc);
		alarmaControl.comprobarSensores();
		ab.setActivado(true);
		srvc.setActivado(true);
		alarmaControl.comprobarSensores();
		
		
		
		
		}
	
		

	}

