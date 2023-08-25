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
                "CAT Мурка",
                "CAT Пушок",
                "CAT Васька",
                "CAT Лакома",
                "CAT Ворчун",
                "DOG Жучка",
                "DOG Пушок",
                "DOG Мухтар",
                "DOG Дозор",
                "COW Мурка",
                "COW Гаврюша",
                "COW Бурёнка",
                "HORSE Лакома",
                "HORSE ",
                "HORSE",
                "HSE Буян",
                "HORSE Яблоко",
                "NOT_DEFINED Ряба"
        );
        AnimalFarm farm_1 = new AnimalFarm(farmAnimals);
        var animalCount = farm_1.countedAnimals(farmAnimals);
        var animalNames = farm_1.uniqueNames(farmAnimals);
        System.out.printf(animalCount +"\n");
        System.out.printf(animalNames +"\n");
    }
}