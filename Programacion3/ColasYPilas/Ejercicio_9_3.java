package Programacion3.ColasYPilas;

import java.util.Stack;

public class Ejercicio_9_3 
{
    public static void main(String[] args)
    {

        String expresion1= "((a+b)*5)-7";
        String expresion2= "2*[(a+b)/2.5 + x - 7*y";

        System.out.println("La expresion " + expresion1 + " esta equilibrada?: " + equilibrio(expresion1));
        System.out.println("La expresion " +  expresion2 + " esta equilibrada?: " + equilibrio(expresion2));
        
    }

    public static boolean equilibrio(String expresion)
    {

        Stack<String> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            String caracter = expresion.substring(i, i+1)
            
        }

    }
    
}
