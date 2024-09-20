package TP5EJ6;

public class Programador extends Contribuyente {
	private int montoFacturado;
	private final double porcentajeDeFactura=2;
	public Programador(String nombre, int montoFacturado) {
		super(nombre, 20);
		this.montoFacturado = montoFacturado;
	}
	
	
	public double getPaga(double sueldo) {
		return ((super.getDescuento() / 100) * sueldo) + ((this.porcentajeDeFactura/100) * this.montoFacturado);
	}
	public int getMontoFacturado() {
		return montoFacturado;
	}
	public void setMontoFacturado(int montoFacturado) {
		this.montoFacturado = montoFacturado;
	}
	public double getPorcentajeDeFactura() {
		return this.porcentajeDeFactura;
	}

}
