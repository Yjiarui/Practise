//寻找第K大

public class Finder {
    private static int findKthNum(int[] num, int len, int k){
        return quickSort(num,0,len-1,k);
    }
    private static int quickSort(int[] num, int low, int high, int k){
        if (low <= high){
            int pos = partition(num, low ,high);
            if (pos == k -1)
                return num[pos];
            else if (pos > k -1)
                return quickSort(num,low,pos-1,k);
            else
                return quickSort(num,pos+1,high,k);
        }else
            return -1;
    }
    private static int partition(int[] num, int low, int high){
        int tmp = num[low];
        while (low < high){
            while ((low < high ) && tmp >= num[high])
                high--;
            num[low] = num[high];
            while ((low < high) && tmp <= num[low])
                low++;
            num[high] = num[low];
        }
        num[low] = tmp;
        return low;
    }

    public static void main(String[] args) {
        int[] num = {1,3,5,2,2};
        System.out.println(findKthNum(num,5,3));
    }
}
