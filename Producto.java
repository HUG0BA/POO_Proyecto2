import java.util.Objects;

public class Producto {
    private int idProducto;
    private String titulo;
    private String detalles;
    private double costo;
    private boolean disponible;

    // Constructor predeterminado
    public Producto() {

    }
    
    // Constructor con parámetros
    public Producto(int idProducto, String titulo, String detalles, double costo, boolean disponible) {
        this.idProducto = idProducto;
        this.titulo = titulo;
        this.detalles = detalles;
        this.costo = costo;
        this.disponible = disponible;
    }   
    
   //Getters
    public int getIdProducto() {
        return idProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDetalles() {
        return detalles;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isDisponible() {
        return disponible;
    }

   //Setters
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //toString
    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", titulo= '" + titulo + '\'' +
                ", detalles='" + detalles + '\'' +
                ", costo=" + costo +
                ", disponible=" + disponible +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto);
    }
}
