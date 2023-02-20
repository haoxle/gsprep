package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixTest {

    @Test
    void matrix1() {
        Matrix matrix = new Matrix();
        Assertions.assertEquals(2016, matrix.findHighValue(new int[][]{{1, 2, 3},{4,5,6},{7,8,9}}));
    }


}
