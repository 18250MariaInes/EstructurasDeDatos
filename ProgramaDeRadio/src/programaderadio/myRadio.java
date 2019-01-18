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

public class myRadio implements Radio{
    private boolean encendido;
    private boolean frecuencia;
    private double estacion;
    private ArrayList<Double> buttons;
    
    public myRadio(){
        encendido = false; //False es FM y True es para AM
        frecuencia = false;
        estacion = 87.9;
        buttons = new ArrayList<>(12);
    }
    
    @Override
    public void toggle(){
        if (encendido==false){
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
        if (frecuencia==false){
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
        if (this.frecuencia==false){
            this.estacion+=0.2;
            if (estacion>107.9){
                this.estacion= 87.9;
            }   
        } else {
            this.estacion+=10.0;
            if (estacion>1610.0){
                this.estacion= 530.0;
            }  
            
        }
        //Aumenta o disminuye la estacion. Si sube de estacion es true y si baja es false
    }
    @Override
    public boolean getFrequency(){
        return this.frecuencia;
        //Devuelve la frecuencia actual (AM o FM)
    }
    @Override
    public void saveStation(int numButton){
        if (buttons.size() <= 12){
            this.buttons.add(numButton-1, estacion);
        }
        //Guarda la estacion elegida en la lista de estaciones favoritas en el boton seleccionado
    }
    @Override   
    public void changeStationButton(int numButton){
        this.estacion = this.buttons.get(numButton - 1);
        //Permite seleccionar una estacion (emisora) de las guardadas en las 12 favoritas
    }
    @Override
    public double getStation(){
        return this.estacion; 
        //Devuelve la estacion (emisora) actual 
    }
    
}
