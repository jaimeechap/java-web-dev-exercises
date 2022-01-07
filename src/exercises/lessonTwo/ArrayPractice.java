package exercises.lessonTwo;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args) {

        int array[] = {1, 1, 2, 3, 5, 8};

//        for (int i : array) {
//            System.out.println(i);
//        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
