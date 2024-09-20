package TP6EJ4;


public class SistemaControl {
	protected ColaElementos elementoPrinc;
	protected ColaElementos elementoSecun;
	public SistemaControl() {
		this.elementoPrinc = new ColaElementos();
		this.elementoSecun = new ColaElementos();
	}
	public void agregarPrincipal(Elemento proc) {
		if(proc != null) 
			this.elementoPrinc.agregar(proc);	
	}
	public void agregarSecundario(Elemento proc) {
		if(proc != null) 
			this.elementoSecun.agregar(proc);	
	}
	
	public void ejecutar() {
		if(this.elementoPrinc.getCantElementos() > 0 && this.elementoSecun.getCantElementos() > 0) {
				this.elementoPrinc.removerPrimero();
				this.elementoSecun.removerPrimero();
			}
		
	}
	public void ejecutarTodos() {
		int i = 0;
		while(i < this.elementoPrinc.getCantElementos() && this.elementoPrinc.getCantElementos() > 0 && this.elementoSecun.getCantElementos() > 0) {
			this.ejecutar();
			i++;
		}
	}
	
	public String getListaPrincipal() {
		return this.elementoPrinc.getLista();
	}
	public String getListaSecundario() {
		return this.elementoSecun.getLista();
	}
	public String getListaElemntosEnCola() {
		return this.getListaPrincipal() + this.getListaSecundario();
	}
}
