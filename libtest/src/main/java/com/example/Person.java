package com.example;

public abstract  class Person {
    int no;
    String name;

    Person(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void show(){
        System.out.println(no + ", " + name);
    }

    public void eat() {
        System.out.println("eat************");
    }

    public void run() {
        System.out.println("run************");
    }

    public void work() {
        System.out.println("work************");
    }

    public abstract  void sleep() ;
}
