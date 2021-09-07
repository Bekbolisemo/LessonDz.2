package com.company;

public class Frog extends Animal{
    private String thisFrog = "эта лягушка тупая как пробка P.s из за этого он потерял лапку";
    public Frog(String name, int age) {
        super(name, age);

    }
    @Override
    public void print() {
        peculiarity = " у " + getName() + " нету одной лапки";
        System.out.println("Зовут лягушку " + getName() + "\n возраст лягушки " + getAge() + " лет"+ "\n" + peculiarity +
                "\n"+ thisFrog + "\n----------------------------------------------------");

    }
}
