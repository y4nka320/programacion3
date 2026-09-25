package Programacion3.MiniProyecto;

import java.util.Scanner;

public class Pelicula 
{
    private String nombre;
    private String idioma;
    private String tipoProyeccion;
    private int duracionMinutos;

    public Pelicula(String pNombre, String pIdioma, String pTipoProyeccion, int pDuracionMinutos )
    {
        nombre = pNombre;
        idioma = pIdioma;
        tipoProyeccion = pTipoProyeccion;
        duracionMinutos = pDuracionMinutos;
    }

    public String getNombre() {return nombre; }
    public String getIdioma () {return idioma;}
    public String getTipo() {return tipoProyeccion;}
    public int getDuracionMinutos() {return duracionMinutos;}

    public void mostrarInfo()
    {
        System.out.println("Titulo: " + nombre + "\nIdioma: " + idioma + "\ntipo: " + tipoProyeccion + "\nDuracion: " + duracionMinutos + " min");
    }

    public static Pelicula solicitarDatos(Scanner scanner)
    {
        scanner.nextLine();

        System.out.println("Nombre de la pelicula: ");
    }

}
