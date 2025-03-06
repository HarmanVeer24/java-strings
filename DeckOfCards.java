import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPlayers = sc.nextInt();
        int numCards = sc.nextInt();
        initializeDeck();
        shuffleDeck();
        distributeCards(numCards, numPlayers);
    }
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[] deck = new String[suits.length * ranks.length];

    static void initializeDeck() {
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
    }
    //helper function to shuffle
    static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    //helper functions to distribute
    static void distributeCards(int numCards, int numPlayers) {
        if (numCards * numPlayers > deck.length) {
            System.out.println("Not enough cards.");
            return;
        }
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < numCards; j++) {
                System.out.print(deck[i + j * numPlayers] + ", ");
            }
            System.out.println();
        }
    }
}
