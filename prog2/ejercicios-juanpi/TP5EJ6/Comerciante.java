package TP5EJ6;

public class  Comerciante extends Contribuyente {
	private int montoFacturado;
	private final static double porcentajeDeFactura=3.5;
	public Comerciante(String nombre, int montoFacturado) {
		super(nombre, 50);
		this.montoFacturado = montoFacturado;
	}
	public double getPaga(double sueldo) {
		 return ((super.getDescuento() / 100) * sueldo) + ((porcentajeDeFactura/100) * this.montoFacturado);
	}
	public int getMontoFacturado() {
		return montoFacturado;
	}
	public void setMontoFacturado(int montoFacturado) {
		this.montoFacturado = montoFacturado;
	}
	public static double getPorcentajeDeFactura() {
		return porcentajeDeFactura;
	}


}
