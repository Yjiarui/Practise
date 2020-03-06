//小米笔试题-风口的猪，中国牛市
public class FengKouDeZhu {
    public int getMax(int[] arr,int start,int end){
        //有两次买入卖出的机会，必须买入，必须卖出后才能卖出
        int max = 0;
        int len = arr.length;
        if (start >= 0 && start <= len-1 && end <= len-1 && end >= 0){
            int min = arr[start];
            for (int i = start;i <= end;i++){
                if (arr[i] < min){
                    min = arr[i];
                }
                if (arr[i] - min > max){
                    max = arr[i] - min;
                }
            }
        }
        return max;
    }
    public int calculateMax(int[] prices) {
        int value = 0;
        int len = prices.length;
        for(int i = 0;i <= len-1;i++){
            int tmp = getMax(prices,0,i)+getMax(prices,i+1,len-1);
            if (tmp > value){
                value = tmp;
            }
        }
        return value;
    }
}
