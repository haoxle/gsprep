package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsecTest {

    @Test
    void consec1(){
        Consec consec = new Consec();
        assertEquals(2, consec.getSolution(new int[] {1,2,5}));
    }

    @Test
    void consec2(){
        Consec consec = new Consec();
        assertEquals(1, consec.getSolution(new int[] {5,5,3,1}));
    }
    @Test
    void consec3(){
        Consec consec = new Consec();
        assertEquals(3, consec.getSolution(new int[] {4,2,1,6,5}));
    }
}
