package School.app;

import School.model.Student;
import School.service.StudentService;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numb = input.nextInt();
        String [] arrayStudentsName = new String[numb];
        int [] arrayStudentsAge = new int[numb];
        int id=0;

        for (int i=0;i<numb;i++){
            System.out.println("Enter the name of student");
            arrayStudentsName[i] = input.next();
            System.out.println("Enter the age of student");
            arrayStudentsAge[i] = input.nextInt();
            id+=1;
        }
        for (int j=0;j<numb;j++){
            Student student = new Student();
            student.setId(id);
            student.setName(arrayStudentsName[j]);
            student.setAge(arrayStudentsAge[j]);
            StudentService service = new StudentService();
            service.addstudent(student);
            service.printStudents(student);
        }
    }
}
