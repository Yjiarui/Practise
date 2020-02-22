//快速排序
public class QuickSort {
    //start 默认是0
    //end 是数组长度-1
    public void quickSort(int[] arr, int start, int end) {
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
}