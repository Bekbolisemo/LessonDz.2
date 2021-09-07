package com.company;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println( "Зовут собаку " + getName() + "\n возраст собаки " + getAge() + " лет");
    }
}
