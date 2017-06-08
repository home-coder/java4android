package com.example;

public class MyClass {
    public static void main(String[] args) {
        boolean isTrue = true;
        System.out.println(isTrue);
        boolean isFalse = false;
        System.out.println(isFalse);

        char isEng = 'e';
        char isChn = '江';
        System.out.println(isEng);
        System.out.println(isChn);

        /* java 8 charactor*/
        byte b = 0;
        short s = 1;
        int i = 2;
        long l = 3;
        boolean bl = true;
        float f = 0.1f;
        double d = 0.01;
        char c = 'c';
        byte k = (byte) (b + 200);
/*11001000 --> (-1 *)00110111 = -56*/
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(bl);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(k);

        int testNum = 6;
        if (testNum > 5 && testNum < 10) {
            System.out.println(testNum);
        } else if (testNum > 3) {
            System.out.println(testNum);
        }

        switch (c) {
            case 'b':
                System.out.println("c is b");
                break;
            case 'c':
                System.out.println("c is c");
                break;
            default:
                break;
        }

        /* student score */
        int[] studentScore = {23, 57, 98, 108, 94};
        for (int index = 0; index < studentScore.length; index++) {
            int divor = studentScore[index] % 10;
            if (studentScore[index] / 10 >= 10) {
                System.out.println("假的\t" + studentScore[index]);
                continue;
            }
            switch (divor) {
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("你的成績不合格" + '\t' + studentScore[index]);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("你的成績不錯" + '\t' + studentScore[index]);
                    break;
                default:
                    break;
            }
        }
        /* 打印出 100-200 之间的所有素数 */
        for (int numList = 100; numList <= 200; numList++) {
            for (int div = 2; div < numList; div++) {
                if (numList % div == 0) {
                    System.out.println(numList);
                    break;
                }

            }
        }

        /* 在命令行当中打印出如下的图形 */
        int lineNum = 30;
        for (int lineIndex = 0; lineIndex < lineNum; lineIndex++) {
            for (int spaceNum = lineNum - lineIndex - 1; spaceNum > 0; spaceNum--) {
                System.out.print(" ");
            }
            for (int starNum = 0; starNum <= lineIndex; starNum++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
