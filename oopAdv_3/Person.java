package javaadvanced.oopAdv_3;

import java.util.Objects;

public class Person {
    /**
     * Create a class called "Person" with fields for name, age, and address.
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hello. His name is "+ name +" and he is " + age + " years hold. " +  "He live in " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}