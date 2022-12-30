package com.bridgelabz;

public class MoodAnalyzer {

    String message;


    MoodAnalyzer(){

    }

    MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyseMood(){
        if(this.message.equals("I am in Sad Mood")){
            System.out.println("In Sad mood");
            return "SAD";
        } else{
            System.out.println("In Happy mood");
            return "HAPPY";
        }
    }
}
