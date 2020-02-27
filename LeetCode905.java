//按奇偶排序数组
//给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
//你可以返回满足此条件的任何数组作为答案。
//示例：
//输入：[3,1,2,4]
//输出：[2,4,3,1]
//输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
public class LeetCode905 {
    public int[] sortArrayByParityII(int[] A) {
        /*
        思路：遍历数组元素，如果元素为偶数，下标为偶数那么继续遍历，否则寻找下一个下标为偶数的奇数交换位置；
        如果元素为奇数，下标为奇数那么继续遍历，否则寻找下一个下标为奇数的偶数交换位置
         */
        for (int i = 0; i < A.length; i++) {
            int num=A[i];
            if (num%2==0)
            {
                if (i%2==0)
                {
                    continue;
                }else {
                    int j=i+1;
                    while (j<A.length)
                    {
                        if (j%2==0 && A[j]%2!=0)
                        {
                            break;
                        }
                        j++;
                    }
                    int tmp=A[j];
                    A[j]=A[i];
                    A[i]=tmp;
                }
            }else {
                if (i%2!=0)
                {
                    continue;
                }else {
                    int j=i+1;
                    while (j<A.length)
                    {
                        if (j%2!=0 && A[j]%2==0)
                        {
                            break;
                        }
                        j++;
                    }
                    int tmp=A[j];
                    A[j]=A[i];
                    A[i]=tmp;
                }
            }
        }
        return A;
    }

}