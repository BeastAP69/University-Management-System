package com.university.idGenerator;

import java.util.Random;


public class AdmissionIDGenerator
 {
    public static String generateRandomNumericAdmissionID(int length) 
    {
        Random random = new Random();
        StringBuilder admissionID = new StringBuilder();

        for (int i = 0; i < length; i++) {
            admissionID.append(random.nextInt(10)); // Generates a random digit (0-9)
        }

        return admissionID.toString();
    }

    public static void GenerateId() 
    {
        System.out.println("\n ******  ID CARD BEING GENERATED  ****** ");
        int desiredLength = 6; // You can change the desired length as needed
        String randomID = generateRandomNumericAdmissionID(desiredLength);
        System.out.println("Admission ID: " + randomID);
    }
}
