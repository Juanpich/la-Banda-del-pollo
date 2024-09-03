package TP2EJ1;
public class principal {
    public static void main(String[] args) {
        Serie serie1 = new Serie("elite", "Accion", "estudiantes en una escuela", "netflic", 2);
        serie1.setNuevaTemporada(2);
        serie1.setNuevaTemporada(3);
        serie1.setNuevoEpisodio(1,"Llego la hora", "llego la hora de la mueerte de las personas etc", false, 0);
        serie1.setNuevoEpisodio(1,"si esta", " etc", false, 0);
        serie1.setNuevoEpisodio(2, "fallecio", "acccidente", false, 5);
        serie1.setNuevoEpisodio(2, "fallecio", "acccidente", false, 0);
        serie1.setNuevoEpisodio(2, "fallecio", "acccidente", false, 0);
        System.out.println(serie1.getCalificacionTemEpi(2, 1));
        serie1.setPuntuacionVistoTemporadaEpisodio(1,1, 3, true);
        serie1.setPuntuacionVistoTemporadaEpisodio(1,2, 3, true);
        serie1.setPuntuacionVistoTemporadaEpisodio(2,1, 3, true);
        serie1.setPuntuacionVistoTemporadaEpisodio(2,2, 1, true);
        serie1.setPuntuacionVistoTemporadaEpisodio(2,3, 3, true);
       
  
    
    }
}