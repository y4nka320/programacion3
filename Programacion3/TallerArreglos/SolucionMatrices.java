import java.util.Scanner;

public class SolucionMatrices 
{
    
    public static void main(String[] args) 
    {

        //punto 17 del taller
       /*  int [][] m = {{2, 21, 15}, 
                         {8, 5, 12}, 
                         {1, 4, 3}};


              String cad = "";
        for (int i = 0; i < m[0].length; i++)
        {
            for (int j = 0; j < m[0].length; j++)
            {
                cad += "|" + m[i][j];
            }

              cad += "| \n";
        }  
        System.out.println(cad);  //me imprime la matriz original
        
        for (int i = 0; i < m.length; i++) {

         int suma = 0;

            for (int j = 0; j < m[i].length; j++) {
                suma = suma + m[i][j];
             }

            System.out.println("Suma de la fila " + i + ": " + suma);
        }

        for (int j = 0; j < m[0].length; j++) {

           int suma = 0;

            for (int i = 0; i < m.length; i++) {
                suma = suma + m[i][j];
            }

            System.out.println("Suma de la columna " + j + ": " + suma);
        } */

        //punto 18 del taller
        
        /*int[][] tabla = new int[10][10];

        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }*/

        // punto 19 del taller

       /*  int n = 4;
        int m = 4;

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i == j) {
                    a[i][j] = 1;      
                }else {
                    a[i][j] = 0;
                }
            }
        }

        String cad = "";
        for (int i = 0; i < a[0].length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                cad += "|" + a[i][j];
            }

              cad += "| \n";
        }  
        System.out.println(cad);*/

        // punto 20 dle taller 

        /*int n = 10;
        int m = 10;
        int [][] a = new int [n][m];

        for ( int i = 0 ; i < 10 ; i++)
        {
            for ( int j = 0; j < 10 ; j++)
            {
                if (i + j == 9){
                    a[i][j] = 0;
                }else{
                    a[i][j] = 1;
                }

            }
        }

        String cad = "";
        for (int i = 0; i < a[0].length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                cad += "|" + a[i][j];
            }

              cad += "| \n";
        }  
        System.out.println(cad);*/

        //punto 21 del taller

        /*int m = 4;
        int[][] a = {{2, 4, 5, 9}, 
                     {8, 5, 7, 1}, 
                     {1, 4, 3, 8},
                     {3, 7, 8, 1}};
        int []b = new int [m];
        


        for (int i = 0; i < a.length; i++)
        {
            int suma = 0;
            for (int j = 0; j < a.length; j++)
            {
                if (a[i][j] % 2 == 0){
                    suma = suma + a[i][j];
                }
            }
            b[i] = suma;

        }

        String cad = "";
        for (int i = 0; i < a[0].length; i++)
        {
            for (int j = 0; j < a[0].length; j++){
                cad += "|" + a[i][j];
            }

              cad += "| \n";
        }
          

            System.out.println(cad);

        for (int i = 0; i < m; i++)
        {
            System.out.print( b[i] + " " );
        }*/


        // punto 22 del taller

        Scanner poner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = poner.nextInt();

         System.out.print("Ingrese el número de columnas: ");
        int columnas = poner.nextInt();

        int [][] t = new int[filas][columnas];
         
        for (int i = 0 ; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++)
            {
                System.out.println("t[" + i +"][" + j + "]: ");
                t[i][j]=poner.nextInt();
            }
        }


        String cad = "";
        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++){
                cad += "|" + t[i][j];
            }

              cad += "| \n";
        }
          

        System.out.println(cad);

        int mayor = t[0][0];
        int menor = t[0][0];

        int filama = 0;
        int columnama = 0;

         int filame = 0;
        int columname = 0;

        for (int i = 0; i < filas ; i++)
        {
            for ( int j = 0; j < columnas; j++)
            {
                if (t[i][j] > mayor){
                    mayor = t[i][j];
                    filama = i;
                    columnama = j;
                }
                if(t[i][j] < menor){
                    menor = t[i][j];
                    filame = i;
                    columname = j;
                }
            }
        }

        System.out.println("\n El numero mayor es: " + mayor);
        System.out.println( "Posicion del numero mayor: [" + filama + "][" + columnama + "]");
        
         System.out.println("\n El numero menor es: " + menor);
        System.out.println( "Posicion del numero menor: [" + filame + "][" + columname + "]");

    }
}
