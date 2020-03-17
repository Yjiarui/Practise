import java.util.ArrayList;
import java.util.Scanner;

//求和（输出所有的可能组合）
//输入两个整数 n 和 m ，从数列1,2,3...n中随意取几个数，使其和等于 m，要求将其中所有的可能组合列出来
//输入 5 5
//结果
// 1 4
// 2 3
// 5
public class Sum2 {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void dfs(int index,int count,int n){
        if (count == 0){
            res.add(new ArrayList<>(list));
        }
        else {
            for (int i = index;i <= count && i <= n;i++){
                list.add(i);
                dfs(i + 1,count - i,n);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        while (sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            dfs(1,m,n);
            for (ArrayList<Integer> l : res){
                int i = 0;
                for (;i < l.size() - 1;i++){
                    System.out.println(l.get(i)+" ");
                }
                System.out.println(l.get(i));
            }
        }
    }
}