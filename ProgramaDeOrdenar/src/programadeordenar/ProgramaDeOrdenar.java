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
        
                //Se imprime el listado de numeros leidos
        String prueba = "Arreglo leido:\n";
        for (int c = 0; c < listado.length; c++){
            prueba = prueba + listado[c] + ", ";
        }
        System.out.println(prueba + "\n");
        
        /*
        * Ordenamiento con GNOMESORT
        */
        //Se instancia el sort Gnome para ejecutarlo con el Listado de ints
        /*GnomeSort gs = new GnomeSort();
        int[] listGS = GnomeSort.gnomeSort(listado);
        //Se imprime el arreglo ya ordenado con GnomeSort
        String prueba1 = "Arreglo ordenado con GnomeSort:\n";
        for (int c = 0; c < listado.length; c++){
            prueba1 = prueba1 + listGS[c] + ", ";
        }
        System.out.println(prueba1+ "\n");
        
        /*
        * Ordenamiento con MERGESORT
        */
        //Se instancia el sort Merge para ejecutarlo con el Listado de ints
        /*MergeSort ms = new MergeSort();
        int[] listMS = ms.mergeSort(listado);
        //Se imprime el arreglo ya ordenado con MergeSort
        String prueba2 = "Arreglo ordenado con MergeSort:\n";
        for (int c = 0; c < listado.length; c++){
            prueba2 = prueba2 + listMS[c] + ", ";
        }
        System.out.println(prueba2 + "\n");
        
        /*
        * Ordenamiento con QUICKSORT
        */
        //Se instancia el sort Quick para ejecutarlo con el Listado de ints
        QuickSort qs = new QuickSort();
        int[] listQS = qs.sort(listado);
        //Se imprime el arreglo ya ordenado con MergeSort
        String prueba3 = "Arreglo ordenado con QuickSort:\n";
        for (int c = 0; c < listado.length; c++){
            prueba3 = prueba3 + listQS[c] + ", ";
        }
        System.out.println(prueba3 + "\n");
        
        /*
        * Ordenamiento con RADIXSORT
        */
        //Se instancia el sort Radix para ejecutarlo con el Listado de ints
        /*RadixSort rs = new RadixSort();
        int[] listRS = RadixSort.radixSort(listado);
        //Se imprime el arreglo ya ordenado con MergeSort
        String prueba4 = "Arreglo ordenado con RadixSort:\n";
        for (int c = 0; c < listado.length; c++){
            prueba4 = prueba4 + listRS[c] + ", ";
        }
        System.out.println(prueba4 + "\n");
        */
        /*BubbleSort bs = new BubbleSort();
        int[] listbs = BubbleSort.bubblesort(listado);
        //Se imprime el arreglo ya ordenado con GnomeSort
        String prueba5 = "Arreglo ordenado con BubbleSort:\n";
        for (int c = 0; c < listado.length; c++){
            prueba5 = prueba5 + listbs[c] + ", ";
        }
        System.out.println(prueba5+ "\n");
        */
        
        
       
      
    }
    
}
