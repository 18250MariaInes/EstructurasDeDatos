/*
 * 
 * 
 * Interfaz de radio
 */
//package programaderadio;

/**
 *
 * @author Camila y Maria Ines
 */
public interface Radio {

    /**
     *metodo encargada de encender o apagar radio
     */
    public void toggle(); 

    /**
     *Devuelve si el radio esta on u off
     * @return boolean de si esta apagado
     */
    public boolean getState();  //

    /**
     *Cambia de Am a Fm y viceversa
     */
    public void changeFrequency(); //Cambia de Am a Fm y viceversa

    /**Aumenta o disminuye la estacion. Si sube de estacion es true y si baja es false
     *
     * @param up indica si quiere subir o bajar de estacion
     */
    public void changeStation(boolean up); //

    /**
     *metodo que indica en que frecuencia esta
     * @return boolean sobre si esta en am o fm
     */
    public boolean getFrequency();

    /**
     *metodo qeu guarda estacion en un boton
     * @param numButton indica que boton desea cambiar
     */
    public void saveStation(int numButton);

    /**
     *cambia entacion a una guardada en el numero
     * @param numButton numero al cual desea cambiar
     */
    public void changeStationButton(int numButton);

    /**
     *retorna la estacion en donde esta
     * @return double con el numero de estacion
     */
    public double getStation();
}
