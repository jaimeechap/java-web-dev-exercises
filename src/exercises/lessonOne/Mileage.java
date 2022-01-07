package exercises.lessonOne;
import java.util.Scanner;
public class Mileage {
    public static void main(String[] args) {
        int milesDriven;
        int gallonsGasUsed;
        int milesPerGallon;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        milesDriven = input.nextInt();
        System.out.println("How many gallons of gas did you use?");
        gallonsGasUsed = input.nextInt();
        input.close();
        milesPerGallon = (milesDriven/ gallonsGasUsed);
        System.out.println("You are currently getting " + milesPerGallon + " miles per gallon.");
    }
}
