import java.util.Scanner;

//买苹果
//分别有6个/袋 8个/袋
//如果不能恰好够num个，返回-1
public class buyApples{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            for (int i=0;i<num;i++){
                for (int j=0;j<num;j++){
                    if (6*i+8*j==num){
                        if (num%8==0){
                            System.out.println(num/8);
                            return;
                        }else {
                            System.out.println(i+j);
                            return;
                        }
                    }
                }
            }
            System.out.println(-1);
        }
    }
