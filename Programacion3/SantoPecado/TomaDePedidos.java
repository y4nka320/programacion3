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
                            + "\n3. Verificar si un plato esta en tu pedido"
                            + "\n4. Eliminar plato por posicion o nombre"
                            + "\n5. Opciones avanzadas de memoria"
                            + "\n6. Vaciar todo el pedido"
                            + "\n7. Salir"
                            + "\nElige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println("=========== Platos Disponibles ==========");
                    for (int i = 0; i < platos.size(); i++) {
                        System.out.println((i + 1) + ". " + platos.get(i));

                    }
                    System.out.print("\nEscribe el nombre del plato que quieres pedir: ");

                    String platoElegido = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < platos.size(); i++) {
                        if (platoElegido.equalsIgnoreCase(platos.get(i))) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        pedido.add(platoElegido);
                        System.out.println("¡Plato agregado con exito!");
                    } else {
                        System.out.println("El plato no esta disponible en la lista.");
                    }

                    break;
                case 2:
                    System.out.println("\n--- PLATOS EN EL PEDIDO ---");
                    if (pedido.isEmpty()) {
                        System.out.println("El pedido esta vacio.");
                    } else {
                        System.out.println("Total de platos en el pedido: " + pedido.size());
                        for (int i = 0; i < pedido.size(); i++) {
                            System.out.println((i + 1) + ". " + pedido.get(i));
                        }
                    }
                    break;
                case 3:
                    
                    break;
            
                default:
                    break;
            }

        }while 
        
        
    }

}

