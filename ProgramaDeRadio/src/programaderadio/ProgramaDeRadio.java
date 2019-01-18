
/*
 * 
 * 
 * Esta es la clase principal en la cual se ejecutan las instancias de radios
 */
package programaderadio;

/**
 *
 * @author maria & Camila
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
        int opcion, boton, inicio=0;
        String frec;
        
        System.out.println("Bienvenido a la radio de Camila y Maria Ines");
        
        while (inicio!=7){
            System.out.println("Seleccione la actividad que desee realizar:");
            System.out.println("1. Encender radio");
            System.out.println("2. Cambiar de frecuencia (AM/FM) ");
            System.out.println("3. Cambiar estacion de radio.");
            System.out.println("4. Guardar estacion de radio en boton.");
            System.out.println("5. Seleccionar estacion de radio en boton.");
            System.out.println("6. Apagar radio");
            System.out.println("7. Salir");
            opcion=scan.nextInt();
            System.out.println(" ");
            if (opcion==1){
                r.toggle();
                System.out.println("Radio se ha encendido");
            }else if (opcion==2){
                r.changeFrequency();
                System.out.println("Usted ha cambiado de frecuencia");
            }else if (opcion==3){
                r.changeStation(true);
                System.out.println("Usted ha cambiado de estacion");
            }else if (opcion ==4){
                System.out.println("Ingrese el boton en el que desea ingresar la estacion actual");
                boton = scan.nextInt();
                if (boton <= 12 && boton >= 1){
                    r.saveStation(boton);
                    System.out.println("Ha guardado exitosamente la estacion " + r.getStation() + " en el boton #" + boton);
                } else {
                    System.out.println("No existe ese boton en la radio");
                }
            }else if(opcion == 5){
                System.out.println("Ingrese el boton numero de boton con la estacion deseada");
                boton = scan.nextInt();
                if (boton <= 12 && boton >= 1){
                    r.changeStationButton(boton);
                    System.out.println("Ha cambiado exitosamente la estacion");
                } else {
                    System.out.println("No existe ese boton en la radio");
                }  
            } else if (opcion ==6){
                r.toggle();
                System.out.println("Radio se ha apagado");
            } else if (opcion==7){
                inicio = 7; 
            }
            //Se termina la opcion seleccionada y se muestra informacion
            boolean frecuencia=r.getFrequency();
            if (frecuencia==true){
                frec="AM";
            }else {
                frec="FM";
            }
            System.out.println("Usted se encuentra en la frecuencia: "+frec);
            System.out.println("Estación:"+r.getStation());
        }
                System.out.println("\nHasta pronto!\n\tEsperamos a la radio de Camila y Maria Ines");
        
    }
    
}
