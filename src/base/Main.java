package base;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> firstGradeStudents = new ArrayList<>();
        ArrayList<Teacher> firstGradeTeachers = new ArrayList<>();

        Student student1 = new Student("Steve1", "Johnson1", 1, 1);
        Student student2 = new Student("Steve2", "Johnson2", 2, 1);
        Student student3 = new Student("Steve3", "Johnson3", 3, 1);
        Student student4 = new Student("Steve4", "Johnson4", 4, 1);
        Student student5 = new Student("Steve5", "Johnson5", 5, 1);
        Student student6 = new Student("Steve6", "Johnson6", 6, 1);
        Student student7 = new Student("Steve7", "Johnson7", 7, 1);
        Student student8 = new Student("Steve8", "Johnson8", 8, 1);
        Student student9 = new Student("Steve9", "Johnson9", 9, 1);
        Student student10 = new Student("Steve10", "Johnson10", 10, 1);
        Student student11 = new Student("Steve11", "Johnson11", 11, 1);
        Student student12 = new Student("Steve12", "Johnson12", 12, 1);
        Student student13 = new Student("Steve13", "Johnson13", 13, 1);
        Student student14 = new Student("Steve14", "Johnson14", 14, 1);
        Student student15 = new Student("Steve15", "Johnson15", 15, 1);
        firstGradeStudents.add(student1);
        firstGradeStudents.add(student2);
        firstGradeStudents.add(student3);
        firstGradeStudents.add(student4);
        firstGradeStudents.add(student5);
        firstGradeStudents.add(student6);
        firstGradeStudents.add(student7);
        firstGradeStudents.add(student8);
        firstGradeStudents.add(student9);
        firstGradeStudents.add(student10);
        firstGradeStudents.add(student11);
        firstGradeStudents.add(student12);
        firstGradeStudents.add(student13);
        firstGradeStudents.add(student14);
        firstGradeStudents.add(student15);

        Teacher teacher1 = new Teacher("Jo1", "Jackson1", 1, 1);
        Teacher teacher2 = new Teacher("Jo2", "Jackson2", 2, 1);
        Teacher teacher3 = new Teacher("Jo3", "Jackson3", 3, 1);
        firstGradeTeachers.add(teacher1);
        firstGradeTeachers.add(teacher2);
        firstGradeTeachers.add(teacher3);

        Set<Student> group1 = new HashSet<>();
        Set<Student> group2 = new HashSet<>();
        Set<Student> group3 = new HashSet<>();

        group1.add(student1);
        group1.add(student2);
        group1.add(student3);
        group1.add(student4);
        group1.add(student5);

        group2.add(student6);
        group2.add(student7);
        group2.add(student8);
        group2.add(student9);
        group2.add(student10);

        group3.add(student11);
        group3.add(student12);
        group3.add(student13);
        group3.add(student14);
        group3.add(student15);

        Map<Teacher, Set> classes = new HashMap<>();

        classes.put(teacher1, group1);
        classes.put(teacher2, group2);
        classes.put(teacher3, group3);

        System.out.println("The list of keys: ");
        for (Teacher key : classes.keySet()) {
            System.out.println(key);
        }

        System.out.println("The list of values: ");
        for (Set value : classes.values()) {
            System.out.println(value);
        }

        System.out.println("The list of entry sets: ");
        for (Map.Entry entry: classes.entrySet()) {
            System.out.println(entry);
        }
    }
}
