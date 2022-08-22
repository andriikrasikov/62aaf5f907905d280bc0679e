package ua.ithillel.homework;

public class homework1 {

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Let's check", 'e'));
        System.out.println(findWordPosition("word0word1word2", "word1"));
        System.out.println(stringReverse("Some text"));
        System.out.println(isPalindrome("Iol"));
    }

    // task 2
    public static int findSymbolOccurance(String text, char a) {
        String checkText = text.toLowerCase();
        char[] array = checkText.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) count++;
        }
        return count;
    }

    // task 3
    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    // task 4
    public static String stringReverse(String text) {
        StringBuilder newText = new StringBuilder(text);
        String result = newText.reverse().toString();
        return result;
    }

    // task 5
    public static boolean isPalindrome(String texts) {
        String checkText = texts.toLowerCase();
        StringBuffer buffer = new StringBuffer(checkText);
        String newText = buffer.reverse().toString();
        return newText.equals(checkText);
    }
}
