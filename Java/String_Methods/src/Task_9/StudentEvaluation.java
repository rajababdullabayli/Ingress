package Task_9;

public class StudentEvaluation {
    private String studentName;
    private double examScore1;
    private double examScore2;
    private double examScore3;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getExamScore1() {
        return examScore1;
    }

    public void setExamScore1(double examScore1) {
        this.examScore1 = examScore1;
    }

    public double getExamScore2() {
        return examScore2;
    }

    public void setExamScore2(double examScore2) {
        this.examScore2 = examScore2;
    }

    public double getExamScore3() {
        return examScore3;
    }

    public void setExamScore3(double examScore3) {
        this.examScore3 = examScore3;
    }

    public double calculateAverage() {
        double average = (examScore1 + examScore2 + examScore3) / 3;
        return average;
    }

    public char calculateGrade() {
        if (calculateAverage() >= 90) {
            return 'A';
        } else if (calculateAverage() >= 80) {
            return 'B';
        } else if (calculateAverage() >= 70) {
            return 'C';
        } else if (calculateAverage() >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public boolean isPassed() {
        char grade = calculateGrade();
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D') {
            System.out.print("Pass: ");
            return true;
        } else {
            System.out.println("No Pass: ");
            return false;
        }
    }

    public void printResult() {
        System.out.println("Name: " + studentName);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println(isPassed());
    }

}
