import java.util.ArrayList;

public class Pedido{
    private int idPedido;
    private int idCliente;
    private Repartidor repartidor;
    private int idRestaurante;
    private ArrayList<Integer> idProductos;
    private String local;
    private boolean asignada;
    //private boolean completado;

    public Pedido(int idPedido, int idCliente, int idRestaurante, String local, ArrayList<Integer> idProductos){
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        //cliente = new Cliente(clienteP.getId(), clienteP.getNombre(), clienteP.getApellido(), clienteP.getEmail(), clienteP.getEdad(), clienteP.getTipo());
        this.idRestaurante = idRestaurante;
        //restaurante = new Restaurante(restauranteP.getIdRest(),restauranteP.getNombre(), restauranteP.getDes(), restauranteP.getHorario(), restauranteP.getDisp());
        //restaurante.setProductos(restauranteP.getProductos());
        this.local = local;
        this.asignada = false;
        //this.completado = false;

        this.idProductos = new ArrayList<Integer>();
        if (!idProductos.isEmpty()){
            for(int copia : idProductos ){
                this.idProductos.add(copia);
                /*Producto producto = new Producto(copia.getIdProducto(), copia.getTitulo(), copia.getDetalles(), copia.getCosto(), copia.getDisponible());
                productos.add(producto);*/
            }
        }
    }

    public int getIdPedido(){
        return idPedido;
    }

    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    /*
    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente clienteP){
        cliente.setId(clienteP.getId());
        cliente.setNombre(clienteP.getNombre());
        cliente.setApellido(clienteP.getApellido());
        cliente.setEmail(clienteP.getEmail());
        cliente.setEdad(clienteP.getEdad());
        cliente.setTipo(clienteP.getTipo());
        cliente.setTotalP(clienteP.getTotalP());
        cliente.setTotalPE(clienteP.getTotalPE());
        cliente.setTotalPC(clienteP.getTotalP());    
        cliente.setMetPag(clienteP.getMetPag());
        cliente.setCalif(clienteP.getCalif());
    }*/

    public Repartidor getRepartidor(){
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidorP){
        repartidor.setId(repartidorP.getId());
        repartidor.setNombre(repartidorP.getNombre());
        repartidor.setApellido(repartidorP.getApellido());
        repartidor.setEmail(repartidorP.getEmail());
        repartidor.setEdad(repartidorP.getEdad());
        repartidor.setTotalP(repartidorP.getTotalP());
        repartidor.setTotalT(repartidorP.getTotalT());
        repartidor.setTotalPC(repartidorP.getTotalPC());
        repartidor.setTotalTC(repartidorP.getTotalTC());
        repartidor.setTotalH(repartidorP.getTotalH());
        repartidor.setCalif(repartidorP.getCalif());
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    /*
    public Restaurante getRestaurante(){
        return restaurante;
    }

    public void setRestaurante(Restaurante restauranteP){
        restaurante.setIdRest(restauranteP.getIdRest());
        restaurante.setNombre(restauranteP.getNombre());
        restaurante.setDes(restauranteP.getDes());
        restaurante.setHorario(restauranteP.getHorario());
        restaurante.setDisp(restauranteP.getDisp());
        restaurante.setProductos(restauranteP.getProductos());
    }*/

    /*
    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public void setProductos(ArrayList<Producto> productosP){
        if (!productosP.isEmpty()){
            for(Producto copia : productosP ){
                Producto producto = new Producto(copia.getIdProducto(), copia.getTitulo(), copia.getDetalles(), copia.getCosto(), copia.getDisponible());
                productos.add(producto);
            }
        }
    }*/

    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public boolean getAsignada(){
        return asignada;
    }

    public void setAsignada(boolean asignada){
        this.asignada = asignada;
    }

    /*
    public boolean getCompletado(){
        return completado;
    }*/

    /*
    public void setCompletado(boolean completado){
        this.completado = completado;
    }*/

}