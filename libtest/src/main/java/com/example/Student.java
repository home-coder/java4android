package com.example;

/**
 * Created by java on 17-6-7.
 */
public class Student extends Person {
    int height;

    Student(int no, String name) {
        super(no, name);
    }

    Student(int no, String name, int height) {
        this(no, name);
        this.height = height;
    }
//    @Override
//    public void eat() {
//        System.out.println("Student eat");
//    }
//
//    @Override
//    public void show() {
//        System.out.println("Student show" + height);
//    }

    @Override
    public void sleep() {
        System.out.println("no sleep ***************");
    }
}
