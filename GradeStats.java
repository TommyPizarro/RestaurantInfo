import java.util.Scanner;
public class GradeStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalGrades = 10;

        System.out.print("Enter grade 1: ");
        double firstGrade = input.nextDouble();

        double sum = firstGrade;
        double max = firstGrade;
        double min = firstGrade;

        // Where the loop begins executing remaining grades
        for (int i = 2; i <= totalGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = input.nextDouble();

            sum += grade;

            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        // Average calculation
        double average = sum / totalGrades;

        // Display results
        System.out.println("\n****** Class Statistics ******");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);

        input.close();
    }
}