/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestion;

import java.util.Scanner;

/**
 *
 * @author bogad
 */
public class Sistemagestion {
    
    
    public static void main(String[] args) { 
        Torre torre = new Torre();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
       do{
            System.out.println("\n===== Menú Espacial =====");
            System.out.println("1. Agregar Nave");
            System.out.println("2. Mostrar Naves");
            System.out.println("3. Iniciar exploracion");
            System.out.println("4. mostrar naves ordenadas por nombre");
            System.out.println("5. naves ordenadas por año de lanzamiento");
            System.out.println("6. ordenar");
            System.out.println("7.salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

switch (opcion) {
case 1:
        System.out.println("------tipo de nave------- ");
        System.out.println("1. Nave de exploracion");
        System.out.println("2. Carguero");
        System.out.println("3. Crucero Estelar");
        opcion = scanner.nextInt();
        scanner.nextLine();
        switch(opcion){
            case 1:
                System.out.println("ingrese el nombre de la nave");
                String nombreExploracion = scanner.nextLine();
                System.out.println("ingrese la capacidad de tripulacion");
                int capacidadDeTripulacionExploracion = scanner.nextInt();
                System.out.println("ingrese año de lanzamiento ");
                int anioDeLanzamientoExploracion = scanner.nextInt();
                scanner.nextLine();
                System.out.println("ingrese Tipo de mision");
                String tipoMision = scanner.nextLine();
                     if (!(tipoMision.equals("CARTOGRAFIA"))&&
                    !tipoMision.equals("NVESTIGACION")&&
                    !tipoMision.equals("CONTACTO")){
                          System.out.println("mision no valida");
                          break;
                    }else{
                            torre.agregarNave(new NaveExploracion(nombreExploracion, capacidadDeTripulacionExploracion, anioDeLanzamientoExploracion,tipoMision));
                            }

                    break;
            case 2:
                System.out.println("ingrese nombre del carguero");
                String nombreCarguero = scanner.nextLine();
                System.out.println("ingrese capacidad de carga (entre 100 y 500)1");
                int capacidadDeCargaCarguero = scanner.nextInt();
               if (!(capacidadDeCargaCarguero < 500 ) && !(capacidadDeCargaCarguero > 100)){
                System.out.println("capacidad invalidad");
                break;
               }else{
                   System.out.println("ingrese anio de lanzamiento");
                   int anioDeLanzamiento = scanner.nextInt();
                   System.out.println("ingrese capacidad de carga");
                   int capacidadDeCarga = scanner.nextInt();
                   scanner.nextLine();
                   torre.agregarNave(new Carguero(nombreCarguero, capacidadDeCargaCarguero, anioDeLanzamiento, capacidadDeCarga));
                   break;
               }
            case 3:
              System.out.println("ingrese nombre del crucero estelar");
                 String nombreCrucero = scanner.nextLine();
                 System.out.println("ingrese capacidad de tripulacion");
                 int capacidadCrucero = scanner.nextInt();
                 System.out.println("ingrese anio de lanzamiento");
                 int anioLanzamientoCrucero = scanner.nextInt();
                 System.out.println("ingrese cantidad de pasajeros");
                 int cantidadPasajeros = scanner.nextInt();
                 scanner.nextLine();
                 torre.agregarNave(new CruceroEstelar(nombreCrucero, capacidadCrucero , anioLanzamientoCrucero , cantidadPasajeros ));
                 break;
        }
        break;
case 2:
                  torre.mostrarNaves();
                    break;
case 3:     
                    torre.empezarMision();
                    break;
case 4:
                    torre.ordenarNombre();
                    break;
case 5:
                    torre.OrdenarPorAnio();
                    break;
case 6:
                   torre.ordenarTripualcion();
                   break;

case 7:
System.out.println("Saliendo del sistema...");
                    break;
default:
System.out.println("Opción inválida.");
            }
    }while (opcion != 0);

    scanner.close();
    }
 }
