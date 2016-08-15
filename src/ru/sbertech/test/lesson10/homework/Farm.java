package ru.sbertech.test.lesson10.homework;

import java.util.List;

/**
 * Created by Daria on 12.08.2016.
 */
public class Farm {
    private List<Animal> animals;

    public Farm() {}

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
        this.animals.stream().sorted();
    }

    @Override
    public String toString() {
        String result = "Farm:\n";
        //ToDo использовать лямбды
        return result;
    }

    public void stroke() {
        //ToDo погладить всех пушистых животных с изменением их настроения
    }

    public void feed(Food food) {
        //ToDo накормить всех животных, которым подходит этот корм, с изменением их статуса сытости
    }

    //ToDo аналогичные методы

}
