package ru.sbertech.test.lesson9.classwork;

import java.io.*;

/**
 * Created by Student on 08.08.2016.
 */

class DataHolder implements Serializable{
    String value = "AAAAA";
}
public class CacheTest {
    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder();
        System.out.println(dataHolder);
        String fileName = "src/ru/sbertech/test/lesson9/classwork/dataholder.bin";
        try(FileOutputStream fis = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fis)) {
            oos.writeObject(dataHolder);
            dataHolder.value = "BBBBB";
            //oos.writeUnshared(dataHolder); //must be false
            oos.writeObject(dataHolder);
            dataHolder.value = "CCCCC";
            oos.writeObject(dataHolder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataHolder dataholder1;
        DataHolder dataholder2;
        DataHolder dataholder3;

        try(FileInputStream fos = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fos)){
            dataholder1 = (DataHolder) in.readObject();
            dataholder2 = (DataHolder) in.readObject();
            dataholder3 = (DataHolder) in.readObject();
            System.out.println(dataHolder == dataholder1);
            System.out.println(dataHolder == dataholder2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // must be "true"!!!!!

    }
}
