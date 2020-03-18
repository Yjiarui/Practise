//在排序数组中查找元素的第一个和最后一个位置
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
//你的算法时间复杂度必须是 O(log n) 级别。
//如果数组中不存在目标值，返回 [-1, -1]。
//
//示例 1:
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: [3,4]

//示例 2:
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: [-1,-1]
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = { -1,-1};
        if(nums == null || nums.length == 0){
            return arr;
        }
        int index = binarySearch(nums,target);
        if(index == -1){
            return arr;
        }
        int l = index - 1;
        while(l >= 0 && nums[l] == target){
            --l;
        }
        arr[0] = l + 1;
        int r = index + 1;
        while( r < nums.length && nums[r] == target){
            ++r;
        }
        arr[1] = r - 1;
        return arr;
    }

    private int binarySearch(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            int middle = (l + r)/2;
            if (nums[middle] == target){
                return middle;
            }else if (nums[middle] >target){
                r = middle - 1;
            }else {
                l = middle + 1;
            }
        }
        return -1;
    }
}