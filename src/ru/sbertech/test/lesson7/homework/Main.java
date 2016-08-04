package ru.sbertech.test.lesson7.homework;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Daria on 04.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String pathToPlugins = "C:/Users/Daria/Desktop/JavaSchoolRND/src/PluginsForLesson7";
        PluginManager pm = new PluginManager(pathToPlugins, Main.class.getClassLoader());
        ArrayList<Plugin> plugs = pm.loadAll();
        for (Plugin p : plugs) {
            p.doUsefull();
        }
    }
}
