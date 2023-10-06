public class Producto {
    private int idProducto;
    private String titulo;
    private String detalles;
    private double costo;
    private boolean disponible;

    public Producto() {

    }
    
    public Producto(int idProducto, String titulo, String detalles, double costo, boolean disponible) {
        this.idProducto = idProducto;
        this.titulo = titulo;
        this.detalles = detalles;
        this.costo = costo;
        this.disponible = disponible;
    }    
}
