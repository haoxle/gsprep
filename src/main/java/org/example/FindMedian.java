package org.example;

import java.util.Arrays;

public class FindMedian {
    public double findMedian(int [] arr, int[] arr2) {
        int[] arrFinal = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, arrFinal, 0, arr.length);
        System.arraycopy(arr2, 0, arrFinal, arr.length, arr2.length);
        Arrays.sort(arrFinal);

        // write the normal method for above.
        int mid = arrFinal.length / 2;
        if (arrFinal.length % 2 == 1) {
            return arrFinal[mid];
        } else {
            double even = (arrFinal[mid] + arrFinal[mid - 1]);
            return even / 2;
        }
    }
}
