
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package programaderadio;

/**
 *
 * @author Camila & Maria Ines
 */
import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class myRadio implements Radio{
    private boolean encendido;
    private boolean frecuencia;
    private double estacion;
    private double[] buttons;
    
    /**
     *
     */
    public myRadio(){
        encendido = false; //False es FM y True es para AM
        frecuencia = false;
        estacion = 87.9;
        buttons = new double[12];
    }
    
    /**
     *
     */
    @Override
    public void toggle(){
        if (encendido==false){
            this.encendido=true;
        }else{
            this.encendido=false;
        }
    }//Apaga o enciende la radio
    
    /**
     *
     * @return boolean true=encendido false=apagado
     */
    @Override
    public boolean getState(){
        return encendido;
        //Devuelve si el radio esta on u off
    }
    
    /**
     *metodo que cambia frecuencia de radio e igualmente cambia la estacion actual de acuerdo a la frecuencia
     */
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

    /**
     *metodo que cambia la estacion de acuerdo a la frecuencia. Puede subir o bajar de estacion
     * @param up indica si quiere subir o bajar
     */
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

    /**
     *metodo que retorna frecuencia de la radio
     * @return boolean de true y false dependiendo de la frecuencia
     */
    @Override
    public boolean getFrequency(){
        return this.frecuencia;
        //Devuelve la frecuencia actual (AM o FM)
    }

    /**
     *metodo que guarda la estacion que indique el usuario
     * @param numButton indica que boton desea
     */
    @Override
    public void saveStation(int numButton){
        this.buttons[numButton-1] = this.estacion;
        //Guarda la estacion elegida en la lista de estaciones favoritas en el boton seleccionado
    }

    /**
     *metodo que cambia la estacion de los botones
     * @param numButton indica que boton desea cambiar a
     */
    @Override   
    public void changeStationButton(int numButton){
        this.estacion = this.buttons[numButton - 1];
        //Permite seleccionar una estacion (emisora) de las guardadas en las 12 favoritas
    }

    /**
     *metodo que retorna estacion actual
     * @return double con la estacion
     */
    @Override
    public double getStation(){
        return this.estacion; 
        //Devuelve la estacion (emisora) actual 
    }
    
}

