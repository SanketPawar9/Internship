package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        List<Student> studList = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
         
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    studList.add(new Student(id, name, marks));
                    System.out.println("Student added successfully.");
                    break;

                case 2: // View Students
                    System.out.println("\n--- Student List ---");
                    for (Student s : studList) {
                        System.out.println(s);
                    }
                    break;

                case 3: // Update Student
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    boolean foundUpdate = false;
                    for (Student s : studList) {
                        if (s.id == updateId) {
                            sc.nextLine(); // consume newline
                            System.out.print("Enter new name: ");
                            s.name = sc.nextLine();
                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextDouble();
                            System.out.println("Student updated.");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 4: // Delete Student
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean foundDelete = false;
                    for (Student s : studList) {
                        if (s.id == deleteId) {
                            studList.remove(s);
                            System.out.println("Student deleted.");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        
    }
}
