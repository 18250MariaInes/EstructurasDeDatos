/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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
        Stack <Integer> pilaprueba=new StackArrayList<Integer>();
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
        for (int i=0; i<=(lectura.size()-1); i++){
        //Se obtiene el string del txt y se transforma a un array
        String s = lectura.get(i);
        String[] arr = s.split(" ");
        //Se crea una lista
        List<String> one = Arrays.asList(s.split(" "));
        //Se transforma en un arraylist
        List<String> two = new ArrayList<>(Arrays.asList(s.split(" ")));
        
     
        //Se evalua cada objeto de array y si es int se agrega a la pila
        
        for (int m = 0; m <=((two.size())-1); m++){
            //System.out.println("estoy en el for");
            String item = two.get(m);
            int a;
            try {
                a=Integer.parseInt(item); //el item se intenta transformar en int
                pila.push(a);  //Se agrega a la pila
                pilaprueba.push(a);
            }
               catch (NumberFormatException e){
                   //Si el item es de tipo String se sacan dos elementos de la pila
                   int dato1 = pila.pop();
                   int dato2 = pila.pop();
                   int dato1prueba=pilaprueba.pop();
                   int dato2prueba=pilaprueba.pop();
                   //Se operan los elementos con el signos usando la calculadora
                   int nuevo = calculadora.calculate(dato1, dato2, item);
                   int nuevoprueba=calculadora.calculate(dato1prueba, dato2prueba, item);
                   //Se agrega el resultado a la pila
                   pila.push(nuevo);
                   pilaprueba.push(nuevoprueba);
                   
            }
            
        }
        //Se imprime el resultado finalCalcu
        System.out.println("Esta es el resultado de nuestra clase pila: "+pila.peek());
        System.out.println("Este es el resultado de pilaprueba de StackArrayList: "+pilaprueba.peek());
        }     
    }   
}
