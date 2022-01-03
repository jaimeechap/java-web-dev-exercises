package exercises;
import java.util.Scanner;

public class AliceStory {

    public static void main (String[] args) {
        String aliceInWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String story = aliceInWonderland.toLowerCase();
        String searchTerm;
        int index;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Search for a term in the first sentence of Alice in Wonderland.");
        searchTerm = input.nextLine().toLowerCase();

        if (story.contains(searchTerm)) {
            System.out.println("The index or indices of the search term within the sentence are as follows: ");
            index = story.indexOf(searchTerm);
            while (index >= 0) {
                System.out.println(index);
                index = story.indexOf(searchTerm, index + 1);
            }
                   System.out.println( "The length of the term is " + searchTerm.length() + " characters. This is the new sentence: " +
                    aliceInWonderland.replaceAll(searchTerm, ""));
        } else {
            System.out.println("False");
        }
    }
}