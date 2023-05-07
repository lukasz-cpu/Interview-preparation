package codebase;

import java.util.stream.IntStream;

public class Palidrome {

    public static void main(String[] args) {

        System.out.println(checkIfPalidrome("level"));
        System.out.println(checkIfPalidrome("levell"));
        System.out.println(checkIfPalidromeStream("level"));
        System.out.println(checkIfPalidromeStream("levell"));


    }


    static boolean checkIfPalidrome(String word) {
        int length = word.length();
        int forward = 0;
        int backward = length - 1;

        char[] wordChars = word.toCharArray();

        while (backward > forward) {
            char backwardWordChar = wordChars[backward];
            char forwardWordChar = wordChars[forward];
            if(forwardWordChar != backwardWordChar){
                return false;
            }
            forward++;
            backward--;

        }
        return true;
    }

    static boolean checkIfPalidromeStream(String word){
        String temp  = word.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .allMatch(i -> temp.charAt(i) == temp.charAt((temp.length() - 1) - i));
    }
}


