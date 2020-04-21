import java.util.Scanner;

public class UsingSubStrings {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = keybd.nextLine();

        System.out.println(word + " has a length of " + word.length());
        System.out.println("This substring from 0 to 3 is: " + word.substring(0,3));

    }
}
