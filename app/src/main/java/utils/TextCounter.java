package utils;

import android.content.Context;
import android.widget.Toast;

public class TextCounter {
    public static String getCharsCount(String input, Context context) {
        if (input == null || input.isEmpty()) {
            Toast.makeText(context, "Iveskite kazka i laukeli", Toast.LENGTH_SHORT).show();
            return "Zodziu nera";
        }
        return String.valueOf(input.length());
    }

    public static String getWordCount(String input, Context context) {
        if (input == null || input.isEmpty()) {
            Toast.makeText(context, "Iveskite kazka i laukeli", Toast.LENGTH_SHORT).show();
            return "Nieko nera";
        }
        String[] words = input.split("\\s+");
        return String.valueOf(words.length);
    }
}