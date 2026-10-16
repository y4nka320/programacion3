import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TomaDePedidos
{
    public static void main(String[] args) 
    {

        List<String> pedido = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcion = 0;


        do
        {

            System.out.print("\n====== MENU DE SANTO PECADO ======"
                            + "\n 1. Salchipapas"
                            + "\n 2. Hamburguesas"
                            + "\n 3. Perros"
                            + "\n 4. Gaseosa"
                            + "\n 5. finalizar pedido"
                            + "\n ¿Que desea el dia de hoy?: "
            );

            opcion = sc.nextInt(); 

             switch (opcion) {
                case 1:
                    System.out.println("\n 1. la morronga .... " 
                                     + "\n 2. La bochinchera .... "
                                     + "\n 3. La belleza .... "
                    );
                    break;
                case 2:
                    System.out.println("\n 1. Street burguer .... "
                                      +"\n 2. Gaucha .... "
                                      +"\n 3. Jovita .... "
                    );
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    break;
                case 7:
                    System.out.println("gracias por su visita");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    
            }
         

        }while();
        
        
    }

}

