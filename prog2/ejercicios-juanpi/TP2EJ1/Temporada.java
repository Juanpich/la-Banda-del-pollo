package TP2EJ1;
public class Temporada {
    Episodio[] episodios;
    int cantEpisodio;

    public Temporada(int cantEpisodio) {
        this.cantEpisodio = cantEpisodio;
        this.episodios = new Episodio[cantEpisodio];
    }

    // cargar un nuevo episodio
    public void setCargarNuevoEpisodio(String titulo, String descripcion, boolean visto, int calificacion) {
        int pos = -1;
        int i = 0;
        while (i < cantEpisodio && pos == -1) {
            if (episodios[i] == null) {
                pos = i;
            }
            i++;
        }
        if (pos != -1) {
            episodios[pos] = new Episodio(titulo, descripcion, visto, calificacion);
        } else {
            System.out.println("Ya se cargaron todos los episodios de esta temporada");
        }
    }

    // obtenemos la cantidad de episodios de esta temporada
    public int getCantEpisodiosTemporada() {
        return cantEpisodio;

    }

    // obtenemos la cantidad de episodios vistos de etsa temporada
    public int getEpisodiosVistosEnTemp() {
        int total = 0;
        for (int i = 0; i < cantEpisodio; i++) {
            if (episodios[i].getVisto()) {
                total++;
            }
        }
        return total;
    }

    // obtener el promedio de calificacion de la temporada
    public double getObtenerPromedioCalificacion() {
        double total = 0;
        int vistas = 0;
        int temporal = 0;
        for (int i = 0; i < cantEpisodio; i++) {
            temporal = episodios[i].getCalificacion();
            if (temporal >= 1 && temporal <= 5 && episodios[i].getVisto()) {
                vistas++;
                total += temporal;
            }

        }
        return total / vistas;
    }

    // obtenemos el titilo del episodio que le pasamos como parametro
    public String getTituloEpisodio(int epi) {
        return episodios[epi].getTitulo();
    }

    // obtener la calificacion del episodio solicitado
    public int getCalificacionEpi(int epi) {
        return episodios[epi].getCalificacion();

    }

    //obtenemos la descripcion dek episodio solicitado
    public String getDescripcionEpi(int epi){
        return episodios[epi].getDescripcion();
    }

    //sabemos si el episodio solicitado fue visto
    public boolean getVistoEpi(int epi){
        return episodios[epi].getVisto();
    }

    // cargar calificacion de un episodio
    public void setPuntuacionVistoEpisodio(int epi, int califica, boolean visto) {
        episodios[epi].setPuntuacionVisto(califica, visto);
    }

    //cagar descripcion de un episodio 
    public void setDescripcionEpi(int epi, String descripcion){
        episodios[epi].setDescripcion(descripcion);
    }
}
