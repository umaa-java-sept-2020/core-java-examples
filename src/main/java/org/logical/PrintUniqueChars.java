package org.logical;

public class PrintUniqueChars {

    public static void main(String[] args) {
        String s = "abbbccdeeffff"; // abcdef
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (prev != current) {
                System.out.print(prev);
            }
            prev = current;
        }
        System.out.print(prev);
    }
}
