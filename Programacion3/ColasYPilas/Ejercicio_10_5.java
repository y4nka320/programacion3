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
        
        basePersonal.add(new Repartidor("999-111", "Comercial X", 2));
        basePersonal.add(new Repartidor("888-222", "Publicidad Y", 4));

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

    }
}
