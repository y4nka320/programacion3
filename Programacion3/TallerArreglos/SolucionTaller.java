
public class SolucionTaller 
{

    public static void main (String[] arg)
    {

        int[] a = {2, 3, 7, 6, 12, 27, 21, 33, 24, 18};
        
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
                }

    }
}
