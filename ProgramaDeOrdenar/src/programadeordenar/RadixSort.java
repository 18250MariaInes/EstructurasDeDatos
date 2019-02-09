/*
 * Maria Ines Vasquez y Camila Gonzales
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package programadeordenar;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author maria 
 * 
 */
public class RadixSort {

    /**
     *Método de Radix extraído de : https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Radix_sort
     * @param v el arreglo que se debe ordenar
     * @return el arreglo ya arreglado
     */
    public static Comparable [] radixSort(Comparable[] v){
        int max    = 1;     // cantidad de repeticiones
        int nbytes = 4;     // numero de bytes a desplazar
        int nColas = (int) Math.pow(2,nbytes) ;
        // Creación e inicialización del arreglo de colas
        Queue<Integer>[] cola = new LinkedList[nColas];
        for(int i=0; i<nColas; i++) cola[i]=new LinkedList<Integer>();
 
        int     div     = 0;        // posición a comparar
        for(int i=0; i<max; i++) {
            // parte 1: recorrer el vector  para guardar cada elemento
            // en la cola correspondiente
            for(Comparable numero: v) {
                // buscar el mayor número del vector
                if(i==0) if((Integer) numero>max) max=(int) numero;
                // calcular en qué cola debe ir cada número
                int numCola = ( (Integer) numero>>div) & 0xf;
                cola[numCola].add((Integer) numero);
            }
            div = div+nbytes;
 
            // parte 2: recorrer las colas en orden para poner cada
            // elemento en el vector;
            int j=0;
            for(Queue<Integer> c: cola) {
                while(!c.isEmpty()) v[j++]=c.remove();
            }
            // la primera vez se actualiza el número de veces que se
            // debe ejecutar el proceso
            if(i==0) { max = (int) (Math.log(max)/Math.log(nColas)) + 1; }
        }
        return v;
    }
}
