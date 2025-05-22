/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author bogad
 */
public abstract class Nave implements Comparable<Nave> {
    private String nombre;
    private int capacidadDeTripulacion;
    private int anioDeLanzamiento;

    public Nave(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.capacidadDeTripulacion = capacidadDeTripulacion;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadDeTripulacion() {
        return capacidadDeTripulacion;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }
    
    
@Override
    public String toString(){
        return "nombre  " + nombre + "   capacidadDeTripulacion  " + capacidadDeTripulacion + "   año de lanzamiento  " + anioDeLanzamiento;
    }
    
@Override
    public int compareTo(Nave o) {
       return Double.compare(o.anioDeLanzamiento, this.anioDeLanzamiento);
}


}
