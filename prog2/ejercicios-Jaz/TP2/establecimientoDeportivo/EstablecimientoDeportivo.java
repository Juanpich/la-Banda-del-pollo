public class EstablecimientoDeportivo{
    public static void main (String []args){
        RegistroSocios rS1=new RegistroSocios();
        Cancha canchaUs1= new Futbol();
        Cancha canchaUs2= new Paddle();



        Turno t1=new Turno("fecha1", 14.00, canchaUs1);
        Turno t2=new Turno("fecha2", 13.00, canchaUs1);
        Turno t3=new Turno("fecha3", 11.00, canchaUs1);
        Turno t4=new Turno("fecha4", 11.00, canchaUs2);

        //retorna si la reserva se pudo hacer o no, segun disponibilidad.
        //agregar el turno al arreglo de turnos si se pudo hacer la reserva.
        System.out.println(canchaUs1.hacerReserva(t1));
        System.out.println(canchaUs1.hacerReserva(t2));
        System.out.println(canchaUs1.hacerReserva(t3));
        System.out.println(canchaUs2.hacerReserva(t4));
        
        Usuario us1=new Usuario("Jazmin", t1,1);
        Usuario us2=new Usuario("Julia", t2,5);

        //imprimir los turnos que tiene la cancha de futbol.
        System.out.println("-----------");
        canchaUs1.getTurnos();

        //imprimir los turnos que tiene la cancha de paddle.
        System.out.println("-----------");
        canchaUs2.getTurnos();
        

        //se verifica si el usuario es socio o no y se SETEA.
        us1.setSocio(rS1.hacerSocio(us1));
        us2.setSocio(rS1.hacerSocio(us2));

        //resultados de ese SET.
        System.out.println("Socio: " + us1.getSocio());
        System.out.println("Socio: " + us2.getSocio());

        //esta funcion recorre el arreglo socios y se fija si el obj esta ahi.
        System.out.println("Socio: " + rS1.esSocio(us1));
        System.out.println("Socio: " + rS1.esSocio(us2));

        //determinar si el Usuario debe pagar como socio o no.
        System.out.println("A pagar: " + canchaUs1.aplicaDescuento(us1));
        System.out.println("A pagar: " + canchaUs2.aplicaDescuento(us2));


       
    }
}