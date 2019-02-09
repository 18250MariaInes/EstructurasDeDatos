/*
 * Maria Ines Vasquez y Camila Gonzales
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package programadeordenar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que genera numeros random y los guarda en un archivo .txt
 * @author camila 
 * 
 */
public class Generador {
    int[] numeros = new int[2500];
    
    public void generar(){
        Random random = new Random();
        for(int i=0; i < 2500; i++){
            int numRand = random.nextInt();
            this.numeros[i] = numRand;
        }
    }
    
    public int[] getNumeros(){
       return numeros;
    }
  
}

           
 
