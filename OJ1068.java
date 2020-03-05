import java.text.DecimalFormat;
import java.util.Scanner;

//球的半径和体积
//输入球的中心点和球上某一点的坐标
//输出半径和体积 并保留结果三位小数
//为避免精度问题，PI值使用arccos(-1)
//例：输入 0 0 0 1 1 1
//输出 1.732 21.766
public class OJ1068 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double z0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        double r =(x1-x0)*(x1-x0)+(y1-y0)*(y1-y0)+(z1-z0)*(z1-z0);
        r = Math.sqrt(r);
        double PI =Math.acos(-1);
        double are = PI*r*r*r*4/3;
        DecimalFormat f = new DecimalFormat("0.000");
        System.out.println(f.format(r)+" "+f.format(are));
    }
}
