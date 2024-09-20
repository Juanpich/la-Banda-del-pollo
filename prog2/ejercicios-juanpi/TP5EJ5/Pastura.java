package TP5EJ5;



public class Pastura extends Cereal {
	private static int minHectareas = 50;
	public Pastura() {
		super();
	}
	
	public static int getMinHectareas() {
		return minHectareas;
	}

	public static void setMinHectareas(int minHectareas) {
		Pastura.minHectareas = minHectareas;
	}
	public boolean loteApto(Lote lot) {
		boolean losEncontre = true;
		if(lot.getHectareas() >= this.minHectareas) {
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
			}
		}else {
			losEncontre = false;
		}
		
		return losEncontre;
	}
}
	
