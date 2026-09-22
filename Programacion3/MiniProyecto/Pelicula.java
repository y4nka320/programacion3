package Programacion3.MiniProyecto;

public class Pelicula 
{
    private String nombre;
    private String idioma;
    private String tipo;
    private int duracionMinutos;

    public Pelicula(String nom, String idio, String tip, int minutos )
    {
        nombre = nom;
        idioma = idio;
        tipo = tip;
        duracionMinutos = minutos;
    }

    public String getNombre() {return nombre; }
    public String getIdioma () {return idioma;}
    public String getTipo() {return tipo;}
    public int getDuracionMinutos() {return duracionMinutos;}

    public void mostrarInformacion()
    {
        System.out.println("Titulo: " + nombre + " | Idioma: " + idioma + " | tipo: " + tipo + " | Duracion: " + duracionMinutos + " min");
    }

}
