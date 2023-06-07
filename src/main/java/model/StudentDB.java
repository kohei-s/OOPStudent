package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class StudentDB {

    public ArrayList<Student> allStudents;

    public StudentDB() {
    }

    public StudentDB(ArrayList<Student> allStudents) {
        this.allStudents = allStudents;
    }


    public ArrayList<Student> getAllStudents() {
        return allStudents;
    }


    public Student randomStudent() {
        int randomIndex = (int) (Math.random() * (this.allStudents.size()));
        return allStudents.get(randomIndex);
    }

    public void addStudentToDB (Student student) {
        allStudents.add(student);
        System.out.println("Student/in: " + student.name + "(" + student.id  +") is zur StudentDB hinzugefügt.");
    }

    public void removeStudentFromDB (Student student) {
        allStudents.remove(student);
        System.out.println("Student/in: " + student.name + "(" + student.id  +") is von der StudentDB entfernt.");
    }

}

