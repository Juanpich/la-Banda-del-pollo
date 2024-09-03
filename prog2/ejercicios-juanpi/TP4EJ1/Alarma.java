package TP4EJ1;

public class Alarma {
	boolean seAbrioAbertura;
	boolean seRompioVidrio;
	boolean seDetectaMovimiento;
	
	public Alarma(boolean seAbrioAbertura, boolean seRompioVidrio, boolean seDetectaMovimiento) {
		this.seAbrioAbertura = seAbrioAbertura;
		this.seRompioVidrio = seRompioVidrio;
		this.seDetectaMovimiento = seDetectaMovimiento;
		this.detectarConflictos();
		
	}
	
	public boolean getSeAbrioAbertura() {
		return seAbrioAbertura;
	}
	public void setSeAbrioAbertura(boolean seAbrioAbertura) {
		this.seAbrioAbertura = seAbrioAbertura;
		this.detectarConflictos();
	}
	public boolean getSeRompioVidrio() {
		return seRompioVidrio;
	}
	public void setSeRompioVidrio(boolean seRompioVidrio) {
		this.seRompioVidrio = seRompioVidrio;
		this.detectarConflictos();
	}
	public boolean getSeDetectaMovimiento() {
		return seDetectaMovimiento;
	}
	public void setSeDetectaMovimiento(boolean seDetectaMovimiento) {
		this.seDetectaMovimiento = seDetectaMovimiento;
		this.detectarConflictos();
	}
	public boolean detectarConflictos() {
		if(seAbrioAbertura == false && seRompioVidrio == false && seDetectaMovimiento == false) {
			return false;
		}else {
			return true;
		}
	}
	
	
}
