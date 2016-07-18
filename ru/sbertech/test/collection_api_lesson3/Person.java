package ru.sbertech.test.collection_api_lesson3;

/**
 * Created by Student on 18.07.2016.
 */
public class Person implements Comparable<Person>{
    Long id;
    String name;
    String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(Long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        return this.getPhoneNumber().compareTo(o.getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Person (id = " + this.getId() + "; name = " + this.getName() + "; phoneNumber = " + this.getPhoneNumber() + ")";
    }


    @Override
    public int hashCode() {
        return (this.getId() + this.getPhoneNumber() + this.getName()).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return this.getId().equals(((Person) o).getId());
    }
}
