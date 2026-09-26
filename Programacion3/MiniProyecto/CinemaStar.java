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
                                + "\n 3. Modulo de ventas"                    //despues reisar si lo cambio
                                + "\n 4. salir"
                                + "\n seleccione una opcion: "
            );
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cantidadPeliculas = menuPeliculas(scanner, peliculaRegistrada, cantidadPeliculas);
                    break;
                case 2:
                    menuFunciones(scanner, salas, peliculaRegistrada, cantidadPeliculas);
                    break;
                case 3:
                    menuVentas(scanner, salas);
                    break;
                case 4:
                    System.out.println("\nGracias por si visita a nuestros cines, hasta pronto");
                    break;
                default:
                    System.out.println("\nOpcion no valida, intentar de nuevo");
            }
        } while (opcion !=4); 

        scanner.close();

    }

    private static int menuPeliculas(Scanner scanner, Pelicula[] peliculasRegistradas, int cantidadPeliculas)
    {
        int opcionSubmenu;
        do{
            System.out.println("\n--- Menu de Peliculas ---");
            System.out.println("1. Registrar Pelicula");
            System.out.println("2. Ver Peliculas");
            System.out.println("3. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcionSubmenu = scanner.nextInt();
        }
    }
    
}
