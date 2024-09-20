package TP2EJ5;

import java.util.ArrayList;

public class Peluquero {
	String nombre;
	int dni;
	ArrayList<Turno>turnos;
	public Peluquero(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.turnos = new ArrayList<Turno>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCantTurnos() {
		int turnos=0;
		for(int i = 0; i < this.turnos.size(); i++) {
			if(this.turnos.get(i).getClienteAsignado() == null) {
				turnos++;
			}
				
		}
		return turnos;
	}
	public Turno getPrimerTurnoDisponible() {
		int i=0;
		boolean disponible = false;
		Turno turnoDispon = new Turno("00", 00, null);
		while( i < this.turnos.size() && !disponible) {
			if(this.turnos.get(i).getClienteAsignado() == null) {
				turnoDispon = this.turnos.get(i);
				disponible = true;
			}
			i++;	
		}
			return turnoDispon;
		
	}
	public String getTurnosAsignados() {
		String turnosAsignados = "EL peluquero " + this.getNombre() + " tiene los siguientes turnos: " + '\n';
		for(int i = 0; i < this.turnos.size(); i++) {
			if(this.turnos.get(i).getClienteAsignado() != null) {
				turnosAsignados +=  "Turno: " + this.turnos.get(i).getFecha() + "-" + this.turnos.get(i).getHora() + "Asignado a: " + this.turnos.get(i).getClienteAsignado().getNombre() + "; El descuento aplica: " + this.turnos.get(i).getClienteAsignado().getAplicaDescuento()+ '\n';
			}else {
				turnosAsignados +=  "Turno: " + this.turnos.get(i).getFecha() + "-" + this.turnos.get(i).getHora() + " esta sin asignar" + '\n';
			}
		}
		return turnosAsignados;
	}
	public void cargarTurno(Turno turn) {
		boolean seCargo = false;
		if( this.turnos.size() == 0) {
			seCargo= true;
			this.turnos.add(turn);
		}else {
			for(int i = 0; i < this.turnos.size(); i++) {
				if(!this.turnos.contains(turn)) {
					seCargo= true;
					this.turnos.add(turn);
				}
			}
		}
		if(seCargo) {
			System.out.println("El turno se cargo correctamente");
		}else {
			System.out.println("El turno no se puede cargar porue ya esta");
			System.out.println(!this.turnos.contains(turn));
		}
			
	}
	
}
