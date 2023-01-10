package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Masha", "Python", 1, 4);
        Student student2 = new Student("Dasha", "Java", 2, 3);
        Student student3 = new Student("Sasha", "C#", 3, 2);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        deleteStudent(student1.getRating(), student1, students);
        deleteStudent(student2.getRating(), student2, students);
        deleteStudent(student3.getRating(), student3, students);


    }
    public static void deleteStudent(Integer rating, Student student, ArrayList students){
        if( rating < 3){
            System.out.println(student.getName() + " отчислен.");
            students.remove(student);
        } else if (rating >= 3) {
            System.out.println(student.getName() + " переведен(-a) на следующий курс!");
            student.setCourse(student.getCourse() + 1);
            System.out.println("Следующий курс -> " + student.getCourse());
        }
    }

    public static void printStudents(List<Student> students, int course){

    }
}
