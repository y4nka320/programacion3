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

        System.out.print("Nombre de la pelicula: ");
        String nombreIngresado = scanner.nextLine();

        System.out.print("Idioma: ");
        String idiomaIngresado = scanner.nextLine();

        int opcionTipo;
        do
        {
            System.out.println("En que ddormato desea ver la pelicula?: ");
            System.out.println("1. 35mm");
            System.out.println("2. 3D");
            System.out.print("digite su eleccion: ");
            opcionTipo = scanner.nextInt();

            switch (opcionTipo) 
            {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\n °°°Opcion invalida, compruebe su elecion de nuevo°°°");
                    
            }
        } while (opcionTipo != 1 && opcionTipo != 2);
         
            String tipoIngresado = opcionTipo == 1 ? "35mm" : "3D";

            System.out.print("cual es la duracion en minutos de la pelicula: ");
            int duracionIngresada = scanner.nextInt();

            return new Pelicula(nombreIngresado, idiomaIngresado, tipoIngresado, duracionIngresada);
    }

}
