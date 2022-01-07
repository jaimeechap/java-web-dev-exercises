package exercises.lessonOne;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle in inches?");
        length = input.nextInt();
        System.out.println("What is the width of the rectangle in inches?");
        width = input.nextInt();
        input.close();
        area = (width * length);
        System.out.println("The area of the rectangle is  " + area + "inches.");






    }
}
