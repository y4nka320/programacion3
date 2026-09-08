public class MatricesA
 {
    public static void main(String[] args)
    {

        //Delcaracion de la matriz (forma 1)

        int [][] m = {{5, 8, 6}, 
                      {1, 3, 2}, 
                      {4, 9, 7}};

        //Recorrido de la matriz
        for (int i = 0; i < m[0].length; i++){
            for (int j = 0; j < m[0].length; j++){
                System.out.println("m[" + i + "][" + j + "]=" + m[i][j]);
            }
        }

    }



}


