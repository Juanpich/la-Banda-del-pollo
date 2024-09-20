package TP6EJ3;

public class Principal {
	public static void main(String[] args) {
		Puerto po = new Puerto();
		po.agregarBarco(new Barco(100));
		po.agregarBarco(new Barco(101));
		po.agregarCamion(new Camion(2024,9,9));
		po.agregarCamion(new Camion(2024,8,7));
		po.agregarCamion(new Camion(2024,7,10));
		System.out.println(po.listaCompleta());
		po.descargarTodo();
		System.out.println(po.listaCompleta());
	}
}
