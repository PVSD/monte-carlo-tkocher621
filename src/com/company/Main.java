package com.company;

public class Main {

    public static void main(String[] args) {

        MonteCarlo mcObj = new MonteCarlo(5, 3, 2);

        int cirCount = 0;
        int sqrCount = 0;

        for (int i = 0; i < 100000; i++) {
            if (mcObj.insideCircle(mcObj.nextRainDrop_x(), mcObj.nextRainDrop_y()))
                cirCount++;
            sqrCount++;
        }

        double calc = cirCount * (Math.pow(mcObj.h * 2, 2)) / (sqrCount * Math.pow(mcObj.r, 2));
        System.out.println(calc);
    }
}
