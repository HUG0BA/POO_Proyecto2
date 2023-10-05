public class Usuario {
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;


    //Constructor predeterminado
    public Usuario() {
    }

    //Constructor con parámetros
    public Usuario(int id, String nombre, String apellido, String email, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }
}

// Getters
public int getId() {
    return id;
}

public String getNombre() {
    return nombre;
}

public String getApellido() {
    return apellido;
}

public String getEmail() {
    return email;
}

public int getEdad() {
    return edad;
}

// Setters
public void setId(int id) {
    this.id = id;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public void setEmail(String email) {
    this.email = email;
}

public void setEdad(int edad) {
    this.edad = edad;
}

