//杨辉三角


import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        //list是一种引用，List类型的接口引用（java语法）
        //list逻辑上是一种线性表
        //线性表的元素类型是List<Integer>
        //   (java 语法) List 类型的接口引用
        //               元素类型是 Integer 类类型的引用
        //               Integer 是 int 的包装类
        for(int i = 0;i < numRows;i++){
            list.add(new ArrayList<>(i+1));
        }
        list.get(0).add(1);
        list.get(1).add(1);
        list.get(1).add(1);
        for(int i = 2;i < numRows;i++){
            List<Integer> nums = list.get(i);
            nums.add(1);
            for(int j = 1;j < i;j++){
                int num = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                nums.add(num);
            }
            nums.add(1);
        }
        return  list;
    }
   /* public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        for(int i = 0;i < numRows;i++){
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            for(int j = 0;j<=i-2;j++){
                List<Integer> preNums = list.get(i-1);
                int p = preNums.get(j);
                int q = preNums.get(j+1);
                int n = p + q;

                nums.add(n);
            }
            if(i != 0){
                nums.add(1);
            }
            list.add(nums);
        }
        return list;
    }*/
     private  static  void printPasscalsTriangle(Solution2 s,int n){
         System.out.println(s.generate(n));
     }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        printPasscalsTriangle(solution,10);
    }

}
