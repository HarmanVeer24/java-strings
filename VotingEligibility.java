import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for(int i=0;i<10;i++){
            ages[i] = sc.nextInt();
        }
        String[][] results = checkVotingEligibility(ages);
        System.out.println("Age\tEligibility");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    //defining the voting check helper method
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }
}
// input array : 12 34 23 21 20 13 19 20 28 32
//output 
