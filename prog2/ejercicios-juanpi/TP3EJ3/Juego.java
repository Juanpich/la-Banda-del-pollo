package TP3EJ3;

import java.util.ArrayList;

public class Juego {
	private ArrayList <Jugador> jugadores;
	String reglas = "Se van a enfrentar los jugadores segun la carcateristica dada, en caso de empate se buscara otra caracterista a comparar";
	public Juego() {
		this.jugadores =  new ArrayList<Jugador>();
		System.out.println(reglas);
	}
	public void cargarJugadores(Jugador pers) {
		jugadores.add(pers);
	}
	public String comenzarJuego(String caracteristica) {
		String ganador;
		int posGanador=0;
		switch(caracteristica){
		case("fuerza"):
				for(int i = 0; i < jugadores.size(); i++) {
					if(i != 0) {
						
						if(jugadores.get(i).getFuerza() >= jugadores.get(posGanador).getFuerza()) {
							
							if(jugadores.get(i).getFuerza() == jugadores.get(posGanador).getFuerza()) {
								
								if(jugadores.get(i).getVelocidad() >= jugadores.get(posGanador).getVelocidad()) {
									
									if(jugadores.get(i).getVelocidad() == jugadores.get(posGanador).getVelocidad()) {
										
										if(jugadores.get(i).getVisionNocturna() >= jugadores.get(posGanador).getVisionNocturna()) {
											
											if(jugadores.get(i).getVisionNocturna() == jugadores.get(posGanador).getVisionNocturna()) {
												
											}else {
												posGanador=i;
											}
										}
										
									}else {
										posGanador=i;
									}
									
								}
							}else {
								posGanador=i;
							}
						}
					}
				}
				ganador="Por la fuerza gano el jugador con nombre real: " + jugadores.get(posGanador).getNombreReal() + " y su nombre de super es: " + jugadores.get(posGanador).getNombreSuper() ;
				
			break;
		case("velocidad"):
			for(int i = 0; i < jugadores.size(); i++) {
				if(i != 0) {
					
					if(jugadores.get(i).getVelocidad() >= jugadores.get(posGanador).getVelocidad()) {
						
						if(jugadores.get(i).getVelocidad() == jugadores.get(posGanador).getVelocidad()) {
							
							if(jugadores.get(i).getVisionNocturna() >= jugadores.get(posGanador).getVisionNocturna()) {
								
								if(jugadores.get(i).getVisionNocturna() == jugadores.get(posGanador).getVisionNocturna()) {
									
									if(jugadores.get(i).getFuerza() >= jugadores.get(posGanador).getFuerza()) {
										
										if(jugadores.get(i).getFuerza() == jugadores.get(posGanador).getFuerza()) {
											
										}else {
											posGanador=i;
										}
									}
									
								}else {
									posGanador=i;
								}
								
							}
						}else {
							posGanador=i;
						}
					}
				}
			}
			ganador="Por la velocidad gano el jugador con nombre real: " + jugadores.get(posGanador).getNombreReal() + " y su nombre de super es: " + jugadores.get(posGanador).getNombreSuper() ;
			
		break;
		case("vision nocturna"):
			for(int i = 0; i < jugadores.size(); i++) {
				if(i != 0) {
					
					if(jugadores.get(i).getVisionNocturna() >= jugadores.get(posGanador).getVisionNocturna()) {
						
						if(jugadores.get(i).getVisionNocturna() == jugadores.get(posGanador).getVisionNocturna()) {
							
							if(jugadores.get(i).getFuerza() >= jugadores.get(posGanador).getFuerza()) {
								
								if(jugadores.get(i).getFuerza() == jugadores.get(posGanador).getFuerza()) {
									
									if(jugadores.get(i).getVelocidad() >= jugadores.get(posGanador).getVelocidad()) {
										
										if(jugadores.get(i).getVelocidad() == jugadores.get(posGanador).getVelocidad()) {
											
										}else {
											posGanador=i;
										}
									}
									
								}else {
									posGanador=i;
								}
								
							}
						}else {
							posGanador=i;
						}
					}
				}
			}
			ganador="Por la vision nocturna gano el jugador con nombre real: " + jugadores.get(posGanador).getNombreReal() + " y su nombre de super es: " + jugadores.get(posGanador).getNombreSuper() ;
			
		break;
	
		default: 
			ganador="La caracteristica ingresada no es verdadera";
		}
		return ganador;
	}
	
}
