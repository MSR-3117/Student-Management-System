import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void removeStudent(int id) {
        Student student = findStudent(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void updateStudent(int id, String name, int age, String department) {
        Student student = findStudent(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            student.setDepartment(department);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}