package ru.igor;

public class ValidPalindrome {

    public static boolean solve(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reversed = stringBuilder.toString();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reversed.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var result = solve("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
}
