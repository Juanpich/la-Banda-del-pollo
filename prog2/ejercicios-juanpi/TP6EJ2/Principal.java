package TP6EJ2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentroDeComputos c1 = new CentroDeComputos();
		c1.agregarComputadora(new Computadora(9));

		c1.agregarComputadora(new Computadora(10));
		c1.agregarComputadora(new Computadora(11));
		c1.agregarComputadora(new Computadora(90));
		c1.agregarProceso(new Proceso(1));
		c1.agregarProceso(new Proceso(10));
		
		c1.agregarProceso(new Proceso(11));
		
		
		c1.agregarProceso(new Proceso(100));
		c1.agregarProceso(new Proceso(10));
		
		System.out.println(c1.getListaCompleta());
		c1.ejecutar();
		System.out.println(c1.getListaCompleta());
		c1.ejecutarTodo();
		System.out.println(c1.getListaCompleta());
		
		}

}
