/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author bogad
 */
public class Torre {
private List<Nave>naves;

    public Torre(){
        naves = new ArrayList<>();
    }
    
   public void agregarNave(Nave na){
       if(naves.contains(na)){
           System.out.println("ya esta esta nave");
       }else{
           naves.add(na);
       }
   }
   
   public void mostrarNaves(){
     System.out.println("\n Publicaciones en la Biblioteca:");
        if (naves.isEmpty()) {
            System.out.println("No hay naves registradas.");
        } else {
            naves.forEach(System.out::println);
            }
        }
   
   public void empezarMision(){
      for(Nave  p : naves){
          if(p instanceof Explorar){
              System.out.println(p );
          }
      }
    }
   
   public void ordenarNombre(){
        Collections.sort(naves, new OrdenarPorNombre());
        System.out.println("/nOrdenados por nombre");
        naves.forEach(System.out::println);
   }
   
   public void OrdenarPorAnio() {
         Collections.sort(naves);
        for(Nave p : naves){
        System.out.println(p );
   }
  } 
   public void ordenarTripualcion(){
        Collections.sort(naves, new OrdenarPorTripulacion());
        System.out.println("/nOrdenados por Tripulacion");
        naves.forEach(System.out::println);
}
}
