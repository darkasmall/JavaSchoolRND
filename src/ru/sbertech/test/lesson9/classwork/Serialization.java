package ru.sbertech.test.lesson9.classwork;

import java.io.*;

/**
 * Created by Student on 08.08.2016.
 */
/*class Person{
    private String firstName;
    private int age;

    public Person() {
        this.age = 20;
        this.firstName = "Mike";
        System.out.println("person constructor");
    }
}*/

class Student implements Serializable{
    private String group;
    private int avgMark;
    private String password;
    private String secureData;

    final static long serialVersionUID = 55;

    public Student() {
        group = "default";
        password = "qwerty";
        avgMark = 3;
        System.out.println("I'm in constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", avgMark=" + avgMark +
                '}';
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        //throw new NotSerializableException();
        avgMark = avgMark ^ 0xFFFFFFFF;
        out.defaultWriteObject();
        out.writeLong(System.currentTimeMillis());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        avgMark = avgMark ^ 0xFFFFFFFF;
        long value = in.readLong();
        System.out.println(value);
    }

}

public class Serialization {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        String fileName = "src/ru/sbertech/test/lesson9/classwork/student.bin";
        try(FileOutputStream fis = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fis)) {
            oos.writeObject(student);
            oos.flush();
            fis.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fos = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fos)){
            Student student1 = (Student) in.readObject();
            System.out.println(student1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}