package org.logical;

public class CountPossibleNumbersDivisibleBy3 {
    // you are allowed to do only one replacement at one index

    public static void main(String[] args) {
        String s = "035"; // 135, 435, 735

        char[] ch = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Character.digit(ch[i], 10);
        }
        int result = m1(ch, sum - Character.digit(ch[0], 10));
        System.out.println(result);
        result = m1(ch, sum - ch[1]);
        System.out.println(result);
        result = m1(ch, sum - ch[2]);
        System.out.println(result);
    }

    private static int m1(char[] ch, int sum) {
        int reminder = sum % 3;
        int temp = reminder;
        int diff = 0;
        if (reminder != 0) {
            while (temp <= 9) {
                if (temp % 3 == 0) {
                    diff = temp - reminder;
                    break;
                }
                temp++;
            }
        }
        // 0, 3, 6
        // 3, 3, 6
        // 6, 3, 6
        // 9, 3, 6

        return 1 + (9 - diff) / 3;
    }
}
