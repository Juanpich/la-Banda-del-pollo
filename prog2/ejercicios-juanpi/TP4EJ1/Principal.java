package TP4EJ1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Principal {

	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(false, false, false);
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		boolean consultar =false;
		while(!consultar) {
			try {
				System.out.println("Ingres true o false para la rotura de vidrio");
				boolean aux = Boolean.valueOf(entrada.readLine());
				alarma1.setSeRompioVidrio(aux);
				System.out.println("Ingres true o false para la aberura de aberturas ");
				aux = Boolean.valueOf(entrada.readLine());
				alarma1.setSeAbrioAbertura(aux);
				System.out.println("Ingres true o false si se detecta movimiento");
				aux = Boolean.valueOf(entrada.readLine());
				alarma1.setSeDetectaMovimiento(aux);
				boolean estaTodoOk = alarma1.detectarConflictos();
				if(estaTodoOk) {
					AlarmaLuminosa conflictos = new AlarmaLuminosa();
					conflictos.encenderAlarma(estaTodoOk);
					consultar = true;
				}else {
					System.out.println("Esta todo bien");
				}
			}catch(Exception exc) {
				
			}
			

		}
		

	}

}
