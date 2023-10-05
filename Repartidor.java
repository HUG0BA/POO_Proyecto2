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
    public Repartidor(String nombre, String apellido, String email, int edad, int totalP, int totalT, int totalPC, int totalTC, int totalH, int calif) {
        super(nombre, apellido, email, edad);
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
    
}
