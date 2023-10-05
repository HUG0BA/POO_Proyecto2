import java.util.Arrays;
import java.util.Objects;

public class Cliente extends Usuario {
   // Atributos
   private String tipo;
   private int totalP;
   private int totalPE;
   private int totalPC;
   private String[] metPag;
   private int calif;

   // Constructor predeterminado
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(int id, String nombre, String apellido, String email, int edad, String tipo, int totalP, int totalPE, int totalPC, String[] metPag, int calif) {
        super(id, nombre, apellido, email, edad);
        this.tipo = tipo;
        this.metPag = metPag;
        this.totalP = 0;
        this.totalPE = 0;
        this.totalPC = 0;
        this.calif = 0;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public int getTotalP() {
        return totalP;
    }

    public int getTotalPE() {
        return totalPE;
    }

    public int getTotalPC() {
        return totalPC;
    }

    public String[] getMetPag() {
        return metPag;
    }

    public int getCalif() {
        return calif;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTotalP(int totalP) {
        this.totalP = totalP;
    }

    public void setTotalPE(int totalPE) {
        this.totalPE = totalPE;
    }

    public void setTotalPC(int totalPC) {
        this.totalPC = totalPC;
    }

    public void setMetPag(String[] metPag) {
        this.metPag = metPag;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    // Métodos
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", edad=" + getEdad() +
                ", tipo='" + tipo + '\'' +
                ", totalP=" + totalP +
                ", totalPE=" + totalPE +
                ", totalPC=" + totalPC +
                ", metPag=" + Arrays.toString(metPag) +
                ", calif=" + calif +
                '}';
    }

    // Método para comprar dos objetos Cliente
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o))return false;
        Cliente cliente = (Cliente) o;
        return getTotalP() == cliente.getTotalP() && getTotalPE() == cliente.getTotalPE() && getTotalPC() == cliente.getTotalPC() && getCalif() == cliente.getCalif() && getTipo().equals(cliente.getTipo()) && Arrays.equals(getMetPag(), cliente.getMetPag());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getTipo(), getTotalP(), getTotalPE(), getTotalPC(), getCalif());
        result = 31 * result + Arrays.hashCode(getMetPag());
        return result;
    }
}