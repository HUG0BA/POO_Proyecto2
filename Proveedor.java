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
}
