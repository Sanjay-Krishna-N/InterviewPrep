import java.util.Arrays;

/**
 * ------------------------------------------------------------------------
 * Author   : Sanjay Krishna Narayanan
 * Created  : 10/23/26
 * Version  : 1.0
 * ------------------------------------------------------------------------
 */
public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = {2,7,0,15,0,11};
        arrange(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void arrange(int[] nums) {
        int j= nums.length-1;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]!=0){
                nums[j--]= nums[i];
            }
        }
        while(j>=0){
            nums[j--]=0;
        }
    }
}
