import java.util.Arrays;
//第三大的数
//给定一个非空数组，返回此数组中第三大的数，如果不存在，则返回数组中最大的数。
//输入：3,2,1
//输出：1
public class LeetCode414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int temp = 1;
        if(nums.length <= 2){
            return nums[nums.length - 1];
        }
        for(int i = nums.length - 1; i > 0;i--){
            if(nums[i] != nums[i - 1]){
                temp++;
            }
            if(temp == 3)
                return nums[i - 1];
        }
        return nums[nums.length - 1];
    }
}
