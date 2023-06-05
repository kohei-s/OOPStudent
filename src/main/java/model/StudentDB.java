package model;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class StudentDB {

    private Student[] allStudents;

    public StudentDB(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    public Student[] getAllStudents() {
        return allStudents;
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

    public static Student randomStudent(Student[] allStudents) {
        int randomIndex = (int) Math.random() * (allStudents.length);
        Student randomStudent = allStudents[randomIndex];
        return randomStudent;
    }

    public void addStudentToDB (String name, int id) {
        Student [] oldDB = this.getAllStudents();
        Student newStudent = new Student(name, id);
        Student [] newDB = Arrays.copyOf(oldDB, oldDB.length + 1);
        newDB[newDB.length - 1] = newStudent;
        System.out.println("Ein neuer Student: " + name + "(" + id  +") is zur StudentDB hinzugefügt.");
    }

    public void removeStudentFromDB (Student student) {
        Student [] oldDB = this.getAllStudents();
        int i = Arrays.asList(oldDB).indexOf(student);
        Student [] newDB = ArrayUtils.remove(oldDB, i);
        System.out.println("Ein Student: " + student.name + "(" + student.id  +") is von der StudentDB entfernt.");

    }

}

