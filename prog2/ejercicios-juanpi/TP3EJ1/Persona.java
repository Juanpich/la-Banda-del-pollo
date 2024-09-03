package TP3EJ1;

public class Persona {
	
	int dni;
	String nombre;
	Encuesta [] encuestas =new Encuesta [1000000];
	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		
	}
	public void setCargoEncuesta(Encuesta encuesta, Empleado empleado) {
		int temp =0;
		int pos =-1;
		boolean yaEsta=false;
		while(temp < encuestas.length && pos == -1) {
			if(encuestas[temp] == null) {
				pos= temp;
			}
			if(encuestas[temp] == encuesta) {
				yaEsta= true;
				pos=temp;
			}
			temp++;
		}
		if(pos != -1 && yaEsta) {
			System.out.println("La encuesta realizada a " + nombre + " esta respondida");
		}else if(pos != -1) {
			encuestas[pos] = encuesta;
			this.empleadorealizoEncuesta(empleado);
		}else {
			System.out.println("No se pueden reponder mas encuestas");
		}
		
	}
	private void empleadorealizoEncuesta(Empleado empleado) {
		empleado.setRealizoEncuesta();
	}
}
