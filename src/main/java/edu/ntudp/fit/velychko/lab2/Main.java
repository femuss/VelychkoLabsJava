package edu.ntudp.fit.velychko.lab2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        int rows = 0, columns = 0;
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Set size of the matrix.");
        while (rows < 1 || rows > 20) {
            System.out.println("Enter number of rows between 1 and 20: ");
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
                if (rows < 1 || rows > 20) {
                    System.out.println("You should write number between 1 and 20");
                }
                scanner.nextLine();
            }
            else {
                System.out.println("You should write number between 1 and 20");
                scanner.nextLine();
            }
        }
        while (columns < 1 || columns > 20) {
            System.out.println("Enter number of columns between 1 and 20: ");
            if (scanner.hasNextInt()) {
                columns = scanner.nextInt();
                if (columns < 1 || columns > 20) {
                    System.out.println("You should write number between 1 and 20");
                }
                scanner.nextLine();
            }
            else {
                System.out.println("You should write number between 1 and 20");
                scanner.nextLine();
            }
        }
        while (true) {
            System.out.println("""
                How do you want to fill the matrix with values?
                1. Type elements yourself.
                2. Set elements randomly.""");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input == 1) {
                    matrix = getCustomMatrix(rows, columns);
                    break;
                }
                else if (input == 2) {
                    matrix = getRandomMatrix(rows, columns);
                    break;
                }
                else {
                    System.out.println("You should choose between 1 and 2 options");
                }
            }
            else {
                System.out.println("You should choose between 1 and 2 options");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Matrix is created:");
        printMatrix(matrix);
        int min = findMinElement(matrix);
        int max = findMaxElement(matrix);
        double arithmeticMean = findArithmeticMean(matrix);
        double geometricMean = findGeometricMean(matrix);
        System.out.println("Min element of the matrix: " + min);
        System.out.println("Max element of the matrix: " + max);
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + geometricMean);
    }
    public static int[][] getCustomMatrix(int inputRows, int inputColumns) {
        int[][] matrix = new int[inputRows][inputColumns];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + " element: ");
                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                }
            }
        }
        return matrix;
    }
    public static int[][] getRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int min = 1;
        int max = 20;
        int diff = max - min;
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(diff + 1) + min;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static int findMinElement(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
        }
        return min;
    }
    public static int findMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
    public static double findArithmeticMean(int[][] matrix) {
        double sumOfElements = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumOfElements += ints[j];
            }
        }
        return sumOfElements / (matrix.length * matrix[0].length);
    }
    public static double findGeometricMean(int[][] matrix) {
        int productOfElements = 1;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                productOfElements *= ints[j];
            }
        }
        return Math.pow(productOfElements, 1.0 / (double) (matrix.length * matrix[0].length));
    }
}
