package Programacion3.ColasYPilas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio_10_3 
{

    static class Cliente
    {
        String nombre;
        int numCarrito;

        public Cliente(String nombre, int numCarrito)
        {
            this.nombre = nombre;
            this.numCarrito = numCarrito;
        }
    }

    public static void main(String[] args) 
    {

        Queue<Integer> carritosDisponibles = new LinkedList<>();
        for (int i = 1; i < 25; i++) {
            carritosDisponibles.offer(i);
            
        }

        Queue<Cliente>[] cajas = new LinkedList[3];
        for (int i = 0; i < 3; i++) {
            cajas[i] = new LinkedList<>();
            
        }

        System.out.println("\n=== Bienvenido a supermercado El Barrio ===");


        llegadaCliente("Cliente 1", carritosDisponibles, cajas);
        llegadaCliente("Cliente 2", carritosDisponibles, cajas);
        llegadaCliente("Cliente 3", carritosDisponibles, cajas);
        llegadaCliente("Cliente 4", carritosDisponibles, cajas);

        procesarPago(0, carritosDisponibles, cajas);

        llegadaCliente("Cliente 5", carritosDisponibles, cajas);


    }

    public static void llegadaCliente(String nombre, Queue<Integer> carritosDisponibles, Queue<Cliente>[] cajas)
    {

        System.out.println("\n-> Llega el " + nombre + " al supermercado.");

        
        if (carritosDisponibles.isEmpty()) {
            System.out.println(" No hay carritos disponibles. " + nombre + " debe esperar.");
            return;
        }

        int idCarrito = carritosDisponibles.poll();
        System.out.println( nombre + " toma el carrito #" + idCarrito);

        
        int cajaSeleccionada = cajaConMenosGente(cajas);

        Cliente nuevoCliente = new Cliente(nombre, idCarrito);
        cajas[cajaSeleccionada].offer(nuevoCliente);

        System.out.println( nombre + " se forma en la Caja " + (cajaSeleccionada + 1) + 
                           " (Personas formadas en esta cola: " + cajas[cajaSeleccionada].size() + ")"
        );
        
    }

    public static int cajaConMenosGente(Queue<Cliente>[] cajas) {
        int indiceMenor = 0;
        int menosGente = cajas[0].size();

        for (int i = 1; i < cajas.length; i++) {
            if (cajas[i].size() < menosGente) {
                menosGente = cajas[i].size();
                indiceMenor = i;
            }
        }
        return indiceMenor;
    }


    public static void procesarPago(int numeroCaja, Queue<Integer> carritosDisponibles, Queue<Cliente>[] cajas) {
        System.out.println("\n-> Procesando pago en la Caja " + (numeroCaja + 1) + "...");

        if (cajas[numeroCaja].isEmpty()) {
            System.out.println(" La Caja " + (numeroCaja + 1) + " está vacía.");
            return;
        }

        
        Cliente clienteSaliendo = cajas[numeroCaja].poll();
        System.out.println( " el cliente " + clienteSaliendo.nombre + " ha pagado y sale del supermercado.");

       
        carritosDisponibles.offer(clienteSaliendo.numCarrito);
        System.out.println(" El carrito #" + clienteSaliendo.numCarrito + " vuelve a estar disponible.");
    }
    
}
