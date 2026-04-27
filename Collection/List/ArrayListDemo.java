package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9};

       reverse2(arr,0,arr.length-1);
      System.out.println(Arrays.toString(arr));



    }
    private static void reverse(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start >= end) {
            return;
        }

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    private static void reverse2(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start >= end) {
            return;
        }
        int a[]=new int[arr.length];
        for (int i = start; i <= end; i++) {
            a[i]=arr[i];
        }


        for (int i = 0; i <= 2; i++) {
            arr[2-i]=a[i];
        }

        for (int i = 3; i <= 8; i++) {
            arr[i]=a[11-i];
        }
        for (int i = 0; i <= 8; i++) {
            int temp=arr[i];
            arr[i]=arr[8-i];
            arr[8-i]=temp;
        }

    }


}
