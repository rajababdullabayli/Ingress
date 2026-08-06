package Task_9;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of Students");
        int studentNumb = input.nextInt();
        System.out.println("Enter The Number of Teachers");
        int teacherNumb = input.nextInt();
        System.out.println("Enter The Number Of Departments");
        int departmentNumb = input.nextInt();

        int [] arrayStudentId = new int[studentNumb];
        String [] arrayStudentName = new String[studentNumb];
        String [] arrayStudentLastName = new String[studentNumb];
        int [] arrayStudentAge = new int[studentNumb];

        int [] arrayTeacherId = new int[teacherNumb];
        String [] arrayTeacherName = new String[teacherNumb];
        String [] arrayTeacherLastName = new String[teacherNumb];
        int [] arrayTeacherAge = new int[teacherNumb];

        int [] arrayDepartmentId = new int[departmentNumb];
        String [] arrayDepartmentName = new String[departmentNumb];

        for (int i=0;i<studentNumb;i++) {
            System.out.println("Enter The Student's Name");
            String studentName = input.next();
            System.out.println("Enter The Student's Last Name");
            String studentLastName = input.next();
            System.out.println("Enter The Student's Age");
            int studentAge = input.nextInt();
            arrayStudentId[i] = i+1;
            arrayStudentName[i] = studentName;
            arrayStudentLastName[i] = studentLastName;
            arrayStudentAge[i] = studentAge;
        }
        for (int i=0;i<studentNumb;i++){
            University university = new University();
            University.Student student = university.new Student();
            student.setStudentId(arrayStudentId[i]);
            student.setStudentName(arrayStudentName[i]);
            student.setStudentLastName(arrayStudentLastName[i]);
            student.setStudentAge(arrayStudentAge[i]);
            student.printStudentInfo();
        }
        for (int i=0;i<teacherNumb;i++) {
            System.out.println("Enter The Teacher's Name");
            String teacherName = input.next();
            System.out.println("Enter The Teacher's LastName");
            String teacherLastName = input.next();
            System.out.println("Enter The Teacher's Age");
            int teacherAge = input.nextInt();
            arrayTeacherId[i] = i+1;
            arrayTeacherName[i] = teacherName;
            arrayTeacherLastName[i] = teacherLastName;
            arrayTeacherAge[i] = teacherAge;
        }
        for (int i=0;i<teacherNumb;i++){
            University university = new University();
            University.Teacher teacher = university.new Teacher();
            teacher.setTeacherId(arrayTeacherId[i]);
            teacher.setTeacherName(arrayTeacherName[i]);
            teacher.setTeacherLastname(arrayTeacherLastName[i]);
            teacher.setTeacherAge(arrayTeacherAge[i]);
            teacher.printTeacherInfo();
        }
        for (int i=0;i<departmentNumb;i++) {
            System.out.println("Enter The Department's Name");
            String departmentName = input.next();
            arrayDepartmentId[i] = i+1;
            arrayDepartmentName[i] = departmentName;
        }
        for (int i=0;i<departmentNumb;i++) {
            University university = new University();
            University.Department department = university.new Department();
            department.setDepartmentId(arrayDepartmentId[i]);
            department.setDepartmentName(arrayDepartmentName[i]);
            department.printDepartmentInfo();
        }
    }
}
