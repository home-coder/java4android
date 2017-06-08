package com.example;

public class MyClass {
    public static void main(String[] args) {
        PrintStar pStar = new PrintStar(" ", "^ ");

        System.out.println("    Triggle test    ");
        pStar.printTriggle(5);

        System.out.println("    Rt test     ");
        pStar.printRt(8);

        System.out.println("    Diamond test    ");
        pStar.printDiamond(5);

        System.out.println("    3 Diamond test  ");

/*        new PrintStar().printSomeDiamond(3, 4);
        new PrintStar().printDiamond(3, 4);*/
    }
}
