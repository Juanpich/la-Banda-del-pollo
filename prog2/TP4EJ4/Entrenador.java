package TP4EJ4;



public class Entrenador extends Integrante {
	String federacion;
	public Entrenador(String nombre, String apellido, 
			int numeroPasaporte, String estado,
			String nacimiento, String federacion) {
		
		super(nombre, apellido, numeroPasaporte, estado, nacimiento);
		this.federacion = federacion;
	}
	public String getFederacion() {
		return federacion;
	}
	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}
	public boolean equals(Integrante inte) {
		   Integrante aux = (Integrante)inte;
		   System.out.println(this.getNumeroPasaporte() == aux.getNumeroPasaporte());
		   return this.getNumeroPasaporte() == aux.getNumeroPasaporte();
	   }
	
}
