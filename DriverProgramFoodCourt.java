import java.util.Scanner;
import java.util.ArrayList;

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
            System.out.println("¡Bienvenido al menu de usuario! Ingrese la opción que desea ejecutar.");
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
                                System.out.println("Index del restaurante donde labora: ");
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
                        if(tipoU == 1){
                            mostrarMenuCliente();
                        }
                        else if(tipoU == 2){
                            menuRepartidores();
                        }
                        else if(tipoU == 3){ 
                            if(food.getIdRestProveedor() == -1){
                                System.out.println("Ha ocurrido un error tratando de seleccionar el id del restaurante del proveedor actual");
                                break;
                            }
                            food.iniciarRest(food.getIdRestProveedor());
                            menuProveedor();
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

    public static void mostrarMenuCliente() {
        boolean seguirEnMenu = true;
        while (seguirEnMenu) {
            System.out.println("\nMenu de Cliente:");
            System.out.println("1. Solicitar pedido inmediato");
            //System.out.println("2. Calendarizar pedido");
            System.out.println("3. Cancelar pedido");
            //System.out.println("4. Modificar pedido");
            //System.out.println("5. Monitorear estado del pedido");
            System.out.println("6. Confirmar entrega del pedido");
            //System.out.println("7. Modificar informacion del perfil");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1: 
                    int idClienteA = -1;
                    try {
                        idClienteA = food.getIndexUsuarioA();
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                    }

                    int idPedido = -1;
                    System.out.println("Ingrese el id de su pedido");
                    try {
                        idPedido = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Asegúrse de ingresar un valor numérico. Error: " + e.toString());
                        scanner.nextLine();
                        break;
                    }

                    System.out.println("Elija el restaurante para su pedido:");
                    if(!food.existeRestaurantes()){
                        System.out.println("Aún no se han ingresado al menos un restaurante para realizar la operación");
                        break;
                    }
                    System.out.println(food.mostrarRestaurantes());
                    System.out.println("Ingrese el id del restaurante seleccionado");
                    int idRestaurante = -1;

                    try {
                        idRestaurante = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Asegúrse de ingresar un valor numérico. Error: " + e.toString());
                        scanner.nextLine();
                        break;
                    }
                    

                    try {
                        food.iniciarRest(idRestaurante);
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación, asegúrse de ingresar un id válido. Error: " + e.toString());
                    }

                    int productoId = -1;
                    ArrayList<Integer> idProductos = new ArrayList<Integer>();
                    try {
                        System.out.println("Elija el menu: ");
                        System.out.println(food.mostrarProductos());
                        System.out.println("Ingrese el id del producto a comprar");
                        productoId = scanner.nextInt();
                        scanner.nextLine();
                        idProductos.add(productoId);
                    } catch (Exception e) {
                        System.out.println("Asegúrse de ingresar un id válido. Error: " + e.toString());
                    }
                    
                    System.out.println("Ingrese el punto para recoger su pedido");
                    String local = "";

                    try {
                        local = scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error: " + e.toString());

                    }

                    //Crear un nuevo pedido
                    try {
                        Pedido pedido = new Pedido(idPedido, idClienteA, idRestaurante, local, idProductos);
                        food.agregarPedido(pedido);
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                    }
                    
                    //boolean exito = SistemaPedidos.solicitarPedido(pedido);

                    break;

                case 2:
                    System.out.println("Elija la fecha y hora para su pedido (formato DD/MM/YYYY HH:MM)");
                    String fechaHora = scanner.nextLine();

                    System.out.println("COMING SOON...");

                case 3:
                    System.out.println("Ingrese el ID del pedido que desea cancelar: ");
                    int pedidoId = -1;

                    try {
                        pedidoId = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Asegúrse de ingresar un valor numérico");
                    }

                    try {
                        food.eliminarPedido(pedidoId);
                        System.out.println("Pedido eliminado exitosamente");
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString());
                    }
                    
                    break;

                case 4: 
                    System.out.println("COMING SOON... ");
                    break;

                case 5: 
                    System.out.println("COMING SOON... ");
                    break;

                case 6: 
                    System.out.println("COMING SOON...");
        
                    break; 
                
                case 7: 
                    System.out.println("COMING SOON...");
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
                    String[] menus = {"Pizza", "Sushi", "Hamburguesa", "Ensalada", "Pasta"};
                    System.out.println("Elija el menu de su preferencia:");
                    for (int i = 0; i < menus.length; i++) {
                        System.out.println((i+1) + ". " + menus[i]);
                    }
                    System.out.print("Ingrese el numero del menu que desea: ");
                    int eleccion = Integer.parseInt(scanner.nextLine());
                    if (eleccion > 0 && eleccion <= menus.length) {
                        System.out.println("Usted ha elegido el menu: " + menus[eleccion-1]);
                    } else {
                        System.out.println("Ingrese una opcion valida");
                    }
                    break;

                case 2:
                    String[] metodosPago = {"Tarjeta de credito", "Tarjeta de debito", "Efectivo"};
                    System.out.println("Elija el metodo de pago de su preferencia:");
                    System.out.println("COMING SOON...");
                    /*for (int i = 0; i < metodosPago.length; i++) {
                        System.out.println((i+1) + ". " + metodosPago[i]);
                    }
                    System.out.print("Ingrese el numero del metodo de pago que desea: ");
                    int eleccion = Integer.parseInt(scanner.nextLine());
                    if (eleccion > 0 && eleccion <= metodosPago.length) {
                        System.out.println("Usted ha elegido el metodo de pago: " + metodosPago[eleccion-1]);
                    } else {
                        System.out.println("Ingrese una opcion valida");
                    }*/
                    break;

                case 3:
                    System.out.println("COMING SOON...");
                    /*System.out.println("Su pedido es el siguiente:");
                    System.out.println(pedidoActual.resumenPedido());
                    System.out.println("Desea confirmar su pedido? (si/no)");
                    String confirmacion = scanner.nextLine();
                    if (confirmacion.equals("si")) {
                        System.out.println("Su pedido ha sido confirmado");
                        seguirEnSubMenu = false;
                    } else if (confirmacion.equals("no")) {
                        System.out.println("Su pedido ha sido cancelado");
                        seguirEnSubMenu = false;
                    } else {
                        System.out.println("Ingrese una opcion valida");
                    }*/
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
        while (seguirEnSubMenu){
            System.out.println("\nConfirmar Entrega del Pedido:");
            System.out.println("1. Confirmar pedido");
            System.out.println("2. Calificar Atencion del repartidor");
            System.out.println("3. Volver al menu principal");

            System.out.print("Seleccione una opcion: ");
            int opcionSubMenu = Integer.parseInt(scanner.nextLine());

            switch (opcionSubMenu) {
                case 1: 
                    System.out.println("COMING SOON...");
                    /*if (pedidoActual != null && !pedidoActual.isEntregado()){
                        pedidoActual.setEntregado(true);
                        System.out.println("Su pedido ha sido entregado");
                    } else {
                        System.out.println("No tiene ningun pedido pendiente");
                    }
                    seguirEnSubMenu = false;*/
                    break;

                case 2:
                    System.out.println("Califique la atencion del repartidor (1-5):");
                    int calificacion = Integer.parseInt(scanner.nextLine());
                    if (calificacion >= 1 && calificacion <= 5) {
                        System.out.println("Su calificacion ha sido registrada");
                    } else {
                        System.out.println("Ingrese una calificacion valida");
                    }
                    System.out.println("COMING SOON...");
                    break;

                case 3: 
                    seguirEnSubMenu = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }

    public static void menuProveedor() {
        boolean seguirEnMenu = true;

        while (seguirEnMenu) {
            System.out.println("\n--- Menú del proveedor ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar producto");
           /*System.out.println("4. Modificar menús existentes");
            System.out.println("5. Personalizar pantalla principal de un negocio");
            System.out.println("6. Modificar datos de la pantalla principal");*/
            System.out.println("7. Modificar disponiblidad del restaurante");
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
                    System.out.println("Ingrese el estado de disponibilidad actual para recibir pedidos");
                    System.out.println(" 1. Disponible \n 2. No disponible");
                    int dispIndex = -1;

                    try {
                        dispIndex = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Ingrese un valor numérico válido. Error: " + e.toString());
                        scanner.nextLine();
                    }

                    try {
                        if(dispIndex == 1){
                            food.cambiarDisponibilidadRest(true);
                        }else if(dispIndex == 2){
                            food.cambiarDisponibilidadRest(false);
                        }else{
                            System.out.println("Ingrese una opción válida");
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    break;
                case 8:
                    seguirEnMenu = false;
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        }
    }

    public static void menuRepartidores(){
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

}