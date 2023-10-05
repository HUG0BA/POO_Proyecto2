public class Proveedor extends Usuario{
    // Atributos
    private String rest;
    private int nivAccess;

    // Constructor predeterminado
    public Proveedor() {
    }

    // Constructor con parámetros
    public Proveedor(String nombre, String apellido, String email, int edad, String reset, int nivAccess){
      super(nombre, apellido, email, edad);  
      this.rest = rest;
      this.nivAccess = nivAccess;
    }

    // Getters
    public String getRest() {
        return rest;
    }

    public int getNivAccess() {
        return nivAccess;
    }

    // Setters
    public void setRest(String rest) {
        this.rest = rest;
    }

    public void setNivAccess(int nivAccess) {
        this.nivAccess = nivAccess;
    }

    // Métodos
}
