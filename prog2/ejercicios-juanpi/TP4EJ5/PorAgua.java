package TP4EJ5;

public class PorAgua extends Congelado {
	private double gramosSal;

	public PorAgua(String fechaVencimineto, int nroLote, String fechaEnvasado, String granjaOrigen, int codigoOSA,
			double temperatura, double gramosSal) {
		super(fechaVencimineto, nroLote, fechaEnvasado, granjaOrigen, codigoOSA, temperatura);
		this.gramosSal = gramosSal;
	}

	public double getGramosSal() {
		return gramosSal;
	}

	public void setGramosSal(double gramosSal) {
		this.gramosSal = gramosSal;
	}
	public String getInfoCompleta() {
		return super.getInfoCompleta() + '\n' + "Este producto se congelo con agua, esta contenia " + this.getGramosSal() + " gramos de sal por litro de auga";
	}
}
