package org.example;

import java.util.Arrays;

public class RobotString {

    public int[] getCoordinates(String instruction) {
        instruction.toUpperCase().replace("UP", "U").replace("DOWN", "D").replace("LEFT", "L").replace("RIGHT", "R");
        int x = 0;
        int y = 0;
        for (int i = 0; i < instruction.length() ; i++) {
            if(instruction.charAt(i) == 'U') {
                x++;
            }
            if(instruction.charAt(i) == 'D') {
                x--;
            } if(instruction.charAt(i) == 'L') {
                y--;
            } if(instruction.charAt(i) == 'R') {
                y++;
            }
        }
        int[] arr = {x,y};
        return arr ;
    }

}
