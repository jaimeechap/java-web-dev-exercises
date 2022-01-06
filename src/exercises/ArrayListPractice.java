package exercises;

import java.util.*;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Arrays.asList(
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10
        );
//        System.out.println(sumEvens(numbers));

        ArrayList<String> people = new ArrayList<String>(
                Arrays.asList(
                        "Joe",
                        "Tommy",
                        "Lisa",
                        "Megan",
                        "Alonzo")
        );
        fiveLetter(people);
    }

    ;


    public static void sumEvens(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
    };



    public static void fiveLetter(ArrayList<String> collect) {
        for (String word : collect) {
            if (word.length() == 5) {
            }
            System.out.println(word);
        }
    };

};

