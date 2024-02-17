package leeetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    int[] nums = {1, 2, 3, 1};

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(containsDuplicate.nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (final int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}
