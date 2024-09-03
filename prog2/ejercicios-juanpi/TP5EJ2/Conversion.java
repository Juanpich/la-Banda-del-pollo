package TP5EJ2;

public class Conversion {
	private static double convLitros = 3.78541;
	private static double convCm = 2.54;
	private static double convKg = 0.453592;
	private double aConvertir;
	private String queConvierto;
	public Conversion(String queConvierto, double aConvertir) {
		this.queConvierto = queConvierto;
		this.aConvertir = aConvertir;
	}
	
	public double getaConvertir() {
		return aConvertir;
	}

	public void setaConvertir(double aConvertir) {
		this.aConvertir = aConvertir;
	}

	public String getQueConvierto() {
		return queConvierto;
	}

	public void setQueConvierto(String queConvierto) {
		this.queConvierto = queConvierto;
	}

	public String getConversion() {
		String result= "";
		switch(this.queConvierto) {
		case"litros": 
			result = this.getaConvertir() + " litros son: " + this.aConvertir/convLitros + " galones"; 
			break;
		case"galones":
			result =  this.getaConvertir() + " galones son: " + this.aConvertir*convLitros + " litros"; 
			break;
		case"pulgadas":
			result = this.getaConvertir() + " pulgadas son: " + this.aConvertir*convCm + " cm"; 
			break;
		case"cm":
			result =  this.getaConvertir() + " cm son: " + this.aConvertir/convCm + " pulgadas"; 
			break;
		case"kg":
			result =  this.getaConvertir() + " kg son: " + this.aConvertir/convKg + " libras"; 
			break;
		case"libras":
			result =  this.getaConvertir() + " libras son: " + this.aConvertir*convKg + " kg"; 
			break;
		default:
			result =  "lo que desea convertir no se puede";
		}
		return result;
	}
}
	
	
