package com.ua.sutty.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Zeydel slau = new Zeydel();
        double[][] A = { { 3.8, 1.1, 0.75, 0.8, 15.6 }, { 1.1, 4.5, 0.9, 1.6, 22.7 },
                { 0.7, 0.8, 4.7, 0.6, 23.5 }, {0.8, 0.8, 1.2, 3.5, 16} };
        double[] x = slau.findSolution(A);
        for (double[] d : A) {
            System.out.println(Arrays.toString(d));
        }
        System.out.println(Arrays.toString(x));
    }
}

