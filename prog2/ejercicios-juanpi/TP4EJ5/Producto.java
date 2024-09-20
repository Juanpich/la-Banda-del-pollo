package TP4EJ5;
	
public class Producto {
	private String fechaVencimineto;
	private int nroLote;
	private String fechaEnvasado;
	private String granjaOrigen;
	public Producto(String fechaVencimineto, int nroLote, String fechaEnvasado, String granjaOrigen) {
		this.fechaVencimineto = fechaVencimineto;
		this.nroLote = nroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
	}
	public String getFechaVencimineto() {
		return fechaVencimineto;
	}
	public void setFechaVencimineto(String fechaVencimineto) {
		this.fechaVencimineto = fechaVencimineto;
	}
	public int getNroLote() {
		return nroLote;
	}
	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	public String getInfoCompleta() {
		return " con lote nro: " + this.getNroLote() + ", tiene fecha de envasado en:" 
				+ this.getFechaEnvasado() + " y su vencimineto es:" + this.getFechaVencimineto() +
				". El producto proviene de la granja " + this.getGranjaOrigen() + '\n';
	}
	
	
	
}
