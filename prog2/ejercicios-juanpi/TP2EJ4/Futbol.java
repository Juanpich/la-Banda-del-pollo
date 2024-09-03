package TP2EJ4;

public class Futbol {
	private int precio;
	private int reserva;
	private int cantCanchas;
	public Futbol(int precio) {
		this.precio = precio;
		this.cantCanchas = 2;
		this.reserva = 0;
		
	}
	public int getCantCanchas() {
		return cantCanchas;
	}
	public void setCantCanchas(int cantCanchas) {
		this.cantCanchas = cantCanchas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getReserva() {
		return this.reserva;
	}
	public void setReserva(Usuario user) {
		if(this.reserva < this.cantCanchas) {
			reserva++;
			user.reservoCancha();
		}else {
			System.out.println("No hay mas canchas disponibles");
		}
	}
}
