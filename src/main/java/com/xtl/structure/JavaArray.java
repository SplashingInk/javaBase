package com.xtl.structure;

import java.util.Arrays;

/**
 * Java的数组操作
 * @author 31925
 */
public class JavaArray {
    public static void main(String[] args) {
        int[] array={12,223,5,36,24,100};
        System.out.println("使用加强for循环遍历数组：");
        printArray(array);
        System.out.println("使用普通for循环遍历数组：");
        printArray2(array);
        Arrays.sort(array);
        System.out.println("经过排序后的数组结果是：");
        printArray2(array);
        int key=36;
        int result = recursionBinarySearch(array, key, 0, array.length - 1);
        System.out.println("目标"+key+"在数组中的位置是："+result);
        int target=20;
        int k=commonBinarySearch(array,target);
        System.out.println("目标"+target+"在数组中的位置是："+k);
    }

    private static void printArray(int[] array){
        for(int i:array){
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    private static void printArray2(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    private static int recursionBinarySearch(int[] array,int key,int low,int high){
      if(low>high||key<array[low]||key>array[high]){
          return -1;
      }

      int mid=(low+high)/2;
      if(array[mid]<key){
          return recursionBinarySearch(array,key,mid+1,high);
      }else if(array[mid]>key){
          return recursionBinarySearch(array,key,low,mid-1);
      }else{
          return mid;
      }
    }

    private static int commonBinarySearch(int[] array,int key){
        int low=0,high=array.length-1,mid;
        if(low>high||key<array[low]||key>array[high]){
            return -1;
        }
        while(low<=high){
            mid=(low+high)/2;
            if(array[mid]<key){
                //比关键字小则关键字在右区域
                low=mid+1;
            }else if(array[mid]>key){
                //比关键字大则关键字在左区域
                high=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
