import java.util.Scanner;

public class DriverProgramFoodCourt{
    static Scanner scanner = new Scanner(System.in);
    static FoodCourtUVG food = new FoodCourtUVG();
    public static void main(String[] args){
        /*DriverProgramFoodCourt program = new DriverProgramFoodCourt();
       
        program.menuProveedor();*/
        menuUsuario();

    }

    public static void menuUsuario(){
        boolean menuUsuario = true;

        while(menuUsuario){
            System.out.println("¡Bienvenido al menu de cliente! Ingrese la opción que desea ejecutar.");
            System.out.println(" 1. Agregar Usuario (Cliente, Proveedor, Repartidor) \n 2. Iniciar sesión (Cliente, Proveedor, Repartidor) \n 3. Mostrar clientes \n 4. Mostrar repartidores \n 5. Mostrar proveedores \n 6. Agregar restaurante \n 7. Mostrar restaurantes");
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
                            if(!food.existeRestaurantes()){
                                System.out.println("Debe crear almenos un restaurante antes de agregar proveedores");
                                break;
                            }
                            String rest = "";
                            int restIndex = -1;
                            int nivAccess = -1;    

                            try {
                                System.out.println(food.mostrarRestaurantes());
                                System.out.println("Id del restaurante donde labora: ");
                                restIndex = scanner.nextInt();
                                scanner.nextLine();
                                rest = food.nombreRestaurante(restIndex);
                                if(rest == null){
                                    System.out.println("Ingrese un índice de restaurante válido");
                                    break;
                                }
                                System.out.println("Nivel de acesso: ");
                                nivAccess = scanner.nextInt();
                                scanner.nextLine();

                            } catch (Exception e) {
                                System.out.println("Asegúrese de ingresar un valor numérico válido. Error: " + e.toString());
                                scanner.nextLine();
                                break;
                            }

                            try {
                                food.agregarProveedor(id, nombre, apellido, email, edad, rest, restIndex, nivAccess);
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                            }
                            break;
                    }
                    break;
            
                case 2:
                    tipoU = -1;
                    try {
                        System.out.println("Ingrese el tipo de usario para inicio de sesión.");
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
                        if(tipoU == 3){ 
                            if(food.getIdRestProveedor() == -1){
                                System.out.println("Ha ocurrido un error tratando de seleccionar el id del restaurante del proveedor actual");
                                break;
                            }
                            food.iniciarRest(food.getIdRestProveedor());
                        }

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

                case 6:
                    int idRest = -1;
                    String nombreR = "";
                    String des = "";
                    String horario = "";
                    boolean disp = false;

                    try {
                        System.out.println("Ingreso de información solicitada para la creación de un nuevo restaurante");
                        System.out.println("Id: ");
                        idRest = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nombre: ");
                        nombreR = scanner.nextLine();
                        System.out.println("Descripción: ");
                        des = scanner.nextLine();
                        System.out.println("Horario: ");
                        horario = scanner.nextLine();
                        System.out.println("Disponibilidad para antender: \n 1. Disponible \n 2. No disponible");
                        int dispInt = scanner.nextInt();
                        scanner.nextLine();

                        if(dispInt == 1){
                            disp = true;
                        }else if(dispInt == 2){
                            disp = false;
                        }else{
                            System.out.println("Ingrese únicamente un valor válido");
                            break;
                        }
                        } catch (Exception e) {
                        System.out.println("Asegúrese de ingresar un valor válido. Error: " + e.toString());
                        scanner.nextLine();
                        break;
                    }
                    try {
                        food.agregarRest(idRest, nombreR, des, horario, disp);
                        System.out.println("Restaurante " + nombreR + " agregado exitosamente");
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación.Error: " + e.toString());
                    }
                    break;

                case 7: 
                    try {
                        System.out.println(food.mostrarRestaurantes());
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación");
                    }
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
                    System.out.println("Elija el restaurante para su pedido:");
                    String restaurante = scanner.nextLine();
                    System.out.println("Elija el menu: ");
                    String menu = scanner.nextLine();

                    //Crear un nuevo pedido
                    Pedido pedido = new Pedido(restaurante, menu);
                    boolean exito = SistemaPedidos.solicitarPedido(pedido);

                    if(exito){
                        System.out.println("Su pedido del restaurante " + restaurante + " con el menu " + menu + " ha sido solicitado." );
                    }else{
                        System.out.println("No se ha podido solicitar su pedido. Intente de nuevo.");
                    }
                    break;

                case 2:
                    System.out.println("Elija la fecha y hora para su pedido (formato DD/MM/YYYY HH:MM)");
                    String fechaHora = scanner.nextLine();

                    Pedido pedido = new Pedido();
                    pedido.setFechaHora(fechaHora); 
                    boolean exito = SistemaPedidos.solicitarPedido(pedido);

                    if(exito){
                        System.out.println("Su pedido para la fecha " + fechaHora + " ha sido solicitado." );
                    }else{
                        System.out.println("No se ha podido solicitar su pedido. Intente de nuevo.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el ID del pedido que desea cancelar: ");
                    String pedidoId = scanner.nextLine();

                    boolean exito = SistemaPedidos.cancelarPedido(pedidoId);

                    if(exito){
                        System.out.println("Su pedido con el ID " + pedidoId + " ha sido cancelado." );
                    }else{
                        System.out.println("No se ha podido cancelar su pedido. Intente de nuevo.");
                    }
                    break;

                case 4: 
                    System.out.println("Ingrese el ID del pedido que desea modificar: ");
                    String pedidoId = scanner.nextLine();

                    boolean exito = SistemaPedidos.modificarPedido(pedidoId);

                    if(exito){
                        System.out.println("Su pedido con el ID " + pedidoId + " ha sido modificado." );
                    }else{
                        System.out.println("No se ha podido modificar su pedido. Intente de nuevo.");
                    }
                    break;

                case 5: 
                    System.out.println("Ingrese el ID del pedido cuyo estado desea mopnitorear: ");
                    String pedidoId = scanner.nextLine();

                    String estado = SistemaPedidos.monitorearPedido(pedidoId);
                    System.out.println("El estado de su pedido " + pedidoID + " es: " + estado);
                    break;

                case 6: 
                    System.out.println("Ingrese el ID del pedido que desea confirmar su entrega:");
                    String pedidoId = scanner.nextLine();

                    boolean exito = SistemaPedidos.confirmarEntrega(pedidoId);

                    if(exito){
                        System.out.println("Su pedido con el ID " + pedidoId + " ha sido confirmado." );
                    }else{
                        System.out.println("No se ha podido confirmar su pedido. Intente de nuevo.");
                    }
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

    public void menuProveedor() {
        boolean seguirEnMenu = true;

        while (seguirEnMenu) {
            System.out.println("\n--- Menú del proveedor ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar opciones del menu");
            System.out.println("3. Mostrar menús");
            System.out.println("4. Modificar menús existentes");
            System.out.println("5. Personalizar pantalla principal de un negocio");
            System.out.println("6. Modificar datos de la pantalla principal");
            System.out.println("7. Modificar disponiblidad de pedidos");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los detalles del nuevo producto: ");
                    System.out.print("ID del producto: ");
                    int idProducto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: "); 
                    String titulo = scanner.nextLine();
                    System.out.print("Detalles: ");
                    String detalles = scanner.nextLine();
                    System.out.print("Costo: ");
                    double costo = scanner.nextDouble();
                    System.out.print("Disponible (true/false): ");
                    boolean disponible = scanner.nextBoolean();
                    scanner.nextLine();

                    food.agregarProducto(idProducto, titulo, detalles, costo, disponible);
                    System.out.println("Se ha agregado el producto exitosamente.");
                    break;
                case 2:
                    //eliminar menús
                    System.out.println("Ingrese el ID del producto a eliminar: ");
                    int idProductoe = scanner.nextInt();
                    food.eliminarProducto(idProductoe);
                    System.out.println("Producto eliminado exitosamente");
                    break;
                case 3:
                    //mostrar menús
                    String productos = food.mostrarProductos();
                    System.out.println(productos);
                    break;
                case 4:
                    //Método para modificar menús existentes
                    break;
                case 5:
                    //Método para personalizar pantalla principal de un negocio
                    break;
                case 6:
                    //Método para modificar datos de la pantalla principal
                    break;
                case 7:
                    //Método para modificar disponiblididad de pedidos
                    break;
                case 8:
                    seguirEnMenu = false;
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        }
    }

    public void menuRepartidores(){
        boolean menu = true;

        while(menu){
            System.out.println("-- Menú del repartidor --");
            System.out.println(" 1. Ingresar horario de turno \n 2. Modificar horario \n 3. Cancelar turno \n 4. Finalizar turno actual \n 5. Buscar pedidos disponibles  \n 5. Cancelar pedido actual \n 6. Resumen de trabajo \n 7. Personalizar pantalla de inicio");
            int opcion = -1;

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Asegúrese de ingresar un valor numérico. Error: " + e.toString());
            }

            switch (opcion) {
                case 1:
                    
                    break;
            
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    try {
                        System.out.println(food.mostrarPedidos());
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido una error trantando de realizar la operación. Error: " + e.toString());
                    }

                    
                    
                    break;

                case 6: 

                    break;

                case 7: 

                    break;

                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        }
    }

    public void menuRestaurante(){

    }
}