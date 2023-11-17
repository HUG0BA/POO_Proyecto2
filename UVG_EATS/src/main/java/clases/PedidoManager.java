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
                Pedido pedido = new Pedido(copia.getIdPedido(), copia.getIdCliente(), copia.getIdRestaurante(), copia.getLocal(), copia.getIdProductos());
                pedidos.add(pedido);
            }
        }
    }
    
    public ArrayList<Pedido> getPedidosDisponibles(){
        ArrayList<Pedido> disponibles = new ArrayList<Pedido>();
        if(pedidos.isEmpty()){
            return disponibles;
        }else{
            for(Pedido pedido : pedidos){
                if(!pedido.getAsignada()){
                    disponibles.add(pedido);
                }
                
            }
            return disponibles;
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

    public String[] mostrarPedidosDisponiblesMenu(){
        
        String text = "";
        int i = 0;
        if(!pedidos.isEmpty()){
            String[] info = new String[pedidos.size()];
            for(Pedido pedido : pedidos){
                if(!pedido.getAsignada()){
                    text = "Id: ¡" + pedido.getIdPedido() + "! Entregar en: " + pedido.getLocal() + "";
                    info[i] = text;
                    i++;        
                } 
                
            }
            return info;
        }
        else{
            String[] mensaje = {"Todos los pedidos actuales están asignados"};
            return mensaje;
         }

        
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void eliminarPedido(int index){
        pedidos.remove(pedidos.get(index));
    }
    

    public void asignarRepartidor(int index, int idRepartidor){
        for(Pedido pedido : pedidos){
            if(pedido.getIdPedido() == index){
                pedido.setRepartidor(idRepartidor);
                pedido.setAsignada(true);
            }
        }
    }
    
    public void cancelarRepartidor(int idRepartidor){
       for(Pedido pedido : pedidos){
            if(pedido.getAsignada() && pedido.getIdRepartidor() == idRepartidor){
                
                pedido.setRepartidor(-1);
                pedido.setAsignada(false);
            }
        } 
    }
}