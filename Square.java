package homework;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a = scan.nextLine();
        System.out.println(painting(n,a));
    }

    private static String painting(int n, String a) {
        int y = n/2 ;
        for (int i = 0;i < n;i++){
            if(i == 0 ){
                for (int k = 0;k < n;k++){
                    System.out.print(a);
                }
                System.out.println( );
            }else if (i == y-1){
                    for (int k = 0;k < n-1;k++){
                        System.out.print(a);
                }
                    break;
            } else if(i != 0 && i != y -1){
                System.out.print(a);
                for (int k = 0;k < n-2;k++){
                    System.out.print("  ");
                }
                System.out.println(a);
            }
        }
        return a;
    }
}
