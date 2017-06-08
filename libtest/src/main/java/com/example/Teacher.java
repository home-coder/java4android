package com.example;

/**
 * Created by java on 17-6-7.
 */
public class Teacher extends Person {
    Teacher(int no, String name) {
        super(no, name);
    }

    @Override
    public void work() {
        System.out.println("no work ***************");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("Teacher eat");
    }
}
