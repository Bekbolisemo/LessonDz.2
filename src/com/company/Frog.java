package com.company;

public class Frog extends Animal{

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("Зовут лягушку " + getName() + "\n возраст лягушки " + getAge() + " лет");

    }
}
