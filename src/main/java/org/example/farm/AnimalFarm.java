package org.example.farm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AnimalFarm {
    private Animal type;
    private String name;
    private final List<String> farmAnimals;
    public AnimalFarm(List<String> farmAnimals){
        this.farmAnimals = farmAnimals;
    }
    public void addingAnimal(Animal type, String name){
        farmAnimals.add(type.toString() + " " + name);
    }
    public void addingAnimal(Animal type){
        farmAnimals.add(type.toString() + " " + "N");
    }
    public void addingAnimal(String name){
        farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }
    public HashMap countedAnimals(List<String> farmAnimals){
        HashMap<Animal, Integer> animalCount = new HashMap<>();
        for(String animal : farmAnimals) {
            try {
            Animal animalType = Animal.valueOf(animal.split(" ")[0]);
            if (!animalCount.containsKey(animalType)) animalCount.put(animalType, 1);
             else animalCount.put(animalType, animalCount.get(animalType)+1);
            } catch (IllegalArgumentException exception) {
                System.out.println("Please correct string "+ animal
                        + ". Incorrect input data.");
            }
        }
        return animalCount;
    }
    public HashSet uniqueNames(List<String> farmAnimals){
        HashSet<String> animalNames = new HashSet<>();
        for(String animal : farmAnimals) {
            try {
                animalNames.add(animal.split(" ")[1]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Please correct string "+ animal
                        + ". Incorrect input data.");
            }
        }
        return animalNames;
    }
}
