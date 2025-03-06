import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[5][3]; // For 5 students
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                marks[i][j] = sc.nextInt();
            }
        }
        String[][] results = calculateResults(marks);
        System.out.println("Phy\tChem\tMath\tPercentage\tGrade");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3] + "\t" + row[4]);
        }
    }
    //helper function to generate the results for 5 student
    public static String[][] calculateResults(int[][] marks) {
        String[][] results = new String[marks.length][5];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            String grade = (percentage >= 90) ? "A+" : 
                           (percentage >= 80) ? "A" : 
                           (percentage >= 70) ? "B" : "C";

            results[i][0] = String.valueOf(marks[i][0]);
            results[i][1] = String.valueOf(marks[i][1]);
            results[i][2] = String.valueOf(marks[i][2]);
            results[i][3] = String.valueOf(percentage) + "%"+"    ";
            results[i][4] = grade;
        }
        return results;
    }
}
//input 
// 78 90 68
// 56 84 58
// 67 52 49
// 39 88 53
// 59 48 90
//expected output
// Phy     Chem    Math    Percentage      Grade
// 78      90      68      78.67%          B
// 56      84      58      66.0%           C
// 67      52      49      56.0%           C
// 39      88      53      60.0%           C
// 59      48      90      65.67%          C
