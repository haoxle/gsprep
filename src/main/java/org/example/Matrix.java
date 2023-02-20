package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {

    public int findHighValue(int[][] matrix) {
        ArrayList arr = new ArrayList<>();
        int product;
        int j = 1, k = 0;
        product = matrix[0][0];
        for (int i = 0; i < matrix.length - 1; i++) {
            if(matrix[i][k] > matrix[i + 1][k]){
                product *= matrix[i][k];
                i = 0;
            } else {
                product *= matrix[i + 1][k];
            }
            while(i == matrix.length - 2 && k < 2){
                product *= matrix[i + 1][k + 1];
                k++;
            }
        }
        System.out.println(product);
        return product;
    }
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[][] scores = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        // 0, 1 + 1,0
        // 1, 1 + 2,0
        // 2, 1
        // 2, 2'

        //1,0
        //2,0
        //2,1
        //2,2

        matrix.findHighValue(scores);
    }
}
