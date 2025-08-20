import java.io.*;
import java.util.*;

/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 */

// Entity Class
class Student implements Serializable {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Marks: " + marks;
    }
}

// Main Application
public class StudentRecordSystem {
    private static final String FILE_NAME = "students.dat";
    private static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        loadData();  // Load existing records from file
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Save & Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    saveData();
                    System.out.println("Data saved. Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Add a student
    private static void addStudent(Scanner sc) {
        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = Double.parseDouble(sc.nextLine());

            Student s = new Student(id, name, marks);
            studentList.add(s);
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Error! Please enter valid data.");
        }
    }

    // View all students
    private static void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No records found!");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    // Search student by ID
    private static void searchStudent(Scanner sc) {
        System.out.print("Enter Student ID to search: ");
        try {
            int id = Integer.parseInt(sc.nextLine());
            for (Student s : studentList) {
                if (s.getId() == id) {
                    System.out.println("Record Found: " + s);
                    return;
                }
            }
            System.out.println("Student not found!");
        } catch (Exception e) {
            System.out.println("Invalid ID input!");
        }
    }

    // Save student list to file
    private static void saveData() {
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(studentList);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load student list from file
    private static void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentList = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            // first run, no file exists
            studentList = new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
