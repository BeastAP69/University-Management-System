package com.university.students;

import java.util.*;

public class Student 
{
    private String name;
    private String studentID;
    private int age;
    private String mtounge;
    private String address;
    private String marks12;
    private String mothername;
    private String MARKS1;
    private String contact;
    private String email;

    public Student(String name, String studentID, int age,String address,String mtounge,String mothername,String marks12,String MARKS1,String contact,String email) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
        this.mtounge = mtounge;
        this.address = address;
        this.mothername = mothername;
        this.marks12 = marks12;
        this.MARKS1= MARKS1;
        this.contact = contact;
        this.email = email;
        
    }

    public String getName() 
    {
    return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    public String Address(){
        return address;
    }
    public String Mothertongue(){
        return mtounge;
    }
    public String MotherName(){
        return mothername;
    }
    public String Marks12(){
        return marks12;
    }
    public String Marks1(){
        return MARKS1;
        }
    public String Contact(){
        return contact;
        }
    public String Email(){
        return email;
        }
}


