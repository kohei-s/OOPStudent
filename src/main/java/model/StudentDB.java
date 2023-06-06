package model;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class StudentDB {

    private Student[] allStudents;

    public StudentDB(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    public Student[] getAllStudents() {
        return this.allStudents;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudents=" + Arrays.toString(allStudents) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(allStudents, studentDB.allStudents);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(allStudents);
    }

    public static Student randomStudent() {
        Student [] allStudents = this.getAllStudents();
        int randomIndex = (int) Math.random() * (allStudents.length);
        Student randomStudent = allStudents[randomIndex];
        return randomStudent;
    }

    public Student[] addStudentToDB (Student student) {
        Student [] oldDB = this.getAllStudents();
        Student [] newDB = Arrays.copyOf(oldDB, oldDB.length + 1);
        newDB[newDB.length - 1] = student;
        System.out.println("Student/in: " + student.name + "(" + student.id  +") is zur StudentDB hinzugefügt.");
        return newDB;
    }

    public Student[] removeStudentFromDB (Student student) {
        Student [] oldDB = this.getAllStudents();
        int i = Arrays.asList(oldDB).indexOf(student);
        Student [] newDB = ArrayUtils.remove(oldDB, i);
        System.out.println("Student/in: " + student.name + "(" + student.id  +") is von der StudentDB entfernt.");
        return newDB;
    }

}

