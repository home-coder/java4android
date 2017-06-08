package com.example;

/**
 * Created by java on 17-6-7.
 */
public class Test {
    public static void main(String args[]) {
        Person p = new Student(23, "abc", 180);
        Person t = new Teacher(1, "lilaoshi");

        Test test = new Test();
        test.showActivity(t);

    }

    public void showActivity(Person person) {
        person.eat();
        person.run();
        person.work();
        person.sleep();
    }
}
