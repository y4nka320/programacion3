package Programacion3.ColasYPilas;

import java.util.LinkedList;
import java.util.Queue;

public class ClientesTickets 
{

    public static void main(String[] args)
    {
        Queue<String> tickets = new LinkedList<>();

        System.out.println("\n=== 1. Abriendo tienda" + "\nSe encuentra vacio los turnos?: " + tickets.isEmpty());

        System.out.println("\n=== 2. clientes ingresando a la tienda===");

        tickets.add("C1");
        tickets.add("C2");
        tickets.add("C3");
        tickets.add("C4");
        tickets.add("C5");

        System.out.println("orden de clientes ingresados: " + tickets);

        System.out.println("\n=== 3. primer cliente en atender: " + tickets.peek()
                            + "\nCliente " + tickets.poll() + " satisfecho"
                            + "\nSiguente cliente en atender: " + tickets.peek()
                            + "\nCliente " + tickets.remove() + " satisfecho"
        );

        System.out.println("\n=== Han ingresado mas clientes===");
        tickets.add("C6");
        tickets.add("C7");
        tickets.add("C8");

        System.out.println("orden de clientes faltantes: " + tickets);

        System.out.println("\n=== verificacion de clientes ==="
                            + "\nexiste el cliente C10?: " + tickets.contains("C10")
                            +  "\nexiste el cliente C8?: " + tickets.contains("C8")
        );

        System.out.println("\n cuantos clientes hay en la tienda?: " + tickets.size());

        System.out.println("\n=== Hora de cierre cercana, atendiendo a los ultimos clientes===");
        tickets.clear();
        System.out.println("clientes sin atender: " + tickets.size()
                            + "\nClientes satisfecho, gracias por su visita");


    }
    
}
