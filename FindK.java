//最小的k个数
//输入n个整数，找出其中最小的k个数
//例如 输入 4,5,1,6,2,7,3,8
//则最小的四个数是1,2,3,4
import java.util.ArrayList;
import java.util.PriorityQueue;

public class FindK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        PriorityQueue<Integer> maxHead = new PriorityQueue<Integer>(k,(o1,o2) ->{return o2.compareTo(o1);});
        for (int i = 0;i < input.length;i++){
            if (i < k){
                maxHead.add(input[i]);
            }else if (maxHead.peek() > input[i]) {
                maxHead.poll();
                maxHead.add(input[i]);
            }
        }
        while (!maxHead.isEmpty()){
            arrayList.add(maxHead.remove());
        }
        return arrayList;
    }
}