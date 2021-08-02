
package test;

import dominio.AnimalCarnivoro;
import dominio.AnimalHerbivoro;
import dominio.Planta;

public class TestAnimal {
    
    public static void main(String[]args){
       Planta planta = new Planta();
       planta.setNombre("Eucalipto");
       System.out.println("Planta: "+planta.getNombre());
       planta.alimentarse();
       AnimalCarnivoro animalC = new AnimalCarnivoro();
       animalC.setNombre("León");
       System.out.println("Animal Carnívoro: "+animalC.getNombre());
       animalC.alimentarse();
       AnimalHerbivoro animalH = new AnimalHerbivoro();
       animalH.setNombre("Cuy");
       System.out.println("Animal Herbívoro: "+animalH.getNombre());
       animalH.alimentarse();
    }
}
