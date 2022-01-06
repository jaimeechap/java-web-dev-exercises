package exercises;

public class ArrayPracticeStrings {
    public static void main(String[] args) {

        int maxWords = 100;
        String dr = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

//        System.out.println(java.util.Arrays.toString(dr.split(" ")));
        System.out.println(java.util.Arrays.toString(dr.split("\\.")));

    }
}
