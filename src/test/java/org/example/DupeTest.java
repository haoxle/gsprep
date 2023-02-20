package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DupeTest {

    @Test
    void findDupes() {
        Dupe dupe = new Dupe();
        assertEquals("[]", dupe.findDupes(new int[] {1,2,3}).toString());
    }


    @Test
    void findDupes2() {
        Dupe dupe = new Dupe();
        assertEquals("[3]", dupe.findDupes(new int[] {3,3,3}).toString());
    }

    @Test
    void findDupes3() {
        Dupe dupe = new Dupe();
        assertEquals("[3]", dupe.findDupes(new int[] {1,3,3}).toString());
    }

    @Test
    void findDupes4() {
        Dupe dupe = new Dupe();
        assertEquals("[1]", dupe.findDupes(new int[] {1,3,1}).toString());
    }
}