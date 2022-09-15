package ua.Ithillel.Java.Lesson9.Homework8;

import java.util.*;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) {

        //1
        List<String> words = new ArrayList<>();
        Collections.addAll(words, "Seems", "like", "I", "am", "totally", "lagged", "behind", "group", "and", "have", "no", "idea", "how", "to", "catch", "it", "up");
        countOccurance(words, "I");
        //2
        Integer[] array = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(toList(array));
        //3
        System.out.println(findUnique(toList(array)));
        //4
        calcOccurance(words);
        findOccurance(words);
    }

    //1
    public static void countOccurance(List<String> x, String word) {
        int count = 0;
        for (String s : x) {
            if (word.equals(s)) {
                count++;
            }
        }
        System.out.println("repeats " + count + "x");
    }

    //2
    public static List<Integer> toList(Integer[] array) {
        return Arrays.asList(array);
    }

    //3

    public static List<Integer> findUnique(List<Integer> x) {
        return x.stream().distinct().collect(Collectors.toList());
    }

    public static void calcOccurance(List<String> x) {
        Set<String> distinct = new HashSet<>(x);
        for (String s : distinct) {
            System.out.println(s + ": " + Collections.frequency(x, s));
        }
    }

    public static List<String> findOccurance(List<String> words) {
        Collections.sort(words);
        String str1 = words.get(0);
        int occurance = 1;
        List<String> names2 = new ArrayList<>();
        for (int i = 1; i < words.size(); i++) {
            String str2 = words.get(i);
            if (str1.equals(str2)) {
                occurance++;
            } else {
                names2.add("{name: " + str1 + " , occurance " + occurance + "}");
                occurance = 1;
                str1 = str2;
            }
        }
        names2.add("{name: " + str1 + " , occurance " + occurance + "}");
        names2.forEach(System.out::println);
        return names2;
    }

}







