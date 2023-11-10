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
    
    private static FoodCourtUVG single_instance = null;

    private FoodCourtUVG(){
        usuarios = new ArrayList<Usuario>();
        restaurantes = new ArrayList<Restaurante>();
        pedidoManager = new PedidoManager();
        /*
        clientes = new ArrayList<Cliente>();
        restaurantes = new ArrayList<Restaurante>();
        repartidores = new ArrayList<Repartidor>();
        proveedores = new ArrayList<Proveedor>();
        pedidoManager = new PedidoManager();
        indexCA = -1;
        indexRA = -1;
        indexRestA = -1;
        */
    }
    
    public static synchronized FoodCourtUVG getInstance(){
        if(single_instance == null){
            System.out.println("NUEVO");
            single_instance = new FoodCourtUVG();
        }
        return single_instance;
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
    /* 
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientesP){
        if(!clientesP.isEmpty()){
            clientes.clear();
            for(Cliente cliente : clientesP){
                Cliente copia = new Cliente(cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getEmail(), cliente.getEdad(), cliente.getTipo());
                clientes.add(copia);
            }
        }
    }
    */

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

    /*
    public ArrayList<Repartidor> getRepartidores(){
        return repartidores;
    }

    public void setRepartidores(ArrayList<Repartidor> repartidoresP){
        if(!repartidoresP.isEmpty()){
            repartidores.clear();
            for(Repartidor repartidor : repartidoresP){
                Repartidor copia = new Repartidor(repartidor.getId(), repartidor.getNombre(), repartidor.getApellido(), repartidor.getEmail(), repartidor.getEdad());
                repartidores.add(copia);
            }
        }
    }
    */

    public PedidoManager getPedidoManager(){
        return pedidoManager;
    }

    public void setPedidoManager(PedidoManager pedidoManagerP){
        pedidoManager.setPedidos(pedidoManagerP.getPedidos());
    }

    /*
    public Cliente getClienteA(){
        return clienteA;
    }

    public void setClienteA(Cliente clienteP){

        if()

        
        clienteA.setId(clienteP.getId());
        clienteA.setNombre(clienteP.getNombre());
        clienteA.setApellido(clienteP.getApellido());
        clienteA.setEmail(clienteP.getEmail());
        clienteA.setEdad(clienteP.getEdad());
        clienteA.setTipo(clienteP.getTipo());
        clienteA.setTotalP(clienteP.getTotalP());
        clienteA.setTotalPE(clienteP.getTotalPE());
        clienteA.setTotalPC(clienteP.getTotalP());    
        clienteA.setMetPag(clienteP.getMetPag());
        clienteA.setCalif(clienteP.getCalif());
        
    }
    */

    /*
    public int getIndexCA(){
        return indexCA;
    }

    public void setindexCA(int indexCA){
        this.indexCA = indexCA;
    }

    public Repartidor getRepartidorA(){
        return repartidorA;
    }

    public void setRepartidorA(Repartidor repartidorP){
        repartidorA.setId(repartidorP.getId());
        repartidorA.setNombre(repartidorP.getNombre());
        repartidorA.setApellido(repartidorP.getApellido());
        repartidorA.setEmail(repartidorP.getEmail());
        repartidorA.setEdad(repartidorP.getEdad());
        repartidorA.setTotalP(repartidorP.getTotalP());
        repartidorA.setTotalT(repartidorP.getTotalT());
        repartidorA.setTotalPC(repartidorP.getTotalPC());
        repartidorA.setTotalTC(repartidorP.getTotalTC());
        repartidorA.setTotalH(repartidorP.getTotalH());
        repartidorA.setCalif(repartidorP.getCalif());
    }

    public int getIndexRA(){
        return indexRA;
    }

    public void setindexRA(int indexRA){
        this.indexRA = indexRA;
    }

    */
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
        /*
        restA.setIdRest(restauranteP.getIdRest());
        restA.setNombre(restauranteP.getNombre());
        restA.setDes(restauranteP.getDes());
        restA.setHorario(restauranteP.getHorario());
        restA.setDisp(restauranteP.getDisp());
        restA.setProductos(restauranteP.getProductos());
        */
    }

    public int getIndexRestA(){
        return indexR;
    }

    /*
    public void setindexRestA(int indexRestA){
        this.indexRestA = indexRestA;
    }
    */

    public void agregarCliente(int id, String nombre, String apellido, String email, int edad, String tipo){
        Cliente nuevo = new Cliente(id, nombre, apellido, email, edad, tipo);
        usuarios.add(nuevo);
    }

    /*
    public void iniciarCliente(int id){
        if(!clientes.isEmpty()){
            for (Cliente cliente : clientes){
                if (cliente.getId() == id){
                    setClienteA(cliente);
                    indexCA = clientes.indexOf(cliente);
                }
            }
        }
        
    }
    */

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

    /*
    public void iniciarRepartidor(int id){
        if(!repartidores.isEmpty()){
            for (Repartidor repartidor : repartidores){
                if (repartidor.getId() == id){
                    setRepartidorA(repartidor);
                    indexRA = repartidores.indexOf(repartidor);
                }
            }
        }
        
    }
    */

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

    /*
    public void iniciarProveedor(int id){
        if(!proveedores.isEmpty()){
            for (Proveedor proveedor : proveedores){
                if (proveedor.getId() == id){
                    //setRepartidorA(proveedor);
                    indexPA = proveedores.indexOf(proveedor);
                }
            }
        }
        
    }
    */

    public String mostrarProveedores(){
        String text = "";
        int i = 0;
        if(!usuarios.isEmpty()){
            for(Usuario usuario : usuarios){
                if(usuario instanceof Proveedor){
                    text = text + i + ". " + ((Proveedor)usuario).toString() + "\n"; 
                }
            }
            /*
            for (Proveedor proveedor : proveedores){
                text = text + i + ". " + proveedor.toString() + "\n";
            }
            */
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
        /*
        if(!proveedores.isEmpty()){
            for (Proveedor proveedor : proveedores){
                if (proveedor.getId() == id){
                    //setRepartidorA(proveedor);
                    indexPA = proveedores.indexOf(proveedor);
                }
            }
        }
        */
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
}
