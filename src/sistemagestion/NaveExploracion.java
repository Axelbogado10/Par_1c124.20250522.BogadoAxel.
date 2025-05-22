/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author bogad
 */
public class NaveExploracion extends Nave implements Explorar{
    private String tipoMision;

    public String getTipoMision() {
        return tipoMision;
    }
    
    public NaveExploracion(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento,String tipoMision) {
        super(nombre, capacidadDeTripulacion, anioDeLanzamiento);
        this.tipoMision = tipoMision;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "   TipoMision  " + tipoMision;
    }
    
    @Override
 public void explorar(){
     System.out.println("explorando");
 }
}
