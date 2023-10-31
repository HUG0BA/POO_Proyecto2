import java.util.Scanner;

public class DriverProgramFoodCourt{
    Scanner scanner = new Scanner(System.in);
    FoodCourtUVG food = new FoodCourtUVG();
    public static void main(String[] args){
        
    }

    public void menuUsuario(){
        boolean menuUsuario = true;

        while(menuUsuario){
            System.out.println("¡Bienvenido al menu de cliente! Ingrese la opción que desea ejecutar.");
            System.out.println("1. Agregar Usuario (Cliente, Proveedor, Repartidor) \n 2. Iniciar sesión (Cliente, Proveedor, Repartidor)");
            int opcion = -1;

            try{
                opcion = scanner.nextInt();
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Asegúrese de ingresar un valor numérico válido");
                scanner.nextLine();
            }

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


                    int tipoU = -1;
                    try {
                        System.out.println("Ingrese el tipo de usario para registrar datos específicos.");
                        System.out.println("1. Cliente \n 2. Repartidor \n 3. Proveedor");
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
                            break;
                    }
                    

                    break;
            
                case 2:

                    break;

                case 3:

                    break;  
            }


        }
    }
    
}
