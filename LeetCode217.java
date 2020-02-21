import java.util.HashSet;
import java.util.Set;

//存在重复元素
//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
//示例 1:
//输入: [1,2,3,1]
//输出: true
//示例 2:
//输入: [1,2,3,4]
//输出: false
public class LeetCode217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0;i < nums.length;i++){
            if (!set1.add(nums[i])){//add（）方法 是判断set1中是否有包含nums[i]，如果没有则添加，若已包含，则该调用不更改set并返回false
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}