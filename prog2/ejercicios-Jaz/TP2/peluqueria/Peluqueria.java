import java.util.ArrayList;

public class Peluqueria{
    ArrayList<Cliente> conBeneficio = new ArrayList<Cliente>();

    public Peluqueria(){
    }

    public void aplicarBeneficio(Cliente c){
        if (c.getTurnosOtorgados()>4){
            conBeneficio.add(c);
        }
    }
    public static void main(String []args){

        Peluqueria pelu1= new Peluqueria();

        //crear 4 peluqueros.
        Peluquero p1= new Peluquero("Jazmin", 4);
        Peluquero p2= new Peluquero("Julia", 6);
        Peluquero p3= new Peluquero("Mario", 3);
        Peluquero p4= new Peluquero("Mirta", 5);


        //crear turnos.
        Turno t1=new Turno(19.00, "fecha1", p1);
        Turno t2=new Turno(11.00, "fecha2", p1);
        Turno t3=new Turno(20.00, "fecha3", p2);
        Turno t4=new Turno(16.00, "fecha4", p2);
        Turno t5=new Turno(12.00, "fecha5", p3);
        Turno t6=new Turno(13.00, "fecha6", p3);
        Turno t7=new Turno(17.00, "fecha7", p4);
        Turno t8=new Turno(18.00, "fecha8", p4);



        //crear cliente.
        Cliente c1=new Cliente ("Jose", t1);

        //se agrega el turno a los turnos del peluquero si tiene disponibilidad.
        System.out.println(p1.asignarTurno(t1, c1));
        System.out.println(p1.asignarTurno(t2, c1));
        System.out.println(p2.asignarTurno(t3, c1));
        System.out.println(p2.asignarTurno(t4, c1));
        System.out.println(p3.asignarTurno(t5, c1));
        System.out.println(p3.asignarTurno(t6, c1));
        System.out.println(p4.asignarTurno(t7, c1));
        System.out.println(p4.asignarTurno(t8, c1));

        //consultar cuantos turnos disponibles le quedan al peluquero.
        System.out.println(p1.getTurnosDisponibles());
        System.out.println(p2.getTurnosDisponibles());
        System.out.println(p3.getTurnosDisponibles());
        System.out.println(p4.getTurnosDisponibles());

        pelu1.aplicarBeneficio(c1);
        System.out.println(c1.getTurnosOtorgados());
        System.out.println(pelu1.conBeneficio.get(0).getNombre());


    }
}