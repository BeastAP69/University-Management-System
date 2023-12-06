package com.university.examinations;

public class Examinations
{
    private String ds;
    private String itvc;
    private String dsm;
    private String oopml;
    private String coa;


    public Examinations(String ds,String itvc,String dsm,String oopml,String coa)
    {
        this.ds = ds;
        this.itvc = itvc;
        this.dsm = dsm;
        this.oopml = oopml;
        this.coa = coa;
   
    }

    public static void Ds()
    {
        System.out.println("\n****  SUBJECT : DATA STRUCTURES  ****");
        System.out.println(("Subject Contains : 5 Modules"));
        System.out.println(("In-semister Examination : 30 Marks"));
        System.out.println(("End-semister Examination : 100 Marks"));
        System.out.println(("Continous Assesment = = : In-sem + Internal Assesments == Marks/50"));
        System.out.println(("Total Marks Obtained in the subject : CA + (End-Sem)/2"));
        System.out.println(("Total Experiments : 10 "));
        
    }

    public static void Itvc()
    {
        System.out.println("\n****  SUBJECT : ITVC(INTEGRAL TRANSFORM AND VECTOR CALCULUS)  ****");
        System.out.println(("Subject Contains : 5 Modules"));
        System.out.println(("In-semister Examination : 30 Marks"));
        System.out.println(("End-semister Examination : 100 Marks"));
         System.out.println(("Continous Assesment = = : In-sem + Internal Assesments == Marks/50"));
        System.out.println(("Total Marks Obtained in the subject : CA + (End-Sem)/2"));
        System.out.println(("Total Experiments : 10 "));
         
        
    }

    public static void Dsm()
    {
        System.out.println("\n****  SUBJECT : DISCRETE MATHEMATICS  ****");
        System.out.println(("Subject Contains : 7  Modules"));
        System.out.println(("In-semister Examination : 30 Marks"));
        System.out.println(("End-semister Examination : 100Marks"));
        System.out.println(("Continous Assesment = = : In-sem + Internal Assesments == Marks/50"));
        System.out.println(("Total Marks Obtained in the subject : CA + (End-Sem)/2"));
        System.out.println(("Total Tutorials: 10 "));
    }

    public static void  Oopml()
    {
        System.out.println("\n****  SUBJECT :OBJECT ORIENTED PROGRAMMING METHODOLOGY  ****");
        System.out.println(("Subject Contains : 5 Modules"));
        System.out.println(("In-semister Examination : 30 Marks"));
        System.out.println(("End-semister Examination : 100 Marks"));
        System.out.println(("Continous Assesment = = : In-sem + Internal Assesments == Marks/50"));
        System.out.println(("Total Marks Obtained in the subject : CA + (End-Sem)/2"));
        System.out.println(("Total Experiments : 10 "));
        
    }

    public static void Coa()
    {
        System.out.println("\n****  SUBJECT : COMPUTER ORGANISATION AND ARCHITECTURE  ****");
        System.out.println(("Subject Contains : 5 Modules"));
        System.out.println(("In-semister Examination : 30 Marks"));
        System.out.println(("End-semister Examination : 100 Marks"));
        System.out.println(("Continous Assesment = = : In-sem + End-sem"));
        System.out.println(("Total Experiments : 10 "));       
    }}
