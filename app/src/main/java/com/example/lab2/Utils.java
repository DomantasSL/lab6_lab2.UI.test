package com.example.lab2;

import java.util.ArrayList;

public class Utils {

    public static String removeExessiveSpacesFromString(String inputText){
        String[] wordsArray = inputText.split("//s");
        ArrayList<String> wordsArrayWithoutEmptySpaces = new ArrayList<>();
        for (String word : wordsArray) {
            if(!word.isEmpty()) {
                wordsArrayWithoutEmptySpaces.add(word);
            }
        }
        return String.join(" ", wordsArrayWithoutEmptySpaces);
    }
}
