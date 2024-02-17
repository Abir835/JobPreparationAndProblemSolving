package leeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    String[] sts = {"eat", "tea", "tan", "ate", "nat", "bat"};


    public static void main(String[] args) {
        GroupAnagrams containsDuplicate = new GroupAnagrams();
        System.out.println(containsDuplicate.groupAnagrams(containsDuplicate.sts));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store groups of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the array
        for (String str : strs) {
            // Convert the string to a character array, sort it, and convert it back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Check if the sorted string exists as a key in the map
            if (!map.containsKey(sortedStr)) {
                // If not, create a new list and put it in the map
                map.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the corresponding group in the map
            map.get(sortedStr).add(str);
        }

        // Convert the values of the map (lists of anagrams) to a list of lists
        return new ArrayList<>(map.values());
    }
}
