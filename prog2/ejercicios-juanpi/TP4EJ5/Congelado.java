package TP4EJ5;

public class Congelado extends Producto {
	private int codigoOSA;
	private double temperatura;
	public Congelado(String fechaVencimineto, int nroLote, String fechaEnvasado, String granjaOrigen, int codigoOSA,
			double temperatura) {
		super(fechaVencimineto, nroLote, fechaEnvasado, granjaOrigen);
		this.codigoOSA = codigoOSA;
		this.temperatura = temperatura;
	}
	public int getCodigoOSA() {
		return codigoOSA;
	}
	public void setCodigoOSA(int codigoOSA) {
		this.codigoOSA = codigoOSA;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public String getInfoCompleta() {
		return "Este producto congelado" + super.getInfoCompleta() + "El producto fue revisado por la OSA con el codigo:" 
				+ this.getCodigoOSA() + '\n' + "IMPORTANTE mantener el producto en temperaturas cercanas a " + this.getTemperatura();
	}
	
}
