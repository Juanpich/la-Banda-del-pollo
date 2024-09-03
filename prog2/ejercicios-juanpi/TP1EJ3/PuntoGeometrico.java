package TP1EJ3;

public class PuntoGeometrico {
	int x;
	int y;
	
	public PuntoGeometrico(){
		this(0,0);
	}
	public PuntoGeometrico(int nuevoX, int nuevoY) {
		this.x = nuevoX;
		this.y = nuevoY;
	}
	public int getPuntoX() {
		return x;
	}
	public int getPuntoY() {
		return y;
	}
	public double getDistanciaEuclidia(PuntoGeometrico punto) {
		int x1 = punto.getPuntoX();
		int y1 = punto.getPuntoY();
		int prov = (this.x - x1) * (this.x - x1) + (this.y - y1) * (this.y - y1);
		double result = Math.sqrt(prov);
		return result;
	}
}
	
