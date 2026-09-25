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

    public int getFranjaHoraria(){return franjaHoraria;} 
    
    public Pelicula getPeliculaAsignada(){return peliculaAsignada;}

    public boolean tieneAsignacion(){return tieneAsignacion;}

    //aca devuelve el horario en texto a cada franja

    public String getHorarioTexto()
    {
        String horario;
        if(franjaHoraria == 1){
            horario = "14:00 - 16:30";
        }else if(franjaHoraria == 2){
            horario = "16:30 - 19:00";
        }else {
            horario = "19:00 - 21:00";
        }
        return horario;
    }


}
