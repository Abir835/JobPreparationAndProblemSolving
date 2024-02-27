package leeetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    int[] nums = {2,7,11,15};
    int target = 18;
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.getIndex(twoSum.nums, twoSum.target));
    }

    public List<Integer> getIndex(int[] num, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<num.length; i++){
            int compliment = target - num[i];
            if (map.containsKey(compliment)){
                List<Integer> result = new ArrayList<>();
                result.add(map.get(compliment));
                result.add(i);
                return result;
            }
            map.put(num[i], i);
        }
        return new ArrayList<>();
    }
}
