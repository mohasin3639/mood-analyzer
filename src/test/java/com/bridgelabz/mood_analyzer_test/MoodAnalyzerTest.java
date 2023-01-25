package com.bridgelabz.mood_analyzer_test;

import com.bridgelabz.mood_analyser.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood(){
        MoodAnalyzer obj = new MoodAnalyzer();
        String res = obj.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", res);
    }
    @Test
    public void givenMessage_whenAny_shouldReturnHappyMood(){
        MoodAnalyzer obj = new MoodAnalyzer();
        String res = obj.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", res);
    }
    }

