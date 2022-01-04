package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

//import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        double radius;
        double area;

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle in centimeters: ");
        radius = input.nextDouble();
        input.close();
        area =(3.14 * radius * radius);
        System.out.println("The area of a circle with a radius of " + radius + "cm: " + area + " centimeters squared.");
    }
}

