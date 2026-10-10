package Programacion3.ColasYPilas;

import java.util.Stack;

public class Ejercico_9_2
{

    public static void main(String[] args) 
    {
        System.out.println(simetria("fgh&hgf"));
        System.out.println(simetria("reconocer&reconocer"));
        System.out.println(simetria("jki&jki"));
        
    }

    public static boolean simetria(String cadena)
    {
        Stack<String> caracteres = new Stack<>();
        int separador = -1;

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '&'){
                separador = i;
                break;
            }
            
        }

    }

    
    
}
