public class Ejecutar {
    public static void imprimir(Agenda ag1){
        System.out.println(ag1);
    }
    public static void main(String []args){
        //Creo Personas.
        Persona p1=new Persona("JAZMIN", "JAZMIN@GMIAL.COM", 22876553);
        Persona p2=new Persona("JULIA", "JULIA@GMAIL.COM", 345678);
        Persona p3=new Persona("MARIA", "MARIA@GMAIL.COM", 3456789);

        //Creo Reunion.
        Reunion r1=new Reunion("TANDIL", "POLITICA", 3.5);

        //Agrego participantes a la reunion.
        r1.participantes.add(p1);
        r1.participantes.add(p2);
        r1.participantes.add(p3);

        //Creo agenda.
        Agenda ag1=new Agenda();

        //Agrego reunion a la agenda.
        ag1.reuniones.add(r1);

        //Imprimo todos los datos de Agenda.
        ag1.imprimirDatosAgenda();
        System.out.println("  ");

        //Imprimo Tostring de Persona.
        System.out.println(p1);
        System.out.println("  ");

        //Imprimo toString de Reunion.
        System.out.println(r1);
        System.out.println("  ");

        //Imprimo toString de Agenda.
        System.out.println(ag1);
        System.out.println("  ");

    }
}
