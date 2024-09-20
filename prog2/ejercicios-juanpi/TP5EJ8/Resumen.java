package TP5EJ8;

public class Resumen extends TrabajoPractico {

	public Resumen(String nombre) {
		super(nombre);
	}
	public void asignarEvaluador(Evaluador eva) {
			if(eva != null) {
				if(this.sePuedeAsiganrEvaluador(eva))
					eva.agregarTrabajo(this);
			}	
	}
	public boolean sePuedeAsiganrEvaluador(Evaluador eva) {
		if(eva != null) {
			int pos = 0;
			while (pos < this.palabrasClaves.size() && eva.contieneCualidad(this.palabrasClaves.get(pos))){
				pos++;
			}
			if(pos == this.palabrasClaves.size())
				return true;
			else
				return false;
		}else
			return false;
	}
		

}


