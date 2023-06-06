package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentDBTest {


    @Test
    void testGetAllStudents () {
        Student a = new Student ("A", 1);
        Student b = new Student ("B", 2);
        Student c = new Student ("C", 3);
        Student [] expected = {a, b, c};
        StudentDB testDB = new StudentDB (expected);
        Student [] actual = testDB.getAllStudents();
        assertArrayEquals(expected, actual);
    }

    @Test
    void testStudentDBToString () {
        Student a = new Student ("A", 1);
        Student b = new Student ("B", 2);
        Student c = new Student ("C", 3);
        String expected = "StudentDB{allStudents=[" +
                a.toString() + ", " +
                b.toString() + ", " +
                c.toString() + "]}";
        Student [] testStudents = {a, b, c};
        StudentDB testDB = new StudentDB (testStudents);
        String actual = testDB.toString();
        assertEquals(expected, actual);
    }

    @Test



}
