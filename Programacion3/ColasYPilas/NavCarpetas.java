package Programacion3.ColasYPilas;
import java.util.Scanner;
import java.util.Stack;

public class NavCarpetas
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> rutaCarpeta = new Stack<>();
        

        System.out.println("*** 1. Comprobar si la ruta esta vacía ***");
        System.out.println("¿la ruta de carpetas está vacía? " + rutaCarpeta.empty());

        System.out.println("\n*** 2. Ingresar a subcarpetas***");
        rutaCarpeta.push("C:");
        rutaCarpeta.push("yanka > ");
        rutaCarpeta.push("Descargas > ");
        rutaCarpeta.push("Pruebas Pseint > ");
        rutaCarpeta.push("Practicas > ");
        rutaCarpeta.push("visual practicas > ");

        System.out.println("Ruta actual de navegacion : " + rutaCarpeta);
       
        System.out.println("\n*** 3. Consultar la carpeta activa sin salir de ella ***");
        System.out.println("Carpeta activa actual " + rutaCarpeta.peek());

        System.out.println("\n*** 4. Buscar la posicion de una carpeta ***");
        int opcion = 0;

        do{
            System.out.println("¿Que carpeta/directorio deseas buscar?");
            System.out.println("1. C: "
                            + "\n 2. yanka"
                            + "\n 3. Descagas"
                            + "\n 4. Pruebas Pseint"
                            + "\n 5. Practicas"
                            + "\n 6. Visual practicas"
            );

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La carpeta 'C:' esta en la posicion: " + rutaCarpeta.search("C:"));
                    break;
                case 2:
                    System.out.println("La carpeta 'yanka' esta en la posicion: " + rutaCarpeta.search("yanka > "));
                    break;
                case 3:
                    System.out.println("La carpeta 'Descargas' esta en la posicion:" + rutaCarpeta.search("Descargas > "));
                    break;
                case 4:
                    System.out.println("La carpeta 'Pruebas Pseint' esta en la posicion: " + rutaCarpeta.search("Pruebas Pseint > "));
                    break;
                case 5:
                    System.out.println("La carpeta 'Practicas' esta en la posicion: " + rutaCarpeta.search("Practicas > "));
                    break;
                case 6:
                    System.out.println("La carpeta 'Visual practicas' esta en la posicion: " + rutaCarpeta.search("visual practicas > "));
                    break;
            
                default:
                    break;
            }


        }while (opcion != 7);
            
        
       
       

    }
    
}
