package exercises.lessonTwo;

import java.util.*;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter student name. Press enter again to finish.");
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Enter student ID. Press enter again to finish.");
                Integer idNumber = input.nextInt();
                students.put(idNumber, newStudent);
                input.nextLine();
            }

        } while (!newStudent.equals("")) ;
        System.out.println("\n Class Roster: ");
        for(Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println("name" + student.getValue() + ": Id Number: " + student.getKey());

        }
    }
}
