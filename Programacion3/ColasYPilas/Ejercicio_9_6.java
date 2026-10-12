package Programacion3.ColasYPilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_9_6 
{

    public static void main(String[] args) 
    {
        Stack<String> pila = new Stack<>();
        Queue<String> cola = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngresar la frase que quiere saber" + "\nsi es palindromo o no: ");

        String fr = sc.nextLine();
        fr = fr.replace(" ", "").toLowerCase();

        for (int i = 0; i < fr.length(); i++) 
        {
            String caracter = fr.substring(i, i + 1);
            pila.push(caracter);
            cola.add(caracter);
        }

        boolean palindromo = true;

        for (int i = 0; i < fr.length(); i++) 
        {
            String caracterPila = pila.pop();
            String caracterCola = cola.poll();

            if(!caracterPila.equals(caracterCola))
            {
                palindromo = false;
                break;
            }
        }

        if (palindromo) 
            System.out.println("\nLa frase ingresada es un palindromo");
        else
            System.out.println("\nLa frase ingresada no es un palindromo");
    }
    
}
