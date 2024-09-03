package TP3EJ2;

public class Principal {

	public static void main(String[] args) {
		Muebleria azul = new Muebleria();
		Mueble aaa = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aab = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aac = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aad = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aae = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aaf = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aag = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aah = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aai = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aaj = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aak = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aal = new Mueble("silla", "caoba", "pino", 12.5, 1);
		Mueble aam = new Mueble("mesa", "caoba", "pino", 12.5, 1);
		azul.cargarMueble(aam);
		azul.cargarMueble(aal);
		azul.cargarMueble(aak);
		azul.cargarMueble(aaj);
		azul.cargarMueble(aai);
		azul.cargarMueble(aah);
		azul.cargarMueble(aag);
		azul.cargarMueble(aaf);
		azul.cargarMueble(aae);
		azul.cargarMueble(aad);
		azul.cargarMueble(aac);
		azul.cargarMueble(aab);
		azul.cargarMueble(aaa);
		aam.setPorcentajeVenta(10);
		System.out.println(aam.getValorVenta());
		System.out.println(azul.getCantidadDe("silla"));
		System.out.println(azul.getCostoFabricaccionDeTodos());
		System.out.println(azul.getCostoVentaDeTodos());
	}

}
