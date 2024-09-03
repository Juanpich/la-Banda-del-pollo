package TP2EJ2;

public class Reunion {
	String lugar;
	Persona [] participantes;
	String tema;
	double duracion;
	
	public Reunion(String lugar, String tema, double duracion, int limiteParticipantes) {
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = duracion;
		this.participantes = new Persona [limiteParticipantes];
	}
	
	public void setLugarReunion(String lugar) {
		this.lugar = lugar;
	}
	public String getLugarReunion() {
		return lugar;
	}
	public String getTema() {
		return tema;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public String getInfoCompletaReunion() {
		String dato;
		dato = "Lugar: " + this.getLugarReunion() + ", Tema: " + this.getTema() + ", Duracion: " + this.getDuracion() + ", Participantes: " + this.getInfoDeTodosLosParticipantes();
	    return dato;
	}
	
	
	
	
	//cargar un nuevo participante
	public void setNuevoParticipante(String nombre, String email, int tel) {
		int pos=-1;
		int temp=0;
		while(temp < participantes.length && pos == -1) {
			if(participantes[temp] == null) {
				pos = temp;
			}
			temp++;
		}
		if(pos != -1) {
			participantes[pos] = new Persona(nombre, email, tel);
		}else {
			System.out.println("No se pueden agregar mas personas a la reunion");
		}
	}
	/*solicitar a los participantes de la reunion*/
	public String getInfoDelParticipante(int pos) {
		String dato;
		dato = "Nombre: " + participantes[pos].getNombre() + " email: " + participantes[pos].getEmail() + " tel: " + participantes[pos].getTelefono();
		return dato;
	}
	public String getInfoDeTodosLosParticipantes() {
		String datosCompletos = "";
		for(int i = 0; i < participantes.length ; i++) {
			datosCompletos += "-" + this.getInfoDelParticipante(i) + "\n";
		}
		return datosCompletos;
	}
	
	
}
