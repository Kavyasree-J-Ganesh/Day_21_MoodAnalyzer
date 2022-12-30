package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyzerMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message");
        String message = scan.nextLine();

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyseMood(message);

        System.out.println("Enter the message");
        message = scan.nextLine();

        moodAnalyzer.analyseMood(message);
    }
}
