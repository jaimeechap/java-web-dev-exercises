package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class AreaTwo {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        Double radius;
        do {
            System.out.println("Please enter the radius of the circle in cm: ");

//        radius= input.nextDouble();
//        while (radius < 0 || radius.isNaN()) {
//            System.out.println("That is invalid input. Please enter a number greater than zero.");
//        }
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid radius.");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius < 0);
        input.close();
        Double area = Circle.getArea(radius);


        System.out.println("The area of a circle with a radius of " + radius +"cm is " + area + " centimeters squared.");

    }
}
