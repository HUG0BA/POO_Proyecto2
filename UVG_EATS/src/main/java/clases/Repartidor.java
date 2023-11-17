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

public class Repartidor extends Usuario{
    // Atributos
    private boolean ocupado;
    private int totalP;
    private int totalT;
    private int totalPC;
    private int totalTC;
    private int totalH;
    private int calif;

    // Constructor predeterminado
    

    // Constructor con parámetros
    public Repartidor(int id, String nombre, String apellido, String email, int edad) {
        super(id, nombre, apellido, email, edad);
        this.ocupado = false;
        this.totalP = 0;
        this.totalT = 0;
        this.totalPC = 0;
        this.totalTC = 0;
        this.totalH = 0;
        this.calif = 0;
    }

    public Repartidor(int id, String nombre, String apellido, String email, int edad, int totalP, int totalT, int totalPC, int totalTC, int totalH, int calif) {
        super(id, nombre, apellido, email, edad);
        this.ocupado = false;
        this.totalP = totalP;
        this.totalT = totalT;
        this.totalPC = totalPC;
        this.totalTC = totalTC;
        this.totalH = totalH;
        this.calif = calif;
    }

    // Getters y setters
    public boolean isOcupado(){
        return this.ocupado;
    }
    
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
    
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
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
        return "Repartidor{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + '\'' +
            ", apellido='" + getApellido() + '\'' +
            ", email='" + getEmail() + '\'' +
            ", edad=" + getEdad() +
            ", totalP=" + totalP +
            ", totalPC=" + totalPC +
            ", totalT=" + totalT +
            ", totalPC=" + totalPC +
            ", totalTC=" + totalTC +
            ", totalH=" + totalH +
            ", calif=" + calif +
            '}'; 
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

