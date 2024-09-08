public class Ejecutar {
    public static void imprimirSerie(Serie serie){
        System.out.println(serie);
        System.out.println("  ");
    }
    public static void imprimirTemporada(Temporada temp){
        System.out.println(temp);
        System.out.println("  ");

    }
    public static void main(String []args){
        Serie serie1=new Serie(1, "La vida es bella", "tatatatta", "jaz", "drama");
        Temporada temp1=new Temporada(2,"El amor");
        Episodio ep1=new Episodio("El inicio", "tatatata", true, 5);
        Episodio ep2=new Episodio("El fin", "tatatatata", false, -3);
        Temporada temp2=new Temporada(3,"El odio");
        Episodio ep3=new Episodio("El uno", "tatatata", true, 5);
        Episodio ep4=new Episodio("El dos", "tatatatata", true, -2);
        Episodio ep5=new Episodio("El tres", "tatatatata", false, -1);

        temp1.episodios.add(ep1);
        temp1.episodios.add(ep2);
        temp2.episodios.add(ep3);
        temp2.episodios.add(ep4);
        temp2.episodios.add(ep5);

        serie1.temporadas.add(temp1);
        serie1.temporadas.add(temp2);
        imprimirSerie(serie1);
        imprimirTemporada(temp1);
        imprimirTemporada(temp2);
        System.out.println(ep1.visto());
        System.out.println(ep2.visto());
        System.out.println(ep3.visto());
        System.out.println(ep4.visto());
        System.out.println(ep5.visto());



    
    
    
    
    }

}
