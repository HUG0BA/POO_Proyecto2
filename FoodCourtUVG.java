import java.util.ArrayList;

public class FoodCourtUVG{
    private ArrayList<Cliente> clientes;
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<Repartidor> repartidores;
    private PedidoManager pedidoManager;
    private Cliente clienteA;
    private int indexCA;
    private Repartidor repartidorA;
    private int indexRA;
    private Restaurante restA;
    private int indexRestA;

    public FoodCourtUVG(){
        clientes = new ArrayList<Cliente>();
        restaurantes = new ArrayList<Restaurante>();
        repartidores = new ArrayList<Repartidor>();
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
}