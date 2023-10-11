public class Menu{
    private int idMenu;
    private String titulo;
    private String detalles;
    private double costo;
    private boolean disponible;

    public Menu(){

    }

    public Menu(int idMenu, String titulo, String detalles, double costo, boolean disponible){
        this.idMenu = idMenu;
        this.titulo = titulo;
        this.detalles = detalles;
        this.costo = costo;
        this.disponible = disponible;
    }

}