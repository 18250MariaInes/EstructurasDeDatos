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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

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
        //Se pide la ruta del archivo
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
        //Se lee el documento txt
        ArrayList<String> lectura = new ArrayList<String>();
        int[] listado = new int[3000];
        try{
            Stream<String> lines = Files.lines(
                    Paths.get("numeros.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> lectura.add(a));
        } catch (IOException e){
            System.out.println("Error!");
        }
        for (int i=0; i<=(lectura.size()-1); i++){
            //Se obtiene el string del txt y se transforma a un array
            String s = lectura.get(i);
            String[] arr = s.split(", ");
            //Se crea una lista
            List<String> one = Arrays.asList(s.split(", "));
            //Se transforma en un arraylist
            List<String> two = new ArrayList<>(Arrays.asList(s.split(", ")));
            //Se evalua cada objeto de array y se agrega al listado de ints
            for (int m = 0; m <=((two.size())-1); m++){
                String item = two.get(m);
                int a;
                a=Integer.parseInt(item); //el item se intenta transformar en int
                listado[m] = a;  //Se agrega a la pila          
            }
        }    //Se termina de agregar cada item del txt al array Listado
        
        //Se instancia el sort Gnome para ejecutarlo con el Listado de ints
        GnomeSort gs = new GnomeSort();
        int[] listGS = GnomeSort.gnomeSort(listado);
        //Se imprime el primero del listado
        System.out.println(listado[0]);
        System.out.println(listado[1]);
        //Se imprime el primero del ordenado
        System.out.println(listGS[0]);
        System.out.println(listGS[1]);
        
        
        
       
      
    }
    
}
