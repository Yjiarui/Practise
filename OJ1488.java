//百万富翁问题
//陌生人给富翁 10万元/天
//富翁给陌生人 1分、2分、4分.../天
//交换30天后，富翁交出了多少钱，陌生人交出了多少钱
public class OJ1488 {
    public static void main(String[] args) {
        int stranger = 0;
        int rich = 0;
        stranger = 100000 * 30;
        rich = (int)(Math.pow(2,30)-1);//求2的30次方
        System.out.println(rich+" "+stranger);
    }
}
