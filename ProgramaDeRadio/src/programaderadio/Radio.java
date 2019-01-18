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
public interface Radio {
    public void toggle(); //Apaga o enciende la radio
    public boolean getState();  //Devuelve si el radio esta on u off
    public void changeFrequency(); //Cambia de Am a Fm y viceversa
    public void changeStation(boolean up); //Aumenta o disminuye la estacion. Si sube de estacion es true y si baja es false
    public boolean getFrequency();
    public void saveStation(int numButton);
    public void changeStationButton(int numButton);
    public double getStation();
}
