package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class AreaTwo {
    public static void main(String[] args) {
    Double radius;

    Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle in cm: ");

        radius= input.nextDouble();
        while (radius < 0 || radius.isNaN()) {
            System.out.println("That is invalid input. Please enter a number greater than zero.");
        }
//        if (radius < 0 || radius.isNaN()) {
//            System.out.println("That is invalid input. Please enter a number greater than zero.");
//            System.out.println("Please enter the radius of the circle in cm: ");
//        } else {
//            radius= input.nextDouble();
//        }

        Double area = Circle.getArea(radius);

        input.close();

        System.out.println("The area of a circle with a radius of " + radius +"cm is " + area + " centimeters squared.");

    }
}
