package TP6EJ4;


public class Principal {
	public static void main(String[] args) {
		SistemaControl Puerto = new SistemaControl();
		Barco b1 = new Barco(100);
		Barco b2 = new Barco(101);
		Barco b3 = new Barco(102);
		Camion c1 = new Camion(2024,8,7);
		Camion c2 = new Camion(2024,9,7);
		Camion c3 = new Camion(2024,10,7);
		Camion c4 = new Camion(2024,12,7);
		Camion c5 = new Camion(2024,6,7);
		Puerto.agregarPrincipal(c1);
		Puerto.agregarPrincipal(c2);
		Puerto.agregarPrincipal(c3);
		Puerto.agregarPrincipal(c4);
		Puerto.agregarPrincipal(c5);
		Puerto.agregarSecundario(b3);
		Puerto.agregarSecundario(b2);
		Puerto.agregarSecundario(b1);
		System.out.println(Puerto.getListaElemntosEnCola());
		Puerto.ejecutar();
		System.out.println(Puerto.getListaElemntosEnCola());
		Puerto.ejecutarTodos();
		System.out.println(Puerto.getListaElemntosEnCola());

		
		
	}
}
