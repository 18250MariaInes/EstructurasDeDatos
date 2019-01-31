/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacalculadora;

import java.util.Vector;

/**
 *
 * clase Pila que implementa Stack encargada de almacenar los valores de documento .txt y manejar su flujo
 * @param <E>
 */
public class Pila<E>  implements Stack<E>  {
    Vector<E> v = new Vector();
    
    /**
     *metodo que agrega numero al vector
     * @param item es el numero a agregar
     */
    @Override
   public void push(E item){
        this.v.add(item);
   }

    /**
     *metodo que saca el ultimo elemento agregado del vector
     * @return el numero de la pila que se elimino
     */
    @Override
   public E pop(){
       // pre: stack is not empty
        // post: most recently pushed item is removed and returned
       int size=v.size();
       int ultimo=size-1;
       E element=(E) v.get(ultimo);
       v.remove(ultimo);
       return element;
   }
   
    /**
     *metodo que muestra el ultimo o siguiente a ser popped de la lista
     * @return el numero pronto a ser popped
     */
    @Override
   public E peek(){
       int size=v.size();
       int ultimo=size-1;
       E element = v.get(ultimo);
       return element;
   }
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
    /**
     *metodo que chequea si el vector está vacio
     * @return retorna true or false dependiendo del estado
     */
    @Override
   public boolean empty(){
    if (v.size()==0){
        return true;
    }else{
        return false;
    }
}
   // post: returns true if and only if the stack is empty
   
    /**
     *metodo que muestra el tamano de nuesto vector
     * @return su tamaño
     */
    @Override
   public int size(){
       return v.size();
   }
   // post: returns the number of elements in the stack
    
}
