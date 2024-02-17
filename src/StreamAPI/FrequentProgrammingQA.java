package StreamAPI;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentProgrammingQA {
    public static void main(String[] args) {
        // 1. Java Program to Count the occurrence of each character in a string
        String input = "abirhasan";
//        Map<String, List<String>> map = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(s-> s));

        Map<String, Long> map = Arrays.stream(input.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        // 2. Java program to find all duplicate element from given String
        List<String> duplicateElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x-> x.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(duplicateElements);

        // 3. Java Program to find first non repeat from a given string

        String findNonRepeatElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x-> x.getValue()==1)
                .findFirst().get().getKey();

        System.out.println(findNonRepeatElement);

        //4. java program to find second-highest number from given array
        int[] numbers = {5,6,7,8,9,3,2,1};
        Integer sortedArray =Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(sortedArray);

        // 5. Java program to find longest string from given array
        String[] strArray = {"Jva", "hello"};
        String longest = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length()> word2.length()?word1:word2)
                .get();

        System.out.println(longest);


    }
}
