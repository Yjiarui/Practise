import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String J,String S){
        Set<Character> jewels = new HashSet<>();

        for(char ch : J.toCharArray()){
            jewels.add(ch);
        }
        int count = 0;
        for(char ch : J.toCharArray()){
            if(jewels.contains(ch)){
                count++;
            }
        }
        return count;
    }
}