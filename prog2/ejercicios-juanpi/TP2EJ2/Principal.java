package TP2EJ2;

public class Principal {
	public static void main (String[] args) {
		Agenda ag1 = new Agenda(2);
		ag1.setReunion("Comedor", "Prog2", 2, 4);
		ag1.setCargarParticipanteReunionDicha(1, "juan", "juanQgmail.com", 410526);
		ag1.setCargarParticipanteReunionDicha(1, "fran", "franQgmail.com", 0526);
		ag1.setCargarParticipanteReunionDicha(1, "agu", "aguQgmail.com", 26);
		ag1.setCargarParticipanteReunionDicha(1, "jaz", "jazQgmail.com", 00);
		System.out.println(ag1.getInfoTotasReuniones());
	}
}
