package TP2EJ2;

public class Agenda {
	Reunion [] reuniones;
	public Agenda(int limiteReuniones) {
		this.reuniones = new Reunion [limiteReuniones];
	}
	//cargar una nueva reunion 
	public void setReunion(String lugar, String tema, double duracion, int limiteParticipantes) {
		int pos = -1;
		int temp = 0;
		while(temp  < reuniones.length && pos == -1){
			if(reuniones[temp] == null) {
				pos=temp;
			}
			temp++;
		}
		if(pos != -1) {
			reuniones[pos] = new Reunion(lugar,tema,duracion,limiteParticipantes);
		}else {
			System.out.println("No se pueden cargar mas reuniones en la agenda");
		}
	}
	//muestra la info completa de todas las reuniones asignadas
	public String getInfoTotasReuniones() {
		String datos="";
		for(int i = 0; i <reuniones.length; i++) {
			if(reuniones[i] != null) {
			    datos += "Reunion " + (i+1) +	reuniones[i].getInfoCompletaReunion();
			}
		}
		return datos;
	}
	//cargar un participante nuevo en la reunion pasada por parametro
	public void setCargarParticipanteReunionDicha(int reu,String nombre, String email, int tel) {
		reu--;
		reuniones[reu].setNuevoParticipante(nombre, email, tel);
	}
	
	
	
	
	
	
	
	
	
	
	
	//muestra la cantidad de reuniones asignadas
	public int getCantidadReuniones() {
		int reunionesAsignadas =0;
		for(int i = 0; i <reuniones.length; i++) {
			if(reuniones[i] != null) {
				reunionesAsignadas++;
			}
		}
		return reunionesAsignadas;
	}
	
}
