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
	this.estado = estado;
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
	   System.out.println(this.getNumeroPasaporte() == aux.getNumeroPasaporte());
	   return this.getNumeroPasaporte() == aux.getNumeroPasaporte();
   }



}
