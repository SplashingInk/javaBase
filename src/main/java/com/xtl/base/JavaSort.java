package com.xtl.base;

import java.util.Arrays;
import java.util.SortedSet;

/**
 * Java的排序算法
 * @author 31925
 */
public class JavaSort {
    public static void main(String[] args) {
        testBubbleSort();
        testQuickSort();
        testSelectionSort();
        testShellSort();
        testInsertionSort();
        testHeapSort();
        testMergingSort();
        testRadixSort();
    }

    private static void testBubbleSort(){
        int[] array=new int[]{12,36,20,5,84,62,37};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        BubbleSort.bubbleSort(array);
        System.out.println("经过排序后的数组结果是："+ Arrays.toString(array));
    }

    private static void testQuickSort(){
        int[] array=new int[]{20,36,84,21,2,5,32,87};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        QuickSort.quickSort(array);
        System.out.println("使用非递归的快速排序后的数组结果是："+ Arrays.toString(array));
        int[] newArray=new int[]{21,2,36,10,8,12,60,43};
        System.out.println("排序前的数组结果是："+Arrays.toString(newArray));
        QuickSort.recursivelyQuickSort(newArray,0,array.length-1);
        System.out.println("使用递归的快速排序后的数组结果是："+Arrays.toString(newArray));
    }

    private static void testSelectionSort(){
        int[] array=new int[]{21,52,3,12,58,41,62,8,74};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        SelectionSort.selectionSort(array);
        System.out.println("经过选择排序后的数组结果是："+Arrays.toString(array));
    }

    private static void testShellSort(){
        int[] array=new int[]{21,52,32,62,8,14,23,50};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        ShellSort.shellSort(array);
        System.out.println("经过选择排序后的数组结果是："+Arrays.toString(array));
    }

    private static void testInsertionSort(){
        int[] array=new int[]{12,3,25,62,84,20,35,22};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        InsertionSort.insertionSort(array);
        System.out.println("经过插入排序后的数组结果是："+Arrays.toString(array));
    }

    private static void testHeapSort(){
        int[] array=new int[]{21,52,36,27,82,16,23,52};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        HeapSort.heapSort(array);
        System.out.println("经过堆排序后的数组结果是："+Arrays.toString(array));
    }

    private static void testMergingSort(){
        int[] array=new int[]{21,52,36,27,82,16,23,52};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        MergingSort.mergingSort(array);
        System.out.println("经过归并排序后的数组结果是："+Arrays.toString(array));
    }

    private static void testRadixSort(){
        int[] array=new int[]{23,54,62,25,85,27,16,53};
        System.out.println("排序前的数组结果是："+Arrays.toString(array));
        RadixSort.radixSort(array);
        System.out.println("经过基数排序后的数组结果是："+Arrays.toString(array));
    }
}

class BubbleSort{
    /**
     * 算法描述
     *   1.  比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     *   2.  对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     *   3.  针对所有的元素重复以上的步骤，除了最后一个；
     *   4.  重复步骤1~3，直到排序完成。
     * */
    public static void bubbleSort(int[] array){
        //外层控制排序次数
        for(int i = 0; i< array.length-1; i++){
            //内层控制比较次数
            for(int j = 0; j< array.length-1-i; j++){
                if(array[j]> array[j+1]){
                    swap(array,j,j+1);
                }
            }
            System.out.println("第"+(i+1)+"次排序的结果是："+Arrays.toString(array));
        }
    }

    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}

