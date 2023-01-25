package com.bridgelabz.mood_analyser;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(){

            if(this.message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
    }

