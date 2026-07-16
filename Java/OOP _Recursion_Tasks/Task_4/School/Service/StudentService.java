package School.service;

import School.model.Student;

public class StudentService {
    public void addstudent(Student student) {
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge() + "Added");
    }

    public void printStudents(Student student) {
        System.out.println("Student: " + student.getId() + student.getName() + student.getAge());
    }
}
