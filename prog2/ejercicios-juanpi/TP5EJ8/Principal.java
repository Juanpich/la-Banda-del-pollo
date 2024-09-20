package TP5EJ8;

public class Principal {

	public static void main(String[] args) {
		Evaluador ev1 = new Evaluador("Juan");
		Evaluador ev2 = new Evaluador("Pedro");
		TrabajoPractico tp1 = new Poster("Unicen");
		TrabajoPractico tp2 = new Resumen("Harry Poter");
		System.out.println("El evaluador " + ev1.getNombre() + " puede evaluar el tp " + tp1.getNombre() + ev1.puedoEvaluarElTrabajo(tp1));
		System.out.println("El evaluador " + ev1.getNombre() + " puede evaluar el tp " + tp2.getNombre() + ev1.puedoEvaluarElTrabajo(tp2));
		System.out.println("El evaluador " + ev2.getNombre() + " puede evaluar el tp " + tp1.getNombre() + ev2.puedoEvaluarElTrabajo(tp1));
		System.out.println("El evaluador " + ev2.getNombre() + " puede evaluar el tp " + tp2.getNombre() + ev2.puedoEvaluarElTrabajo(tp2));
		System.out.println("El evaluador " + ev1.getNombre() + " es experto" + ev1.getEsExperto());
		System.out.println("El evaluador " + ev2.getNombre() + " es experto" + ev2.getEsExperto());
	}

}
