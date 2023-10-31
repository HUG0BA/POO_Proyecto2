import java.util.ArrayList;

public class FoodCourtUVG{
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

    public FoodCourtUVG(){
        clientes = new ArrayList<Cliente>();
        restaurantes = new ArrayList<Restaurante>();
        repartidores = new ArrayList<Repartidor>();
        proveedores = new ArrayList<Proveedor>();
        pedidoManager = new PedidoManager();
        indexCA = -1;
        indexRA = -1;
        indexRestA = -1;
    }

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

    public PedidoManager getPedidoManager(){
        return pedidoManager;
    }

    public void setPedidoManager(PedidoManager pedidoManagerP){
        pedidoManager.setPedidos(pedidoManagerP.getPedidos());
    }

    public Cliente getClienteA(){
        return clienteA;
    }

    public void setClienteA(Cliente clienteP){
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

    public Restaurante getRestA(){
        return restA;
    }

    public void setRestA(Restaurante restauranteP){
        restA.setIdRest(restauranteP.getIdRest());
        restA.setNombre(restauranteP.getNombre());
        restA.setDes(restauranteP.getDes());
        restA.setHorario(restauranteP.getHorario());
        restA.setDisp(restauranteP.getDisp());
        restA.setProductos(restauranteP.getProductos());
    }

    public int getIndexRestA(){
        return indexRA;
    }

    public void setindexRestA(int indexRestA){
        this.indexRestA = indexRestA;
    }

    public void agregarCliente(int id, String nombre, String apellido, String email, int edad, String tipo){
        Cliente nuevo = new Cliente(id, nombre, apellido, email, edad, tipo);
        clientes.add(nuevo);
    }

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

    public String mostrarClientes(){
        String text = "";
        int i = 0;
        if(!clientes.isEmpty()){
            for (Cliente cliente : clientes){
                text = text + i + ". " + cliente.toString() + "\n";
            }
        }
        else {
            text = "Aún no se han registrado clientes";
        }

        return text;
    }

    public void agregarRepartidor(int id, String nombre, String apellido, String email, int edad){
        Repartidor nuevo = new Repartidor(id, nombre, apellido, email, edad);
        repartidores.add(nuevo);
    }

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

    public String mostrarRepartidores(){
        String text = "";
        int i = 0;
        if(!repartidores.isEmpty()){
            for (Repartidor repartidor : repartidores){
                text = text + i + ". " + repartidor.toString() + "\n";
            }
        }
        else {
            text = "Aún no se han registrado repartidores";
        }

        return text;
    }

    public void agregarProveedor(int id, String nombre, String apellido, String email, int edad, String rest, int nivAccess){
        Proveedor nuevo = new Proveedor(id, nombre, apellido, email, edad, rest, nivAccess);
        proveedores.add(nuevo);
    }

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

    public String mostrarProveedores(){
        String text = "";
        int i = 0;
        if(!proveedores.isEmpty()){
            for (Proveedor proveedor : proveedores){
                text = text + i + ". " + proveedor.toString() + "\n";
            }
        }
        else {
            text = "Aún no se han registrado repartidores";
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
                    indexRestA = restaurantes.indexOf(rest);
                }
            }
        }
        
    }

    public String mostrarRestaurantes(){
        String text = "";
        int i = 0;
        if(!restaurantes.isEmpty()){
            for (Restaurante rest : restaurantes){
                text = text + i + ". " + rest.toString() + "\n";
            }
        }
        else {
            text = "Aún no se han registrado restaurantes";
        }

        return text;
    }

    public void agregarProducto(int idProducto, String titulo, String detalles, double costo, boolean disponible){
        Producto nuevo = new Producto(idProducto, titulo, detalles, costo, disponible);
        restA.agregarProducto(nuevo);
    }

    public void eliminarProducto(int idProducto){
        restA.eliminarProducto(restA.getProductoById( idProducto));
    }

    public String mostrarProductos(){
        return restA.mostrarProductos();
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