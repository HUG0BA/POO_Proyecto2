/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author 50256
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArchivoRestaurante{
    private File archivoRestaurante;
    

    /** 
     * @param nombreArchivo
     * @description Constructor asgina parámetros ingresados para crear nuevo archivo
     */
    public ArchivoRestaurante(String nombreArchivoRestaurante){
        archivoRestaurante = new File(nombreArchivoRestaurante);
    }

    public boolean escribirArchivo(ArrayList<Restaurante> restaurantes) throws Exception{
        boolean exito = false;
        PrintWriter escritor = new PrintWriter(archivoRestaurante, "UTF-8");
        String linea = "";
        if(archivoRestaurante.length() > 0){
            PrintWriter cleaner = new PrintWriter(archivoRestaurante, "UTF-8");
            cleaner.write("");
            cleaner.close();
        }
        linea = "id_restaurante,nombre_restaurante,descripcion,horario,disponibilidad,productos";
        escritor.println(linea);

        for(Restaurante restaurante : restaurantes){
            linea = restaurante.getIdRest() + "," + restaurante.getNombre() + "," + restaurante.getDes() + "," + restaurante.getHorario() + "," + restaurante.getDisp(); 
            ArrayList<Producto> produtos = restaurante.getProductos();
            String textProductos = "";
            for(Producto producto : produtos){
                textProductos = textProductos + producto.getIdProducto() + ";" + producto.getTitulo() + ";" + producto.getDetalles() + ";" + producto.getCosto() + ";" + producto.getDisponible() + ":";
            }
            linea = linea + "," + textProductos;
            escritor.println(linea);
            exito = true;
        }
        escritor.close();
        return exito;

    }

    /** 
     * @return ArrayList<Dispositivo>
     * @description Método obtener datos del archivo CSV y convertirlos a las clases de Celular y Computadora
     * @throws Exception
     */
    public ArrayList<Restaurante> leerArchivo() throws Exception{
        ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

        if(!archivoRestaurante.exists()){
            return restaurantes;
        }
        
        BufferedReader br = new BufferedReader(new FileReader(archivoRestaurante));
        String line = "";

        boolean firstTime = true;
        while((line = br.readLine()) != null){
            if(firstTime){
                firstTime = false;
                continue;
            }
            String[] values = line.split(",");
            
            if(values != null || values.length != 0){
                ArrayList<Producto> productos = new ArrayList<Producto>();
                if(values[5] != null){
                    String[] textProductos  = values[5].split(":");  
                    System.out.println(textProductos.toString());
                    for(String textProducto : textProductos){
                        String[] infoProducto = textProducto.split(";");
                        //System.out.println(infoProducto.toString());
                        Producto producto = new Producto(Integer.parseInt(infoProducto[0]), infoProducto[1], infoProducto[2], Double.parseDouble(infoProducto[3]), Boolean.parseBoolean(infoProducto[4]));
                        productos.add(producto);
                    } 
                }

                Restaurante restaurante = new Restaurante(Integer.parseInt(values[0]), values[1], values[2], values[3], Boolean.parseBoolean(values[4]), productos);
                restaurantes.add(restaurante);
                //System.out.println("LLEGO");
            }          
        }
        
        //System.out.println("AYUDAAA");
        br.close();
        
        return restaurantes;
    }
}
