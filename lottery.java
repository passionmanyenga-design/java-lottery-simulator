import java.util.*;

public class lottery {

    // CONSTANTS 
    private static final int NUMBERS_PER_TICKET = 6;         //defines how many numbers each player chooses
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 30;                 //range for both user input and the lottery draw
    private static final double TICKET_PRICE = 2.0;         //tracks the cost per week

    private static Random random = new Random();            //Random is used to generate random numbers for the draw

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalSpent = 0;
        double totalWon = 0;

        // Ask user how many weeks to play
        System.out.print("Enter number of weeks to play: ");
        int totalWeeks = scanner.nextInt();

        // Get player numbers
        Set<Integer> playerNumbers = getPlayerNumbers(scanner);

        System.out.println("\nYour Numbers: " + playerNumbers);
        System.out.println("======================================");

//main program logic
        for (int week = 1; week <= totalWeeks; week++) {

            Set<Integer> drawNumbers = generateDrawNumbers();

            int matches = countMatches(playerNumbers, drawNumbers);
            double winnings = calculateWinnings(matches);

            totalSpent += TICKET_PRICE;
            totalWon += winnings;

            System.out.println("Week " + week);
            System.out.println("Draw Numbers: " + drawNumbers);
            System.out.println("Matches: " + matches);
            System.out.println("Winnings: £" + winnings);
            System.out.println("--------------------------------------");
        }

        // Final Summary
        System.out.println("\n========= FINAL SUMMARY =========");
        System.out.println("Total Spent: £" + totalSpent);
        System.out.println("Total Won: £" + totalWon);
        System.out.println("Net Result: £" + (totalWon - totalSpent));

        scanner.close();
    }

    //Get Player Numbers 
    private static Set<Integer> getPlayerNumbers(Scanner scanner) {

        Set<Integer> numbers = new HashSet<>();

        System.out.println("Enter 6 unique numbers between 1 and 30:");

        while (numbers.size() < NUMBERS_PER_TICKET) {      //loops until the player has selected exactly 6 valid numbers.

            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            if (number < MIN_NUMBER || number > MAX_NUMBER) {       //validates that input is within the correct range
                System.out.println("Invalid number! Must be between 1 and 30.");
            } else if (numbers.contains(number)) {            //prevents duplicates
                System.out.println("Duplicate number! Try again.");
            } else {
                numbers.add(number);
            }
        }

        return numbers;
    }

    // Generate Draw Numbers 
    private static Set<Integer> generateDrawNumbers() {
                                                           //Uses a Set to ensure all draw numbers are unique
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < NUMBERS_PER_TICKET) {         //while loop continues until 6 unique numbers are generated    
            int randomNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;             //generates numbers in the range between min and max
            numbers.add(randomNumber);
        }

        return numbers;
    }

    // Counting Matches 
    private static int countMatches(Set<Integer> player, Set<Integer> draw) {

        Set<Integer> intersection = new HashSet<>(player);
        intersection.retainAll(draw);               //keeps only the numbers that exist in both sets

        return intersection.size();
    }

    //  Calculate Winning
    private static double calculateWinnings(int matches) {

        switch (matches) {
            case 6: return 1_000_000;
            case 5: return 1_000;
            case 4: return 100;
            case 3: return 25;
            default: return 0;
        }
    }
}