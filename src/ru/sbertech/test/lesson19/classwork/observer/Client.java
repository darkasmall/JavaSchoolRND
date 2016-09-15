package ru.sbertech.test.lesson19.classwork.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 12.09.2016.
 */
public class Client {
    public static void main(String[] args) {
        MeteoStation meteo = new MeteoStation();
        Observer cons = new ConsoleObserver();

        meteo.addObserver(cons);
        meteo.setData(30, 750);
    }
}

interface Observable {
    void notifyObserver(int temperature, int pressure);
    void addObserver(Observer o);
    void removeObserver(Observer o);
}

interface Observer {
    void onChange(int temperature, int pressure);
}

class MeteoStation implements Observable{
    List<Observer> observers = new ArrayList<>();
    int temperature;
    int pressure;

    void setData(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObserver(temperature,pressure);
    }

    @Override
    public void notifyObserver(int temperature, int pressure) {
        for (Observer observer: observers){
            observer.onChange(temperature,pressure);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}

class ConsoleObserver implements Observer {
    @Override
    public void onChange(int temperature, int pressure) {
        System.out.println("Temp: " + temperature + "," + pressure);
    }
}

class FileObserver implements Observer {
    @Override
    public void onChange(int temperature, int pressure) {
     //  try (PrintWriter pw = new PrintWriter())
    }
}