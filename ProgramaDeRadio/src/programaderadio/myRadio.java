/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaderadio;

/**
 *
 * @author Camila
 */

import java.util.ArrayList;

/**
 *Clase MyRadio donde se se implementa interface Radio
 * @author maria
 */
public class myRadio implements Radio{
    private boolean encendido=false;
    private boolean frecuencia=false;
    private double estacion=87.9;
    private ArrayList<Double> buttons = new ArrayList<>();

    /**
     *Método que enciende y apaga la radio
     */
    @Override
    public void toggle(){
        if (encendido=false){
            this.encendido=true;
        }else{
            this.encendido=false;
        }
    }//Apaga o enciende la radio

    /**
     *método que da el estado de la radio entre encendido y apagado
     * @return boolean, true para encendido y false para apagado
     */
    @Override
    public boolean getState(){
        return encendido;
        //Devuelve si el radio esta on u off
    }

    /**
     *método que cambia frecuencia de radio entre am=true y fm =false, tambien cambia la estación de acuerdo a su frecuencia
     */
    @Override
    public void changeFrequency(){ 
        if (frecuencia=false){
            this.frecuencia=true;
            this.estacion=530.0;
        }else{
            this.frecuencia=false;
            this.estacion=87.9;
        }
        //Cambia de Am a Fm y viceversa
    }

    /**
     *Método que cambia estación de radio dependiendo en su frecuencia
     * @param up
     */
    @Override
    public void changeStation(boolean up){
        if (this.frecuencia=false){
            this.estacion+=0.2;
            if (estacion>107.9){
                this.estacion=estacion-87.9;
            }    
        }else{
            this.estacion+=10;
        }
        //Aumenta o disminuye la estacion. Si sube de estacion es true y si baja es false
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getFrequency(){
        return this.frecuencia;
        
    }
    @Override
    public void saveStation(int numButton){
        
    }
    @Override
    public void changeStationButton(int numButton){
        
    }
    @Override
    public double getStation(){
        return estacion;
        
    }
    
}
