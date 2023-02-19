package org.example;

import java.util.Arrays;

public class RobotString {

    public int[] getCoordinates(String instruction) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < instruction.length() ; i++) {
            if(instruction.charAt(i) == 'U') {
                y++;
            }
            if(instruction.charAt(i) == 'D') {
                y--;
            } if(instruction.charAt(i) == 'L') {
                x--;
            } if(instruction.charAt(i) == 'R') {
                x++;
            }
        }
        int[] arr = {x,y};
        return arr ;
    }

}
