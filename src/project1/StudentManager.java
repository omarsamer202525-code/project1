package project1;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    public int getStudentCount() {
        return students.size();
    }

    public Student getStudentAt(int index) {
        return students.get(index);
    }
}
