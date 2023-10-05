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
    public Cliente(String nombre, String apellido, String email, int edad, String tipo, int totalP, int totalPE, int totalPC, String[] metPag, int calif) {
        super(nombre, apellido, email, edad);
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


}