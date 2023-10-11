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

    private Pedido(Cliente clienteP, Restaurante restaurante, String local){
        cliente = new Cliente(clienteP.getId(), clienteP.getNombre(), clienteP.getApellido(), clienteP.getEmail(), clienteP.getEdad(), clienteP.getTipo(), clienteP.getTotalP(), clienteP.getTotalPE(), clienteP.getTotalPC(), clienteP.getMetPag(), clienteP.getCalif());
        
    }
}