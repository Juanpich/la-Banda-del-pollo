package TP2EJ1;
public class Serie {
   int CantTemporadas;
   String titulo;
   String genero;
   String descripcion;
   String creador;
   Temporada[] temporadas;

   public Serie(String nombre, String genero, String descripcion, String creador, int CantTemporadas) {
      this.titulo = nombre;
      this.genero = genero;
      this.descripcion = descripcion;
      this.creador = creador;
      this.temporadas = new Temporada[CantTemporadas];
      this.CantTemporadas = CantTemporadas;
   }
//solicitudes a serie
   // dar cantidad de temporadas
   public int getCantTemporadas() {
      int temp = 0;
      for (int i = 0; i < temporadas.length; i++) {
         temp++;
      }
      return temp;
   }

   // otener la cantidad de episodios totales de toda la serie
   public int getCantidadEpisodiosTotales() {
      int total = 0;
      for (int i = 0; i < CantTemporadas; i++) {
         total += temporadas[i].getCantEpisodiosTemporada();
      }
      return total;
   }

    // obtener el promedio de calificacion de todos los episodios de la serie
    public double getObtenerPromedioCalificacionTotal() {
      double total = 0;
      for (int i = 0; i < CantTemporadas; i++) {
         total += temporadas[i].getObtenerPromedioCalificacion();
      }
      return total / CantTemporadas;
   }

   // retornar el titulo
   public String getTitulo() {
      return titulo;
   }

   // retornar el genero
   public String getGenero() {
      return genero;
   }

   // retornar descripcion
   public String getDescripcion() {
      return descripcion;
   }

// Solicitudes a temporadas
   // obtener cantidad de episodios vistos de la temporada
   public int getEpisodiosVistosDeTemp(int temp) {
      temp--;
      return temporadas[temp].getEpisodiosVistosEnTemp();
   }

   // obtener la cantidad de episodios de la temporada recibida parametro
   public int getCantEpisodiosDeTemp(int temp) {
      temp--;
      return temporadas[temp].getCantEpisodiosTemporada();
   }

   // obtiene el promedio de claificacion de la temporada que se pasa por parametro
   public double getObtenerPromedioCalificacioTemp(int temp) {
      temp--;
      return temporadas[temp].getObtenerPromedioCalificacion();
   }

   // cargar una nueva tempoprada con cantidad de episodios
   public void setNuevaTemporada(int cantEpisodio) {
      int pos = -1;
      int i = 0;
      while (i < CantTemporadas && pos == -1) {
         if (temporadas[i] == null) {
            pos = i;
         }
         i++;
      }
      temporadas[pos] = new Temporada(cantEpisodio);
   }

// Solicitudes a episodios
   // obtener la descripcion de el episodio de la temporada que se pasa por paraetro
   public String getDescripcionTempEpi(int temp, int epi){
      temp--;
      epi--;
      return temporadas[temp].getDescripcionEpi(epi);
   }
   // obtener el titulo del episodio de la temporada que se pasan por parametro
   public String getTituloTempEpi(int temp, int epi) {
      temp--;
      epi--;
      return temporadas[temp].getTituloEpisodio(epi);
   }
   
   // obtener la clasificacion de un episodio de la temporada pasada por parametro
   public int getCalificacionTemEpi(int temp, int epi) {
      temp--;
      epi--;
      return temporadas[temp].getCalificacionEpi(epi);
   } 

   //cargar una descripcion de un episodio de una temporada pasada por parametro
   public void setDescripcionTempEpi(int temp, int epi, String descripcion ){
      temp--;
      epi--;
      temporadas[temp].setDescripcionEpi(epi, descripcion);
   }
   // cargar un nuevo episodio en la tempordada dicha por parametro
   public void setNuevoEpisodio(int temp, String titulo, String descripcion, boolean visto, int calificacion) {
      temp--;
      temporadas[temp].setCargarNuevoEpisodio(titulo, descripcion, visto, calificacion);
   }

   // cargar la puntuacion de un episodio
   public void setPuntuacionVistoTemporadaEpisodio(int temp, int epi, int califica, boolean visto) {
      temp--;
      epi--;
      temporadas[temp].setPuntuacionVistoEpisodio(epi, califica, visto);
   }
 
}
