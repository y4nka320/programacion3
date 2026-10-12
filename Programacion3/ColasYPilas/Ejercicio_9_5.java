package Programacion3.ColasYPilas;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_9_5 
{

     public static void main(String[] args)
    {
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> p3 = new Stack<>();
        Stack<Integer> p4 = new Stack<>();
        Stack<Integer> p5 = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsertar trio de numeros enteneros o ingresa 0 para terminar");

        while (true)
        {

            System.out.print("\nInserte el numero de pila: ");
            int i = sc.nextInt();

            if(i == 0)
            {
                System.out.println("fin de la actividad, garcias por asistir");
                break;
            }

            
            if(Math.abs(i) > 5)
            {    
                System.out.println("El numero de la pila debe estar entre 1 y 5");
                continue;
            }

            System.out.print("Ingrese el elemento: ");
            int j = sc.nextInt();

            System.out.print("\ningrese el valor de k, -1 para borar los elementos de la pila ingresada " 
                                + "\no 0 para seguir le proceso sin modificaciones: "
            );
            int k = sc.nextInt();
            int selecpilas = Math.abs(i);

            if (k == -1){
                if (selecpilas == 1)
                    p1.clear();
                else if (selecpilas == 2)
                    p2.clear();
                else if (selecpilas == 3)
                    p3.clear();
                else if (selecpilas == 4)
                    p4.clear();
                else if (selecpilas == 5)
                    p5.clear();

                System.out.println("\nSe han borrado los elementos de la pila " + selecpilas);

                System.out.println("pila 1: " + p1);
                System.out.println("pila 2: " + p2);
                System.out.println("pila 3: " + p3);
                System.out.println("pila 4: " + p4);
                System.out.println("pila 5: " + p5);

            }else if(k == 0){
                if(i > 0){
                    if(i == 1)
                        p1.push(j);
                    else if(i == 2)
                        p2.push(j);
                    else if (i == 3)
                        p3.push(j);
                    else if(i == 4)
                        p4.push(j); 
                    else if(i == 5)
                        p5.push(j);
                } else {
                    
                    boolean retirado = false;
                    int elementofuera = 0;

                    if(selecpilas == 1 && !p1.isEmpty()) {
                        elementofuera = p1.pop();
                        retirado = true;
                    }else if (selecpilas == 2 && !p2.isEmpty()){
                        elementofuera = p2.pop();
                        retirado = true;

                    }else  if(selecpilas == 3 && !p3.isEmpty()){
                        elementofuera = p3.pop();
                        retirado = true;

                    }else  if(selecpilas == 4 && !p4.isEmpty()){
                        elementofuera = p4.pop();
                        retirado = true;

                    }else if(selecpilas == 5 && !p5.isEmpty()){
                        elementofuera = p5.pop();
                        retirado = true;
                    }

                    if(retirado){
                        
                        System.out.println("\nEliminado el elemento " + elementofuera + " de la Pila " + selecpilas);
                    } else {
                        System.out.println("La Pila " + selecpilas + " ya está vacía, no se puede eliminar.");
                    }
                
                }

                System.out.println("pila 1: " + p1);
                System.out.println("pila 2: " + p2);
                System.out.println("pila 3: " + p3);
                System.out.println("pila 4: " + p4);
                System.out.println("pila 5: " + p5);

            }

        }
        
    }
    
}
