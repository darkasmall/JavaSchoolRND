package ru.sbertech.test.lesson7.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static ru.sbertech.test.lesson7.homework.SupportingMethods.*;

/**
 * Created by Daria on 04.08.2016.
 */


public class PluginManager {
    //private final String pluginRootDirectory;
    private Method define, resolve;
    private final File rootDirectory;
    private final ClassLoader classLoader;

    public PluginManager(String pluginRootDirectory, ClassLoader classLoader) {
        rootDirectory = new File(pluginRootDirectory);
        this.classLoader = classLoader;
        try {
            define = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
            resolve = ClassLoader.class.getDeclaredMethod("resolveClass", Class.class);
            define.setAccessible(true);
            resolve.setAccessible(true);
        } catch (Exception e) {
            System.out.println("Fail: " + e);
        }

    }

   // public Plugin load(String pluginName, String pluginClassName) {
        //todo
   // }


    public ArrayList<Plugin> loadAll() {
        ArrayList<Plugin> result = new ArrayList<>();
        Class<?> clazz;
        Object instance;
        for (File f : getFiles(rootDirectory)) {
            byte[] bcode = getByteCode(f.getPath());
            try {
                clazz = (Class<?>) define.invoke(classLoader, null , bcode, 0, bcode.length);
                resolve.invoke(classLoader, clazz);
                instance = clazz.newInstance();
                if (instance instanceof Plugin) {
                    result.add((Plugin) instance);
                }
            }
            catch (Exception e) {
                System.out.println("Fail:" + e);
            }
        }
        return result;
    }

}

