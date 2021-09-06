package com.company;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("Зовут кота " + getName() + "\n возраст кота " + getAge() + " лет");

    }
}
