import java.util.Scanner;

//买不买珠子
public class BuyPearl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sell = scan.nextLine();
        String  buy = scan.nextLine();
        int s = 0;
        int c = 0;
        StringBuilder sell2 = new StringBuilder(sell);
        StringBuilder buy2 = new StringBuilder(buy);
        for (int i = 0;i < buy2.length();i++){
            int m = 0;
            for (int j = 0;j < sell2.length();j++){
                if (buy2.charAt(i) == sell2.charAt(j)){
                    s++;
                    m++;
                    sell2.deleteCharAt(j);
                    break;
                }
            }
            if (m == 0){
                c++;
            }
        }
        if (s == buy2.length()){
            System.out.println("Yes "+(sell.length()-buy2.length()));
        }else {
            System.out.println("No "+c);
        }
    }
}