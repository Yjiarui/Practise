import java.util.*;
//微信红包
//给定一个红包的金额数组gifts及它的大小n
//返回所求红包的金额
//若没有金额超过总数n的一半，返回0
public class Gift {
    public int getValue(int[] gifts, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int ret = 0;
        for(int i = 0;i < n;i++){
            map.put(gifts[i],map.getOrDefault(gifts[i],0)+1);
        }
        for (Integer j : map.keySet()){
             if (map.get(j) > n/2){
                 ret = j;
             }
        }
        return ret;
    }
