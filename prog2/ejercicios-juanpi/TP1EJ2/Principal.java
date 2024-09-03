package TP1EJ2;

public class Principal {
	public static void main(String[] args) {
		Electrodomestico Electro1 = new Electrodomestico("heladera", 700000, "Blanco perla", 45, 130 );
		boolean EsBajoConsumo = Electro1.getEsBajoConsumo();
		String nombreElectro = Electro1.getNombre();
		System.out.println("El electrodomestico " + nombreElectro + " es bajo consumo " + EsBajoConsumo);
		double balance = Electro1.getBalance();
		System.out.println("El balance de " + nombreElectro + " es de " + balance);
		boolean esAltaGama = Electro1.getEsAltaGama();
		System.out.println("El producto " + nombreElectro + " es alta gama " + esAltaGama);
	}

}
