import java.util.Arrays;

//旋转数组
//给定一个数组，将数组中的元素右移 k 个位置，其中 k 是个非负数
//例
//输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
public class LeetCode189 {
    public void ratate(int[] nums, int k) {
        int temp = 0;
        k = k % nums.length;
        if ((nums.length % 2 == 0) && (nums.length / 2 == k) ){
            for (int i = 0;i < k;i++){
                temp = nums[i];
                nums[i] = nums[nums.length - k + i];
                nums[nums.length - k + i] = temp;
            }
        }else if (nums.length / 2 >= k){
            for (int i = 0;i < k;i++){
                temp = nums[i];
                nums[i] = nums[nums.length - k + i];
                nums[nums.length - k + i] = temp;
            }
            for (int j = 0;j < k;j++){
                for (int i = nums.length - 1;i > k;i--){
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }else {
            for (int i = 0;i < nums.length - k;i++){
                temp = nums[i];
                nums[i] = nums[k + i];
                nums[k + i] = temp;
            }
            for (int j = 0;j < nums.length - 2 * (nums.length - k);j++){
                for (int i = k - 1;i > 0;i--){
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
