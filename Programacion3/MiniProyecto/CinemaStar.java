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

            switch (opcionSubmenu) {
                case 1:
                    if (cantidadPeliculas >= peliculasRegistradas.length) {
                        System.out.println("\nNo hay espacio para registrar mas peliculas.");
                    }else{
                        peliculasRegistradas[cantidadPeliculas] = Pelicula.solicitarDatos(scanner);
                        cantidadPeliculas = cantidadPeliculas + 1;
                        System.out.println("\nPelicula registrada con exito.");
                    }
                    break;
                case 2:
                    mostrarListaPeliculas(peliculasRegistradas, cantidadPeliculas);
                    break;
                case 3:
                    break;
            
                default:
                    System.out.println("\nOpcion no valida, intentar de nuevo");
                        
            }
                
        }while (opcionSubmenu !=3); 
        
        return cantidadPeliculas;

    }

    private static void mostrarListaPeliculas(Pelicula[]peliculasRegistradas, int cantidadPeliculas)
    {
        if(cantidadPeliculas == 0){
            System.out.println("\n En este momento no contamos con peliculas en fucion, vuelva pronto");

        }else{
            System.out.println("\n --- Peliculas Registradas ---");
            for (int indice = 0; indice < cantidadPeliculas; indice++) {
                System.out.println((indice + 1));
                peliculasRegistradas[indice].mostrarInfo();
            }
        }
    }

    private static void menuFunciones(Scanner scanner, sala[] salas, Pelicula[] peliculaRegistradas, int cantidadPeliculas)
    {
        if(cantidadPeliculas == 0){
            System.out.println("\n****Primer0 debes registrar al menos una pelicula (opcion 1 del menu principal)****");
            return;
        }

        int opcionSubmenu;
        do{
            System.out.println("\n--- Asignacion de Funciones ---");
            System.out.println("1. Asignar pelicula a una sala/franja");
            System.out.println("2. Ver funciones asignadas");
            System.out.println("3. Volver al menu principal");
            System.out.print("\nSeleccione una opcion: ");
            opcionSubmenu = scanner.nextInt();

            switch (opcionSubmenu) {
                case 1:
                    asignarPeliculaSala(scanner, salas, peliculaRegistradas, cantidadPeliculas);
                    break;
                case 2:
                    for (int indiceSala = 0; indiceSala < salas.length; indiceSala++) {
                        salas[indiceSala].mostrarFunciones();
                        
                    }
                    break;
                case 3:
                    break;
            
                default:
                    System.out.println("\nOpcion no valida, intentar de nuevo");
                    
            }
        }while (opcionSubmenu !=3);
    }

    
    
}
