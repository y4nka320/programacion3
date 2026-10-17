import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TomaDePedidos
{
    public static void main(String[] args) 
    {

        List<String> pedido = new ArrayList<>();
        List<String> platos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        platos.add("Salchipapa Morronga");
        platos.add("Salchipapa Bochinchera");
        platos.add("Hamburguesa jovita");
        platos.add("hamburguesa gaucha");
        platos.add("Perro sencillo");
        platos.add("Perro chespirito");

        int opcion = 0;


        
        do{

            System.out.println("\n========== MENU DE SANTO PECADO ==========");
            System.out.print("\n1. Agregar plato"
                            + "\n2. Ver pedido actual"
                            + "\n3. Verificar si un plato esta en tu pedido"
                            + "\n4. Eliminar plato por posicion o nombre"
                            + "\n5. cancelar el pedido"
                            + "\n6. cambiar plato"
                            + "\n7. imprimri comanda para cocina"
                            + "\n8. aplicar Gran oferton"
                            + "\n9. Salir"
                            + "\nElige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println("=========== Platos Disponibles ==========");
                    for (int i = 0; i < platos.size(); i++) {
                        System.out.println((i + 1) + ". " + platos.get(i));

                    }
                    System.out.print("\nEscribe el nombre del plato que quieres pedir: ");

                    String platoElegido = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < platos.size(); i++) {
                        if (platoElegido.equalsIgnoreCase(platos.get(i))) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        pedido.add(platoElegido);
                        System.out.println("¡Plato agregado con exito!");
                    } else {
                        System.out.println("El plato no esta disponible en la lista.");
                    }

                    break;
                case 2:
                    System.out.println("\n========== PLATOS EN EL PEDIDO ==========");
                    if (pedido.isEmpty()) {
                        System.out.println("El pedido esta vacio.");
                    } else {
                        System.out.println("Total de platos en el pedido: " + pedido.size());
                        for (int i = 0; i < pedido.size(); i++) {
                            System.out.println((i + 1) + ". " + pedido.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Escribe el plato que quieres verificar si esta en tu pedido: ");
                    String verificar = sc.nextLine();
                   
                    if (pedido.contains(verificar)){
                        System.out.println("El plato que ingresaste SI se emcuemtra en tu pedido");
                        System.out.println("Numero del plato en el pedido: " + (pedido.indexOf(verificar) + 1));
                    } else {
                        System.out.println("El plato NO esta en tu pedido");
                    }
                    break;
                case 4:
                    System.out.print("\n ========== Eliminar plato del pedido =========="
                                    + " \n 1. Por numero de plato"
                                    + " \n 2. Por nombre del plato"
                                    + " \n Eligue una opcion: "
                    );

                    int opcionEliminar = sc.nextInt();
                    sc.nextLine();

                    switch (opcionEliminar) {
                        case 1:
                            System.out.print("Ingresa el numero del plato a eliminar: ");
                            int pos = sc.nextInt();
                            sc.nextLine();
                            if (pos > 0 && pos <= pedido.size()) {
                                String eliminado = pedido.remove(pos - 1);
                                System.out.println("Se elimino correctamente: " + eliminado);
                            } else {
                                System.out.println("numero no valido.");
                            }
                            break;
                        case 2:
                            System.out.print("Ingresa el nombre del plato a eliminar: ");
                            String nombreEliminar = sc.nextLine();
                            if (pedido.remove(nombreEliminar)) {
                                System.out.println("Se elimino correctamente el plato: " + nombreEliminar);
                            } else {
                                System.out.println("No se encontro ese plato en tu pedido.");
                            }
                            break;
                        default:
                            System.out.println("Opcion de eliminacion invalida.");
                            break;
                    }

                    break;

                case 5:
                    pedido.clear();
                    System.out.println("¡Se ha cancelado el pedido con exito!");
                    break;
                case 6:
                    System.out.println("\n ========= modificar plato del pedido ==========");
                    if (pedido.isEmpty()){
                        System.out.println("aun no hay pedido, no se puede modificar");
                    } else {
                        for (int i = 0; i < pedido.size(); i++) {
                            System.out.println((i + 1) + ". " + pedido.get(i));
                        }

                        System.out.print("Ingrese el numero del plato que desea cambiar: ");
                        int modificarindi = sc.nextInt();
                        sc.nextLine();

                        if ( modificarindi > 0 && modificarindi <= pedido.size()){
                            System.out.println("Platos disponibles del menu");
                            for (int i = 0; i < platos.size(); i++) {
                                System.out.println((i + 1) + ". " + platos.get(i));
                            }

                            System.out.print("Ingresa el nombre del nuevo plato: ");
                            String nuevoPlato = sc.nextLine();

                            boolean platoValido = false;
                            for (int i = 0; i < platos.size(); i++) {
                                if (nuevoPlato.equalsIgnoreCase(platos.get(i))) {
                                    platoValido = true;
                                    break;
                                }
                            } 
                            
                            if (platoValido) {
                               
                                String platoAnterior = pedido.set(modificarindi - 1, nuevoPlato);
                                
                                System.out.println("¡Plato actualizado con éxito!");
                                System.out.println("Se cambió '" + platoAnterior + "' por '" + nuevoPlato + "'.");
                            } else {
                                System.out.println("El plato ingresado no existe en el menú de Santo Pecado.");
                            } 
                        } else {
                            System.out.println("Número de plato inválido.");


                        }
                    }
                    break;
                case 7:
                    System.out.println(" =========== Comanda para cocina ========== ");
                    if(pedido.isEmpty()){
                        System.out.println(" aun no se ha registrado el pedido");
                    } else {
                        System.out.println(" cocinar: " + pedido.toString());
                    }
                    break;
                case 8:
                    System.out.println(" ========== ¡GRAN OFERTON! ==========");
                  
                    List<String> comboEspecial = new ArrayList<>();
                    comboEspecial.add("Salchipapa morronga");
                    comboEspecial.add("Hamburguesa jovita");
                    
                    System.out.println("Para llevarte el descuento del gran oferton, debes haber pedido:");
                    for (int i = 0; i < comboEspecial.size(); i++) {
                        System.out.println("- " + comboEspecial.get(i));
                    }
                    
                    if (pedido.containsAll(comboEspecial)) {
                        System.out.println("\nGRAN OFERTON APLICADO, DISFRUTALO");
                    } else {
                        System.out.println("\nTu pedido aún no tiene todos los platos necesarios para el Combo Especial.");
                    }
                    break;
                case 9:
                    System.out.println("Gracias por visitar Santo Pecado");
                    break;
            
                default:
                    System.out.println("Opcion invalida, porfavor ingresa de nuevo");
                    break;
            }

        }while (opcion != 9 ); 
        
        sc.close();
    }

}

