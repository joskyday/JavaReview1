package a_FunCodesForTeens;

import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        String secretWord = "apple";
        Scanner scanner = new Scanner(System.in);
        int guessesLeft = 5;

        System.out.println("Welcome to Guess The Word!");

        while (guessesLeft > 0) {
            System.out.println("You have " + guessesLeft + " guesses left.");
            System.out.print("Guess a letter: ");
            String guess = scanner.nextLine();

            if (secretWord.contains(guess)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
                guessesLeft--;
            }

            if (secretWord.equals(getCurrentWord(secretWord, guess))) {
                System.out.println("Congratulations! You guessed the word!");
                break;
            }
        }

        if (guessesLeft == 0) {
            System.out.println("Sorry, you lost. The word was " + secretWord);
        }

        scanner.close();
    }

    public static String getCurrentWord(String secretWord, String guessedLetter) {
        String result = "";

        for (int i = 0; i < secretWord.length(); i++) {
            char c = secretWord.charAt(i);

            if (c == guessedLetter.charAt(0)) {
                result += c;
            } else {
                result += "_";
            }
        }

        return result;
    }
}
