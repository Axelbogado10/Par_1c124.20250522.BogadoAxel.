/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

import java.util.Comparator;

/**
 *
 * @author bogad
 */
public class OrdenarPorTripulacion implements Comparator <Nave>{
  @Override
    public int compare(Nave o1, Nave o2) {
            return Integer.compare(o2.getCapacidadDeTripulacion(), o1.getCapacidadDeTripulacion());
    }
}
