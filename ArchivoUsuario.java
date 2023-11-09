import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.BufferedReader;


public class ArchivoUsuario{
    private File archivoCliente;
    private File archivoProveedor;
    private File archivoRepartidor;

    /** 
     * @param nombreArchivo
     * @description Constructor asgina parámetros ingresados para crear nuevo archivo
     */
    public ArchivoUsuario(String nombreArchivoClientes, String nombreArchivoProveedor, String nombreArchivoRepartidor){
        archivoCliente = new File(nombreArchivoClientes);
        archivoProveedor = new File(nombreArchivoProveedor);
        archivoRepartidor = new File(nombreArchivoRepartidor);
    }

    public void escribirArchivo(ArrayList<Usario> usuarios) throws Exception{
        PrintWriter escritorCliente = new PrintWriter(archivo, "UTF-8");
        String linea = "";
        if(!archivo.exists()){
            linea = "Nombre,País,Errores,Aces,Servicios totales,Recibos,Pases,Fintas,Ataques,Bloques exitosos, Bloque fallidos, Tipo";
            escritor.println(linea);
        }

        

        for(Jugador jugador : jugadores){
            linea = jugador.getNombre() + "," + jugador.getPais() + "," + jugador.getErrores() + "," + jugador.getAces() + "," + jugador.getServicios();
            if (jugador instanceof Libero){
                linea = linea + "," + ((Libero)jugador).getRecibidos() + "," + "," + "," + "," + "," + "," + "Libero";
            }
            else if (jugador instanceof Pasador){
                linea = linea + "," + "," + ((Pasador)jugador).getPases() + "," +((Pasador)jugador).getFintas() + "," + "," + "," + "," + "Pasador";
            }
            else if (jugador instanceof AuxOp){
                linea = linea + "," + ","  + "," + "," + ((AuxOp)jugador).getAtaques() + "," + ((AuxOp)jugador).getBloqueosE() + "," + ((AuxOp)jugador).getBloqueosF() + "," + "AuxOp";
            }
            escritor.println(linea);
        }
        escritor.close();
    }

    /** 
     * @return ArrayList<Dispositivo>
     * @description Método obtener datos del archivo CSV y convertirlos a las clases de Celular y Computadora
     * @throws Exception
     */
    public ArrayList<Usuario> leerArchivo() throws Exception{
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        if(!archivoCliente.exists() && !archivoProveedor.exists() && !archivoRepartidor.exists()){
            return usuarios;
        }
        
        BufferedReader br = new BufferedReader(new FileReader(archivoCliente));
        String line = "";
        //String[] videos = null;

        while((line = br.readLine()) != null){
            String[] values = line.split(",");
            //videos = null;
            Cliente cliente = new Cliente(Integer.parseInt(values[0]), values[1], values[2], values[3], Integer.parseInt(values[4]), values[5], Integer.parseInt(values[6]), Integer.parseInt(values[7]), Integer.parseInt(values[8]), Integer.parseInt(values[9]), Integer.parseInt(values[10]));
        }

        return dispositivos;
    }
}