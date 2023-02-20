package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Consec {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public int getSolution(int[] arr) {

            HashSet<Integer> S = new HashSet<>();
            int ans = 0;
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                S.add(arr[i]);
            for (int i = 0; i < n; ++i) {
                if (!S.contains(arr[i] - 1)) {
                    int j = arr[i];
                    while (S.contains(j)){
                        S.remove(Integer.valueOf(j));
                        j++;
                    }
                    if (ans < j - arr[i])
                        ans = j - arr[i];
                }
            }
            return ans;
    }


    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
