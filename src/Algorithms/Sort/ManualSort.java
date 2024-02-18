package Algorithms.Sort;

import java.util.Arrays;

public class ManualSort {
    public static void main(String[] args)
    {

        int[] arr = { 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[0]);
        System.out.print(Arrays.toString(arr));
    }
}
