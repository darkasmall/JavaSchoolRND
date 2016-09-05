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
        String farm = "Farm:\n";
        String result = animals.stream().map(Animal::toString).reduce(farm,(s1, s2) -> s1 + s2 + "\n");
        return result;
    }

    // всех "меховых" погладить
    public void stroke() {
        animals.stream().filter(a -> a.getSkin() == Skin.wool).forEach(Animal::becomeFriendly);
    }

    // всех, кому подходит корм, покормить
    public void feed(Food food) {
        animals.stream().filter(a -> a.getPermissibleFood().contains(food)).forEach(Animal::feed);
    }

    /*ToDo
        -плодить
        -случайные имена из файла
        -жизнь со временем
        -сохранение состояния в файл
        -лог операций
     */

}
