package com.bridgelabz;

enum Error {
    NULL("Invalid message. Null value for message"),
    EMPTY("Invalid message. Empty value for message");

    private String action;

    // getter method
    public String getAction()
    {
        return this.action;
    }

    // enum constructor - cannot be public or protected
    private Error(String action)
    {
        this.action = action;
    }
}

public class MoodAnalyzer {

    String message;


    MoodAnalyzer(){

    }

    MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyseMood() throws MoodAnalysisException{
        if(this.message == null){
            System.out.println(Error.NULL.getAction());
            throw new MoodAnalysisException(Error.EMPTY.getAction());
        }

        if(message == ""){
            System.out.println(Error.EMPTY.getAction());
            throw new MoodAnalysisException(Error.EMPTY.getAction());
        }
        if(this.message.equals("I am in Sad Mood")){
            System.out.println("In Sad mood");
            return "SAD";
        } else{
            System.out.println("In Happy mood");
            return "HAPPY";
        }
    }
}
