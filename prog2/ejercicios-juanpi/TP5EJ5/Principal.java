package TP5EJ5;

public class Principal {

	public static void main(String[] args) {
		Lote l1 = new Lote(70);
		Fina c1 = new Fina();
		System.out.println("El lote es apto para cereal fino " +  c1.loteApto(l1));
		Coperativa cop = new Coperativa();
		cop.esLoteDeInteres(l1);
		System.out.println(l1.getEsLoteEspecial());
	}

}
