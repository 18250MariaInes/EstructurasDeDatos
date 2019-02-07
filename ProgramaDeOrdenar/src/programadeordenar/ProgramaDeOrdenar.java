/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeordenar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class ProgramaDeOrdenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "";
        //Se intancia un objeto para generar el arreglo
        Generador g = new Generador();
        g.generar();
        int[] datos = g.getNumeros();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la ruta del la carpeta para guardar el archivo.\nDebe ser de la siguiente forma:\nC:/Users/GrupoLF/Documents/GitHub/EstructurasDeDatos/ProgramaDeOrdenar/numeros.txt\n");
        ruta =scan.next();
        
        //Se crea el archivo
        try{
            //String ruta = "C:/Users/GrupoLF/Documents/GitHub/EstructurasDeDatos/ProgramaDeOrdenar/numeros.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 3000; i++){
                int dato = datos[i];
                bw.write(dato + ", ");
            }
            bw.close();
            System.out.println("Archivo exitosamente creado");
        } catch (IOException e) {
            System.out.println("Imposible crear");
        }
       
      
    }
    
}
