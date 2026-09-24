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

    public int getSalaId(){
        return salaId;
    }

    public boolean isSoloPermite3D(){
        return soloPermite3D;
    }

    public Funcion[] getFuncionesDelDia(){
        return funcionesDelDia;
    }

    //esto va a buscar el indice de la fila dentro de la matriz dependiendo de la letra
    public int buscarIndiceFila(String pFila)
    {
        int indiceEncontrado = -1;
        for (int indiceFila = 1; indiceFila < mapaAsientos.length; indiceFila = indiceFila+1){
            if (mapaAsientos[indiceFila][0].equals(pFila))
            {
                indiceEncontrado = indiceFila;
            }   
        }
        return indiceEncontrado;
    }

    //esto me verifica las columnas validas, entonces la columna con el indice 0 no vale porque pues ahi no hay nada
    //la columna debe ser igual o mayor a 1 y menor o igual al limite superior
    public boolean columnaValida(int pColumna)
    {
        return pColumna >= 1 && pColumna<= mapaAsientos[0].length - 1;
    }

    //este decide si la fila que se pone es preferencial con las salas 1 y 2  y filas G y H
    public boolean esPreferencial(String pFila)
    {
        boolean esFilaPreferencial = false;
        if (salaId == 1 || salaId == 2){
            if (pFila.equals("G") || pFila.equals("H")){
                esFilaPreferencial = true;
            }
        }
        return esFilaPreferencial;
    }

    
}
