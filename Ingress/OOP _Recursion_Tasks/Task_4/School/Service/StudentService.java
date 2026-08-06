package School.service;

import School.model.Student;

public class StudentService {
    public void addstudent(Student student) {
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }

    public void printStudents(Student student) {
        System.out.println("Student's Info");
        System.out.println("Student: ");
        System.out.println("Student's Id: " + student.getId());
        System.out.println("Student's Name: "+ student.getName());
        System.out.println("Student's Age: " + student.getAge());
    }
}
