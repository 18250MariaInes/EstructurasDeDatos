/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeordenar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Camila
 */
public class ProgramaDeOrdenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(3000);
        Random random = new Random();
        for(int i=0; i < 3000; i++){
            int numRand = random.nextInt();
            numeros.add(numRand);
        }
    }
    
}
