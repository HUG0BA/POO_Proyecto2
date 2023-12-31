/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author 50256
 */
import java.util.Objects;

public class Proveedor extends Usuario{
    // Atributos
    private String rest;
    private int idRest;
    private int nivAccess;

    // Constructor predeterminado


    // Constructor con parámetros
    public Proveedor(int id, String nombre, String apellido, String email, int edad, String rest, int idRest, int nivAccess){
        super(id, nombre, apellido, email, edad);  
        this.rest = rest;
        this.idRest = idRest;
        this.nivAccess = nivAccess;
    }


    // Getters
    public String getRest() {
        return rest;
    }

    public int getIdRest() {
        return idRest;
    }

    public int getNivAccess() {
        return nivAccess;
    }

    // Setters
    public void setRest(String rest) {
        this.rest = rest;
    }

    public void setIdRest(int idRest) {
        this.idRest = idRest;
    }
    
    public void setNivAccess(int nivAccess) {
        this.nivAccess = nivAccess;
    }

    // Métodos
    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", edad=" + getEdad() +
                ", rest='" + rest + '\'' +
                ", nivAccess=" + nivAccess +
                '}';
    }

    // Método para comprar dos objetos Proveedor
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o))return false;
        Proveedor proveedor = (Proveedor) o;  
        return getNivAccess() == proveedor.getNivAccess() && getRest().equals(proveedor.getRest());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRest(), getNivAccess());
    }
}
