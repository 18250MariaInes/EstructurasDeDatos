/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaderadio;
//import myRadio, Radio;
/**
 *
 * @author maria
 */
import java.util.Scanner;
public class ProgramaDeRadio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("");
        Radio r = new myRadio();
        
        Scanner scan = new Scanner(System.in);
        int opcion/*, boton*/, inicio=0;
        String frec;
        
        System.out.println("Bienvenido a la radio de Camila y Maria Ines");
        
        while (inicio!=7){
            System.out.println("Seleccione la actividad que desee realizar:");
            System.out.println("1. Apagar radio");
            System.out.println("2. Cambiar de frecuencia");
            System.out.println("3. Cambiar estacion de radio.");
            opcion=scan.nextInt();
            if (opcion==1){
                r.toggle();
                System.out.println("Radio se ha apagado");
                inicio=7;
            }else if (opcion==2){
                r.changeFrequency();
                System.out.println("Usted ha cambiado de frecuencia");
            }else if (opcion==3){
                r.changeStation(true);
                System.out.println("Usted ha cambiado de frecuencia");
            }
            boolean frecuencia=r.getFrequency();
            if (frecuencia==true){
                frec="AM";
            }else {
                frec="FM";
            }
            System.out.println("Usted se encuentra en la frecuencia: "+frec);
            System.out.println("Estación:"+r.getStation());
        }
        
        
        
    }
    
}
