/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author 50256
 */
import java.io.File;
import java.io.FileReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.BufferedReader;


public class ArchivoUsuario{
    private File archivoCliente;
    private File archivoProveedor;
    private File archivoRepartidor;


    public ArchivoUsuario(String nombreArchivoClientes, String nombreArchivoProveedor, String nombreArchivoRepartidor){
        archivoCliente = new File(nombreArchivoClientes);
        archivoProveedor = new File(nombreArchivoProveedor);
        archivoRepartidor = new File(nombreArchivoRepartidor);
    }

    public boolean escribirArchivo(ArrayList<Usuario> usuarios) throws Exception{
        boolean exito = false;
        PrintWriter escritorCliente = new PrintWriter(archivoCliente, "UTF-8");
        String linea = "";
        if(archivoCliente.length() > 0){
            PrintWriter cleaner = new PrintWriter(archivoCliente, "UTF-8");
            cleaner.write("");
            cleaner.close();
        }
        linea = "id,nombre,apellido,email,edad,tipo,total_pedidos_solicitados,total_pedidos_exitosos,total_pedidos_cancelados,calificacion";
        escritorCliente.println(linea);

        for(Usuario usuario : usuarios){
            if (usuario instanceof Cliente){
                linea = usuario.getId() + "," + usuario.getNombre() + "," + usuario.getApellido() + "," + usuario.getEmail() + "," + usuario.getEdad(); 
                linea = linea + "," + ((Cliente)usuario).getTipo() + "," + ((Cliente)usuario).getTotalP() + "," + ((Cliente)usuario).getTotalPE() + "," + ((Cliente)usuario).getTotalPC() + "," + ((Cliente)usuario).getCalif();
                escritorCliente.println(linea);
                exito = true;
            }     
        }
        escritorCliente.close();

        PrintWriter escritorProveedor = new PrintWriter(archivoProveedor, "UTF-8");
        linea = "";
        if(archivoProveedor.length() > 0){
            PrintWriter cleaner = new PrintWriter(archivoProveedor, "UTF-8");
            cleaner.write("");
            cleaner.close();
        }
        linea = "id,nombre,apellido,email,edad,nombre_restaurante,id_restaurante,nivel_acceso";
        escritorProveedor.println(linea);

        for(Usuario usuario : usuarios){
            if (usuario instanceof Proveedor){
                linea = usuario.getId() + "," + usuario.getNombre() + "," + usuario.getApellido() + "," + usuario.getEmail() + "," + usuario.getEdad(); 
                linea = linea + "," + ((Proveedor)usuario).getRest() + "," + ((Proveedor)usuario).getIdRest() + "," + ((Proveedor)usuario).getNivAccess();
                escritorProveedor.println(linea);
                exito = true;
            }     
        }
        escritorProveedor.close();

        PrintWriter escritorRepartidor = new PrintWriter(archivoRepartidor, "UTF-8");
        linea = "";
        if(archivoRepartidor.length() > 0){
            PrintWriter cleaner = new PrintWriter(archivoRepartidor, "UTF-8");
            cleaner.write("");
            cleaner.close();
        }
        linea = "id,nombre,apellido,email,edad,pedidos_entregados_exitosamente,turnos_finalizados,total_pedidos_cancelados,total_turnos_cancelados,total_horas_trabajadas,calificacion";
        escritorRepartidor.println(linea);

        for(Usuario usuario : usuarios){
            if (usuario instanceof Repartidor){
                linea = usuario.getId() + "," + usuario.getNombre() + "," + usuario.getApellido() + "," + usuario.getEmail() + "," + usuario.getEdad(); 
                linea = linea + "," + ((Repartidor)usuario).getTotalP() + "," + ((Repartidor)usuario).getTotalT() + "," + ((Repartidor)usuario).getTotalPC() + "," + ((Repartidor)usuario).getTotalTC() + "," + ((Repartidor)usuario).getTotalH() + "," + ((Repartidor)usuario).getCalif();
                escritorRepartidor.println(linea);
                exito = true;
            }     
        }
        escritorRepartidor.close();
        return exito;
    }

    /** 
     * @return ArrayList<Dispositivo>
     * @description Método obtener datos del archivo CSV y convertirlos a las clases de Celular y Computadora
     * @throws Exception
     */
    public ArrayList<Usuario> leerArchivo() throws Exception{
        ArrayList<Usuario> usuariosLectura = new ArrayList<Usuario>();

        if(archivoCliente.length() == 0 && archivoProveedor.length() == 0 && archivoRepartidor.length() == 0){
            return usuariosLectura;
        }
        
        BufferedReader clienteBr = new BufferedReader(new FileReader(archivoCliente));
        String line = "";

        if(archivoCliente.length() > 0){
            boolean fisrtTime = true;
            while((line = clienteBr.readLine()) != null){
                if(fisrtTime){
                    fisrtTime = false;
                    continue;
                }
                String[] values = line.split(",");
                Cliente cliente = new Cliente(Integer.parseInt(values[0]), values[1], values[2], values[3], Integer.parseInt(values[4]), values[5] , Integer.parseInt(values[6]), Integer.parseInt(values[7]), Integer.parseInt(values[8]), Integer.parseInt(values[9]));
                usuariosLectura.add(cliente);
            }
        }
        clienteBr.close();

        BufferedReader proveedorBr = new BufferedReader(new FileReader(archivoProveedor));
        line = "";

        if(archivoProveedor.length() > 0){
            boolean fisrtTime = true;
            while((line = proveedorBr.readLine()) != null){
                if(fisrtTime){
                    fisrtTime = false;
                    continue;
                }
                String[] values = line.split(",");
                Proveedor proveedor = new Proveedor(Integer.parseInt(values[0]), values[1], values[2], values[3], Integer.parseInt(values[4]), values[5], Integer.parseInt(values[6]), Integer.parseInt(values[7]));
                usuariosLectura.add(proveedor);
            }
        }
        proveedorBr.close();

        BufferedReader repartidorBr = new BufferedReader(new FileReader(archivoRepartidor));
        line = "";

        if(archivoRepartidor.length() > 0){
            boolean fisrtTime = true;
            while((line = repartidorBr.readLine()) != null){
                if(fisrtTime){
                    fisrtTime = false;
                    continue;
                }
                String[] values = line.split(",");
                Repartidor repartidor = new Repartidor(Integer.parseInt(values[0]), values[1], values[2], values[3], Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]), Integer.parseInt(values[7]), Integer.parseInt(values[8]), Integer.parseInt(values[9]), Integer.parseInt(values[10]));
                usuariosLectura.add(repartidor);
            }
        }
        repartidorBr.close();

        return usuariosLectura;
    }
}
