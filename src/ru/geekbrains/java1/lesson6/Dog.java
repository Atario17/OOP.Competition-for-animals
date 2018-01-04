package ru.geekbrains.java1.lesson6;

/**
 * Created by Царь on 15.09.2017.
 */
public class Dog extends Animal {
    public Dog(String name,int maxRun, int maxSwim, float maxJump) {
        this.type = "Собака";
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }
}
