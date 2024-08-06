//
//  Main.java
//  students
//
//  Created by Fernando Pastor on 06/08/2024
//

public class Main {
    public static void main(String[] args) {

        printWelcome();

        Classroom classroom = new Classroom();
        insertSampleData(classroom);
        printClassroom(classroom);

    }

    private static void printClassroom(Classroom classroom) {
        for (int i = 0; i < classroom.getStudentCount(); i++) {
            Student student = classroom.getStudentAt(i);
            Subject[] subjects = Subject.values();
            System.out.printf(student.getName() + " (" +student.getIMC() + " IMC.) \n");
            for (Subject subject : subjects)
                System.out.printf(" - " + subject + ": " + student.getNotes().getQualificationForSubject(subject) + "\n");
            System.out.printf(" * AVERAGE: " + student.getAverageQualification() + "\n");
            System.out.println();
        }
    }

    private static void insertSampleData(Classroom classroom) {
        Notes student01notes = new Notes()
                .addQualification(Subject.HISTORY, 8)
                .addQualification(Subject.MATHS, 9)
                .addQualification(Subject.LANGUAGE, 6)
                .addQualification(Subject.SCIENCE, 4);
        Student luisa = new Student.Builder()
                .setName("Luisa")
                .setAge(17)
                .setGender(Gender.WOMAN)
                .setHeight(1.60)
                .setWeight(65)
                .setNotes(student01notes)
                .build();
        classroom.addStudent(luisa);

        Notes student02notes = new Notes()
                .addQualification(Subject.HISTORY, 8)
                .addQualification(Subject.HISTORY, 7.5)
                .addQualification(Subject.MATHS, 9)
                .addQualification(Subject.MATHS, 9.25)
                .addQualification(Subject.LANGUAGE, 6)
                .addQualification(Subject.LANGUAGE, 5.5)
                .addQualification(Subject.SCIENCE, 8)
                .addQualification(Subject.SCIENCE, 6.25);
        Student pepe = new Student.Builder()
                .setName("Pepe")
                .setAge(18)
                .setGender(Gender.MAN)
                .setHeight(1.75)
                .setWeight(80)
                .setNotes(student02notes)
                .build();
        classroom.addStudent(pepe);
    }

    private static void printWelcome() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("-  STUDENTS... ¡IN JAVA!  ");
        System.out.println("--------------------------");
        System.out.println();
    }

}
