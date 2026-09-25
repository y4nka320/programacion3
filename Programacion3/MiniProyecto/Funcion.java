package Programacion3.MiniProyecto;

public class Funcion
{
    private int franjaHoraria; // si es e la franja 1, 2 o 3
    private Pelicula peliculaAsignada; 
    private boolean tieneAsignacion;

    public Funcion (int pFranjaHoraria)
    {
        franjaHoraria = pFranjaHoraria;
        peliculaAsignada = null;
        tieneAsignacion = false;
    }

    
}
