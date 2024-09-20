package TP4EJ5;

public class PorAire extends Congelado {
	private int porcNitrigeno;
	private int porcOxigeno;
	private int porcDioxidoCarbono;
	private int porcVaporAgua;
	
	public PorAire(String fechaVencimineto, int nroLote, String fechaEnvasado, String granjaOrigen, int codigoOSA,
			double temperatura, int porcNitrigeno, int porcOxigeno, int porcDioxidoCarbono, int porcVaporAgua) {
		super(fechaVencimineto, nroLote, fechaEnvasado, granjaOrigen, codigoOSA, temperatura);
		this.porcNitrigeno = porcNitrigeno;
		this.porcOxigeno = porcOxigeno;
		this.porcDioxidoCarbono = porcDioxidoCarbono;
		this.porcVaporAgua = porcVaporAgua;
	}
	public int getPorcNitrigeno() {
		return porcNitrigeno;
	}
	public void setPorcNitrigeno(int porcNitrigeno) {
		this.porcNitrigeno = porcNitrigeno;
	}
	public int getPorcOxigeno() {
		return porcOxigeno;
	}
	public void setPorcOxigeno(int porcOxigeno) {
		this.porcOxigeno = porcOxigeno;
	}
	public int getPorcDioxidoCarbono() {
		return porcDioxidoCarbono;
	}
	public void setPorcDioxidoCarbono(int porcDioxidoCarbono) {
		this.porcDioxidoCarbono = porcDioxidoCarbono;
	}
	public int getPorcVaporAgua() {
		return porcVaporAgua;
	}
	public void setPorcVaporAgua(int porcVaporAgua) {
		this.porcVaporAgua = porcVaporAgua;
	}
	public String getInfoCompleta() {
		return super.getInfoCompleta() + '\n'
				+ "Este producto se congelo mediante el metodo de aire el cual contenia:" + '\n' 
				+ "-" + this.getPorcNitrigeno() + " porciento de nitrogeno" + '\n' + "-" + 
				this.getPorcOxigeno()+ " porciento de oxigeno" + '\n'+ "-" +this.getPorcDioxidoCarbono() +
				" porciento de dioxido de carbono" + '\n' + "-" + this.getPorcVaporAgua()
				+ " porciento de vapor de agua";
	}
	
	
}
