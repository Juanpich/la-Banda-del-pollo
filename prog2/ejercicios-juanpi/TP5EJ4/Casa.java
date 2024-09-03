
package TP5EJ4;



import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
	private ArrayList<String> cualidades;
	private int cantMaxAlumnos;
	private ArrayList<Alumno> alumnos;
	private Casa enemistades;
	private boolean tieneQueTenerSangre;
	public Casa( int cantMaxAlumnos, Casa enemistades, boolean tieneQueTenerSangre) {
		
		this.cantMaxAlumnos = cantMaxAlumnos;
		this.alumnos = new ArrayList<Alumno>();
		this.enemistades = enemistades;
		this.tieneQueTenerSangre = tieneQueTenerSangre;
		this.cargarCualidades();
	}
	public void cargarAlumno(Alumno alum) {
		if(this.cumpleeCondicionesAcargar(alum)) {//verifica si se pude agegar por las concidiocnes de la casa
			
			if(this.enemistades == null) {//vemos si tiene enemistad, si esd null carga al alumno
				System.out.println("Se cargo al alumno perfectamente");
				this.alumnos.add(alum);
			}else {//si tiene vemos si se cumplen los requisitos 
				if(this.enemistades.comprobarCualidades(alum)) {
					System.out.println("la persona no se puede cargar debido a la enemidad");
					
				}else {
					System.out.println("Se cargo al alumno perfectamente");
					this.alumnos.add(alum);
				}
			}	
		}else {
			System.out.println("El alumno no se puede cargar porue alguna condicion no se cumple o no ahi mas lugar");
		}
	}
	private boolean cumpleeCondicionesAcargar(Alumno alum) {
		if(this.alumnos.size()<this.cantMaxAlumnos) {//vemos si ahi lugar para agregar mas alumnos
			
			
			
			if(alum.getDisponible()) {//vemos si esta disponible 
				
				
				
				if(this.comprobarCualidades(alum)) {//vemos las cualidades
					
					
					
					if(this.tenerSangre(alum)) {//comprobamos si la casa pide que tenga sangre, si tiene vemos si se puede agregar
					
						
						return true;//si se cumplen todas las condiciones debuelve true
					}
				}
			}
		}
		return false;//si no se cumple alguna condicion debuelve false
		
	}
	private boolean tenerSangre(Alumno alum) {
		
		if(this.tieneQueTenerSangre) {//si es true va a buscar a alguno con sangre
			
			int pos=0;
			boolean tieneFamiliar= false;
			
			while(pos < alum.getFamiliares().size() && !tieneFamiliar) {//recorre las famlias de el alumno que quiere entrar
				
				int aux = 0;
				boolean esFamiliar = false;
				if(this.alumnos.size() == 0) {//si es la unica persona no se recorre si es la unica perosna
					esFamiliar = true;
					System.out.println("Es la primer persona en cargarse");
				}
				while(aux < this.alumnos.size() && !esFamiliar) {//recorremos los alumnos de la casa 
					
					if(alum.getFamiliares().get(pos) == this.alumnos.get(aux)) { //si algun alumno esta en la lista de familiares de el alumno retorna true 
						esFamiliar=true;
						
					}
					aux++;
				}
				if(!esFamiliar) {//si no encontro familiar suma una pos
					pos++;
				}else {// si encontro el familiar hace a tieneFamiliar = true y sale del while
					tieneFamiliar = true;
				}
			}
			return tieneFamiliar;
			
		}else {
			return true;//retorna true para que se pueda seguir ejecutando 
		}
	}
	private boolean comprobarCualidades(Alumno alum) {
		ArrayList<String> cualidadesotro = alum.getCualidades();
		if(this.cualidades.size() <= cualidadesotro.size()) {//compara que la perosna tenga la misma o mas cualidades que la casa  
			int pos =0;
			boolean estan = true;
			while(pos < this.cualidades.size() && estan) {// itermaos para saber la pos de las cualidades de la casa
				int aux = 0;
				boolean iguales = false;
				while(aux < cualidadesotro.size() && !iguales) {//iteramos para saber la cualidades del alumno
					if(cualidadesotro.get(aux).equals(this.cualidades.get(pos))) {// si las cualidades son iguales sale del while y cambia de cualidadd
						iguales = true;
					}
					aux++;
				}
				if(iguales) {//si son igules va a aumentar
					pos++;
				}else {//de lo contrario va a salir del while retornando false
					estan = false;
				}

			}
			return estan;
		}else {//si la cantidad de cualidades de la casa son mayor sale por aca 
			return false;
		}
	}
	
	private void cargarCualidades() {
		this.cualidades = new ArrayList<String>();
		//this.cualidades.add("listo");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cargar cualidades para la casa ");
		String aux = "";
		boolean sigo = true;
		while(sigo) {
			try {
					System.out.println("Ingrese una cualidad:");
					aux = scanner.nextLine();
					this.cualidades.add(aux);
					System.out.println("Desea seguir avanzando si = true, no = false:");
					sigo = scanner.nextBoolean();
				
			}catch(Exception exc) {
				System.out.println(exc);	
			}
		}
		
	}
	public int getCantMaxAlumnos() {
		return cantMaxAlumnos;
	}
	public void setCantMaxAlumnos(int cantMaxAlumnos) {
		this.cantMaxAlumnos = cantMaxAlumnos;
	}
	public Casa getEnemistades() {
		return enemistades;
	}
	public void setEnemistades(Casa enemistades) {
		this.enemistades = enemistades;
	}
	public boolean getTieneQueTenerSangre() {
		return tieneQueTenerSangre;
	}
	public void setTieneQueTenerSangre(boolean tieneQueTenerSangre) {
		this.tieneQueTenerSangre = tieneQueTenerSangre;
	}
	
	
	
	
}
