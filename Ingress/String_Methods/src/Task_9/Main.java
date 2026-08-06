package Task_9;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Students' count: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine();
        String[] arrayStudent = new String[studentCount];
        double[] arrayExamScore1 = new double[studentCount];
        double[] arrayExamScore2 = new double[studentCount];
        double[] arrayExamScore3 = new double[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter The Student's Name: ");
            String studentName = scanner.next();
            arrayStudent[i] = studentName;
            System.out.println("Enter The Student's Score 1: ");
            arrayExamScore1[i] = scanner.nextDouble();
            arrayStudent[i] = studentName;
            System.out.println("Enter The Student's Score 2: ");
            arrayExamScore2[i] = scanner.nextDouble();
            arrayStudent[i] = studentName;
            System.out.println("Enter The Student's Score 3: ");
            arrayExamScore3[i] = scanner.nextDouble();
        }

        for (int i = 0; i < studentCount; i++) {
            StudentEvaluation studentEvaluation = new StudentEvaluation();
            studentEvaluation.setStudentName(arrayStudent[i]);
            studentEvaluation.setExamScore1(arrayExamScore1[i]);
            studentEvaluation.setExamScore2(arrayExamScore2[i]);
            studentEvaluation.setExamScore3(arrayExamScore3[i]);
            studentEvaluation.printResult();
        }
    }
}
