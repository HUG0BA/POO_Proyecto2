import java.util.ArrayList;

public class PedidoManager{
    private ArrayList<Pedido> pedidos;

    public PedidoManager(){
        pedidos = new ArrayList<Pedido>();
    }

    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidosP){
        if (!pedidosP.isEmpty()){
            this.pedidos.clear();
            for(Pedido copia : pedidosP ){
                Pedido pedido = new Pedido(copia.getIdPedido(), copia.getCliente(), copia.getRestaurante(), copia.getLocal(), copia.getProductos());
                pedidos.add(pedido);
            }
        }
    }
}