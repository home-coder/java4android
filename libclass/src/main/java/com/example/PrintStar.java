package com.example;

/**
 * Created by java on 17-3-19.
 */
public class PrintStar {
/*    public static final String space = " ";
    public static final String star = "* ";*/

    public static String space = null;
    public static String star = null;

    PrintStar(String space, String star) {
        this.space = space;
        this.star = star;
    }

    public void printSpace() {
        System.out.print(space);
    }

    public void printStar() {
        System.out.print(star);
    }

    public void printTriggle(int lineNum) {
        for (int lineIndex = 0; lineIndex < lineNum; lineIndex++) {
            for (int spaceNum = lineNum - lineIndex - 1; spaceNum > 0; spaceNum--) {
                printSpace();
            }
            for (int starNum = 0; starNum <= lineIndex; starNum++)
                printStar();
            System.out.println();
        }
    }

    public void printRt(int lineNum) {
        for (int lineIndex = 0; lineIndex < lineNum; lineIndex++) {
            for (int starNum = 0; starNum <= lineIndex; starNum++)
                printStar();
            System.out.println();
        }
    }

    public void printDiamond(int midNum) {
        printTriggle(midNum);
        for (int underIndex = midNum - 1; underIndex > 0; underIndex--) {
            for (int spaceNum = 0; spaceNum < midNum - underIndex; spaceNum++) {
                printSpace();
            }
            for (int starNum = 0; starNum < underIndex; starNum++) {
                printStar();
            }
            System.out.println();
        }
    }

    public void printSomeDiamond(int Some, int midNum) {
        System.out.println("稍有些麻煩");
    }

    public void printDiamond(int Some, int midNum) {
        System.out.println("函數重載");
    }
}








