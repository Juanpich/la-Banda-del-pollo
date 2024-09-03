package TP5EJ1;

public class Planta {
	private static int identificador =101;
	private String nombreComun;
	private String nombreCientifico;
	private String paisOrigen;
	private String fechaCompra;
	private int id;
	
	
	
	public Planta(String nombreComun, String nombreCientifico, String paisOrigen, String fechaCompra) {
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
		this.paisOrigen = paisOrigen;
		this.fechaCompra = fechaCompra;
		this.id= this.identificador;
		this.identificador++;
	}
	public int getIdentificador() {
		return this.id;
	}
	public String getNombreComun() {
		return nombreComun;
	}
	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
}
