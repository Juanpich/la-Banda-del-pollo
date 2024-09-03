package TP1EJ1;

public class Persona {
	String nombre;
	int edad;
	String fechaNacimiento;
	int dni;
	char sexo;
	double peso;
	double altura;
	
	public Persona() {
		nombre = "NN";
		edad = 24;	
		fechaNacimiento = "1/01/2000";
		sexo = 'F';
		peso = 1.0;
		altura = 1.0;
	}
	public Persona(String nom, int anio, String fecha, int DNI, char genero, double pesoOb, double alturaOb) {
		nombre = nom;
		edad = anio;
		fechaNacimiento = fecha;
		dni = DNI;
		sexo = genero;
		peso = pesoOb;
		altura = alturaOb;
	}
	public void setModiAlturaPeso(double pesoN, double alturaN) {
		peso = pesoN;
		altura = alturaN;
	}
	public void setModiSexo(char sexoN) {
		sexo = sexoN;
	}
	public void setModiFecha(String fechaN) {
		fechaNacimiento=fechaN;
	}
	public void setModiNombre(String nombreN) {
		nombre=nombreN;
	}
	public void setModiEdad(int edadN) {
		edad=edadN;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getDni() {
		return dni;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	public double getMasaCorporal() {
		return peso / (altura * altura);
	}
	public boolean getEstaEnForma() {
		double masa = getMasaCorporal();
		return masa >= 18.5 && masa <=25;
	}
	public boolean getEsmayor() {
		return edad >= 18;
	}
	public boolean getPuedeVotar() {
		return edad >= 16;
	}
	public String getInfoGeneral() {
		String info = "El nombre es " + getNombre() + " tiene " + getEdad() + " anios, nacio el " + getFechaNacimiento() + " pesa " + getPeso() + "kg, mide " + getAltura() + "mts"; 
		return info;
	}
	
}
