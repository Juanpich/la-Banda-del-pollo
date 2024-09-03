package TP3EJ1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Encuesta {
	String [] preguntas;
	public Encuesta(int limite) {
		this.preguntas= new String [limite];
		this.setPreguntas(limite);
	}
	public void setPreguntas(int limite) {
		System.out.println("Encuesta");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int pos=0;
		while(pos < limite ) {
			try {
				System.out.print("Ingrese su pregunta " + (pos+1) + ":");
				preguntas[pos]= entrada.readLine();
				pos++;
			}catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}
}