class QuickSort{
    /**
     *算法描述
     * 快速排序使用分治策略来把一个序列（list）分为两个子序列（sub-lists）。步骤为：
     * ①. 从数列中挑出一个元素，称为”基准”（pivot）。
     * ②. 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
     * ③. 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     * 递归到最底部时，数列的大小是零或一，也就是已经排序好了。这个算法一定会结束，因为在每次的迭代（iteration）中，它至少会把一个元素摆到它最后的位置去。
     */
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (array == null || left >= right || array.length <= 1) {
            return;
        }
        int mid = partition(array, left, right);
        System.out.println("下一个基准的位置是："+mid);
        quickSort(array, left, mid);
        quickSort(array, mid + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int temp = array[left];
        while (right > left) {
            // 先判断基准数和后面的数依次比较
            while (temp <= array[right] && left < right) {
                --right;
            }
            // 当基准数大于了 array[left]，则填坑
            if (left < right) {
                array[left] = array[right];
                ++left;
            }
            // 现在是 array[right] 需要填坑了
            while (temp >= array[left] && left < right) {
                ++left;
            }
            if (left < right) {
                array[right] = array[left];
                --right;
            }
        }
        System.out.println("当前的基准是："+temp+"\t\t"+Arrays.toString(array));
        array[left] = temp;
        return left;
    }

    public static void recursivelyQuickSort(int[] arr, int low, int high){
        if(arr.length <= 0) {
            return;
        }
        if(low >= high) {
            return;
        }
        int left = low;
        int right = high;

        //挖坑1：保存基准的值
        int temp = arr[left];
        while (left < right){
            //坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
            while(left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];
            //坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
            while(left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }
        //基准值填补到坑3中，准备分治递归快排
        arr[left] = temp;
        System.out.println("Sorting: " + Arrays.toString(arr));
        recursivelyQuickSort(arr, low, left-1);
        recursivelyQuickSort(arr, left+1, high);
    }
}

class SelectionSort{
    /**
     * 算法描述
     * ①. 从待排序序列中，找到关键字最小的元素；
     * ②. 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
     * ③. 从余下的 N - 1 个元素中，找出关键字最小的元素，重复①、②步，直到排序结束。
     */
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){    //选出之后待排序中值最小的位置
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];      //交换操作
                arr[min] = arr[i];
                arr[i] = temp;
                System.out.println("Sorting:  " + Arrays.toString(arr));
            }
        }
    }
}

class ShellSort{
    /**
     *算法描述
     * ①. 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；（一般初次取数组半长，之后每次再减半，直到增量为1）
     * ②. 按增量序列个数k，对序列进行k 趟排序；
     * ③. 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     */
    public static void shellSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        // temp为临时变量，gap增量默认是长度的一半，每次变为之前的一半，直到最终数组有序
        int temp, gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                // 将当前的数与减去增量之后位置的数进行比较，如果大于当前数，将它后移
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                // 将当前数放到空出来的位置
                array[preIndex + gap] = temp;
            }
            gap /= 2;
            System.out.println(Arrays.toString(array));
        }
    }
}

class InsertionSort{
    /**
     *算法描述
     * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
     * ①. 从第一个元素开始，该元素可以认为已经被排序
     * ②. 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * ③. 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * ④. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * ⑤. 将新元素插入到该位置后
     * ⑥. 重复步骤②~⑤
     */
    public static void insertionSort(int[] arr){
        for( int i = 1; i < arr.length; i++ ) {
            int temp = arr[i];    // 取出下一个元素，在已经排序的元素序列中从后向前扫描
            for( int j = i; j >= 0; j-- ) {
                if( j > 0 && arr[j-1] > temp ) {
                    // 如果该元素（已排序）大于取出的元素temp，将该元素移到下一位置
                    arr[j] = arr[j-1];
                } else {
                    // 将新元素插入到该位置后
                    arr[j] = temp;
                    System.out.println("Sorting:  " + Arrays.toString(arr));
                    break;
                }
            }
        }
    }
}

