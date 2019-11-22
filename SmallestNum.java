package homework;
import java.util.Scanner;

public class SmallestNum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[]num = {0,1,2,3,4,5,6,7,8,9};

        for(int i=0 ;i<10;i++){

            num[i] = sc.nextInt();

        }

        for(int i=1;i<10;i++){

            if(num[i]!=0){

                System.out.print(i);

                num[i]--;		//	输出后数量减少1

                break;			//	直接跳出 接着输0

            }

        }

        for(int i=0 ;i<num[0] ;i++){

            System.out.print(0);

        }

        for(int i=1;i<10;i++){			//将除0以外数字按大小顺序输出

            for(int j=0 ;j<num[i];j++){

                System.out.print(i);

            }

        }

        System.out.println();

    }

}

