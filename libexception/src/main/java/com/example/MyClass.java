package com.example;

public class MyClass {
    public static void main(String args[]){
        int num = 1;
        try {
            System.out.println(1);
            int another = num / 0;
            System.out.println(2);
        }catch (Exception e) {
            System.out.println(3);
            e.printStackTrace();
            System.out.println(4);
        }finally {
            System.out.println(5);
        }
    }
}
