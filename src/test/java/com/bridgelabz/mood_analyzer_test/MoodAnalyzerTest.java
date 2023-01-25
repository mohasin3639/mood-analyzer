package com.bridgelabz.mood_analyzer_test;

import com.bridgelabz.mood_analyser.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyzerTest {

    @Test
    public void givenMessage_whenSad_shouldReturnSadMood(){
        MoodAnalyzer obj = new MoodAnalyzer("I am in sad mood");
        String res = obj.analyseMood();
        Assert.assertEquals("SAD", res);
    }
    @Test
    public void givenMessage_whenAny_shouldReturnHappyMood(){
        MoodAnalyzer obj = new MoodAnalyzer("I am in happy Mood");
        String res = obj.analyseMood();
        Assert.assertEquals("HAPPY", res);
    }
    }

