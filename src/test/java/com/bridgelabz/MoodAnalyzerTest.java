package com.bridgelabz;

import org.junit.jupiter.api.*;
import static org.junit.Assert.fail;
public class MoodAnalyzerTest {
    static MoodAnalyzer moodAnalyzer;

    @Test
    public void testAnalyseMood(){
        try {
            moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
            String result = moodAnalyzer.analyseMood();
            Assertions.assertEquals(result, "SAD");

            moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
            result = moodAnalyzer.analyseMood();
            Assertions.assertEquals(result, "HAPPY");
        }catch (MoodAnalysisException e){
            fail("Should not throw exception");
        }
    }

    @Test
    public void testAnalyseMoodNullCase(){
        try{
            moodAnalyzer = new MoodAnalyzer(null);
            String result = moodAnalyzer.analyseMood();
        }catch(MoodAnalysisException e){
            Assertions.assertEquals(e.getMessage(), Error.NULL.getAction());
        }
    }

    @Test
    public void testAnalyseMoodEmptyCase(){
        try{
            moodAnalyzer = new MoodAnalyzer("");
            String result = moodAnalyzer.analyseMood();
        }catch(MoodAnalysisException e){
            Assertions.assertEquals(e.getMessage(), Error.EMPTY.getAction());
        }
    }
}
