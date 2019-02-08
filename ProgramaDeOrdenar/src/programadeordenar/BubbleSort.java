package programadeordenar;

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
    public static int [] bubblesort(int[] A) {
        for (int i = 0, k; i < A.length - 1; i++) {
          for (k = A.length - 1; k > i; --k) {
            if (A[k] < A[k - 1]) {
              swap(A, k, k - 1);
            }
          }
        }
        return A;
      }
 
    private static void swap(int[] input, int a, int b) {
      int tmp = input[a];
      input[a] = input[b];
      input[b] = tmp;
    }
}
