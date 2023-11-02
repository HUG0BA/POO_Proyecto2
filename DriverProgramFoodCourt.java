import java.util.Scanner;

public class DriverProgramFoodCourt{
    static Scanner scanner = new Scanner(System.in);
    static FoodCourtUVG food = new FoodCourtUVG();
    public static void main(String[] args){
        menuUsuario();
    }

    public static void menuUsuario(){
        boolean menuUsuario = true;
        
        while(menuUsuario){
            System.out.println("¡Bienvenido al menu de cliente! Ingrese la opción que desea ejecutar.");
            System.out.println(" 1. Agregar Usuario (Cliente, Proveedor, Repartidor) \n 2. Iniciar sesión (Cliente, Proveedor, Repartidor) \n 3. Mostrar clientes \n 4. Mostrar repartidores \n 5. Mostrar proveedores");
            int opcion = -1;

            try{
                opcion = scanner.nextInt();
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Asegúrese de ingresar un valor numérico válido");
                scanner.nextLine();
            }

            int tipoU = -1;
            switch (opcion) {
                
                case 1:
                    int id = 0;
                    String nombre = "";
                    String apellido = "";
                    String email = "";
                    int edad = 0;

                    try {
                        System.out.println("Ingrese los datos requeridos para la creación de usuario");
                        System.out.println("ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nombre: ");
                        nombre = scanner.nextLine();
                        System.out.println("Apellido: ");
                        apellido = scanner.nextLine();
                        System.out.println("Email: ");
                        email = scanner.nextLine();
                        System.out.println("Edad: ");
                        edad = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Asegúrse de ingresar el tipo de valor correcto. Error: " + e.toString());
                        scanner.nextLine();
                        break;
                    }


                    tipoU = -1;
                    try {
                        System.out.println("Ingrese el tipo de usario para registrar datos específicos.");
                        System.out.println(" 1. Cliente \n 2. Repartidor \n 3. Proveedor");
                        tipoU = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Asegúrese de ingresar un valor numérico. Error: " + e.toString());
                        scanner.nextLine();
                        break;
                    }

                    switch (tipoU) {
                        case 1:
                            String tipo = "";

                            try {
                                System.out.println("Tipo de cliente. \n 1. Estudiante \n 2. Docente \n 3. Personal Administrativo");
                                int tipoC = scanner.nextInt();
                                scanner.nextLine();

                                switch (tipoC) {
                                    case 1:
                                        tipo = "Estudiante";
                                        break;
                                
                                    case 2: 
                                        tipo = "Docente";
                                        break;

                                    case 3:
                                        tipo = "Personal administrativo";
                                        break;
                                }
                            } catch (Exception e) {
                                System.out.println("Asegúrese de ingresar un valor numérico. Error: " + e.toString());
                                scanner.nextLine();
                                break;
                            }

                            try {
                                food.agregarCliente(id, nombre, apellido, email, edad, tipo);
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                            }
                            break;
                    
                        case 2:
                            try {
                                food.agregarRepartidor(id, nombre, apellido, email, edad);
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                            }
                            break;

                        case 3:
                            String rest = "";
                            int nivAccess = -1;    

                            try {
                                System.out.println("Restaurante donde labora: ");
                                rest = scanner.nextLine();
                                System.out.println("Nivel de acesso: ");
                                nivAccess = scanner.nextInt();
                                scanner.nextLine();

                            } catch (Exception e) {
                                System.out.println("Asegúrese de ingresar un valor numérico. Error: " + e.toString());
                                scanner.nextLine();
                                break;
                            }

                            try {
                                food.agregarProveedor(id, nombre, apellido, email, edad, rest, nivAccess);
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                            }
                            break;
                    }
                    

                    break;
            
                case 2:
                    tipoU = -1;
                    try {
                        System.out.println("Ingrese el tipo de usario para registrar datos específicos.");
                        System.out.println("1. Cliente \n 2. Repartidor \n 3. Proveedor");
                        tipoU = scanner.nextInt();
                        scanner.nextLine();

                        if(tipoU < 1 || tipoU > 3){
                            System.out.println("Ingrese únicamente un valor numérico dentro del rango");
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Asegúrese de ingresar un valor numérico. Error: " + e.toString());
                        scanner.nextLine();
                        break;
                    }

                    int idLogin = -1;
                    try {
                        System.out.println("Ingrese su id");
                        idLogin = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Asegúrese de ingresar un valor numérico. Error: " + e.toString());
                        scanner.nextLine();
                        break;
                    }

                    try {
                        System.out.println(food.iniciarUsuario(idLogin, tipoU));
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                    }
                    break;

                case 3:
                    try {
                        System.out.println(food.mostrarClientes());
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                    }
                    break;

                case 4:
                    try {
                        System.out.println(food.mostrarRepartidores());
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                    }
                    break;

                case 5:
                    try {
                        System.out.println(food.mostrarProveedores());
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                    }
                    break;
            }


        }
    }

    public void mostrarMenuCliente() {
        boolean seguirEnMenu = true;
        while (seguirEnMenu) {
            System.out.println("\nMenu de Cliente:");
            System.out.println("1. Solicitar pedido inmediato");
            System.out.println("2. Calendarizar pedido");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Modificar pedido");
            System.out.println("5. Monitorear estado del pedido");
            System.out.println("6. Confirmar entrega del pedido");
            System.out.println("7. Modificar informacion del perfil");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1: 
                    //Metodo
                    break;

                case 2:
                    //Metodo
                    break;

                case 3:
                    //Metodo
                    break;

                case 4: 
                    //Metodo
                    break;

                case 5: 
                    //Metodo
                    break;

                case 6: 
                    //Metodo
                    break; 
                
                case 7: 
                    //Metodo
                    break;

                case 8: 
                    seguirEnMenu = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;


            }
        }
    }

