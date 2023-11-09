/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author 50256
 */
import java.util.ArrayList;

public class Restaurante{
    private int idRest;
    private String nombre;
    private String des;
    private String horario;
    private boolean disp;
    private ArrayList<Producto> productos;

    public Restaurante(){
        productos = new ArrayList<Producto>();
    }

    public Restaurante(int idRest, String nombre, String des, String horario, boolean disp){
        this.idRest = idRest;
        this.nombre = nombre;
        this.des = des;
        this.horario = horario;
        this.disp = disp;
        this.productos = new ArrayList<Producto>();
    }

    public Restaurante(int idRest, String nombre, String des, String horario, boolean disp, ArrayList<Producto> productos){
        this.idRest = idRest;
        this.nombre = nombre;
        this.des = des;
        this.horario = horario;
        this.disp = disp;
        this.productos = new ArrayList<Producto>();
        this.productos = new ArrayList<Producto>();
        if(!productos.isEmpty()){
            for (Producto producto : productos){
                Producto copia = new Producto(producto.getIdProducto(), producto.getTitulo(), producto.getDetalles(), producto.getCosto(), producto.getDisponible());
                this.productos.add(copia);
            }
        }

    }

    public int getIdRest(){
        return idRest;
    }

    public void setIdRest(int idRest){
        this.idRest = idRest;

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDes(){
        return des;
    }

    public void setDes(String des){
        this.des = des;
    }

    public String getHorario(){
        return horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public boolean getDisp(){
        return disp;
    }

    public void setDisp(boolean disp){
        this.disp = disp;
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public void setProductos(ArrayList<Producto> productosP){
        if (!productos.isEmpty()){
            this.productos.clear();
            for(Producto copia : productosP ){
                Producto producto = new Producto(copia.getIdProducto(), copia.getTitulo(), copia.getDetalles(), copia.getCosto(), copia.getDisponible());
                productos.add(producto);
            }
        }
    }

    @Override
    public String toString(){
        return "Restaurante{" + 
                "idrest=" + idRest +
                ", nombre= '" + nombre + '\'' +
                ", des='" + des + '\'' +
                ", horario='" + horario + '\'' +
                ", disp=" + disp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante restaurante = (Restaurante) o;
        return idRest == restaurante.idRest;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public Producto getProductoById(int idProducto){
        if(!productos.isEmpty()){
            for (Producto producto : productos){
                if(producto.getIdProducto() == idProducto){
                    return producto;
                }
            }
            return null;
        }
        
        return null;
    }

    public String mostrarProductos(){
        String text = "";
        int contador = 0;
        if(!productos.isEmpty()){
            for(Producto producto : productos){
                text = text + ". " + producto.toString() + "\n";
            }
        }else{
            text = "Aún no se han registrado productos";
        }

        return text;
    }

}
