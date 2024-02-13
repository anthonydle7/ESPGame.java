/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 02/12/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Anthony Le 
*/

package ALe_Assignment1_Complete;

import java.util.Scanner;

public class ALe_Assignment1_Complete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student Information Input
        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        
   
        //Int CorrectGuesses
        int correctGuesses = runColorGame();
        
        // Final User Information Print
        System.out.println("\nGame Over\n");
        System.out.println("\nYou guessed " + correctGuesses + " out of 11 colors correctly.");
        System.out.println("Student Name: " + studentName );
        System.out.println("User Description: " + description );
        System.out.println("Due Date: " + dueDate );
        
     
    }
    //String Colors 
    public static int runColorGame() {
        final String COLOR_RED = "Red";
        final String COLOR_GREEN = "Green";
        final String COLOR_BLUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";

        Scanner scanner = new Scanner(System.in);
        
        int correctGuesses = 0;
        
        //Question User for guess & Check for Satisfaction
        for (int round = 1; round <= 11; round++) {
            System.out.println("\nRound " + round);
            String computerColor = getRandomColor();
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine();

            while (!validateColor(userGuess)) {
                System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
                System.out.print("Enter your guess again: ");
                userGuess = scanner.nextLine();
            }

            if (userGuess.equalsIgnoreCase(computerColor)) {
                System.out.println("\nI was thinking of " + computerColor + ".");
                correctGuesses++;
            } else {
                System.out.println("\nI was thinking of " + computerColor + ".");
            }
        }

        return correctGuesses;
    }
    
    // Case Statements for Colors
    public static String getRandomColor() {
        int randomNum = (int) (Math.random() * 5);
        switch (randomNum) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Orange";
            default:
                return "Yellow";
        }
    }
    
    //Boolean Statement for validate color
    public static boolean validateColor(String color) {
        return color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Green") ||
                color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Orange") ||
                color.equalsIgnoreCase("Yellow");
        
    }
}


