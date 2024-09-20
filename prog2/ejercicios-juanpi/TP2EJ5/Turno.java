package TP2EJ5;

public class Turno {
	String fecha;
	int hora;
	Cliente clienteAsignado;
	Peluquero peluqueroAsignado;
	public Turno(String fecha, int hora,Peluquero peluqueroAsignado) {
		this.fecha = fecha;
		this.hora = hora;
		this.peluqueroAsignado = peluqueroAsignado;
		this.cargarElTurnoEnPeluquero();
	}
	private void cargarElTurnoEnPeluquero() {
		if(this.peluqueroAsignado != null) {
			this.peluqueroAsignado.cargarTurno(this);
		}
	}
	
	public Turno(String fecha, int hora, Peluquero peluqueroAsignado, Cliente clienteAsignado) {
		this.fecha = fecha;
		this.hora = hora;
		this.clienteAsignado = clienteAsignado;
		this.peluqueroAsignado = peluqueroAsignado;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public Cliente getClienteAsignado() {
		return clienteAsignado;
	}
	public void setCliente(Cliente clien) {
		if(this.clienteAsignado == null) {
			this.clienteAsignado = clien;
		}else {
			System.out.println("El cliente no se puede cargar");
		}
	}
	public void gurdarTurno(Cliente clienteAsignado) {
		if(this.clienteAsignado == null) {
			this.clienteAsignado = clienteAsignado;
			this.clienteAsignado.asignarTurno();
		}else {
			System.out.println("El turno no se puede asigar");
		}
		
	}
	public Peluquero getPeluqueroAsignado() {
		return peluqueroAsignado;
	}
	public String getInfoTurno() {
		String infoTurno = "El turno fecha=" + this.getFecha() + " a la hora=" + this.getHora() + " del peluquero: " + this.peluqueroAsignado.getDni();
		if(this.clienteAsignado == null) {
			infoTurno += " esta sin reservar";
		}else {
			infoTurno += " esta reservado por el cliente " + this.clienteAsignado.getNombre();
		}
		return infoTurno;
	}
	
		
}
