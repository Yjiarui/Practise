import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1.统计每个单词中，每个字母的出现次数
//
//
//4.把字母写入结果 list，写入最小次数
public class Solution1002 {
    public List<String> commonChars(String[] A){
        List<Map<Character,Integer>> counts = new ArrayList<>();
        for(String s : A){
            Map<Character,Integer> map = new HashMap<>();
            for(char c : s.toCharArray()){
                int n = map.getOrDefault(c,0);
                map.put(c,n + 1);
            }
            counts.add(map);
        }
        for (char c : counts.get(0).keySet()){
            boolean allContains = true;
            for (int i = 1;i < counts.size();i++){
                Map<Character,Integer> map = counts.get(i);
                if(!map.containsKey(c)){
                    allContains = false;
                    break;;
                }
            }
            int min = counts.get(0).get(c);
            for (int i = 1;i < counts.size();i++){
                int n = counts.get(i).get(c);
                if(n < min){
                    min = n;
                }
            }
            for(int i = 0;i < min;i++){
                result.add(String.valueOf(c));
            }
        }
    }
}
