package ru.sbertech.test.lesson10.homework;

import ru.sbertech.test.lesson10.homework.Animal.Animal;
import ru.sbertech.test.lesson10.homework.Enums.Food;
import ru.sbertech.test.lesson10.homework.Enums.Skin;

import java.util.List;

/**
 * Created by Daria on 12.08.2016.
 */

public class Farm {
    private List<Animal> animals;
    private FarmLog log = new FarmLog();

    public Farm() {}

    public Farm(List<Animal> animals) {
        this.animals = animals;
        log.farmCreated();
        animals.forEach(a -> log.animalAdded(a));
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
        this.animals.stream().sorted();
        log.animalAdded(animal);
    }

    public String getLog() {
        return log.getInfo();
    }

    @Override
    public String toString() {
        String farm = "Farm:\n";
        String result = animals.stream().map(Animal::toStringWithStatus).reduce(farm,(s1, s2) -> s1 + s2 + "\n");
        return result;
    }

    // всех "меховых" погладить
    public void petWool() {
        animals.stream()
                .filter(a -> a.characteristics.getSkin() == Skin.wool)
                .forEach(Animal::becomeFriendly);
    }

    // всех, кому подходит корм, покормить
    public void feed(Food food) {
        animals.stream()
                .filter(a -> a.characteristics.getPermissibleFood().contains(food))
                .forEach(a -> {a.becomeFriendly(); log.animalFed(a, food);});
    }

    /*ToDo
        -сохранение состояния в файл
        -размножение
     */

}