class HeapSort{
    /**
     * 算法描述
     * ①. 先将初始序列K[1..n]
     * 建成一个大顶堆, 那么此时第一个元素K1最大, 此堆为初始的无序区.
     * ②. 再将关键字最大的记录K1 (即堆顶, 第一个元素)和无序区的最后一个记录 Kn 交换, 由此得到新的无序区K[1..n−1]和有序区K[n], 且满足K[1..n−1].keys⩽K[n].key
     * ③. 交换K1 和 Kn 后, 堆顶可能违反堆性质, 因此需将K[1..n−1]调整为堆. 然后重复步骤②, 直到无序区只有一个元素时停止.
     */
    public static void heapSort(int[] arr){
        for(int i = arr.length; i > 0; i--){
            maxHeapify(arr, i);
            //堆顶元素(第一个元素)与Kn交换
            int temp = arr[0];
            arr[0] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    private static void maxHeapify(int[] arr, int limit){
        if(arr.length <= 0 || arr.length < limit) {
            return;
        }
        int parentIdx = limit / 2;

        for(; parentIdx >= 0; parentIdx--){
            if(parentIdx * 2 >= limit){
                continue;
            }
            //左子节点位置
            int left = parentIdx * 2;
            //右子节点位置，如果没有右节点，默认为左节点位置
            int right = (left + 1) >= limit ? left : (left + 1);

            int maxChildId = arr[left] >= arr[right] ? left : right;
            //交换父节点与左右子节点中的最大值
            if(arr[maxChildId] > arr[parentIdx]){
                int temp = arr[parentIdx];
                arr[parentIdx] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }
        System.out.println("MaxHeapify: " + Arrays.toString(arr));
    }
}

class MergingSort{
    /**
     * 迭代法
     * ①. 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
     * ②. 设定两个指针，最初位置分别为两个已经排序序列的起始位置
     * ③. 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
     * ④. 重复步骤③直到某一指针到达序列尾
     * ⑤. 将另一序列剩下的所有元素直接复制到合并序列尾
     * */
    public static int[] mergingSort(int[] arr){
        if(arr==null||arr.length <= 1) {
            return arr;
        }

        int num = arr.length >> 1;
        int[] leftArr = Arrays.copyOfRange(arr, 0, num);
        int[] rightArr = Arrays.copyOfRange(arr, num, arr.length);
        System.out.println("split two array: " + Arrays.toString(leftArr) + " And " + Arrays.toString(rightArr));
        //不断拆分为最小单元，再排序合并
        return mergeTwoArray(mergingSort(leftArr), mergingSort(rightArr));
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        int[] result = new int[arr1.length + arr2.length];  //申请额外的空间存储合并之后的数组
        while(i < arr1.length && j < arr2.length){      //选取两个序列中的较小值放入新数组
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){     //序列1中多余的元素移入新数组
            result[k++] = arr1[i++];
        }
        while(j < arr2.length){     //序列2中多余的元素移入新数组
            result[k++] = arr2[j++];
        }
        System.out.println("Merging: " + Arrays.toString(result));
        return result;
    }
}

class RadixSort{
    /**
     * 算法描述
     *
     * 我们以LSD为例，从最低位开始，具体算法描述如下：
     *
     * ①. 取得数组中的最大数，并取得位数；
     * ②. arr为原始数组，从最低位开始取每个位组成radix数组；
     * ③. 对radix进行计数排序（利用计数排序适用于小范围数的特点）；
     */
    public static void radixSort(int[] arr){
        if(arr.length <= 1) {
            return;
        }

        //取得数组中的最大数，并取得位数
        int max = 0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        int maxDigit = 1;
        while(max / 10 > 0){
            maxDigit++;
            max = max / 10;
        }
        System.out.println("maxDigit: " + maxDigit);

        //申请一个桶空间
        int[][] buckets = new int[10][arr.length];
        int base = 10;

        //从低位到高位，对每一位遍历，将所有元素分配到桶中
        for(int i = 0; i < maxDigit; i++){
            //存储各个桶中存储元素的数量
            int[] bktLen = new int[10];

            //分配：将所有元素分配到桶中
            for (int value : arr) {
                int whichBucket = (value % base) / (base / 10);
                buckets[whichBucket][bktLen[whichBucket]] = value;
                bktLen[whichBucket]++;
            }

            //收集：将不同桶里数据挨个捞出来,为下一轮高位排序做准备,由于靠近桶底的元素排名靠前,因此从桶底先捞
            int k = 0;
            for(int b = 0; b < buckets.length; b++){
                for(int p = 0; p < bktLen[b]; p++){
                    arr[k++] = buckets[b][p];
                }
            }

            System.out.println("Sorting: " + Arrays.toString(arr));
            base *= 10;
        }
    }
}