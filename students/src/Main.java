//
//  Main.java
//  students
//
//  Created by Fernando Pastor on 06/08/2024
//

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        welcomeMessage();

        Classroom classroom = new Classroom();
        insertSampleData(classroom);
        printClassroom(classroom);

        System.out.println();

        // test de getSortedStudentsForSubject
        System.out.println("TEST: getSortedStudentsForSubject");
        ArrayList<Student> mathsSortedStudents = Statistics.getSortedStudentsForSubject(Subject.HISTORY, classroom);
        for (Student student: mathsSortedStudents) {
            System.out.println(student.getName() + " " + student.getQualificationSubject(Subject.HISTORY));
        }

        System.out.println();

        // test de getStudentsWithGender
        System.out.println("TEST: getStudentsWithGender");
        ArrayList<Student> womanStudents = Statistics.getStudentsWithGender(Gender.MAN, classroom);
        for (Student student: womanStudents) {
            System.out.println(student.getName());
        }

        System.out.println();

        // test de getStatistics
        System.out.println("TEST: getStatistics");
        HashMap<String, Integer> data = Statistics.getStatistics(classroom);

        for (HashMap.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void printClassroom(Classroom classroom) {
        for (int i = 0; i < classroom.getStudentCount(); i++) {
            Student student = classroom.getStudentAt(i);
            Subject[] subjects = Subject.values();
            System.out.printf(student.getName() + " (" +student.getIMC() + " IMC.) \n");
            for (Subject subject : subjects) {
                System.out.printf(" - " + subject + ": " + student.getQualificationSubject(subject) + "\n");
            }
            System.out.printf(" * AVERAGE: " + student.getAverageQualification() + "\n");
            System.out.println();
        }
    }

    private static void insertSampleData(Classroom classroom) {
        Notes luisaNotes = new Notes()
                .addQualification(Subject.HISTORY, 7)
                .addQualification(Subject.MATHS, 1.5)
                .addQualification(Subject.LANGUAGE, 7)
                .addQualification(Subject.SCIENCE, 0.5);
        Student luisa = new Student.Builder()
                .setName("Luisa")
                .setAge(17)
                .setGender(Gender.WOMAN)
                .setHeight(1.60)
                .setWeight(65)
                .setNotes(luisaNotes)
                .build();
        classroom.addStudent(luisa);

        Notes pepeNotes = new Notes()
                .addQualification(Subject.HISTORY, 6.5)
                .addQualification(Subject.MATHS, 7.2)
                .addQualification(Subject.LANGUAGE, 3.5)
                .addQualification(Subject.SCIENCE, 8);
        Student pepe = new Student.Builder()
                .setName("Pepe")
                .setAge(18)
                .setGender(Gender.MAN)
                .setHeight(1.75)
                .setWeight(80)
                .setNotes(pepeNotes)
                .build();
        classroom.addStudent(pepe);

        Notes jacintoNotes = new Notes()
                .addQualification(Subject.HISTORY, 10)
                .addQualification(Subject.MATHS, 10)
                .addQualification(Subject.LANGUAGE, 8.5)
                .addQualification(Subject.SCIENCE, 8.5);
        Student jacinto = new Student.Builder()
                .setName("Jacinto")
                .setAge(19)
                .setGender(Gender.MAN)
                .setHeight(1.87)
                .setWeight(92)
                .setNotes(jacintoNotes)
                .build();
        classroom.addStudent(jacinto);

    }

    private static void welcomeMessage() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("- STUDENTS... ¡IN JAVA! -");
        System.out.println("-------------------------");
        System.out.println();
    }

}
