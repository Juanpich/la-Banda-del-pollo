package TP4EJ5;

public class Fresco extends Producto {

	public Fresco(String fechaVencimineto, int nroLote, String fechaEnvasado, String granjaOrigen) {
		super(fechaVencimineto, nroLote, fechaEnvasado, granjaOrigen);
	}
	public String getInfoCompleta() {
		return "Este producto fresco" + super.getInfoCompleta() ;
	}
}
