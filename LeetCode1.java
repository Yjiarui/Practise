//两数之和
//给定一个整数数组nums 和 一个目标值 target
//请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(target - nums[i] == nums[j])
                    return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}