package org.example.ch6;

public class Animal {
    protected String name;
    private int age;

    public Animal(int age) {
        super();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
