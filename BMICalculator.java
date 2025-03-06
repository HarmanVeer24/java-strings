import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiResults = computeBMI(data);
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (String[] row : bmiResults) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t\t" + row[3]);
        }
    }
    //helper method to compute bmi
    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            String status = getStatus(bmi);
            result[i] = new String[]{String.valueOf(data[i][1]), String.valueOf(weight), String.format("%.2f", bmi), status};
        }
        return result;
    }
    // reference chart for status at diff bmi ratios
    private static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
}
// sample input and output
//Enter weight (kg) for person 1: 50
//Enter height (cm) for person 1: 170
//Enter weight (kg) for person 2: 70
//Enter height (cm) for person 2: 150
//Enter weight (kg) for person 3: 78
//Enter height (cm) for person 3: 180
//Enter weight (kg) for person 4: 50
//Enter height (cm) for person 4: 168
//Enter weight (kg) for person 5: 70
//Enter height (cm) for person 5: 180
//Enter weight (kg) for person 6: 57
//Enter height (cm) for person 6: 178
//Enter weight (kg) for person 7: 68
//Enter height (cm) for person 7: 157
//Enter weight (kg) for person 8: 78
//Enter height (cm) for person 8: 149
//Enter weight (kg) for person 9: 73
//Enter height (cm) for person 9: 166
//Enter weight (kg) for person 10: 63
//Enter height (cm) for person 10: 179
//Height(cm)      Weight(kg)      BMI             Status
//170.0           50.0            17.30           Underweight
//150.0           70.0            31.11           Obese
//180.0           78.0            24.07           Normal weight
//168.0           50.0            17.72           Underweight
//180.0           70.0            21.60           Normal weight
//178.0           57.0            17.99           Underweight
//157.0           68.0            27.59           Overweight
//149.0           78.0            35.13           Obese
//166.0           73.0            26.49           Overweight
//179.0           63.0            19.66           Normal weight
