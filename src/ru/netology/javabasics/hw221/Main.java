package ru.netology.javabasics.hw221;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int SIZE = 8;
        int MIN = 0;
        int MAX = 255;
        int[][] matrix = createRandomMatrix(SIZE, MIN, MAX);      //Create matrix with random numbers from 0 to 255
        int[][] rotatedMatrix = new int[SIZE][SIZE];

//        matrix = new int[][]{
//                {114, 112, 148, 83, 204, 22, 125, 31},
//                {192, 231, 245, 128, 63, 246, 139, 17},
//                {61, 128, 224, 45, 91, 57, 239, 34},
//                {219, 237, 167, 191, 236, 146, 144, 117},
//                {35, 199, 102, 124, 208, 195, 21, 147},
//                {52, 229, 126, 32, 24, 145, 19, 39},
//                {107, 43, 190, 43, 47, 172, 18, 19},
//                {62, 221, 6, 208, 241, 198, 187, 85}
//        };

        printMatrix(matrix);

        for (int i = 0; i < SIZE; i++) {
            int k = SIZE-1;
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][k] = matrix [j][i];
                k--;
            }
        }
        System.out.println("Result:");
        printMatrix(rotatedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createRandomMatrix(int size, int min, int max) {
        int[][] matrix = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(256); //random number from 0 to 255
            }
        }
        return matrix;
    }
}
