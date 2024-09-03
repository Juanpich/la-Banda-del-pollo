package TP2EJ3;

public class Principal {
	public static void main(String[] args) {
		Provincia bsas = new Provincia("Buenos Aires");
		Ciudades tandil = new Ciudades("Tandil", 100000, 300, 5 );
		Ciudades mdp = new Ciudades("MarDelPlata", 100000, 300, 20 );
		Impuesto imp1 = new Impuesto("Impuesto a la ganacia", 2);
		Impuesto imp2 = new Impuesto("abl", 3);
		Impuesto imp3 = new Impuesto("agua", 1);
		Impuesto imp4 = new Impuesto("luz", 7);
		Impuesto imp5 = new Impuesto("gas", 6);
		mdp.cargarImpuesto(imp4);
		mdp.cargarImpuesto(imp3);
		mdp.cargarImpuesto(imp2);
		mdp.cargarImpuesto(imp1);
		bsas.setCiudades(mdp);
		tandil.cargarImpuesto(imp4);
		tandil.cargarImpuesto(imp1);
		tandil.cargarImpuesto(imp5);
		bsas.setCiudades(tandil);
		System.out.println(tandil.getRecudado());
		System.out.println(mdp.getRecudado());
		System.out.println(bsas.getCiudadesGastanMasQueRecaudan());
		
		
	
	
	
	}
}
