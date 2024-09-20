package TP5EJ6;

public class Principal {
	public static void main(String[] args) {
		Provincia bsas = new Provincia("Buenos Aires");
		Ciudades tandil = new Ciudades("Tandil", 100, 300, 1 );
		Ciudades mdp = new Ciudades("MarDelPlata", 100000, 300, 20 );
		Contribuyente n001 = new Simple("pepe");
		Contribuyente n002 = new Simple("pepe");
		Contribuyente n003 = new Simple("pepe");
		Contribuyente n004 = new Comerciante("pepe", 100);
		Contribuyente n005 = new Comerciante("pepe", 1000);
		Contribuyente n007 = new Comerciante("pepe", 10000);
		Contribuyente n006 = new Programador("pepe", 1000);
		Contribuyente n008 = new Programador("pepe", 1000);
		Contribuyente n009 = new Programador("pepe", 1000);
		tandil.setContribuyente(n009);
		tandil.setContribuyente(n007);
		tandil.setContribuyente(n003);
		
		bsas.setCiudades(mdp);
		bsas.setCiudades(tandil);
		System.out.println(tandil.getRecudado());
		//System.out.println(tandil.getGastosMantenimiento());
		//System.out.println(mdp.getRecudado());
		//System.out.println(bsas.getCiudadesGastanMasQueRecaudan());
		
		
	
	
	
	}
}
