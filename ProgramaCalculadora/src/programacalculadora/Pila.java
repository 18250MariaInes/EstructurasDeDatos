/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacalculadora;

import java.util.Vector;

/**
 *
 * @author Camila
 */
public class Pila<E>  implements Stack<E>  {
    Vector<E> v = new Vector();
    Calculator calcu = new MyCalculator();
    
    //Verifica que el elemento sea un numero
   public boolean verificarNum(E item){
        boolean resultado;

        try {
            Integer.parseInt((String) item);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
       
   }
   
   @Override
   public void push(E item){
       boolean resultado = verificarNum(item);
       if (resultado == true){
           //Si es numero agrega el dato al vecto
           this.v.add(item);
       } else {
           //Si es String se sacan los primeros dos y se operan
           int num1 =(int) pop();
           int num2=(int)pop();
           String itemS= (String)item;
           int resul=calcu.calculate(num1, num2, itemS);
           this.v.add(resul);
       }
   }

  
    @Override
   public E pop(){
       // pre: stack is not empty
        // post: most recently pushed item is removed and returned
        
       E element=(E) v.get(0);
       E elemento = (E) v.remove(0);
       return element;
   }
   
   @Override
   public E peek(){
       E element = (E)v.get(0);
       return element;
   }
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   @Override
   public boolean empty(){
    if (v.size()==0){
        return true;
    }else{
        return false;
    }
}
   // post: returns true if and only if the stack is empty
   
   @Override
   public int size(){
       return v.size();
   }
   // post: returns the number of elements in the stack
    
    
    
    
}
