/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author Camila
 */
public class myRadio implements Radio{
    @Override
    public void togge(){
    }//Apaga o enciende la radio
    @Override
    public boolean getState(){
        return false;
        //Devuelve si el radio esta on u off
    }
    @Override
    public void changeFrequency(){ 
        //Cambia de Am a Fm y viceversa
    }
    @Override
    public void changeStation(boolean up){
        //Aumenta o disminuye la estacion. Si sube de estacion es true y si baja es false
    }
    @Override
    public boolean getFrequency(){
        return false;
        
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
