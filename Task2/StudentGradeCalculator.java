//CodSoft Task2 
//Code By Mohd Zaid



import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subject: ");
        int numSubjects = sc.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++){
            System.out.print("Enter marks for subject " + i + ": ");
            double subjectMarks = sc.nextDouble();
            totalMarks = totalMarks + subjectMarks;
        }

        double averageMarks = totalMarks / numSubjects;

        System.out.println("Average Marks:" + averageMarks);

        char grade;
        if(averageMarks >= 90){
            grade = 'A';
        } else if (averageMarks >=70){
            grade = 'B';
        } else if (averageMarks >= 60){
            grade = 'D';
        } else{
            grade = 'F';
        }

        System.out.println("Grade:" + grade);

        sc.close();

    }
}
