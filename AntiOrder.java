//判断数组中的逆序对

public class AntiOrder {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,0};
        int count= count( A,A.length);
        System.out.println(count);
    }
    public static int count(int[] A, int n) {
        // write code here
        int[] copy=new int[n];
        for(int i=0;i<n;i++)
            copy[i]=A[i];
        return sortCore(A,copy,0,n-1);
    }
    private static int sortCore(int[] A,int[] copy,int low,int high){
        if(low>=high){
            copy[low]=A[low];
            return 0;
        }
        int mid=(low+high)>>1;
        int left=sortCore(copy,A,low,mid);
        int right=sortCore(copy,A,mid+1,high);
        int i=mid,j=high,index=high;
        int count=0;
        while(i>=low&&j>=mid+1){
            if(A[i]>A[j]){
                count+=j-mid;
                copy[index--]=A[i--];
            }else
                copy[index--]=A[j--];
        }
        while(i>=low)
            copy[index--]=A[i--];
        while(j>=mid+1)
            copy[index--]=A[j--];
        return count+left+right;
    }
}