import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int userWins = 0, computerWins = 0, ties = 0, rounds = 0;
        int computerChoiceIndex = 0;

        while (true) {
            System.out.print("Enter user input rock, paper, scissors, or quit to stop: ");
            String userChoice = sc.nextLine().toLowerCase();

            if (userChoice.equals("quit")) {
                break;
            }
            // Computer's deterministic choice
            System.out.print("Enter computer input rock, paper, scissors, or quit to stop: ");
            String computerChoice = sc.nextLine().toLowerCase();

            if (computerChoice.equals("quit")) {
                break;
            }

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }
            rounds++;
        }

        // Calculate winning percentages
        double userWinPercentage = (rounds > 0) ? ((double) userWins / rounds) * 100 : 0;
        double computerWinPercentage = (rounds > 0) ? ((double) computerWins / rounds) * 100 : 0;

        // Display stats
        System.out.println("\nGame Stats:\n");
        System.out.println("| Player Wins    | Computer Wins |\n");
        System.out.printf("| %-14d | %-14d |\n", userWins, computerWins);
        System.out.printf("| Winning %%: %-5.2f | Winning %%: %-5.2f |\n", userWinPercentage, computerWinPercentage);
    }
}

//input user : scissors
// computer input : rock
//input user : rock
// computer input : scissors
//input user : paper
// computer input : rock

//output expected
// Game Stats:

// | Player Wins    | Computer Wins |

// | 2              | 1              |
// | Winning %: 66.67 | Winning %: 33.33 |
