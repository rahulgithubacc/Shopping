package com.practice.common;

import java.util.Random;

public class Util {
    public static String generateRandomEmailAddress(String firstname,String lastname) {
    Random randomNum = new Random();
    int rand_int1 = randomNum.nextInt(1000);
    String generatedEmail = firstname+rand_int1+lastname+"@gmail.com";
    return generatedEmail;
    }
    public static String splitDay (String date) {
        String dateParts[] = date.split("-");
        return dateParts[0];
    }
    public static String splitMonth (String date) {
        String dateParts[] = date.split("-");
        return dateParts[1];
    }
    public static String splitYear (String date) {
        String dateParts[] = date.split("-");
        return dateParts[2];
    }

}
