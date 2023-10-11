public class Menu{
    private int idMenu;
    private String titulo;
    private String detalles;
    private double costo;
    private boolean disponible;
    private 

    public Menu(){

    }

    public Menu(int idMenu, String titulo, String detalles, double costo, boolean disponible){
        this.idMenu = idMenu;
        this.titulo = titulo;
        this.detalles = detalles;
        this.costo = costo;
        this.disponible = disponible;
    }

    public int getIdMenu(){
        return idMenu;
    }

    public void setIdMenu(int idMenu){
        this.idMenu = idMenu;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDetalles(){
        return detalles;
    }

    public void setDetalles(String detalles){
        this.detalles = detalles;
    }

    public double getCosto(){
        return this.costo;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    @Override
    public String toString(){
        return "Menu {" + 
                "idMenu=" + idMenu + 
                ", titulo= '" + titulo + '\'' +
                ", detalles='" + detalles + '\'' +
                ", costo=" + costo +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return idMenu == menu.idMenu;
    }
}