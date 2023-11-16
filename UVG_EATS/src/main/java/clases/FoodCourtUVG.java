/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author 50256
 */
import java.util.ArrayList;

public class FoodCourtUVG{
    /*
    private ArrayList<Cliente> clientes;
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<Repartidor> repartidores;
    private ArrayList<Proveedor> proveedores;
    private PedidoManager pedidoManager;
    private Cliente clienteA;
    private int indexCA;
    private Repartidor repartidorA;
    private int indexRA;
    private Restaurante restA;
    private int indexRestA;
    private int indexPA;
    */

    private ArrayList<Usuario> usuarios;
    private Usuario usuarioA;
    private int indexA;
    private ArrayList<Restaurante> restaurantes;
    private Restaurante restauranteA;
    private int indexR;
    private PedidoManager pedidoManager;
    private ArchivoUsuario archivoUsuario;
    private ArchivoRestaurante archivoRestaurante;
    
    private static volatile FoodCourtUVG single_instance;

    private FoodCourtUVG() throws Exception{
        archivoUsuario = new ArchivoUsuario("clientes.csv", "proveedores.csv", "repartidores.csv");
        archivoRestaurante = new ArchivoRestaurante("restaurantes.csv");
        usuarios = archivoUsuario.leerArchivo();
        restaurantes = archivoRestaurante.leerArchivo();
        pedidoManager = new PedidoManager();
        
    }
    
    public static FoodCourtUVG getInstance() throws Exception{
        FoodCourtUVG result = single_instance;
        if(result == null){
            //System.out.println("NUEVO");
            synchronized(FoodCourtUVG.class){
                result = single_instance;
                if(single_instance == null){
                    single_instance = result = new FoodCourtUVG();
                }
            }
            
        }
        return result;
    }

    public void setUsuarioA(Usuario usuario){
        if(usuarioA != null){
            usuarios.set(indexA, usuario);
        }

        usuarioA = null;

        if(usuario instanceof Cliente){
            usuarioA = new Cliente(usuario.getId(),usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getEdad(), ((Cliente)usuario).getTipo());
        }
        else if(usuario instanceof Repartidor){
            usuarioA = new Repartidor(usuario.getId(),usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getEdad());
        }
        else if(usuario instanceof Proveedor){
            usuarioA = new Proveedor(usuario.getId(),usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getEdad(), ((Proveedor)usuario).getRest(), ((Proveedor)usuario).getIdRest(),((Proveedor)usuario).getNivAccess());
        }

        indexA = usuarios.indexOf(usuario);
    }

    public int getIndexUsuarioA(){
        return usuarioA.getId();
    }

    public ArrayList<Restaurante> getRestaurantes(){
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantesP){
        if(!restaurantesP.isEmpty()){
            restaurantes.clear();
            for(Restaurante restaurante : restaurantesP){
                Restaurante copia = new Restaurante(restaurante.getIdRest(),restaurante.getNombre(), restaurante.getDes(), restaurante.getHorario(), restaurante.getDisp());
                restaurantes.add(copia);
            }
        }
    }


    public PedidoManager getPedidoManager(){
        return pedidoManager;
    }

    public void setPedidoManager(PedidoManager pedidoManagerP){
        pedidoManager.setPedidos(pedidoManagerP.getPedidos());
    }

    
    public Restaurante getRestA(){
        return restauranteA;
    }

    public void setRestA(Restaurante restauranteP){
        if(restauranteA != null){
            restaurantes.set(indexA, restauranteA);
        }

        restauranteA = null;
        restauranteA = new Restaurante(restauranteP.getIdRest(), restauranteP.getNombre(), restauranteP.getDes(), restauranteP.getHorario(), restauranteP.getDisp(), restauranteP.getProductos());

        indexR = restaurantes.indexOf(restauranteP);
        
    }

    public int getIndexRestA(){
        return indexR;
    }

    public void agregarCliente(int id, String nombre, String apellido, String email, int edad, String tipo){
        Cliente nuevo = new Cliente(id, nombre, apellido, email, edad, tipo);
        usuarios.add(nuevo);
    }

    public String mostrarClientes(){
        String text = "";
        int i = 0;
        if(!usuarios.isEmpty()){
            for(Usuario usuario : usuarios){
                if(usuario instanceof Cliente){
                    text = text + i + ". " + ((Cliente)usuario).toString() + "\n"; 
                }
            }
            /*
            for (Cliente cliente : clientes){
                text = text + i + ". " + cliente.toString() + "\n";
            }
            */
        }
        else {
            text = "Aún no se han registrado clientes";
        }

        return text;
    }

    public void agregarRepartidor(int id, String nombre, String apellido, String email, int edad){
        Repartidor nuevo = new Repartidor(id, nombre, apellido, email, edad);
        usuarios.add(nuevo);
    }


    public String mostrarRepartidores(){
        String text = "";
        int i = 0;

        if(!usuarios.isEmpty()){
            for(Usuario usuario : usuarios){
                if(usuario instanceof Repartidor){
                    text = text + i + ". " + ((Repartidor)usuario).toString() + "\n"; 
                }
            }
        }
        /*
        if(!repartidores.isEmpty()){
            for (Repartidor repartidor : repartidores){
                text = text + i + ". " + repartidor.toString() + "\n";
            }
        }
        */
        else {
            text = "Aún no se han registrado repartidores";
        }

        return text;
    }

