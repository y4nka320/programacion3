package Programacion3.MiniProyecto;

import java.util.Scanner;

public class sala 
{

    //hare los atributos privados
    private int salaId;
    private String[][] mapaAsientos;
    private boolean soloPermite3D;  //este es para que solo la sala 3 sea verdadero
    private Funcion[] funcionesDelDia; //este es porque solo son 3 horarios 
    
    //este es el constructor de la sala, depende de que sala sea le pone la mtriz que es
    public Sala(int pSalaId) 
    {
        salaId= pSalaId;

        //con esto se crean los 3 horarios de la sala
        funcionesDelDia = new Funcion[3];
        funcionesDelDia[0] = new Funcion(1);
        funcionesDelDia[1] = new Funcion(2);
        funcionesDelDia[2] = new Funcion(3);

        if(salaId == 1 || salaId == 2){
            soloPermite3D = false; 
            mapaAsientos = new String[][]{
                {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"},
                {"H", " ", " ", "-", "-", "-", "-", "-", "-", "-", "", "", "_"},
                {"G", " ", " ", "-", "-", "-", "-", "-", "-", "-", "", "", "_"},
                {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
                
            };
        }else {
            soloPermite3D = true;
            mapaAsientos = new String[][]{
                  {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"},
                    {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
            };
        }
    }
}
