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

    //esto recorre l amatriz y va a mostrar el mapa
    public void mostrarMapa()
    {
        System.out.println("--- Mapa de sillas de la sala " + salaId + " ---");
        for (int indiceFila = 0; indiceFila < mapaAsientos.length; indiceFila ++) {
            for (int indiceColumna = 0; indiceColumna < mapaAsientos[indiceFila].length; indiceColumna ++) {
                System.out.println(mapaAsientos[indiceFila][indiceColumna] + "\t");
            }
            System.out.println();
        }
    }

    //aca es donde mira se ponen las sillas vendidas, va a devolver el precio, va adecir que no se puede
    // si no existe la fila, indices invalidos o ya esta vedida

    public double venderSilla(String pFila, int pColumna)
    {
        double precioResultante = -1;
        int indiceFila = buscarIndiceFila(pFila);

        if(indiceFila == -1){
            System.out.println("La fila \"" + pFila + "\" no existe en esta sala.");
        } else if(!columnaValida(pColumna)){
            System.out.println("La silla numero " + pColumna + " no existe en esta sala.");
        }else if(mapaAsientos[indiceFila][pColumna].equals("_")){
            System.out.println("En esta posicion no hay silla fisica.");
        }else if (mapaAsientos[indiceFila][pColumna].equals(" ")){
            System.out.println(" Esa posicion no corresponde a una silla valida");
        }else if(mapaAsientos[indiceFila][pColumna].equals("X")){
            System.out.println("La silla" + pFila + pColumna + " ya fue vendida ");
        }else{
            mapaAsientos[indiceFila][pColumna] = "x";
            if (soloPermite3D) {
                precioResultante = 10000;
            }else if (esPreferencial(pFila)){
                precioResultante = 12000;
            }else{
                precioResultante = 8000;
            }
        }
        return precioResultante;
    }


    //esto es breve, cuenta las sillas dispoble si estan "-"
    public int contarDisponibles()
    {
        int totalDisponible = 0;
        for (int indiceFila = 1; indiceFila < mapaAsientos.length; indiceFila ++)
        {
            for (int indiceColumna = 1; indiceColumna < mapaAsientos[indiceFila].length; indiceColumna++)
            {
                if (mapaAsientos[indiceFila][indiceColumna].equals("-"))
                {
                    totalDisponible = totalDisponible + 1;
                }
            }
        }
        return totalDisponible;
    }


    //aca vamos a empezar ya con los horarios de las funciones
    public void mostrarFunciones()
    {
        System.out.println("--- Funciones de la sala " + salaId + " ---");
        for (int indiceFuncion = 0; indiceFuncion < funcionesDelDia.length; indiceFuncion++)
        {
            funcionesDelDia[indiceFuncion].mostrarInfo();   
        }

    }

    //aca me valida el tipo de pelicula con las salas
    // 3D solo con la 3, 35mm solo con 1 y 2
    public boolean asignarPelicula(int pFranjaHoraria, Pelicula pPelicula)
    {
        boolean tipoCompatible;

        if(soloPermite3D){
            tipoCompatible = pPelicula.getTipoProyeccion().equals("3D");
            if (!tipoCompatible){
                System.out.println("La sala" + salaId + " solo admite peliculas 3D");
            }
        }else{
            tipoCompatible = !pPelicula.getTipoProyeccion().equals("3D");
            if (!tipoCompatible){
                System.out.println("La sala " + salaId + " no admite peliculas 3D");
            }
        }

        boolean asignacionExitosa = false;
        if(tipoCompatible){
            Funcion funcionSeleccionada = funcionesDelDia[pFranjaHoraria - 1];
            asignacionExitosa = funcionSeleccionada.intentarAsignar(pPelicula);
        }
        return asignacionExitosa;
    }


}
