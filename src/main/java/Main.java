import model.Student;
import model.StudentDB;

public class Main {

    public static void main(String[] args) {
        Student studentA = new Student("ABC", 1);
        Student studentD = new Student("DEF", 2);
        Student studentG = new Student("GHI", 3);
        Student studentJ = new Student("JKL", 4);
        Student studentM = new Student("MNO", 5);
        Student studentP = new Student("PQR", 6);
        Student [] allStudents = {studentA, studentD, studentG, studentJ, studentM, studentP};
        StudentDB studentDB = new StudentDB (allStudents);

        System.out.println(studentDB.toString());
        System.out.println(studentDB.hashCode());
        System.out.println(studentDB.randomStudent();
//        System.out.println(studentDB.addStudentToDB("STU",7));
        System.out.println(studentDB.removeStudentFromDB(studentA));



    }
}
