package TP5EJ5;

import java.util.ArrayList;
import java.util.Scanner;




public class Coperativa {
	private ArrayList<String>minerales;
	public Coperativa() {
		
		this.cargarMinerales();
		
	}
	public void cargarMinerales() {
		this.minerales = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cargar minerales que debe tener el lote para ser especial");
		String aux = "";
		boolean sigo = true;
		while(sigo) {
			try {
					System.out.println("Ingrese un mineral:");
					aux = scanner.nextLine();
					this.minerales.add(aux);
					System.out.println("Desea seguir avanzando si = true, no = false:");
					sigo = scanner.nextBoolean();
				
			}catch(Exception exc) {
				System.out.println(exc);	
			}
		}
	}
	public void esLoteDeInteres(Lote lot) {
		if(lot.getMinerales().size() >= this.minerales.size()) {
			boolean losEncontre = true;
			int i = 0;
			while( i < this.minerales.size() && losEncontre) {
				int j= i;
				boolean esta=false;
				while(j < lot.getMinerales().size() && !esta) {
					if(this.minerales.get(i).equals(lot.getMinerales().get(j))) {
						esta = true;
					}
					j++;
				}
				if(!esta) {
					losEncontre= false;
				}
				i++;
			}
			lot.setEsLoteEspecial(losEncontre);
		}
	}
}
