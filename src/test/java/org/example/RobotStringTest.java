package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RobotStringTest {

    @Test
    void getCoordinatesofUUU() {
        RobotString rs = new RobotString();
        assertEquals("[3, 0]", Arrays.toString(rs.getCoordinates("UUU")));
    }
    @Test
    void getCoordinatesofWords() {
        RobotString rs = new RobotString();
        assertEquals("[-1, 0]", Arrays.toString(rs.getCoordinates("Up Down Left 2xRight Down")));
    }
    @Test
    void getCoordinatesofURDL() {
        RobotString rs = new RobotString();
        assertEquals("[0, 0]", Arrays.toString(rs.getCoordinates("URDL")));
    }
}