package TP5EJ5;

import java.util.ArrayList;
import java.util.Scanner;

public class Cereal {
	private ArrayList<String>minerales;
	public Cereal() {
		this.cargarMinerales();
		
	}
	public ArrayList<String> getMinerales(){
		return new ArrayList<String>(this.minerales);
	}
	public boolean loteApto(Lote lot) {
		boolean losEncontre = true;
			int i = 0;
			while( i < this.getMinerales().size() && losEncontre) {
				int j= i;
				boolean esta=false;
				while(j < lot.getMinerales().size() && !esta) {
					if(this.getMinerales().get(i).equals(lot.getMinerales().get(j))) {
						esta = true;
					}
					j++;
				}
				if(!esta) {
					losEncontre= false;
				}
				i++;
			}	
		return losEncontre;
	}
	public void cargarMinerales() {
		this.minerales = new ArrayList<String>();
		
		System.out.println("Cargar cualidades para el cereal");
		String aux = "";
		boolean sigo = true;
		while(sigo) {
			try {
				Scanner scanner = new Scanner(System.in);
					System.out.println("Ingrese un mineral:");
					aux = scanner.nextLine();
					this.minerales.add(aux);
					aux ="";
					System.out.println("Desea seguir avanzando si = true, no = false:");
					sigo = scanner.nextBoolean();
				
			}catch(Exception exc) {
				System.out.println(exc);	
			}
		}
	}
}
