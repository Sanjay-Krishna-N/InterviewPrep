import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ------------------------------------------------------------------------
 * Author   : Sanjay Krishna Narayanan
 * Created  : 10/23/26
 * Version  : 1.0
 * ------------------------------------------------------------------------
 */
public class TwoSum {
    public static void main(String[] args) {

        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twosum(nums, target)));
    }

    private static int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(store.containsKey(target - nums[i])){
                return new int[]{store.get(target - nums[i]),i};
            }else{
                store.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
