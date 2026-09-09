
public class SolucionTaller 
{

    public static void main (String[] arg)
    {


        //punto 7 del taller

        /*int[] a = {2, 3, 7, 6, 12, 27, 21, 33, 24, 18};
        
        int[] b = new int[a.length]; 
        int[] c = new int[a.length];

        int posb = 0;
        int posc = 0;

        for (int i = 0 ; i < a.length ; i++)
        {

            if(a[i] % 2 == 0){
                 b[posb] = a[i];
                posb++;
               
            }else{

                 c[posc] = a[i];
                posc++;

            }
               


        }

            System.out.println("los numeros pares son:\n");

                for (int i = 0; i < posb; i++)
                {
                    System.out.println("b[" + b[i] +"]");
                }

             System.out.println("los numeros impares son:\n");

                for (int i = 0; i < posc; i++)
                {
                    System.out.println("c[" + c[i] +"]");
                }   */


        //punto 8 del taller

        int[] j = new int [30];

         int max = 100;
         int min =1;

        for (int i = 0; i < j.length; i++)
            {
                j[i]= (int) (Math.random() *(max - min +1)) + min;


            }

             for (int i = 0; i < j.length; i++)
            {
                System.out.println("j[" + i + "]=" + j[i]);
            }

        int mayor = j[0];
        int menor = j[0];

         for (int i = 1; i < j.length; i++)
            {
                if(j[i] > mayor){
                    mayor = j[i];
                }

                if(j[i] < menor){
                    menor = j[i];
                }


            }
            System.out.println("el numero menor es: " + menor +"\n"+
                                "el numero mayor es: " + mayor );
    }
}
