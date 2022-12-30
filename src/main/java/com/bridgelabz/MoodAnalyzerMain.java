package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyzerMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the message");
        String message = scan.nextLine();
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer(message);
        moodAnalyzer1.analyseMood();

        System.out.println("Enter the message");
        message = scan.nextLine();
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer(message);
        moodAnalyzer2.analyseMood();
    }
}
