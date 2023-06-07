import model.Student;
import model.StudentDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student studentA = new Student("ABC", 1);
        Student studentD = new Student("DEF", 2);
        Student studentG = new Student("GHI", 3);
        Student studentJ = new Student("JKL", 4);
        Student studentM = new Student("MNO", 5);
        Student studentP = new Student("PQR", 6);

        ArrayList <Student> allStudents = new ArrayList<>();
        StudentDB studentDB = new StudentDB (allStudents);
        studentDB.allStudents.add(studentA);

        studentDB.addStudentToDB(studentP);
        studentDB.removeStudentFromDB(studentA);

    }
}
