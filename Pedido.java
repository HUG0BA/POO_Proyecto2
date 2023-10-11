import java.util.ArrayList;

public class Pedido{
    private int idPedido;
    private Cliente cliente;
    private Repartidor repartidor;
    private Restaurante restaurante;
    private ArrayList<Producto> productos;
    private String local;
    private boolean asignada;
    private boolean completado;

    public Pedido(int idPedido, Cliente clienteP, Restaurante restauranteP, String local, ArrayList<Producto> productosP){
        this.idPedido = idPedido;
        cliente = new Cliente(clienteP.getId(), clienteP.getNombre(), clienteP.getApellido(), clienteP.getEmail(), clienteP.getEdad(), clienteP.getTipo(), clienteP.getTotalP(), clienteP.getTotalPE(), clienteP.getTotalPC(), clienteP.getMetPag(), clienteP.getCalif());
        restaurante = new Restaurante(restauranteP.getIdRest(),restauranteP.getNombre(), restauranteP.getDes(), restauranteP.getHorario(), restauranteP.getDisp());
        restaurante.setProductos(restauranteP.getProductos());
        this.local = local;
        this.asignada = false;
        this.completado = false;

        productos = new ArrayList<Producto>();
        if (!productosP.isEmpty()){
            for(Producto copia : productosP ){
                Producto producto = new Producto(copia.getIdProducto(), copia.getTitulo(), copia.getDetalles(), copia.getCosto(), copia.getDisponible());
                productos.add(producto);
            }
        }
    }
}