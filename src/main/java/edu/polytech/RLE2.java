package edu.polytech;

import java.util.ArrayList;
import java.util.List;

public class RLE2 {

    public static void main(String[] args) {
        String input = "AAABBCDDDDEEEE";

        List<Character> characters = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        char prev = 0;
        int count = 0;

        for (char c : input.toCharArray()) {
            if (c != prev) {
                characters.add(c);
                counts.add(count);
                prev = c;
                count = 0;
            }
            count++;
        }

        characters.add(prev);
        counts.add(count);

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < characters.size(); i++) {
            output.append(characters.get(i));
            output.append(counts.get(i));
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + output.toString());
    }
}