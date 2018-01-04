package ru.geekbrains.java1.lesson6;

public class Cat extends Animal {

    public Cat(String name,int maxRun, float maxJump) {
        this.type = "Кошка";
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = 0;
        this.maxJump = maxJump;
    }
    @Override
    public void toSwim(int distanceSwim){
        System.out.println(name + " отказывается плыть. Не царско-кошачье это дело и вообще у него/её лапки)");
    }
}
