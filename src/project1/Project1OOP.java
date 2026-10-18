package project1;

import java.util.Scanner;

public class Project1OOP {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        int choice = 1;

        while (choice != 0) {
            printMenu();
            choice = Integer.parseInt(input.nextLine());

            if (choice == 1) {
                addStudent(manager);
            } else if (choice == 2) {
                addMark(manager);
            } else if (choice == 3) {
                modifyMark(manager);
            } else if (choice == 4) {
                displayStudents(manager);
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Add mark");
        System.out.println("3. Modify mark");
        System.out.println("4. Display students");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    public static void addStudent(StudentManager manager) {
        System.out.println("1. Undergraduate");
        System.out.println("2. Graduate");
        System.out.print("Choose student type: ");
        int type = Integer.parseInt(input.nextLine());

        System.out.print("Student ID: ");
        String id = input.nextLine();

        System.out.print("Student name: ");
        String name = input.nextLine();

        Student student;

        if (type == 1) {
            student = new UndergraduateStudent(id, name);
        } else {
            student = new GraduateStudent(id, name);
        }

        manager.addStudent(student);
        System.out.println("Student added.");
    }

    public static void addMark(StudentManager manager) {
        System.out.print("Student ID: ");
        String id = input.nextLine();

        Student student = manager.findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.print("Enter mark: ");
            double mark = Double.parseDouble(input.nextLine());

            student.addMark(mark);
            System.out.println("Mark added.");
        }
    }

    public static void modifyMark(StudentManager manager) {
        System.out.print("Student ID: ");
        String id = input.nextLine();

        Student student = manager.findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.print("Which mark number do you want to change? ");
            int markNumber = Integer.parseInt(input.nextLine());

            System.out.print("Enter the new mark: ");
            double newMark = Double.parseDouble(input.nextLine());

            if (student.updateMark(markNumber, newMark)) {
                System.out.println("Mark updated.");
            } else {
                System.out.println("Mark number not found.");
            }
        }
    }

    public static void displayStudents(StudentManager manager) {
        for (int i = 0; i < manager.getStudentCount(); i++) {
            Student student = manager.getStudentAt(i);

            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());

            for (int j = 1; j <= student.getNumberOfMarks(); j++) {
                System.out.println(
                        "Mark " + j + ": " + student.getMark(j)
                );
            }

            System.out.println("Average: " + student.getAverage());

            if (student.hasPassed()) {
                System.out.println("Passed");
            } else {
                System.out.println("Not passed");
            }

            System.out.println();
        }
    }
}
