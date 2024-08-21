package Student_grade_system;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void addGrade(String name, double grade) {
        Student student = findStudent(name);
        if (student != null) {
            student.addGrade(grade);
            System.out.println("Grade added successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudentInfo(String name) {
        Student student = findStudent(name);
        if (student != null) {
            student.displayGrades();
            System.out.println("Average Grade: " + student.calculateAverage());
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            student.displayGrades();
            System.out.println("Average Grade: " + student.calculateAverage());
            System.out.println();
        }
    }
}

