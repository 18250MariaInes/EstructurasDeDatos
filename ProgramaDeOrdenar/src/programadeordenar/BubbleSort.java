package programadeordenar;

import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class BubbleSort {

    /**
     *metodo escogido por pareja para analizar extraído de: http://www.geekviewpoint.com/java/sorting/bubblesort
     * @param A array a arreglar
     * @return el array ya arreglado
     */
    public static Comparable [] bubblesort(Comparable[] A) {
        for (int i = 0, k; i < A.length - 1; i++) {
          for (k = A.length - 1; k > i; --k) {
            if (A[k].compareTo(A[k - 1]) < 0) {
              swap(A, k, k - 1);
            }
          }
        }
        return A;
      }
 
    private static void swap(Comparable[] input, int a, int b) {
      Comparable tmp = input[a];
      input[a] = input[b];
      input[b] = tmp;
    }

    private static void swap(List<Comparable> asList, int k, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
