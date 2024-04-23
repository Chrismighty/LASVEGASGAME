import java.util.Scanner;
import java.util.Random;

public class WelcomeToVegas {
    public static void main(String[] args) {
        // Variables
        String userInput;
        String randList;
        int randomNumber;
        char RandomUno;
        char randomDos;
        char randomTres;
        char play;
        double Bet = 0;
        double Won = 0;
        double totalBet = 0;
        double totalWon = 0;

        // Scanner
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); // Create a Random object

        // Set the bets and winnings to zero.
        System.out.println("Welcome to Vegas !!!");

        // Task 1: Read user input and loop until user wants to stop playing
        while (true) {
            System.out.println("Would you like to Play the slot machine today?\"");
            System.out.print("Enter yes or no: ");
            userInput = input.next();
            if (!userInput.equalsIgnoreCase("yes")) {
                break;
            }

            randList = "";

            // Get the amount the user wants to bet.
            System.out.print("\nEnter the amount you would like to bet: $");
            Bet = input.nextDouble();
            System.out.println();
            totalBet += Bet;

            // Task 2: Create a for loop to get three fruits
            for (int i = 0; i < 3; i++) {
                randomNumber = rand.nextInt(6); // Random number between 0 and 5
                // Task 3: Select fruit based on the random number
                switch (randomNumber) {
                    case 0:
                        randList += "Cherries ";
                        break;
                    case 1:
                        randList += "Oranges ";
                        break;
                    case 2:
                        randList += "Plums ";
                        break;
                    case 3:
                        randList += "Grapes ";
                        break;
                    case 4:
                        randList += "Melons ";
                        break;
                    case 5:
                        randList += "Bananas ";
                        break;
                }
            }

            // Display the slot machine results
            System.out.println("Slot machine result: " + randList);

            // Task 4: Determine if all three fruits match or not
            if (randList.split(" ")[0].equals(randList.split(" ")[1]) && randList.split(" ")[1].equals(randList.split(" ")[2])) {
                System.out.println("Congratulations! All three fruits match!");
                Won = Bet * 3; // Triple the bet
            } else if (randList.split(" ")[0].equals(randList.split(" ")[1]) || randList.split(" ")[0].equals(randList.split(" ")[2]) || randList.split(" ")[1].equals(randList.split(" ")[2])) {
                System.out.println("Congratulations! Two fruits match!");
                Won = Bet * 2; // Double the bet
            } else {
                System.out.println("Sorry, no match.");
                Won = 0; // No win
            }

            // Display the amount won
            System.out.printf("You win $%,.2f\n", Won);
            System.out.println();
            totalWon += Won; // Increment the total winnings.
        }

        // Task 6: Display totals
        System.out.printf("Total bet: $%,.2f\n", totalBet);
        System.out.printf("Total amount won: $%,.2f\n", totalWon);
        System.out.printf("Amount taken home: $%,.2f\n", totalWon - totalBet);

        // Close the scanner
        input.close();
    }
}
