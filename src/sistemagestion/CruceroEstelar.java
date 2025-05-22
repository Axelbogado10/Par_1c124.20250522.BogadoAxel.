/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author bogad
 */
public class CruceroEstelar extends Nave {
    private int cantidadPasajeros;

    
    public CruceroEstelar(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento,int cantidadPasajeros) {
        super(nombre, capacidadDeTripulacion, anioDeLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "   cantidad de pasasjero " + cantidadPasajeros;
        
}
}
