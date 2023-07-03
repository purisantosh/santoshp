package com.java.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student
{
    String firstName,lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    double getGPA()
{
    return this.gpa;
}

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class ArrayListOfStudents {
    public static void main(String[] args)
    {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Puri","Santosh",4));
        students.add(new Student("Puri","Kumar",3.8));
        students.add(new Student("Santosh","P",3.5));
        double average = students.stream().mapToDouble(s->s.gpa).average().orElse(0.0);
        List<Student> filteredStudents = students.stream().filter(s->s.gpa>average).toList();
        for(Student s:filteredStudents)
        {
            System.out.println(s);
        }
    }


}
