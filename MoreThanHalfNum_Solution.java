//数组中有一个数字出现的次数超过数组长度的一半
//请找出这个数字
//例 输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
//输出：2
import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0){
            return 0;
        }
        if (array.length == 1){
            return array[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : array){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans = 0;
        for (int key : map.keySet()){
            if (map.get(key)*2>array.length){
                ans = key;
                break;
            }
        }
        return ans;
    }
}