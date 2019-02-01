/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacalculadora;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 *
 * @author maria y camila
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        //Se instancia el arreglo en el cual se guardaran los datos del txt
        ArrayList<String> lectura = new ArrayList<String>();
        //Se instancia un objeto de clase pila y otro de tipo calculadora
        Stack<Integer> pila = new Pila<Integer>();
        Calculator calculadora = new MyCalculator();
        
        //Se lee el documento txt
        try{
            Stream<String> lines = Files.lines(
                    Paths.get("datos.txt"),
                    StandardCharsets.UTF_8
            );
            //lines.split();
            //String[] lectura=lines.split(" ");
            //lines.forEach(a -> lectura.add(a));
        } catch (IOException e){
            System.out.println("Error!");
        }
        //String[] lectura=lines.split(" ");
        /*String filename=Files.lines(Paths.get("datos.txt"),StandardCharsets.UTF_8);
        String[] lectura=filename.split(" ");*/
        //for (int i=0; i<=)
        
        System.out.println(lectura);
        
        //Se evalua cada objeto de array y si es int se agrega a la pila
        //System.out.println("estoy fuera del for");
        
        for (int i = 0; i <=((lectura.size())-1); i++){
            //System.out.println("estoy en el for");
            String item = lectura.get(i);
             System.out.println(item);
            int a;
            try {
                //pila.push(1);
                System.out.println("Hola estoy antes del parse");
                a=Integer.parseInt(item); //use your variable or object in place of obj
                System.out.println("Hola estoy despues del parse");
                System.out.println(a + " is a integer number.");
                pila.push(a);
            }
               catch (NumberFormatException e){
                   System.out.println("ERROR");
            }
            
        }
        System.out.println(pila.size());
        
        
        
    }
    
}
