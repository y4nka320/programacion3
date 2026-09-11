public class SolucionMatrices 
{
    
    public static void main(String[] args) 
    {
         int [][] m = {{2, 21, 15}, 
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
        System.out.println(cad);
        
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
        }
        

    }
}
