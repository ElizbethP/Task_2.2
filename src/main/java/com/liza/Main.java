package com.liza;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            String st = str[i];
            arr[i] = Integer.parseInt(st);
        }


        I2dGeometricFigure figure = new FigureFactory().FigureFactory(arr);
        if(figure instanceof Triangle){
            System.out.println(figure.calcArea());
            System.out.println(figure.calcPerimeter());
            System.out.println(Arrays.toString(figure.getSides()));
            System.out.println(((Triangle) figure).getTriangleRatio());

        }else if(figure instanceof Tetragon){
            System.out.println(figure.calcArea());
            System.out.println(figure.calcPerimeter());
            System.out.println(Arrays.toString(figure.getSides()));
            System.out.println(((Tetragon) figure).areOppositeSidesEqual());
        }else{
            System.out.println("Incorrect numbers");
        }



    }
}
