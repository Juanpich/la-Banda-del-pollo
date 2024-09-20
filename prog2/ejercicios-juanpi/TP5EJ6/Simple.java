package TP5EJ6;

public class Simple extends Contribuyente {
	public Simple(String nombre) {
		super(nombre , 10);
	}
	public double getPaga(double sueldo) {
		 return (super.getDescuento() / 100) * sueldo;
	}
}
