package TP1EJ3;

public class RectanguloNuevo {
	int x1;
	int y1;
	int base;
	int altura;
	char direccionAltura;
	char direccionBase;
	int x2;
	int y2;
	public RectanguloNuevo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.base = getBase();
		this.altura = getAltura();
	}
	public RectanguloNuevo(int x, int y, int base, int altura, char direccionAltura, char direccionBase) {
		this.x1 = x;
		this.y1 = y;
		this.base = base;
		this.altura = altura;
		this.direccionAltura = direccionAltura;
		this.direccionBase = direccionBase;
		determinarRectangulo();
	}
	public void determinarRectangulo() {
		switch(direccionAltura) {
		case 's': 
			y2 = y1 + altura;
			break;
		case 'i':
			y2 = y1 - altura;
			;break;
		default: System.out.println("La letra ingresada para la direccion de la altura no es correcta, Ingrese i(inferior) y s(superior)");
		}
		switch(direccionBase) {
		case 'd': 
			x2 = x1 + base;
			;break;
		case 'i': 
			x2 = x1 - base;
			;break;
		default: System.out.println("La letra ingresada para la direccion de la base no es correcta, Ingrese i(izquierda) y d(derecha)");
		}
	}
	public char getDireccionBase() {
		if(x1 > x2) {
			return 'i';
		}else
			return 'd';
	}
	public char getDireccionAltura() {
		if(y1 > y2)
			return 'i';
		else
			return 's';
	}
	public int getXFaltante() {
		return x2;
	}
	public int getYFaltante() {
		return y2;
	}
	public int getAltura() {
		altura= y1 - y2;
		if(altura >= 0)
			return altura;
		else 
			return altura * -1;

	}
	public int getBase() {
		base= x1 - x2;
		if(base >= 0)
			return base;
		else 
			return base * -1;
					
	}
	public int getArea() {
		return base * altura;
	}
	public int getSonIguales(RectanguloNuevo rectangulo) {
		int areaOtroRect= rectangulo.getArea();
		int areaEsteRect = getArea();
		if(areaEsteRect > areaOtroRect) {
			return 1;
		}else {
			if(areaOtroRect > areaEsteRect ) {
				return -1;
			}else
				return 0;
		}
	}
	public boolean getEsUnCuadrado() {
		return base == altura;
	}
	public String getParadoAcostado() {
		if(base > altura) {
			return "Esta acostado";
		}else {
			if(altura > base) {
				return "Esta parado";
			}else {
				return "Sus lados son iguales";
			}
		}
	}
	public int getLadoMasLargo() {
		if(base > altura) {
			return base;
		}else {
			if(altura > base)
				return altura;
			else 
				return -1;
		}
	}


}
