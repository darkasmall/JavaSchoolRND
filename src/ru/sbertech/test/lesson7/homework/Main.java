package ru.sbertech.test.lesson7.homework;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Daria on 04.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String pathToPlugins = "C:/Users/Daria/Desktop/JavaSchoolRND/src/PluginsForLesson7";
//        ArrayList<String> l = PluginManager.getJavaFilePaths(new File(pathToPlugins));
//        for (String first : l) {
//            String tmp = first.substring(0, first.length() - 5).replace("\\", ".");
//            System.out.println(tmp);
//        }


        PluginManager pm = new PluginManager(pathToPlugins);
        ArrayList<Plugin> plugins =  pm.getPlugins();
        plugins.forEach(Plugin::doUsefull);


    }
}
