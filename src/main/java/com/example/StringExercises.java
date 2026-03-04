package com.example;

public class StringExercises {

    public static void main(String[] args) {

        // Exercise 1
          // The length of the String "Java" is 4
        String java = "Java";
                System.out.println("Ex 1: Length is " + java.length());

        // Exercise 2
          // Char at index position 6 in "Long example sentence"? - is o
        String sentence = "Long example sentence";
        char letter = sentence.charAt(6);
        System.out.println("Ex 2: Character at index 6 is: " + letter);

        // Exercise 3
        String longSentence = "Even longer example sentence";
        // Find position using indexOf
        int position = longSentence.indexOf("o");
        System.out.println("Ex 3; Index position of 'o' is: " + position);

        // Exercise 4
        String str4 = "Ok this is not as long!";
        String sub = str4.substring(11,22);
        System.out.println("Ex 4: " + sub);

        // Exercise 5
        String caps = "CAPS EQUALS SCREAMING";
        String lower = caps.toLowerCase();
        System.out.println("Ex 5: " + lower);
        System.out.println("Ex 5 back: " + lower.toUpperCase());

        // Exercise 6
        String tabs = "\tJ\ta\tv\ta\t";
        System.out.println("Ex 6: " + tabs.trim());

        // Exercise 7
        int number = 20;
        String numberStr = String.valueOf(number);
        System.out.println("Ex 7: " + numberStr + "20");


        // Exercise 8
        // Split Oil + Water
        String oilWater = "Oil and Water";
        String[] words = oilWater.split(" and ");
        // Prints out oil + water
        System.out.println("Ex 8: " + words[0]);
        System.out.println("Ex 8: " + words[1]);

        // Exercise 9
    String nameStr




    }
}
