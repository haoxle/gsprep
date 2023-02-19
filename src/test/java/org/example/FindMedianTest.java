package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FindMedianTest {

    @Test
    void findMedian1(){
        FindMedian fm = new FindMedian();
        Assertions.assertEquals(5.0, fm.findMedian(new int[] {1,5}, new int[] {4,7,8}));
    }

    @Test
    void findMedian2(){
        FindMedian fm = new FindMedian();
        Assertions.assertEquals(6.0, fm.findMedian(new int[] {1,5}, new int[] {7,8}));
    }

    @Test
    void findMedian3(){
        FindMedian fm = new FindMedian();
        Assertions.assertEquals(4.5, fm.findMedian(new int[] {1,2}, new int[] {7,8}));
    }
}
