package com.bridgelabz;

import org.junit.jupiter.api.*;

public class MoodAnalyzerTest {
    static MoodAnalyzer moodAnalyzer;

    @Test
    public void testAnalyseMood(){
        moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyseMood();
        Assertions.assertEquals(result,"SAD");

        moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        result = moodAnalyzer.analyseMood();
        Assertions.assertEquals(result,"HAPPY");

        // should return HAPPY for null message

        moodAnalyzer = new MoodAnalyzer(null);
        result = moodAnalyzer.analyseMood();
        Assertions.assertEquals(result,"HAPPY");

    }
}
