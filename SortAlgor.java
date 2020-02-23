import java.util.Vector;

public class SortAlgor {

    //插入排序算法
    public static void insertSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // TODO:
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    // 接下来是无用功
                    break;
                }
            }
            if (i % 50000 == 0) // 大量数据排序时太慢，用来显示进度
                System.out.println(i);
        }
    }

    //选择排序算法
    public static void selectSort(int a[])
    {
        int minIndex=0;
        int temp=0;
        if((a==null)||(a.length==0))
            return;
        for(int i=0;i<a.length-1;i++)
        {
            minIndex=i;//无序区的最小数据数组下标
            for(int j=i+1;j<a.length;j++)
            {
                //在无序区中找到最小数据并保存其数组下标
                if(a[j]<a[minIndex])
                {
                    minIndex=j;
                }
            }
            if(minIndex!=i)
            {
                //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
                temp=a[i];
                a[i]=a[minIndex];
                a[minIndex]=temp;
            }
            if(i%50000 == 0)                //大量数据排序时太慢，用来显示进度
                System.out.println(i);
        }
    }

    //冒泡排序算法
    public static void bubbleSort(int a[])
    {
        int i,j,t,n = a.length;
        for(i = n-1;i>=1;i--)
        {
            for(j = 0; j<i; j++)
            {
                if(a[j] > a[j+1])
                {
                    t =a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            if(i%50000 == 0)                //大量数据排序时太慢用来知道进度
                System.out.println(i);
        }
    }

    //快速排序
        public void quickSort(int[] arr, int start, int end) {
            //start 默认是0
            //end 是数组长度-1
            if (start < end) {
                //获取分区索引
                int index = getIndex(arr, start, end);
                //对左右两个分区 再进行同样的步骤 ，即是递归调用
                quickSort(arr, start, index - 1);//左半部分
                quickSort(arr, index + 1, end);//右半部分
            }
        }

        private int getIndex(int[] arr, int start, int end) {
            int i = start;
            int j = end;
            //定义基准数
            int x = arr[i];
            //循环
            while (i < j) {
                //从右往左比较
                while (i < j && arr[j] >= x) {
                    j--;
                }
                //从右往左找到比基准数小的数了后，填坑
                if (i < j) {
                    //把这个数填到上一个坑位
                    arr[i] = arr[j];
                    //让 i++;
                    i++;

                }
                //从左往右找
                while (i < j && arr[i] < x) {
                    i++;
                }
                // 找比基准数大的数，找到后填坑
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            //当上面的循环结束后把基准数填到最后一个坑位，也就一基准数为界，分成了左右两部分
            arr[i] = x; //把基准数填进去
            return i; //返回基准数所在位置的索引
        }

    //两个有序子序列的归并算法
    private  static void Merge(int a[], int b[], int l,int m,int h)
    {
        int i,j,k;
        i = l;                      //i 指的是第一个子序列a[1:m]
        j = m + 1;                  //j 指的是第二个子序列a[m+1:h]
        k = l;                      //k 指的是最后用来存放合并后的数组的数组
        while(i <= m && j <= h)
        {
            if(a[i] < a[j])
            {
                b[k] = a[i];
                i++;
                k++;
            }
            else
            {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        while(i <= m)
        {
            b[k++] = a[i++];
        }
        while(j <= h)
        {
            b[k++] = a[j++];
        }
    }

    //递归归并排序
    public static void MSort(int S[], int T[], int s, int t)
    {
        //对s[s:t]进行归并排序，排序后的记录存入T[s:t]
        int R[] = new int[S.length];            //用于存放归并排序中间结果的辅助空间
        if(s == t)
            T[s] = S[s];
        else
        {
            int m = (s + t)/2;                  //将S[s:t]平分为S[s:m]和s[m+1:t]
            MSort(S,R,s,m);                     //递归的将S[s:m]归并为有序的R[s:m]
            MSort(S,R,m+1,t);                   //递归地将S[m+1:t]归并为有序的R[m+1:t]
            Merge(R,T,s,m,t);                   //将R[s:m]和R[m+1:t]归并到T[s:t]
        }

    }

    //迭代归并算法
    private static void mergePass(int S[], int T[], int n, int len)
    {
        int i = 0;
        while(i+2*len < n)
        {
            Merge(S,T,i,i+len-1,i+2*len-1);
            i += 2*len;
        }
        if(i+len <= n)  //一个归并段长len，另一个对并段长度不足len
        {
            Merge(S,T,i,i+len-1,n-1);
        }
    }

    //迭代实现的归并排序算法
    public static void mergeSort(int R[], int T[], int n)
    {
        int temp[] = R.clone();
        int len = 1;
        while(len < n)
        {
            mergePass(temp,T,n,len);
            temp = T.clone();           //不加这句的话，temp的数组一直没有发生变化
            len*=2;
        }

    }

    //基数排序的实现，有两种方式，低位优先法，适用于位数较小的数排序 简称LSD
    //高位优先法，适用于位数较多的情况，简称MSD
    //这里实现低位优先法
    public static void LSDSort(int a[])
    {
        int max = a[0];
        for(int i = 1; i<a.length; i++)
        {
            if(a[i] > max) max = a[i];
        }
        int len = 0;                    //存贮最大的数的位数，用来判断需要进行几轮基数排序  
        while(max > 0)
        {
            max = max/10;
            len++;
        }

        for(int times = 0;times < len; times++)             //按位数运行几次，每次都分裂成10份，在顺序链接
        {
            //以下内容应为每次运行时，分割成0-9 个桶，然后顺序链接
            Vector<Integer> num[] = new Vector[10];
            for(int i = 0; i <num.length; i++)
            {
                num[i] = new Vector<Integer>();
            }

            int k = 1;                              //用来取出当前的对应的位数的数
            for(int i = 0; i<times; i++)
            {
                k = k*10;
            }

            for(int i = 0; i<a.length; i++)         //对每一个数进行判断位数
            {
                int x = 0;                          //用来表示当前的位数上的数的大小
                x = Math.abs(a[i])/ k;              //使用绝对值，防止受到正负号的影响
                x = x % 10;
                num[x].add(new Integer(a[i]));
            }

            //将排序的结果顺序连接起来
            int count = 0;
            for(int i = 0; i < num.length; i++)
            {
                for(int j = 0; j <num[i].size(); j++)
                {
                    a[count++] = num[i].get(j).intValue();
                }
            }

        }

        //判断完绝对值大小顺序后，需要判断正负了
        {
            Vector<Integer> plus = new Vector<Integer>();       //储存正数
            Vector<Integer> minus = new Vector<Integer>();      //储存负数
            for(int i = 0; i < a.length ; i++)
            {
                if(a[i] <= 0)
                {
                    minus.add(new Integer(a[i]));
                }
                else
                {
                    plus.add(new Integer(a[i]));
                }
            }
            int count = 0;
            for(int i = minus.size()-1; i>0; i--)               //因为这是按照绝对值大小排列的，所以要倒序
            {
                a[count++] = minus.get(i);
            }
            for(int i = 0; i < plus.size(); i++)
            {
                a[count++] = plus.get(i);
            }
        }
    }

    //一趟希尔排序，对每个组轮流进行插入排序
    private static void shellPass (int a[], int d)
    {
        //i = d,2d,3d,...是表示对第一组排序，i = d+1,2d+1,...表示对第二组排序，其余类推
        int i,j;
        for(i = d; i < a.length; i++)
        {
            int x = a[i];
            for(j = i-d; j>=0 && a[j]>x; j=j-d)
            {
                a[j+d] = a[j];
            }
            a[j+d] = x;
        }
    }

    //最终的希尔排序算法，数组d[]是分组间隔序列
    public static void shellSort(int a[],int d[])
    {
        for(int k = 0; k<d.length; k++)
        {
            shellPass(a,d[k]);
        }
    }

}