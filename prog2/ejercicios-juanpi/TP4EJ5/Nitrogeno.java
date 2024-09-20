package TP4EJ5;

public class Nitrogeno extends Congelado {
	private String metodoDeCongelacion;
	private double segundos;
	public Nitrogeno(String fechaVencimineto, int nroLote, String fechaEnvasado, String granjaOrigen, int codigoOSA,
			double temperatura, String metodoDeCongelacion, double segundos) {
		super(fechaVencimineto, nroLote, fechaEnvasado, granjaOrigen, codigoOSA, temperatura);
		this.metodoDeCongelacion = metodoDeCongelacion;
		this.segundos = segundos;
	}
	public String getMetodoDeCongelacion() {
		return metodoDeCongelacion;
	}
	public void setMetodoDeCongelacion(String metodoDeCongelacion) {
		this.metodoDeCongelacion = metodoDeCongelacion;
	}
	public double getSegundos() {
		return segundos;
	}
	public void setSegundos(double segundos) {
		this.segundos = segundos;
	}
	public String getInfoCompleta() {
		return super.getInfoCompleta() + '\n' + 
				"Este producto se congelo bajo el metodo de congelacion con nitrogrno llamado " + 
				this.getMetodoDeCongelacion() + ", se mantubo " + this.getSegundos() + " segundos bajo este metodo"; 
	}
}
