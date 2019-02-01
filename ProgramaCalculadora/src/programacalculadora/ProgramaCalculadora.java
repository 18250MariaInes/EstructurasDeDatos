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
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static jdk.nashorn.tools.ShellFunctions.input;


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
            lines.forEach(a -> lectura.add(a));
        } catch (IOException e){
            System.out.println("Error!");
        }
        
        //Se obtiene el string del txt y se transforma a un array
        String s = lectura.get(0);
        String[] arr = s.split(" ");
        //Se crea una lista
        List<String> one = Arrays.asList(s.split(" "));
        //Se transforma en un arraylist
        List<String> two = new ArrayList<>(Arrays.asList(s.split(" ")));
        
     
        //Se evalua cada objeto de array y si es int se agrega a la pila
        
        for (int i = 0; i <=((two.size())-1); i++){
            //System.out.println("estoy en el for");
            String item = two.get(i);
            int a;
            try {
                a=Integer.parseInt(item); //el item se intenta transformar en int
                pila.push(a);  //Se agrega a la pila
            }
               catch (NumberFormatException e){
                   //Si el item es de tipo String se sacan dos elementos de la pila
                   int dato1 = pila.pop();
                   int dato2 = pila.pop();
                   //Se operan los elementos con el signos usando la calculadora
                   int nuevo = calculadora.calculate(dato1, dato2, item);
                   //Se agrega el resultado a la pila
                   pila.push(nuevo);
                   
            }
            
        }
        //Se imprime el resultado final
        System.out.println(pila.peek());
        
        
        
    }   
}
