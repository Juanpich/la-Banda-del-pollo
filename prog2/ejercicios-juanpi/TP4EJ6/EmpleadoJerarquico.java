package TP4EJ6;

import java.util.ArrayList;

public class EmpleadoJerarquico extends Empleado {
	private ArrayList<Empleado> empleadosACargo;

	
	
	public EmpleadoJerarquico(String nombre, String apellido, int edad, int legajo, double sueldo) {
		super(nombre, apellido, edad, legajo, sueldo);
		this.empleadosACargo =new ArrayList<Empleado>();
	}

	public ArrayList<Empleado> getEmpleadosACargo() {
		return empleadosACargo;
	}

	public void setEmpleadosACargo(Empleado emp){
		this.empleadosACargo.add(emp);
	}
	public String getInfo() {
		String aDevolver = super.getInfo() + '\n' + "Como es empleado jerarquico tiene a cargo a los empleados: " + '\n';
		for(int i = 0; i < this.empleadosACargo.size(); i++) {
			if(this.empleadosACargo.get(i) != null) {
				aDevolver += "-Legajo nro:" +this.empleadosACargo.get(i).getLegajo() + '\n';
			}
		}
		return aDevolver;
	}
	
}
