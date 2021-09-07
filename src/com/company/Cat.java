package com.company;

public class Cat extends Animal{
    private String thisCat = "этот кот любит спать под лучами солнце";
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        peculiarity = " у " + getName() + "a хвост рыжий";
        System.out.println("Зовут кота " + getName() + "\n возраст кота " + getAge() + " лет" + peculiarity +
                "\n"+ thisCat + "\n" + "-----------------------------------------------------------------");

    }
}
