package org.example.ch6;

public class Lion extends  Animal{

    public Lion(int age) {
        super(age);
    }

    protected void setProperties(int age, String n) {
        // private access modifier thus compiler error
        // this.age = age;
        setAge(age);
        name = n;
    }
    public void roar() {
        System.out.println(name + ", age " + getAge() + ", says: Roar!");
    }

    public static void main(String[] args) {
        // non static method cannot be called in static block!
        // roar()
        var lion = new Lion(2);
        lion.setProperties(3,"kion");
        lion.roar();
    }
}
