//
//  Classroom.java
//  students
//
//  Created by Fernando Pastor on 06/08/2024
//

import java.util.ArrayList;

public class Classroom {

    private ArrayList<Student> studentList = new ArrayList<>();

    Classroom() {
    }

    Classroom(ArrayList<Student> studentList) {
        this.studentList.addAll(studentList);
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudentAt(int index) {
        studentList.remove(index);
    }

    public boolean containsStudentWithName(String name) {
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void removeStudentsWithName(String name) {
        for (int i = 0; i < studentList.size();) {
            if (studentList.get(i).getName().equals(name)) {
                studentList.remove(i);
                i--;
            }
        }
    }

    public int getStudentCount() {
        return studentList.size();
    }

    public Student getStudentAt(int index) {
        if (0 <= index && index < studentList.size()) {
            return studentList.get(index);
        }
        return null;
    }

}
