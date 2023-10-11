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
}