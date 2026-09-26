package Programacion3.MiniProyecto;

import java.util.Scanner;

public class CinemaStar
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);

        Pelicula[] peliculaRegistrada = new Pelicula[20];
        int cantidadPeliculas = 0;

        Sala[] salas = new Sala[3];
        salas[0] = new Sala(1);
        salas[1] = new Sala(2);
        salas[2] = new Sala(3);

        int opcion = 0;
        do
        {
            System.out.println("\n-----CinemaStar-----"
                                +  "\n 1. crear o ver peliculas disponibles"
                                + "\n 2. asignar funciones"
                                + "\n 3. Modulo de ventas"
                                + "\n 4. salir"
                                + "\n seleccione una opcion: "
            );
            opcion = scanner.nextInt()
        }

    }
    
}
