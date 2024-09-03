package TP1EJ3;

public class Principal {
	public static void main(String[] args) {
		RectanguloNuevo rect1 = new RectanguloNuevo(/*x*/8 ,/*y*/5, /*base*/ 2, /*altura*/3 ,/*direccionAltura s(superior), i(inferior)*/'i', /*direccionBase d(derecha)i(izquierda)*/'d');
		System.out.println("El x faltante es:" + rect1.getXFaltante() + " e el y faltante es: " + rect1.getYFaltante());
		System.out.println("El area es " + rect1.getArea());
		System.out.println( "La altura es " + rect1.getAltura());
		System.out.println("La base es " + rect1.getBase());
		System.out.println("Es un cuadrado " + rect1.getEsUnCuadrado());
		System.out.println("como esta " + rect1.getParadoAcostado());
		System.out.println("el lado mas mas largo " + rect1.getLadoMasLargo());
		System.out.println("Nuevo lado");
		RectanguloNuevo rect2 = new RectanguloNuevo(1, 5, 3, 3);
		System.out.println("El area es " + rect2.getArea());
		System.out.println( "La altura es " + rect2.getAltura());
		System.out.println("La base es " + rect2.getBase());
		System.out.println("Es un cuadrado " + rect2.getEsUnCuadrado());
		System.out.println("como esta " + rect2.getParadoAcostado());
		System.out.println("el lado mas mas largo " + rect2.getLadoMasLargo());
		System.out.println("comparacion de rectangulos: " + rect1.getSonIguales(rect2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*PuntoGeometrico punto1 = new PuntoGeometrico();
		PuntoGeometrico punto2 = new PuntoGeometrico(2,1);
		double distancia = punto2.getDistanciaEuclidia(punto1);
		System.out.println(distancia);
		Rectangulo rect1 = new Rectangulo(2,2,3,3);
		System.out.println("El area es " + rect1.getArea());
		System.out.println( "La altura es " + rect1.getAltura());
		System.out.println("La base es " + rect1.getBase());
		System.out.println("Es un cuadrado " + rect1.getEsUnCuadrado());
		System.out.println("Esta acostado " + rect1.getParadoAcostado());
		rect1.setNuevoPunto(11, 1);
		System.out.println("Nuevo lado");
		System.out.println("El area es " + rect1.getArea());
		System.out.println( "La altura es " + rect1.getAltura());
		System.out.println("La base es " + rect1.getBase());
		System.out.println("Es un cuadrado " + rect1.getEsUnCuadrado());
		System.out.println("Esta acostado " + rect1.getParadoAcostado());
		/*Rectangulo rect2 = new Rectangulo(1,1,2,2);
		System.out.println("Nuevo lado");
		System.out.println("El area es " + rect2.getArea());
		System.out.println( "La altura es " + rect2.getAltura());
		System.out.println("La base es " + rect2.getBase());
		System.out.println("Es un cuadrado " + rect2.getEsUnCuadrado());
		System.out.println("como esta " + rect2.getParadoAcostado());
		System.out.println("el lado mas mas largo " + rect2.getLadoMasLargo());
		System.out.println("comparar rectangulos " + rect2.getSonIguales(rect1));*/
	}
}
