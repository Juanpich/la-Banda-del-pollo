package TP6EJ1;

public class Vehiculo extends Item {
	private String marca;
	private String patente;
	private int kms;
	private String tipoCombustible;
	private boolean estaDisponible;
	private Cliente clienteQueReservo;
	public Vehiculo(String marca, String patente, int kms, String tipoCombustible) {
		super();
		this.marca = marca;
		this.patente = patente;
		this.kms = kms;
		this.tipoCombustible = tipoCombustible;
		this.estaDisponible = true;
		
	}
	public String getAlquiladoPor() {
		return "Vehiculo alquilado por: "  + this.clienteQueReservo.getNombre();
	}
	public void setAlquiler(Cliente clien) {
		if(this.estaDisponible) {
			if(clien.getPuedeAlquilar()) {
				this.estaDisponible = false;
				this.clienteQueReservo = clien;
				clien.agregarALaLista(this.toString());
			}else {
				System.out.println("el cliente no puede alquilar");
			}
		}else {
			System.out.println("Lo sentimos el vehiculo patente: " + this.getPatente() + " no esta disponible");
		}
	}
	public void borrarCliente(Cliente clien) {
		if(this.clienteQueReservo == clien) {
			this.clienteQueReservo = null;
			this.estaDisponible = true;
			clien.cancelarReserva();
		}else {
			System.out.println("El cliente no tenia tenia este auto");
		}
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public boolean isEstaDisponible() {
		return estaDisponible;
	}
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}
	
}
