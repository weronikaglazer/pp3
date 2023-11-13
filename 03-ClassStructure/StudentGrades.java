import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;    
    double[] grades;    
    int numberOfGrades;

    StudentGrades(String name, double[] grades) {        
        this.studentName = name;        
        this.grades = grades;    
    }

    public StudentGrades(String name, int numberOfGrades) {
        Random random = new Random();
        this.numberOfGrades = random.nextInt(numberOfGrades);
    }

    public StudentGrades(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades? ");
        int amount = scanner.nextInt();
        grades = new double[amount];
        
        for (int i = 0; i < amount; i++) {
            System.out.print("\nEnter " + (i + 1) + " grade: ");
            double grade = scanner.nextDouble();
            grades[i] = grade;
        }

        scanner.close();
    }

    double lowestGrade() {
        Arrays.sort(grades);
        return grades[0];
    }

    double highestGrade() {
        Arrays.sort(grades);
        return grades[grades.length - 1];
    }

    int numberOfGrades() {
        return grades.length;
    }

    double averageGrade() {
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / numberOfGrades();
    }

    void displayInfo() {
        System.out.printf(
                "Name: %s, Grades: %s, Number of grades: %d, Lowest grade: %.02f, Highest grade: %.02f, Average: %.02f",
                this.studentName, Arrays.toString(this.grades), this.numberOfGrades(), this.lowestGrade(),
                this.highestGrade(), this.averageGrade());
    }

    public static void main(String[] args) {
        StudentGrades s1 = new StudentGrades("Ben", new double[] { 1.0, 2.0, 3.0, 5.0, 3.5, 2.5, 1.5, 5.5 });
        StudentGrades s2 = new StudentGrades("Julia", new double[] { 1.0, 2.0, 2.0, 6, 4.5, 1.5, 3.5, 4.5, 5.0 });
        StudentGrades s3 = new StudentGrades("Polly");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }


}
