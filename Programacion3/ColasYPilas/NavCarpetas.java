package Programacion3.ColasYPilas;
import java.util.Scanner;
import java.util.Stack;

public class NavCarpetas
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Stack<String> rutaCarpeta = new Stack<>();
        

        System.out.println("=== 1. Comprobar si la ruta esta vacía ===");
        System.out.println("¿la ruta de carpetas está vacía? " + rutaCarpeta.empty());

        System.out.println("\n=== 2. Ingresar a subcarpetas ===");
        rutaCarpeta.push("C:");
        rutaCarpeta.push("yanka > ");
        rutaCarpeta.push("Descargas > ");
        rutaCarpeta.push("Pruebas Pseint > ");
        rutaCarpeta.push("Practicas > ");
        rutaCarpeta.push("visual practicas > ");

        System.out.println("Ruta actual de navegacion : " + rutaCarpeta);
       
        System.out.println("\n=== 3. Consultar la carpeta activa sin salir de ella ===");
        System.out.println("Carpeta activa actual " + rutaCarpeta.peek());

        System.out.println("\n=== 4. Buscar la posicion de una carpeta ===");
        int opcion = 0;

        do{
            System.out.println("¿Que carpeta/directorio deseas buscar?");
            System.out.print("\n 1. C: "
                            + "\n 2. yanka"
                            + "\n 3. Descagas"
                            + "\n 4. Pruebas Pseint"
                            + "\n 5. Practicas"
                            + "\n 6. Visual practicas"
                            + "\n 7. Salir de este menu"
                            + "\n Seleccione una opcion: "
            );

            opcion = scanner.nextInt();

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
                case 7:
                    System.out.println("Ha salido de este menu");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    
            }


        }while (opcion != 7);
            
        scanner.close();

        System.out.println("\n=== 5. abriendo pestaña de administrador de archivos === ");
        Stack<String> rutaCarpeta2 = (Stack<String>)rutaCarpeta.clone(); 
        System.out.println("\nantigua pestaña: " + rutaCarpeta + "pestaña nueva: " + rutaCarpeta2);

        System.out.println("\n === 6. Borrando pestaña nueva ===" + "\n...");
        rutaCarpeta2.clear();
        System.out.println("pestaña nueva borrada: " + rutaCarpeta2.empty());

        System.out.println("\n === 7. Abriendo carpeta 'HTML'=== " + "\n..." + "\n se ha abierto correctamnete" + rutaCarpeta.add("HTML >")
                            + "\n ahora la ruta es: " + rutaCarpeta
        );

        System.out.println("\n === 8. cual fue la segunda y quinta carpeta en abrirse? === "
                            +"\n La segunda fue: " + rutaCarpeta.get(1) + "\n la quinta carpeta fue: " + rutaCarpeta.get(4) 
        );

        System.out.println("\n=== 9. cual es la indice de la carpeta 'Descargas' ===" 
                            + "\n Indice de la carpeta 'Descargas' es: " + rutaCarpeta.indexOf("Descargas > " )
        );

        System.out.println("\n=== 10. cual fue la ultima carpeta abierta?" + "Fue la carpeta " + rutaCarpeta.lastElement());

        System.out.println("\n === 11. Cuantas carpetas en total hay abiertas?: " + rutaCarpeta.size() + " carpetas abiertas");

        System.out.println("\n === 12. las carpetas 'yanka' y 'videos' estan abiertas? === " +
                            "\nla carpeta 'yanka': " + rutaCarpeta.contains("yanka > ")
                        + "\nla carpeta 'videos': " + rutaCarpeta.contains("videos > ")
        );

        
    
       
       System.out.println("\n*** #. salir de carpetas ***");
       while (!rutaCarpeta.empty()) {
        System.out.println("Retrocediendo de: " + rutaCarpeta.pop());
        
       }

       System.out.println("¿Estamos en la carpeta inicial? " + rutaCarpeta.empty());

       


    }
    
}
