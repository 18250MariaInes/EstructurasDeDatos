package programacalculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class MyCalculator implements Calculator {

    /**
     *
     * @param num1 primer operando
     * @param num2 segundo operando
     * @param op operacion a realizar
     * @return resultado de operacion
     */
    @Override
    public int calculate (int num1, int num2, String op){
        int dato1 = num1;
        int dato2 = num2;
        int resul;
        String signo = op;
        if (signo.equals("+")){
            resul=dato1+dato2;
        }else if (signo.equals("-")){
            resul=dato1-dato2;
        }else if (signo.equals("/")){
            resul=dato1/dato2;
        }else{
            resul=dato1*dato2;
        } 
        return resul;
    }
}
