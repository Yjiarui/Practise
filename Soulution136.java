//只出现一次的数字
//给定一个非空整数数组
//除了某个元素只出现一次以外
//其余每个元素均出现两次
//找出那个只出现了一次的元素
import java.util.HashMap;
import java.util.Map;

public class Solution136 {
    public static void singleNumber(int[] numbers) {
        //values 该数字出现的次数
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : numbers) {
            //判断下n在不在map中
            //如果不在，出现次数为 1
            //如果在，出现次数 +1
            int c = map.getOrDefault(n, 0);
            map.put(n, c + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int cnt = entry.getValue();
            if (cnt == 1) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,7,4,5,6,3,3,6};
        singleNumber(numbers);
    }
}