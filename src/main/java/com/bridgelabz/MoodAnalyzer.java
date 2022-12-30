package com.bridgelabz;

public class MoodAnalyzer {
    public String analyseMood(String message){
        if(message.equals("I am in Sad Mood")){
            System.out.println("In Sad mood");
            return "SAD";
        } else{
            System.out.println("In Happy mood");
            return "HAPPY";
        }
    }
}
