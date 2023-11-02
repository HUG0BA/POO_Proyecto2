import java.util.Objects;

public class Repartidor extends Usuario{
    // Atributos
    private int totalP;
    private int totalT;
    private int totalPC;
    private int totalTC;
    private int totalH;
    private int calif;

    // Constructor predeterminado
    public Repartidor() {
        super();
        this.totalP = 0;
        this.totalT = 0;
        this.totalPC = 0;
        this.totalTC = 0;
        this.totalH = 0;
        this.calif = 0;
    }

    // Constructor con parámetros
    public Repartidor(int id, String nombre, String apellido, String email, int edad) {
        super(id, nombre, apellido, email, edad);
        this.totalP = 0;
        this.totalT = 0;
        this.totalPC = 0;
        this.totalTC = 0;
        this.totalH = 0;
        this.calif = 0;
    }

    // Getters y setters
    public int getTotalP() {
        return totalP;
    }

    public void setTotalP(int totalP) {
        this.totalP = totalP;
    }

    public int getTotalT() {
        return totalT;
    }

    public void setTotalT(int totalT) {
        this.totalT = totalT;
    }

    public int getTotalPC() {
        return totalPC;
    }

    public void setTotalPC(int totalPC) {
        this.totalPC = totalPC;
    }

    public int getTotalTC() {
        return totalTC;
    }

    public void setTotalTC(int totalTC) {
        this.totalTC = totalTC;
    }

    public int getTotalH() {
        return totalH;
    }

    public void setTotalH(int totalH) {
        this.totalH = totalH;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() +
            " Total de pedidos entregados: " + totalP +
            " Total de pedidos turnos finalizados: " + totalT +
            " Total de pedidos cancelados: " + totalPC +
            " Total de turnos cancelados: " + totalTC +
            " Total de horas trabajadas: " + totalH +
            " Calificación: " + calif;      
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Repartidor)) return false;
        if (!super.equals(obj)) return false;
        Repartidor that = (Repartidor) obj;
        return getId() == that.getId();
    }
}
