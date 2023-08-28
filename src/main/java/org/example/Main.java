package org.example;

import org.example.farm.Animal;
import org.example.farm.AnimalFarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.farm.Farms.farm_1;

public class Main {
    public static void main(String[] args) {
        List<String> farmAnimals = Arrays.asList(farm_1);
        List<String> farmAnimals_1 = new ArrayList<>();
        AnimalFarm farm_1 = new AnimalFarm(farmAnimals);
        System.out.printf(farm_1.countedAnimals() +"\n");
        System.out.printf(farm_1.uniqueNames() +"\n");
        System.out.printf(farm_1.toString());
        var farm_2 = new AnimalFarm(farmAnimals_1);
        farm_2.addingFarm(farmAnimals);
        farm_2.addingAnimal("Том");
        farm_2.addingAnimal(Animal.CAT);
        farm_2.addingAnimal(Animal.CAT, "Том");
        System.out.printf(farm_2.countedAnimals() +"\n");
        System.out.printf(farm_2.uniqueNames() +"\n");
        System.out.printf(farm_2.toString());
    }
}