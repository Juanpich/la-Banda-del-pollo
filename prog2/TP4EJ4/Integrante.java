package TP4EJ4;


public class Integrante {
   String nombre;
   String apellido;
   int numeroPasaporte;
   String estado;
   public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getNumeroPasaporte() {
	return numeroPasaporte;
}
public void setNumeroPasaporte(int numeroPasaporte) {
	this.numeroPasaporte = numeroPasaporte;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	if(estado == "en pais de origen" || estado == "en consentracion" || estado == "viajando") {
		this.estado = estado;
	}else {
		System.out.println("El estado ingresado no es correcto");
	}
	
}
public String getNacimiento() {
	return nacimiento;
}
public void setNacimiento(String nacimiento) {
	this.nacimiento = nacimiento;
}
String nacimiento;
   public Integrante(String nombre, String apellido, 
			int numeroPasaporte, String estado,String nacimiento
			) {
	   this.nombre = nombre;
	   this.apellido = apellido;
	   this.numeroPasaporte = numeroPasaporte;
	   this.estado = estado;
	   this.nacimiento = nacimiento;
   }
   public boolean equals(Integrante inte) {
	   Integrante aux = (Integrante)inte;
	   return this.getNumeroPasaporte() == aux.getNumeroPasaporte();
   }
   public boolean getEstaDisponibleParaCaridad() {
	   if(this.estado == "en pais de origen") {
		   return true;
	   }else {
		   return false;
	   }
   }



}