    private void solicitarPedidoSubMenu() {
        boolean seguirEnSubMenu = true;
        while (seguirEnSubMenu) {
            System.out.println("\nSolicitar Pedido:");
            System.out.println("1. Elegir Menu");
            System.out.println("2. Elegir metodo de pago");
            System.out.println("3. Confirmar orden");
            System.out.println("4. Volver al menu principal");

            System.out.print("Seleccione una opcion: ");
            int opcionSubMenu = Integer.parseInt(scanner.nextLine());

            switch (opcionSubMenu) {
                case 1: 
                    //Metodo
                    break;

                case 2:
                    //Metodo
                    break;

                case 3:
                    //Metodo
                    break;

                case 4: 
                    seguirEnSubMenu = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }

    private void confirmarEntregaSubMenu() {
        boolean seguirEnSubMenu = true;
        while (seguirEnSubMenu) {
            System.out.println("\nConfirmar Entrega del Pedido");
            System.out.println("1. Confirmar pedido");
            System.out.println("2. Calificar atencion del repartidor");
            System.out.println("3. Volver al menu principal");

            System.out.print("Seleccione una opcion: ");
            int opcionSubMenu = Integer.parseInt(scanner.nextLine());

            switch (opcionSubMenu) {
                case 1: 
                    //Metodo
                    break;

                case 2:
                    //Metodo
                    break;

                case 3:
                    //Metodo
                    break;

                case 4: 
                    seguirEnSubMenu = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }

    public void menuProveedor() {
        boolean seguirEnMenu = true;

        while (seguirEnMenu) {
            System.out.println("\n--- Menú del proveedor ---");
            System.out.println("1. Agregar/eliminar establecimientos");
            System.out.println("2. Agregar/eliminar opciones del menú");
            System.out.println("3. Modificar menús existentes");
            System.out.println("4. Personalizar pantalla principal de un negocio");
            System.out.println("5. Modificar datos de la pantalla principal");
            System.out.println("6. Modificar disponiblidad de pedidos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    //Método para agregar/eliminar establecimientos
                    break;
                case 2:
                    //Método para agregar/eliminar opciones del menú
                    break;
                case 3:
                    //Método para modificar menús existentes
                    break;
                case 4:
                    //Método para personalizar pantalla principal de un negocio
                    break;
                case 5:
                    //Método para modificar datos de la pantalla principal
                    break;
                case 6:
                    //Método para modificar disponiblididad de pedidos
                    break;
                case 7:
                    seguirEnMenu = false;
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        }
    }
}