    public void agregarProveedor(int id, String nombre, String apellido, String email, int edad, String rest, int idRest, int nivAccess){
        Proveedor nuevo = new Proveedor(id, nombre, apellido, email, edad, rest, idRest, nivAccess);
        usuarios.add(nuevo);
    }


    public String mostrarProveedores(){
        String text = "";
        int i = 0;
        if(!usuarios.isEmpty()){
            for(Usuario usuario : usuarios){
                if(usuario instanceof Proveedor){
                    text = text + i + ". " + ((Proveedor)usuario).toString() + "\n"; 
                }
            }
        }
        else {
            text = "Aún no se han registrado repartidores";
        }

        return text;
    }

    public String iniciarUsuario(int id, int tipoU){
        String text = "";
        if(!usuarios.isEmpty()){
            for(Usuario usuario : usuarios){
                
                switch (tipoU) {
                    case 1:
                        if((usuario instanceof Cliente) && usuario.getId() == id){
                            setUsuarioA(usuario);
                            text = "Bienvenido " + usuario.getNombre() + " " + usuario.getApellido();
                            break;
                        }else{
                            text = "No se ha encontrado ningún cliente con el id " + id;
                        }
                        break;
                
                    case 2: 
                        if((usuario instanceof Repartidor) && usuario.getId() == id){
                            setUsuarioA(usuario);
                            text = "Bienvenido " + usuario.getNombre() + " " + usuario.getApellido();
                            break;
                        }else{
                            text = "No se ha encontrado ningún cliente con el id " + id;
                        }
                        break;

                    case 3:
                        if((usuario instanceof Proveedor) && usuario.getId() == id){
                            setUsuarioA(usuario);
                            text = "Bienvenido " + usuario.getNombre() + " " + usuario.getApellido();
                            break;
                        }else{
                            text = "No se ha encontrado ningún cliente con el id " + id;
                        }
                        break;
                }
            }
 
        }
        return text;
    }

    public void agregarRest(int idRest, String nombre, String des, String horario, boolean disp){
        Restaurante nuevo = new Restaurante(idRest, nombre, des, horario, disp);
        restaurantes.add(nuevo);
    } 

    public void iniciarRest(int idRest){
        if(!restaurantes.isEmpty()){
            for (Restaurante rest : restaurantes){
                if (rest.getIdRest() == idRest){
                    setRestA(rest);
                    indexR = restaurantes.indexOf(rest);
                }
            }
        }
        
    }

    public String mostrarRestaurantes(){
        String text = "";
        
        if(!restaurantes.isEmpty()){
            for (Restaurante rest : restaurantes){
                text = text + ". " + rest.toString()+ "|" ;;
            }
        }
        else {
            text = "Aún no se han registrado restaurantes";
        }

        return text;
    }
    
    public String mostrarRestaurantesParaMenu(){
        String text = "";
        if(!restaurantes.isEmpty()){
            for (Restaurante rest : restaurantes){
                text = text + "Nombre: " + rest.getNombre()+ ";" ;
            }
        }
        else {
            text = "Aún no se han registrado restaurantes";
        }

        return text;
    }
    
    public String obtenerIndexRestaurantesMenu(){
        String text = "";
        if(!restaurantes.isEmpty()){
            for (Restaurante rest : restaurantes){
                text = text + rest.getIdRest()+ ";" ;
            }
        }
        else {
            text = "Aún no se han registrado restaurantes";
        }

        return text;
    }

    public boolean existeRestaurantes(){
        return !restaurantes.isEmpty();
    }

    public void cambiarDisponibilidadRest(boolean disp){
        restauranteA.setDisp(disp);
    }
    public String nombreRestaurante(int id){
        if(!restaurantes.isEmpty()){
            return "No se ha ingresado ningún restaurante";
        }
        for(Restaurante restaurante : restaurantes){
            if(restaurante.getIdRest() == id){
                return restaurante.getNombre();
            }
        }
        return "No existe ningún restaurante con el ID indicado";
    }

    public int getIdRestProveedor(){
        if(!(usuarioA instanceof Proveedor)){
            return -1;
        }
        return ((Proveedor)usuarioA).getIdRest();
    }

    public void agregarProducto(int idProducto, String titulo, String detalles, double costo, boolean disponible){
        Producto nuevo = new Producto(idProducto, titulo, detalles, costo, disponible);
        restauranteA.agregarProducto(nuevo);
        restaurantes.set(indexR, restauranteA);
    }

    public void eliminarProducto(int idProductoe){
        restauranteA.eliminarProducto(restauranteA.getProductoById( idProductoe));
    }

    public String mostrarProductos(){
        return restauranteA.mostrarProductos();
    }

    public void agregarPedido(Pedido pedido){
        pedidoManager.agregarPedido(pedido);
    }

    public void eliminarPedido(int index){
        pedidoManager.eliminarPedido(index);
    }

    public void asignarRepartidor(int index, Repartidor repartidor){
        pedidoManager.asignarRepartidor(index, repartidor);
    }

    public String mostrarPedidos(){
        return pedidoManager.mostrarPedidos();
    }
    
    public boolean guardarUsuarios() throws Exception{
        return archivoUsuario.escribirArchivo(usuarios);
    }
    
    public boolean guardarRestaurantes() throws Exception{
        return archivoRestaurante.escribirArchivo(restaurantes);
    }
}
