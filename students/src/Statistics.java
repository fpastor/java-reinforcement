//
//  Statistics.java
//  students
//
//  Created by Fernando Pastor on 06/08/2024
//

import java.util.ArrayList;
import java.util.HashMap;

public class Statistics {

    public static double getAverageIMC(Classroom classroom) {
        if (classroom == null || classroom.getStudentAt(0) == null)
            return -1;
        int studentCount = classroom.getStudentCount();
        double sum = 0;
        for (int i = 0; i < studentCount; i++) {
            sum += classroom.getStudentAt(i).getIMC();
        }
        return sum / studentCount;
    }

    public static Student getBestStudent(Classroom classroom) {
        if (classroom == null || classroom.getStudentAt(0) == null)
            return null;
        int studentCount = classroom.getStudentCount();
        Student bestStudent = classroom.getStudentAt(0);
        for (int i = 1; i < studentCount; i++) {
            Student nextStudent = classroom.getStudentAt(i);
            if (nextStudent.getAverageQualification() > bestStudent.getAverageQualification()) {
                bestStudent = nextStudent;
            }
        }
        return bestStudent;
    }

    public static Student getYoungestStudent(Classroom classroom) {
        if (classroom == null || classroom.getStudentAt(0) == null)
            return null;
        int studentCount = classroom.getStudentCount();
        Student youngestStudent = classroom.getStudentAt(0);
        for (int i = 1; i < studentCount; i++) {
            Student nextStudent = classroom.getStudentAt(i);
            if (nextStudent.getAge() > youngestStudent.getAge()) {
                youngestStudent = nextStudent;
            }
        }
        return youngestStudent;
    }

    public static ArrayList<Student> getSortedStudentsForSubject(Subject subject, Classroom classroom) {
        ArrayList<Student> studentList = new ArrayList<>();
        int studentCount = classroom.getStudentCount();

        for (int i = 0; i < studentCount; i++) {
            studentList.add(Student.clone(classroom.getStudentAt(i)));
        }

        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                Student studentI = studentList.get(i);
                Student studentJ = studentList.get(j);
                double studentIQualification = studentI.getQualificationSubject(subject);
                double studentJQualification = studentJ.getQualificationSubject(subject);
                if (studentIQualification < studentJQualification) {
                    studentList.set(i, studentJ);
                    studentList.set(j, studentI);
                }
            }
        }
        return studentList;
    }

    public static ArrayList<Student> getStudentsWithGender(Gender gender, Classroom classroom) {
        ArrayList<Student> studentList = new ArrayList<>();
        int studentCount = classroom.getStudentCount();

        for (int i = 0; i < studentCount; i++) {
            if (classroom.getStudentAt(i).getGender() == gender) {
                studentList.add(Student.clone(classroom.getStudentAt(i)));
            }
        }
        return studentList;
    }

    public static HashMap<String, Integer> getStatistics(Classroom classroom) {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("1. Más de un 9", countStudents(classroom, 9, Integer.MAX_VALUE));
        data.put("2. Entre 7 y 9", countStudents(classroom, 7, 9));
        data.put("3. Entre 5 y 7", countStudents(classroom, 5, 7));
        data.put("4. Entre 3 y 5", countStudents(classroom, 3, 5));
        data.put("5. Entre 0 y 3", countStudents(classroom, 0, 3));
        return data;
    }

    public static int countStudents(Classroom classroom, int min, int max) {
        int result = 0;
        int studentCount = classroom.getStudentCount();

        for(int i = 0; i < studentCount; i++) {
            Student student = classroom.getStudentAt(i);
            double average = student.getAverageQualification();
            if (min <= average && average < max)
                result++;
        }
        return result;
    }

}
