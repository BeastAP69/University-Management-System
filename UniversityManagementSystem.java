package com.university;
import com.university.students.Student;
import com.university.examinations.Examinations;
import com.university.idGenerator.AdmissionIDGenerator;

import java.util.ArrayList;
import java.util.Scanner;
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nUniversity Management System Menu:");
            System.out.println("1. Please Generate Your Id Card ");
            System.out.println("2. SApplication Form");
            System.out.println("3. Subject/Syllabus Details");
            System.out.println("4. Application Form List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1)
            {
                AdmissionIDGenerator.GenerateId();
            }
            if (choice == 2)
            {
                
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student ID: ");
                String studentID = scanner.next();
                System.out.print("Enter student age: ");
                int age = scanner.nextInt();
                System.out.print("Enter your address: ");
                String address = scanner.next();
                System.out.print("Enter your mother tongue: ");
                String mtounge = scanner.next();
                System.out.print("Enter your Mother's Name: ");
                String mothername = scanner.next();
                System.out.print("Enter your 12th Percentage: ");
                String fathername = scanner.next();
                System.out.print("Enter your MHT-CET PERCENTILE : ");
                String religion = scanner.next();
                System.out.print("Enter your Contact Details: ");
                String contact = scanner.next();
                System.out.print("Enter your Email: ");
                String email = scanner.next();
                Student student = new Student(name, studentID, age,address,mtounge,mothername,fathername,religion,contact,email);
                students.add(student);
                System.out.println("Student added successfully.");
            }
            if (choice == 3)
            {
                System.out.println("\nEnter the Number to check the Subject Details");
                System.out.println("1. Data Structures:");
                System.out.println("2. Integral Transform Vector Calculus ");
                System.out.println("3. Discrete Mathematics ");
                System.out.println("4. Object Oriented Programming Methodology");
                System.out.println("5. Computer Organisation and Architecture ");
                int num = scanner.nextInt();
                scanner.nextLine(); 
                if(num==1){
                    Examinations.Ds();
                }
                if(num==2){
                    Examinations.Itvc();
                }
                if(num==3){
                    Examinations.Dsm();
                }
                if(num==4){
                    Examinations.Oopml();
                }
                if(num==5){
                    Examinations.Coa();
                }
            }
            

            else if (choice == 4)
             {
                System.out.println("\nList of Students:");
                for (Student student : students)
                {
                    System.out.println("\nName: " + student.getName());
                    System.out.println("\nStudent ID: " + student.getStudentID());
                    System.out.println("\nAge: " + student.getAge());
                    System.out.println("\nAddress: " + student.Address());
                    System.out.println("\nMother Tongue: " + student.Mothertongue());
                    System.out.println("\nMother's Name : " + student.MotherName());
                    System.out.println("\n12th Percentage : : " + student.Marks12());
                    System.out.println("\nMHT-CET PERCENTILE : " + student.Marks1());
                    System.out.println("\nContact Number: " + student.Contact());
                    System.out.println("\nEmail : " + student.Email());
                    System.out.println();
                    }      
            }
            else if (choice == 5)
            {
                System.out.println("Exiting the program.");
                break;
            } 
            else
            {
                System.out.println("Invalid choice. Please try again.");
            }   
        }
    }
}
