package TP3EJ4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaContactos agen = new AgendaContactos();
		Contacto n001 = new Contacto("juan", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		Contacto n002 = new Contacto("pepe", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		Contacto n003 = new Contacto("juan", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		Contacto n004 = new Contacto("juan", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		Contacto n005 = new Contacto("pablo", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		Contacto n006 = new Contacto("juan", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		Contacto n007 = new Contacto("juan", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		Contacto n008 = new Contacto("juan", "chiclana", 2005, 8, 26, 410526, "Racuh", "juan@gamil.com");
		agen.setContacto(n008);
		agen.setContacto(n001);
		agen.setContacto(n002);
		agen.setContacto(n003);
		agen.setContacto(n004);
		agen.setContacto(n005);
		agen.setContacto(n006);
		System.out.println(agen.getCantContactos());
		agen.setContacto(n007);
		System.out.println(agen.getCantContactos());
		imprimirAgenda(agen.getContactosConMismoNumero());
	}
	public static void imprimirAgenda(ArrayList<Contacto>cont) {
		for(int i = 0; i < cont.size(); i++) {
			System.out.println("Contacto repetido nombre: "+cont.get(i).getNombre() + " apellido: " + cont.get(i).getApellido() + " telefono: "+cont.get(i).getNumTel());
		}
		
	}

}
