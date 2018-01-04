package ru.geekbrains.java1.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Катя", 500,2.0f);
        Dog dog = new Dog("Казбек", 1300,1000,1.0f);
        Cat cat1 = new Cat("Васька", 400,2.5f);
        Dog dog1 = new Dog("Нора", 1000, 650,1.5f);
        cat.test();
        dog.test();
        cat1.test();
        dog1.test();
    }
}
