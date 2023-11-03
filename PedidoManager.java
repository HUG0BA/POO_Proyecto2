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
                Pedido pedido = new Pedido(copia.getIdPedido(), copia.getCliente(), copia.getIdRestaurante(), copia.getLocal(), copia.getProductos());
                pedidos.add(pedido);
            }
        }
    }

    public String mostrarPedidos(){
        String text = "";
        int i = 0;
        if(!pedidos.isEmpty()){

            for(Pedido pedido : pedidos){
                text = text + i + ". " + pedido.toString() + "\n";
                i++;
            }
        }else{
            text = "Aún no se ha ingresado ningún pedido";
        }

        return text;
    }

    public String mostrarPedidosAsignados(){
        String text = "";
        int i = 0;
        if(!pedidos.isEmpty()){
            for(Pedido pedido : pedidos){
                if(pedido.getAsignada()){
                    text = text + i + ". " + pedido.toString() + "\n";
                } 
                i++;
            }
        }
        else{
            text = "Aún no se ha asignado ningún pedido";
        }

        return text;
    }

    public String mostrarPedidosPendientes(){
        String text = "";
        int i = 0;
        if(!pedidos.isEmpty()){
            for(Pedido pedido : pedidos){
                if(!pedido.getAsignada()){
                    text = text + i + ". " + pedido.toString() + "\n";
                } 
                i++;
            }
        }
        else{
            text = "Todos los pedidos actuales están asignados";
        }

        return text;
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void eliminarPedido(int index){
        pedidos.remove(pedidos.get(index));
    }
    

    public void asignarRepartidor(int index, Repartidor repartidor){
        pedidos.get(index).setRepartidor(repartidor);
        pedidos.get(index).setAsignada(true);
    }
}