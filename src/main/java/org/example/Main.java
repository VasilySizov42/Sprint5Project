package org.example;

import org.example.farm.Animal;
import org.example.farm.AnimalFarm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> farmAnimals = Arrays.asList(
                "CAT hgh",
                "CAT hgh",
                "CAT iohlulg",
                "CAT iohlulg",
                "CAT iohcgfvhlulg",
                "DOG jbhig",
                "DOG vhvyufvtu",
                "DOG kjhbvhlvhvk",
                "DOG jbhiuyuy",
                "COW lknlkoih",
                "COW lknlkoi",
                "COW lknlk",
                "HORSE iugygfiu",
                "HSE iugyiu",
                "HORSE iugyg"
        );
        AnimalFarm farm_1 = new AnimalFarm(farmAnimals);
        HashMap<Animal, Integer> animalCount = farm_1.countedAnimals(farmAnimals);

        System.out.printf(String.valueOf(animalCount));
    }
}