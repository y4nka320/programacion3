import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TomaDePedidos
{
    public static void main(String[] args) 
    {

        List<String> pedido = new ArrayList<>();
        List<String> platos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        platos.add("Salchipapa Morronga");
        platos.add("Salchipapa Bochinchera");
        platos.add("Hamburguesa jovita");
        platos.add("hamburguesa gaucha");
        platos.add("Perro sencillo");
        platos.add("Perro chespirito");

        int opcion = 0;


        
        do{

            System.out.println("\n========== MENU DE SANTO PECADO ==========");
            System.out.println("\n1. Agregar plato"
                            + "\n2. Ver pedido actual"
                            + "\n3. Buscar plato en el menu"
                            + "\n4. Verificar si un plato esta en tu pedido"
                            + "\n5. Eliminar plato por posicion o nombre"
                            + "\n6. Opciones avanzadas de memoria"
                            + "\n7. Vaciar todo el pedido"
                            + "\n8. Salir"
                            + "\nElige una opcion: ");

        }
        
        
    }

}

