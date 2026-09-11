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
        
        int[][] tabla = new int[10][10];

        
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
        }

    }
}
