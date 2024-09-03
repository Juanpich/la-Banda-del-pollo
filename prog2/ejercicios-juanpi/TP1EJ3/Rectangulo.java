package TP1EJ3;

public class Rectangulo {
	int xInfIzq;
	int yInfIzq;
	int xSupDer;
	int ySupDer;
	int base;
	int altura;
	public Rectangulo(int xInfIzq, int yInfIzq, int xSupDer, int ySupDer  ) {
		this.xInfIzq = xInfIzq;
		this.yInfIzq = yInfIzq;
		this.xSupDer = xSupDer;
		this.ySupDer = ySupDer;
		base = getBase();
		altura = getAltura();
	}
	public void setNuevoPunto(int x, int y) {
		this.xSupDer = x;
		this.ySupDer = y;
		ajustarNuevoPunto();
	}
	public void ajustarNuevoPunto() {
		xInfIzq = xSupDer - base;
		yInfIzq = ySupDer - altura;
	}
	public int getAltura() {
		return ySupDer - yInfIzq;
	}
	public int getBase() {
		return xSupDer - xInfIzq;
	}
	public int getArea() {
		return getAltura() * getBase();
	}
	public int getSonIguales(Rectangulo rectangulo) {
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
		return getBase() == getAltura();
	}
	public String getParadoAcostado() {
		int base = getBase();
		int altura = getAltura();
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
		int base = getBase();
		int altura = getAltura();
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
