package org.example;

import java.util.ArrayList;

public class Dupe {

    public ArrayList<Integer> findDupes(int[] nums) {
        ArrayList arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1 ; j++) {
                if(nums[i] == nums[j + 1] && !arr.contains(nums[i])) {
                    arr.add(nums[i]);
                }

            }
        }
        return arr;
    }

}
