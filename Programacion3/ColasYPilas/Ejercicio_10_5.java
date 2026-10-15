package Programacion3.ColasYPilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio_10_5 
{
    public static void main(String[] args) 
    {
        Queue<String> colaSeguroSocial = new LinkedList<>();
        Queue<String> colaMarca = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        LinkedList<Repartidor> basePersonal = new LinkedList<>(); //lista enlazada
        
        basePersonal.add(new Repartidor("999-111", "Tienda 1", 2));
        basePersonal.add(new Repartidor("888-222", "Tienda 2", 4));

        String numeroNss;
        do {
            System.out.print("Digite el numero de seguro social del trabajador o 0 para finalizar la entrada: ");
            numeroNss = sc.nextLine();

            if (numeroNss.equals("0")) 
            {
                break;
            }

            System.out.print("Digite la empresa o marca publicitaria: ");
            String empresaAnuncio = sc.nextLine();

            // Guardamos la información en las respectivas colas
            colaSeguroSocial.add(numeroNss);
            colaMarca.add(empresaAnuncio);
            System.out.println("Registro añadido a la cola del día");
        } while (true);

        if (!colaSeguroSocial.isEmpty()) {
            do {
                String nssActual = colaSeguroSocial.poll();
                String marcaActual = colaMarca.poll();

                boolean existeEnLista = false;

                // Recorrido de la lista enlazada para verificar coincidencias
                for (int i = 0; i < basePersonal.size(); i++) {
                    Repartidor empleado = basePersonal.get(i);
                    if (empleado.getSeguroSocial().equals(nssActual)) {
                        empleado.sumarDiaLaboral();
                        empleado.setMarcaAnunciada(marcaActual);
                        existeEnLista = true;
                        break;
                    }
                }

                // Si el trabajador no figuraba previamente, se añade como registro nuevo
                if (!existeEnLista) {
                    basePersonal.add(new Repartidor(nssActual, marcaActual, 1));
                }
            } while (!colaSeguroSocial.isEmpty());
        }

        System.out.println("\n.......Lista actualizada......");
        for (int i = 0; i < basePersonal.size(); i++) {
            System.out.println(basePersonal.get(i));
        }

    }
}
