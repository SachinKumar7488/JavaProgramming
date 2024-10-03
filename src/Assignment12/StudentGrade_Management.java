package Assignment12;
//student class
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addGrade(double grade) {
        grades.add(grade);
    }
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
}

class GradeBook {
    private ArrayList<Student> students;

    public GradeBook() {
        this.students = new ArrayList<>();
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentWithHighestAverage() {
        if (students.isEmpty()) {
            return null;
        }
        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.calculateAverage() > topStudent.calculateAverage()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                student.displayStudentDetails();
                System.out.println();
            }
        }
    }
}

public class StudentGrade_Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("\n1. Add a student");
            System.out.println("2. Add a grade for a student");
            System.out.println("3. Find student with highest average grade");
            System.out.println("4. Display all students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add student
                    System.out.print("Enter student's name: ");
                    String name = scanner.nextLine();
                    Student student = new Student(name);
                    gradeBook.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    // Add grade for a student
                    System.out.print("Enter student's name: ");
                    name = scanner.nextLine();
                    Student foundStudent = null;
                    for (Student s : gradeBook.getStudents()) {
                        if (s.getName().equalsIgnoreCase(name)) {
                            foundStudent = s;
                            break;
                        }
                    }
                    if (foundStudent != null) {
                        System.out.print("Enter grade to add: ");
                        double grade = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        foundStudent.addGrade(grade);
                        System.out.println("Grade added successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    // Find student with highest average grade
                    Student topStudent = gradeBook.findStudentWithHighestAverage();
                    if (topStudent != null) {
                        System.out.println("Student with highest average grade:");
                        topStudent.displayStudentDetails();
                    } else {
                        System.out.println("No students available.");
                    }
                    break;

                case 4:
                    // Display all students
                    gradeBook.displayAllStudents();
                    break;

                case 5:
                    // Exit
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}