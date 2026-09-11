
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

       /*  int[] j = new int [30];

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

            int rma = 0;
            int rme = 0;

            for ( int i = 0 ; i<j.length; i++)
                {
                    if(j[i] == mayor){
                        rma++;
                    }
                    if(j[i] == menor){
                        rme++;
                    }
                }

            System.out.println("el numero menor se repite "+ rme + " veces\n" +
                                "el numero mayor se repite "+ rma + " veces");*/


        //punto 9 del taller

       /*  int [] k = new int [20];
        int l = 0;

        int max = 20;
        int min =1;

        for (int i = 0; i < k.length; i++)
            {
                k[i]= (int) (Math.random() *(max - min +1)) + min;

            }


             for (int i = 0; i < k.length; i++)
            {
                System.out.println("k[" + i + "]=" + k[i]);
            }

            
                l= (int) (Math.random() *(max - min +1)) + min;

            
             
                System.out.println("l = " + l );
            

            int repite = 0;

             for ( int i = 0 ; i < k.length; i++)
                {
                    if(l == k[i]){
                        repite++;
                    }
                }
    
            System.out.println("el numero se repite "+ repite + " veces");*/



        // punto 10 del taller

       /*  int [] p = {15, 9, 0, 7, 8, 3, 1};
        //int [] p = {8, 9, 4, 3, 20, 5}; esto para cuando los elemtos de p son pares
        int [] q = new int[(p.length + 1) / 2];

        for (int i = 0; i < p.length/2; i++){
            q[i] = p[i] + p[p.length - 1 - i];
        }

        // Si A tiene cantidad impar, guardamos el centro
        if (p.length % 2 != 0) {
            q[q.length - 1] = p[p.length / 2];
        }

        for (int i = 0; i < p.length; i++)
                {
                    System.out.println("la suma de los elemtos opuestos de p[" + p[i] +"]");
                }

        for (int i = 0; i < q.length; i++)
                {
                    System.out.println("es = q[" + q[i] +"]");
                }*/


        //punto 11 del taller 

       /*  int[] e = {12, -3, 0, -6,-19, 4, 1, 6};
        int[] n = new int[e.length]; 
        int[] v = new int[e.length];
        int[] o = new int[e.length];

        int posn = 0;
        int posv = 0;
        int poso = 0;

        for (int i = 0; i < e.length; i++ ){

            if( e[i] < 0){
                n[posn] = e[i];
                posn++;
            }

            if (e[i] > 0){
                v[posv] = e[i];
                posv++;
            }

            if (e[i] == 0){
                o[poso] = e[i];
                poso++;
            }

        }

        System.out.println("el arreglo original es: ");
        for (int i = 0; i < e.length; i++){
            System.out.println("e[" + e[i] + "] ");
        }

        System.out.println("los numeros positivos son: ");
        for ( int i = 0; i < posv; i++){
            System.out.println("v[" + v[i] + "]\n");
        }


        System.out.println("los numeros negativos son: ");
        for (int i = 0; i < posn; i++){
            System.out.println("n["+ n[i] + "]\n");
        }

        System.out.println("arreglo con el numero: ");   //tengo que mejorar la impresion del arreglo para que se vea bonito
        for (int i = 0; i < poso; i++){
            System.out.println("o["+ o[i] + "]\n");
        }*/


        //punto 12 del taller
       /*  int []w= {4,5,2,6,2,0,8,9,1,3,2,7};
        int x = 2;
        int []h= new int [w.length];
        int posh = 0;

        System.out.print("el arreglo w[");

        for (int i = 0; i < w.length; i++ ){

            if( w[i] == x){
                h[posh] = i;
                posh++;
            }

        }

        for (int i = 0; i < w.length; i++){
            System.out.print( w[i] + ", " );
        }

        System.out.println("");

        System.out.println("los indices de x=2 : ");  //aca tambien debo mejorar la impresio, bueno con todos 

         for (int i = 0; i < posh; i++){
            System.out.println("h[" + h[i] + "]");
        }*/

        //punto 13 del taller

        int [] y = new int [20];
        int []g= new int [y.length];
        int []f= new int [y.length];

         int max = 20;
        int min =1;

        for (int i = 0; i < y.length; i++)
            {
                y[i]= (int) (Math.random() *(max - min +1)) + min;

            }    
            
            






    }
}

