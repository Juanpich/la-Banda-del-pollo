package TP1EJ1;

public class Principal {
	public static void main (String[] args) {
		Persona P1 = new Persona("Pedro", 20, "26/08/2005", 46902119, 'M', 100.0, 1.90 );
		
		double masaCorporal = P1.getMasaCorporal();
		System.out.println(masaCorporal);
		boolean EstaEnForma = P1.getEstaEnForma();
		System.out.println("La persona esta en forma " + EstaEnForma);
		System.out.println(P1.getInfoGeneral());
		//Modificar datos
		P1.setModiNombre("Juanpi");
		P1.setModiEdad(18);
		P1.setModiFecha("26/08/2005");
		P1.setModiSexo('M');
		P1.setModiAlturaPeso(80.0, 1.90);
		masaCorporal = P1.getMasaCorporal();
		System.out.println(masaCorporal);
		EstaEnForma = P1.getEstaEnForma();
		System.out.println("La persona esta en forma " + EstaEnForma);
		System.out.println(P1.getInfoGeneral());
	}
}
