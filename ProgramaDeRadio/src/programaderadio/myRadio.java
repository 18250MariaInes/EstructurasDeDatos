/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaDeRadio;

/**
 *
 * @author Camila
 */

import java.util.ArrayList;
public class myRadio implements Radio{
    private boolean encendido=false;
    private boolean frecuencia=false;
    private double estacion;
    private ArrayList<Double> buttons = new ArrayList<>();

    
    
    @Override
    public void toggle(){
        if (encendido=false){
            this.encendido=true;
        }else{
            this.encendido=false;
        }
    }//Apaga o enciende la radio
    @Override
    public boolean getState(){
        return encendido;
        //Devuelve si el radio esta on u off
    }
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
    @Override
    public void changeStation(boolean up){
        if (this.frecuencia=false){
            this.estacion+=0.2;
            if (estacion>107.9){
                this.estacion=estacion-87.9;
            }
                    
        }
        //Aumenta o disminuye la estacion. Si sube de estacion es true y si baja es false
    }
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
        return 0;
        
    }
    
}
