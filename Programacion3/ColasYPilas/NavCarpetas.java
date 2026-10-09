package Programacion3.ColasYPilas;
import java.util.Stack;

public class NavCarpetas
{
    public static void main(String[] args) 
    {
        
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
        System.out.println("Carpeta activa actual " + rutaCarpeta.peek() );
    }
    
}
