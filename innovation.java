import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Using switch statement to check for vowels and consonants
        switch (ch) {
            // For uppercase vowels
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is an uppercase vowel.");
                break;

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a lowercase vowel.");
                break;

            // For uppercase consonants
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println(ch + " is an uppercase consonant.");
                break;

            // For lowercase consonants
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println(ch + " is a lowercase consonant.");
                break;

            // If the character is not a letter
            default:
                System.out.println(ch + " is not a letter.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
