package ru.geekbrains.java1.lesson6;

public class Animal{
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected float maxJump;

    protected void toRun(int distanceRun){
        if(distanceRun<=maxRun && distanceRun>0){
            System.out.println(type + " " + name + " пробежал/а " + distanceRun + " м.");
        }else{
            System.out.println(type + " " + name + " не может пробежать " + distanceRun + " м.");
        }
    }protected void toSwim(int distanceSwim){
        if(maxSwim==0) {//да, в классе Cat переопределен метод уже, потому что кот не захочет плыть.
                        // Но это на случай создания других классов животных, которые не могут плавать, а не потому что
                        // не хотят
            System.out.println(type + " " + name + " отказывается плыть.");
            return;
        }if(distanceSwim<=maxSwim&&distanceSwim>0){
            System.out.println(type + " " + name + " проплывает " + distanceSwim + " м.");
        }else{
            System.out.println(type + " " + name + " не может проплыть " + distanceSwim + " м.");
        }
    }protected void toJump(float distanceJump){
        if(distanceJump<=maxJump&&distanceJump>0){
            System.out.println(type + " " + name + " перепрыгивает " + distanceJump + " м.");
        }else{
            System.out.println(type + " " + name + " не может перепрыгнуть " + distanceJump + " м.");
        }
    }protected void test(){
        toRun(1000);
        toSwim(700);
        toJump(1.3f);
        System.out.println("===========================");
    }
}
