/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author bogad
 */
public class Carguero extends Nave implements Explorar {
    private int capacidadCarga;
    
    public Carguero(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento,int capacidadCarga) {
        super(nombre, capacidadDeTripulacion, anioDeLanzamiento);
        this.capacidadCarga = capacidadCarga;
        
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

 @Override
    public String toString(){
        return super.toString() + "   capacidad de carga  " + capacidadCarga;
    }
 @Override
 public void explorar(){
     System.out.println("explorando");
 }
}
