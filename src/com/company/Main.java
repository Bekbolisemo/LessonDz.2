package com.company;

public class Main {
    public static void main(String[] args) {
        createObject("Dog");
        createObject("Frog");
        createObject("Cat");
    }

    public static void createObject(String className){
        switch (className){
            case "Dog":
                Dog dog = new Dog("Alex",13);
                dog.print();
                break;
            case "Frog":
                Frog frog = new Frog("Dudly",4);
                frog.print();
                break;
            case "Cat":
                Cat cat = new Cat("Tom",15);
                cat.print();
            break;
        }
    }
}
